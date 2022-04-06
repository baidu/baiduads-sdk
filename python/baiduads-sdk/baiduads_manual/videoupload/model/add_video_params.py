#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""


class AddVideoParams:
    """AddVideoParams

    """

    def __init__(self, _format, source, videoName, httpProtocol):
        """

        Args:
            _format:str
            source:int
            videoName:str
            httpProtocol:str
        """
        self.format = _format
        self.source = source
        self.videoName = videoName
        self.httpProtocol = httpProtocol
