"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.page.model.broad_cast_query_request import BroadCastQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['BroadCastQueryRequest'] = BroadCastQueryRequest
from baiduads.page.model.get_broad_cast_pages_request_wrapper import GetBroadCastPagesRequestWrapper


class TestGetBroadCastPagesRequestWrapper(unittest.TestCase):
    """GetBroadCastPagesRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetBroadCastPagesRequestWrapper(self):
        """Test GetBroadCastPagesRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetBroadCastPagesRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
