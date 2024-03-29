#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""

from baiduads_manual.oauth.model.user_info import UserInfo


class GetUserInfoResponse:
    """get user info response data model
    """

    def __init__(self, code, data, message):
        self.code = code
        self.data = data
        self.message = message

    @classmethod
    def dict_to_obj(cls, dict_data):
        """用于将dict转换为对象
        """
        data = None
        if "data" in dict_data:
            data = UserInfo.dict_to_obj(dict_data["data"])

        return GetUserInfoResponse(
            dict_data.get("code", None),
            data,
            dict_data.get("message", None)
        )
