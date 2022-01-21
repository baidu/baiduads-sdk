#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class OpenIdInfo:
    """open id data model

    Attributes:
        openId: 授权用户在平台+应用+UID维度下对应的唯一标识
    """

    def __init__(self, openId):
        self.openId = openId

    @classmethod
    def dict_to_obj(cls, dict_data):
        """用于将dict转换为对象
        """
        return OpenIdInfo(
            dict_data.get("openId", None)
        )
