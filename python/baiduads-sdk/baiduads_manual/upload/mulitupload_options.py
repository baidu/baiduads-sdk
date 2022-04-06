#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class MultiUploadOptions:
    """MultiUploadOptions
    """

    def __init__(self,
                 multipartThreshold,
                 partSize,
                 partParallel):
        """

        Args:
            multipartThreshold:int
            partSize:int
            partParallel:int
        """
        self.multipartThreshold = multipartThreshold;
        self.partSize = partSize
        self.partParallel = partParallel;
