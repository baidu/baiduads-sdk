"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.miniprogram.model.mini_program_query_request import MiniProgramQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['MiniProgramQueryRequest'] = MiniProgramQueryRequest
from baiduads.miniprogram.model.get_mini_programs_request_wrapper import GetMiniProgramsRequestWrapper


class TestGetMiniProgramsRequestWrapper(unittest.TestCase):
    """GetMiniProgramsRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetMiniProgramsRequestWrapper(self):
        """Test GetMiniProgramsRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetMiniProgramsRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
