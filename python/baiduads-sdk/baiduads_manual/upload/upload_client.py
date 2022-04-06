#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import json
import multiprocessing
import os
import tempfile
import time
from threading import Semaphore

from baiduads import ApiException, ApiClient
from concurrent.futures import ThreadPoolExecutor

# 分片最小 100kb
MIN_PART_SIZE = 100 * 1024

# 网关理论上支持最大100MB的分片
MAX_PART_SIZE = 100 * 1024 * 1024

# 默认分片阈值 100MB
DEFAULT_MULTIPART_THRESHOLD = 100 * 1024 * 1024

# 默认分片大小 5M
DEFAULT_PART_SIZE = 5 * 1024 * 1024

multi_upload_pool = ThreadPoolExecutor(max_workers=multiprocessing.cpu_count() * 2, thread_name_prefix="multi-upload-")


def current_time_millis():
    t_ms = time.time() * 1000
    return int(t_ms)


def convert_to_second(ms_time):
    if ms_time is None:
        return None
    else:
        return ms_time / 1000


class UploadClient:

    def __init__(self):
        self.api_client = ApiClient()

    def upload_file(self,
                    path,
                    filePath,
                    formParams=[],
                    paramsJson={},
                    /,
                    returnType=None,
                    fileKey="file",
                    multipartThreshold=DEFAULT_MULTIPART_THRESHOLD,
                    partSize=DEFAULT_PART_SIZE,
                    partParallel=5,
                    timeout=None
                    ):
        """
        文件上传
        Args:
            path: str 请求路径
            filePath: str 文件路径
            formParams: [Tuple[str,Any]] 表单参数
            paramsJson:dict 额外参数
            returnType: 返回类型
            fileKey: str 文件参数key,不填默认为"file"
            multipartThreshold: int 分片上传阈值，不填默认 100M
            partSize: int 分片大小,不填默认 5M
            partParallel:int 分片并发上传数，不填默认5
            timeout:int 超时时间,不填默认不超时 单位ms

        Returns:
            returnType
        """
        if filePath is None:
            raise ApiException(reason="invalid filePath")
        if partSize is not None and (partSize < MIN_PART_SIZE or partSize > MAX_PART_SIZE):
            raise ApiException(reason="invalid partSize")
        if partParallel is not None and partParallel < 1:
            raise ApiException(reason="invalid partParallel")
        if multipartThreshold is not None and multipartThreshold < DEFAULT_PART_SIZE:
            # 分片阈值最小5M
            raise ApiException(reason="invalid multipartThreshold")

        if fileKey is None:
            fileKey = "file"
        if multipartThreshold is None:
            multipartThreshold = DEFAULT_MULTIPART_THRESHOLD
        if partSize is None:
            partSize = DEFAULT_PART_SIZE
        if partParallel is None:
            partParallel = 5
        if formParams is None:
            formParams = []
        if timeout is not None and timeout <= 0:
            timeout = None

        endpoint_path = path
        http_method = "POST"
        # path params
        path = {}
        # query params
        query = []
        # header params
        header = {"Accept": "application/json;charset=utf-8",
                  "Content-Type": "multipart/form-data"}
        # body param
        body = None
        # form param
        form = formParams
        if returnType is not None:
            response_type = (returnType,)
        else:
            response_type = (dict,)
        auth = []
        async_req = False
        _check_return_type = True
        _return_http_data_only = True
        _preload_content = True
        _request_timeout = timeout
        _host = None
        collection_format = {}

        # check file size
        file_size = os.path.getsize(filePath)
        if file_size <= multipartThreshold:
            with open(filePath, "rb") as file:
                # 简单上传
                form.append(("params", json.dumps(paramsJson)))
                received_data = self.api_client.call_api(
                    endpoint_path, http_method,
                    path,
                    query,
                    header,
                    body=body,
                    post_params=form,
                    files={fileKey: [file]},
                    response_type=response_type,
                    auth_settings=auth,
                    async_req=async_req,
                    _check_type=_check_return_type,
                    _return_http_data_only=_return_http_data_only,
                    _preload_content=_preload_content,
                    _request_timeout=convert_to_second(_request_timeout),
                    _host=_host,
                    collection_formats=collection_format)
                return received_data
        else:
            future = multi_upload_pool.submit(self.multi_upload,
                                              endpoint_path, http_method,
                                              path, query, header, body, form,
                                              response_type, filePath, partSize, fileKey,
                                              partParallel, paramsJson, auth, async_req,
                                              _check_return_type, _return_http_data_only,
                                              _preload_content, _request_timeout, _host,
                                              collection_format)
            ex = None
            if timeout is not None:
                ex = future.exception(convert_to_second(timeout))
            else:
                ex = future.exception()
            if ex is not None:
                raise ApiException(reason=ex)
            return future.result()

    def multi_upload(self,
                     endpoint_path, http_method,
                     path,
                     query,
                     header,
                     body,
                     post_params,
                     response_type,
                     filePath,
                     partSize,
                     fileKey,
                     partParallel,
                     paramsJson,
                     auth_settings,
                     async_req,
                     _check_type,
                     _return_http_data_only,
                     _preload_content,
                     _request_timeout,
                     _host,
                     collection_formats
                     ):
        # 分片上传
        # 计算deadline
        timeout_enable = False
        deadline = None
        if _request_timeout is not None:
            timeout_enable = True
            deadline = current_time_millis() + _request_timeout
        # 计算分片数
        file_size = os.path.getsize(filePath)
        part_count = int(file_size / partSize)
        if file_size % partSize != 0:
            part_count = part_count + 1

        # checkout timeout
        step_timeout = None
        if timeout_enable:
            step_timeout = deadline - current_time_millis()
            if step_timeout <= 0:
                raise TimeoutError()

        # step1: initMultipartUpload
        init_post_params = post_params.copy()
        init_post_params.append(("params", json.dumps(paramsJson)))
        init_post_params.append(("step", "InitiateMultipartUpload"))
        received_data = self.api_client.call_api(
            endpoint_path, http_method,
            path,
            query,
            header,
            body,
            init_post_params,
            files={},
            response_type=(dict,),
            auth_settings=auth_settings,
            async_req=async_req,
            _check_type=_check_type,
            _return_http_data_only=_return_http_data_only,
            _preload_content=_preload_content,
            _request_timeout=convert_to_second(step_timeout),
            _host=_host,
            collection_formats=collection_formats)
        if received_data["header"]["status"] != 0:
            raise ApiException(reason="InitiateMultipartUpload step ex:" + str(received_data))
        upload_id = received_data["body"]["data"][0]["uploadId"]
        file_id = received_data["body"]["data"][0].get("fileId", None)

        # step2: uploadPart
        semaphore = Semaphore(partParallel)
        part_future = {}
        part_post_params = post_params.copy()
        part_post_params.append(("step", "UploadPart"))
        part_post_params.append(("uploadId", upload_id))
        for i in range(part_count):
            part_number = i + 1
            if timeout_enable:
                while True:
                    step_timeout = deadline - current_time_millis()
                    if step_timeout <= 0:
                        raise TimeoutError()
                    else:
                        acquire_res = semaphore.acquire(timeout=convert_to_second(step_timeout))
                        if acquire_res:
                            break
            else:
                semaphore.acquire()
            upload_part_future = multi_upload_pool.submit(self.upload_part,
                                                          endpoint_path, http_method,
                                                          path,
                                                          query,
                                                          header,
                                                          body,
                                                          part_post_params.copy(),
                                                          filePath,
                                                          partSize,
                                                          fileKey,
                                                          part_number,
                                                          semaphore,
                                                          auth_settings=auth_settings,
                                                          async_req=async_req,
                                                          _check_type=_check_type,
                                                          _return_http_data_only=_return_http_data_only,
                                                          _preload_content=_preload_content,
                                                          _request_timeout=step_timeout,
                                                          _host=_host,
                                                          collection_formats=collection_formats
                                                          )
            part_future[part_number] = upload_part_future

        etags = []
        for k, v in part_future.items():
            ex = None
            if timeout_enable:
                t = deadline - current_time_millis()
                if t <= 0:
                    raise TimeoutError()
                else:
                    ex = v.exception(convert_to_second(t))
            else:
                ex = v.exception()
            if ex is not None:
                raise ApiException(reason=ex)
            upload_part_res = v.result()
            if upload_part_res["header"]["status"] != 0:
                raise ApiException(reason="UploadPart step ex:" + str(upload_part_res))

            etag = upload_part_res["body"]["data"][0]["ETag"]
            etags.append({"partNumber": k, "ETag": etag})

        # step3:  CompleteMultipartUpload
        complete_post_params = post_params.copy()
        complete_post_params.append(("step", "CompleteMultipartUpload"))
        complete_post_params.append(("uploadId", upload_id))
        complete_post_params.append(("parts", json.dumps(etags)))
        paramsJson["fileId"] = file_id
        complete_post_params.append(("params", json.dumps(paramsJson)))

        complete_timeout = None
        if timeout_enable:
            t = deadline - current_time_millis()
            if t <= 0:
                raise TimeoutError()
            else:
                complete_timeout = t

        received_data = self.api_client.call_api(
            endpoint_path, http_method,
            path,
            query,
            header,
            body=body,
            post_params=complete_post_params,
            files={},
            response_type=response_type,
            auth_settings=auth_settings,
            async_req=async_req,
            _check_type=_check_type,
            _return_http_data_only=_return_http_data_only,
            _preload_content=_preload_content,
            _request_timeout=convert_to_second(complete_timeout),
            _host=_host,
            collection_formats=collection_formats)
        return received_data

    def upload_part(self,
                    endpoint_path, http_method,
                    path,
                    query,
                    header,
                    body,
                    post_params,
                    filePath,
                    partSize,
                    fileKey,
                    part_number,
                    semaphore,
                    auth_settings,
                    async_req,
                    _check_type,
                    _return_http_data_only,
                    _preload_content,
                    _request_timeout,
                    _host,
                    collection_formats
                    ):
        temp_file = None
        file = None
        try:
            (_, file_name) = os.path.split(filePath)
            temp_file = tempfile.NamedTemporaryFile(prefix=file_name, suffix="-part-" + str(part_number))
            file = open(filePath, "rb")
            file.seek((part_number - 1) * partSize)
            data = file.read(partSize)
            temp_file.write(data)
            temp_file.seek(0)

            # 设置参数
            post_params.append(("partNumber", part_number))
            received_data = self.api_client.call_api(
                endpoint_path, http_method,
                path,
                query,
                header,
                body,
                post_params,
                files={fileKey: [temp_file]},
                response_type=(dict,),
                auth_settings=auth_settings,
                async_req=async_req,
                _check_type=_check_type,
                _return_http_data_only=_return_http_data_only,
                _preload_content=_preload_content,
                _request_timeout=convert_to_second(_request_timeout),
                _host=_host,
                collection_formats=collection_formats)
            return received_data
        except Exception as e:
            raise ApiException(reason=e)
        finally:
            if temp_file is not None:
                temp_file.close()
            if file is not None:
                file.close()
            semaphore.release()
