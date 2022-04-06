#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class UploadFileRequest:
    """UploadFileRequest

    """
    def __init__(self,
                 file,
                 params,
                 timeout=None,
                 uploadOptions=None):
        """

        Args:
            file: str
            params: UploadFileParams
            timeout: int
            uploadOptions: MultiUploadOptions
        """
        self.file = file
        self.params = params
        self.timeout = timeout
        self.uploadOptions = uploadOptions
