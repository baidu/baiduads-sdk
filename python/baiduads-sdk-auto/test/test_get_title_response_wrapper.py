"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.titlerecommend.model.get_title_response_wrapper_body import GetTitleResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetTitleResponseWrapperBody'] = GetTitleResponseWrapperBody
from baiduads.titlerecommend.model.get_title_response_wrapper import GetTitleResponseWrapper


class TestGetTitleResponseWrapper(unittest.TestCase):
    """GetTitleResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetTitleResponseWrapper(self):
        """Test GetTitleResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetTitleResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()