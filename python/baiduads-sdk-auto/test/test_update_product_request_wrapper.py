"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.materialproduct.model.tesla_product_update_request import TeslaProductUpdateRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TeslaProductUpdateRequest'] = TeslaProductUpdateRequest
from baiduads.materialproduct.model.update_product_request_wrapper import UpdateProductRequestWrapper


class TestUpdateProductRequestWrapper(unittest.TestCase):
    """UpdateProductRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateProductRequestWrapper(self):
        """Test UpdateProductRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateProductRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
