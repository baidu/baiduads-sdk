"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.materialproduct.model.add_product_response_wrapper_body import AddProductResponseWrapperBody
globals()['AddProductResponseWrapperBody'] = AddProductResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
from baiduads.materialproduct.model.add_product_response_wrapper import AddProductResponseWrapper


class TestAddProductResponseWrapper(unittest.TestCase):
    """AddProductResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddProductResponseWrapper(self):
        """Test AddProductResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddProductResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()