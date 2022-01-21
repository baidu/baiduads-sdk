#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""

from baiduads import ApiClient, Configuration
from baiduads_manual.oauth.model.get_access_token_response import GetAccessTokenResponse
from baiduads_manual.oauth.model.get_open_id_response import GetOpenIdResponse
from baiduads_manual.oauth.model.get_user_info_response import GetUserInfoResponse
from baiduads_manual.oauth.model.refresh_token_response import RefreshTokenResponse


class OAuthService:
    """for baidu oauth2.0

    please visit: https://dev2.baidu.com/content?sceneType=0&pageId=100441&nodeId=421&subhead=
    """

    def __init__(self):
        conf = Configuration(host="https://u.baidu.com")
        self.api_client = ApiClient(conf)

    def get_access_token(self,
                         request,
                         **kwargs):
        """get_access_token

        Args:
            request (GetAccessTokenRequest): 请求参数
            kwargs: 保留参数

        Returns:
            GetAccessTokenResponse
        """
        endpoint_path = "/oauth/accessToken"
        http_method = "POST"
        # path params
        path = {}
        # query params
        query = []
        # header params
        header = {"Accept": "application/json;charset=utf-8",
                  "Content-Type": "application/json;charset=utf-8"}
        # body param
        body = request.__dict__
        # form param
        form = []
        # file param
        file = {}
        response_type = (dict,)
        auth = []
        async_req = False
        _check_return_type = True
        _return_http_data_only = True
        _preload_content = True
        _request_timeout = None
        _host = None
        collection_format = {}
        received_data = self.api_client.call_api(
            endpoint_path, http_method,
            path,
            query,
            header,
            body=body,
            post_params=form,
            files=file,
            response_type=response_type,
            auth_settings=auth,
            async_req=async_req,
            _check_type=_check_return_type,
            _return_http_data_only=_return_http_data_only,
            _preload_content=_preload_content,
            _request_timeout=_request_timeout,
            _host=_host,
            collection_formats=collection_format)

        return GetAccessTokenResponse.dict_to_obj(received_data)

    def refresh_token(self,
                      request,
                      **kwargs):
        """refresh_token
        Args:
            request (RefreshTokenRequest): 请求参数
            kwargs  : 保留参数

        Returns:
            RefreshTokenResponse
        """
        endpoint_path = "/oauth/refreshToken"
        http_method = "POST"
        # path params
        path = {}
        # query params
        query = []
        # header params
        header = {"Accept": "application/json;charset=utf-8",
                  "Content-Type": "application/json;charset=utf-8"}
        # body param
        body = request.__dict__
        # form param
        form = []
        # file param
        file = {}
        response_type = (dict,)
        auth = []
        async_req = False
        _check_return_type = True
        _return_http_data_only = True
        _preload_content = True
        _request_timeout = None
        _host = None
        collection_format = {}
        received_data = self.api_client.call_api(
            endpoint_path, http_method,
            path,
            query,
            header,
            body=body,
            post_params=form,
            files=file,
            response_type=response_type,
            auth_settings=auth,
            async_req=async_req,
            _check_type=_check_return_type,
            _return_http_data_only=_return_http_data_only,
            _preload_content=_preload_content,
            _request_timeout=_request_timeout,
            _host=_host,
            collection_formats=collection_format)

        return RefreshTokenResponse.dict_to_obj(received_data)

    def get_user_info(self,
                      request,
                      **kwargs):
        """get_user_info
        Args:
            request (GetUserInfoRequest): 请求参数
            kwargs  : 保留参数

        Returns:
            GetUserInfoResponse
        """
        endpoint_path = "/oauth/getUserInfo"
        http_method = "POST"
        # path params
        path = {}
        # query params
        query = []
        # header params
        header = {"Accept": "application/json;charset=utf-8",
                  "Content-Type": "application/json;charset=utf-8"}
        # body param
        body = request.__dict__
        # form param
        form = []
        # file param
        file = {}
        response_type = (dict,)
        auth = []
        async_req = False
        _check_return_type = True
        _return_http_data_only = True
        _preload_content = True
        _request_timeout = None
        _host = None
        collection_format = {}
        received_data = self.api_client.call_api(
            endpoint_path, http_method,
            path,
            query,
            header,
            body=body,
            post_params=form,
            files=file,
            response_type=response_type,
            auth_settings=auth,
            async_req=async_req,
            _check_type=_check_return_type,
            _return_http_data_only=_return_http_data_only,
            _preload_content=_preload_content,
            _request_timeout=_request_timeout,
            _host=_host,
            collection_formats=collection_format)

        return GetUserInfoResponse.dict_to_obj(received_data)

    def get_open_id(self,
                    request,
                    **kwargs):
        """get_open_id
        Args:
            request (GetOpenIdRequest): 请求参数
            kwargs  : 保留参数

        Returns:
            GetOpenIdResponse
        """
        endpoint_path = "/oauth/getOpenId"
        http_method = "POST"
        # path params
        path = {}
        # query params
        query = []
        # header params
        header = {"Accept": "application/json;charset=utf-8",
                  "Content-Type": "application/json;charset=utf-8"}
        # body param
        body = request.__dict__
        # form param
        form = []
        # file param
        file = {}
        response_type = (dict,)
        auth = []
        async_req = False
        _check_return_type = True
        _return_http_data_only = True
        _preload_content = True
        _request_timeout = None
        _host = None
        collection_format = {}
        received_data = self.api_client.call_api(
            endpoint_path, http_method,
            path,
            query,
            header,
            body=body,
            post_params=form,
            files=file,
            response_type=response_type,
            auth_settings=auth,
            async_req=async_req,
            _check_type=_check_return_type,
            _return_http_data_only=_return_http_data_only,
            _preload_content=_preload_content,
            _request_timeout=_request_timeout,
            _host=_host,
            collection_formats=collection_format)

        return GetOpenIdResponse.dict_to_obj(received_data)
