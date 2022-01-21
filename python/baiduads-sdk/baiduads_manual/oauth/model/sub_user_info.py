#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""



class SubUserInfo:
    """sub user info data model

    Attributes:
        ucId: 同意授权用户关联的子账号ucid
        ucName: 同意授权用户关联的子账号ucname
    """

    def __init__(self, ucId, ucName):
        self.ucId = ucId
        self.ucName = ucName

    @classmethod
    def dict_to_obj(cls, dict_data):
        """用于将dict转换为对象
        """
        return SubUserInfo(
            dict_data.get("ucId", None),
            dict_data.get("ucName", None)
        )
