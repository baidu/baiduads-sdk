#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""



class RefreshTokenRequest:
    """refresh token request data model

    Attributes:
        appId: 应用 appId
        refreshToken: 已有的更新令牌 refreshToken
        secretKey: 应用持有的 secretKey
        userId: 同意授权用户ucid
    """

    def __init__(self, appId, refreshToken, secretKey, userId):
        self.appId = appId
        self.refreshToken = refreshToken
        self.secretKey = secretKey
        self.userId = userId
    