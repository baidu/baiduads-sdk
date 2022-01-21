#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class GetUserInfoRequest:
    """get user info request data model

    Attributes:
        accessToken: 授权令牌accessToken
        userId: 同意授权用户ucid
        openId: 授权用户在平台+应用+UID维度下对应的唯一标识
    """

    def __init__(self, accessToken, userId, openId):
        self.accessToken = accessToken
        self.userId = userId
        self.openId = openId
