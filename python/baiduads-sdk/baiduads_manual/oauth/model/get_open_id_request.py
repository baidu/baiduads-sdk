#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class GetOpenIdRequest:
    """get open id request data model

    Attributes:
        accessToken: 授权令牌accessToken
        userId: 同意授权用户ucid
    """

    def __init__(self, accessToken, userId):
        self.accessToken = accessToken
        self.userId = userId
