"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.kr.model.get_kr_file_request_params import GetKRFileRequestParams
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetKRFileRequestParams'] = GetKRFileRequestParams
from baiduads.kr.model.get_file_path_request_wrapper import GetFilePathRequestWrapper


class TestGetFilePathRequestWrapper(unittest.TestCase):
    """GetFilePathRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetFilePathRequestWrapper(self):
        """Test GetFilePathRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetFilePathRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
