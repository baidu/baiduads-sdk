#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""

from baiduads_manual.upload.upload_client import UploadClient
from baiduads_manual.videoupload.model.add_video_response_wrapper import AddVideoResponseWrapper


class VideoUploadService:
    """VideoUploadService
        please visit:  https://dev2.baidu.com
    """

    def __init__(self):
        self.upload_client = UploadClient()

    def add_video(self, add_video_request_wrapper, **kwargs):
        """

        Args:
            add_video_request_wrapper:AddVideoRequestWrapper
            **kwargs:

        Returns:
            AddVideoResponseWrapper
        """
        path = "/json/sms/service/VideoUploadService/addVideo"
        header = add_video_request_wrapper.header
        request_body = add_video_request_wrapper.body
        file = request_body.file
        signature = request_body.signature
        params = request_body.params
        timeout = request_body.timeout

        # form params
        form = [("signature", signature)]
        # set header param
        attribute_map = header.attribute_map
        data_dict = header.to_dict()
        for k, v in data_dict.items():
            form.append((attribute_map.get(k, k), v))

        upload_options = request_body.uploadOptions
        multipartThreshold = None
        partSize = None
        partParallel = None
        if upload_options is not None:
            multipartThreshold = upload_options.multipartThreshold
            partSize = upload_options.partSize
            partParallel = upload_options.partParallel

        return self.upload_client.upload_file(
            path,
            file,
            form,
            params.__dict__,
            multipartThreshold=multipartThreshold,
            partSize=partSize,
            partParallel=partParallel,
            timeout=timeout,
            returnType=AddVideoResponseWrapper
        )
