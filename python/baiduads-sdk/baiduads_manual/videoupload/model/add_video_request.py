#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class AddVideoRequest:
    """AddVideoRequest

    """

    def __init__(self,
                 file,
                 signature,
                 params,
                 timeout=None,
                 uploadOptions=None):
        """

        Args:
            file: str
            signature:str
            params: AddVideoParams
            timeout: int
            uploadOptions: MultiUploadOptions
        """
        self.file = file
        self.signature = signature
        self.params = params
        self.timeout = timeout
        self.uploadOptions = uploadOptions
