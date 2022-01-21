#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class AccessTokenInfo:
    """access token data model

    Attributes:
        accessToken: 授权令牌
        refreshToken: 刷新令牌
        expiresTime: 授权令牌到期时间
        refreshExpiresTime: 更新令牌到期时间
        expiresIn: 授权令牌剩余有效时间
        refreshExpiresIn: 更新令牌剩余有效时间
        scope: 使用应用的用户已授权的权限列表
        userId: 授权账号 ucid
    """

    def __init__(self,
                 accessToken, refreshToken, expiresTime,
                 refreshExpiresTime, expiresIn, refreshExpiresIn,
                 scope, userId):
        self.accessToken = accessToken
        self.refreshToken = refreshToken
        self.expiresTime = expiresTime
        self.refreshExpiresTime = refreshExpiresTime
        self.expiresIn = expiresIn
        self.refreshExpiresIn = refreshExpiresIn
        self.scope = scope
        self.userId = userId

    @classmethod
    def dict_to_obj(cls, dict_data):
        """ 用于将dict转换为对象
        """
        return AccessTokenInfo(
            dict_data.get("accessToken", None),
            dict_data.get("refreshToken", None),
            dict_data.get("expiresTime", None),
            dict_data.get("refreshExpiresTime", None),
            dict_data.get("expiresIn", None),
            dict_data.get("refreshExpiresIn", None),
            dict_data.get("scope", None),
            dict_data.get("userId", None)
        )
