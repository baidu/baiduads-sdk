"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.wtmaterialcategory.model.delete_category_request import DeleteCategoryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['DeleteCategoryRequest'] = DeleteCategoryRequest
from baiduads.wtmaterialcategory.model.delete_category_request_wrapper import DeleteCategoryRequestWrapper


class TestDeleteCategoryRequestWrapper(unittest.TestCase):
    """DeleteCategoryRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteCategoryRequestWrapper(self):
        """Test DeleteCategoryRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteCategoryRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
