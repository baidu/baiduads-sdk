#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class UploadFileRequestWrapper:
    """UploadFileRequestWrapper

    """
    def __init__(self, header, body):
        """

        Args:
            header:ApiRequestHeader
            body:UploadFileRequest
        """
        self.header = header
        self.body = body
