#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class UploadFileParams:
    """UploadFileParams

    """
    def __init__(self,
                 fileName,
                 fileType,
                 storeType,
                 bizFlag):
        """

        Args:
            fileName:str
            fileType:str
            storeType:str
            bizFlag:str
        """
        self.fileName = fileName
        self.fileType = fileType
        self.storeType = storeType
        self.bizFlag = bizFlag
