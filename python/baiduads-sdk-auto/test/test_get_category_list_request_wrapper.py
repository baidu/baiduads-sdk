"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.wtmaterialcategory.model.get_category_list_request import GetCategoryListRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetCategoryListRequest'] = GetCategoryListRequest
from baiduads.wtmaterialcategory.model.get_category_list_request_wrapper import GetCategoryListRequestWrapper


class TestGetCategoryListRequestWrapper(unittest.TestCase):
    """GetCategoryListRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCategoryListRequestWrapper(self):
        """Test GetCategoryListRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCategoryListRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()