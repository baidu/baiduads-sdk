#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class GetAccessTokenRequest:
    """get access token request data model

    Attributes:
        appId: 应用 appid
        authCode: 临时授权码
        secretKey: 应用持有的 secretKey
        grantType: 授权令牌获取模式
        userId: 同意授权的用户ucid
    """

    def __init__(self, appId, authCode, secretKey, grantType, userId):
        self.appId = appId
        self.authCode = authCode
        self.secretKey = secretKey
        self.grantType = grantType
        self.userId = userId
