"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.materialproduct.model.product_ext_dto import ProductExtDto
from baiduads.materialproduct.model.product_image import ProductImage
from baiduads.materialproduct.model.product_video import ProductVideo
globals()['ProductExtDto'] = ProductExtDto
globals()['ProductImage'] = ProductImage
globals()['ProductVideo'] = ProductVideo
from baiduads.materialproduct.model.tesla_product_add_request import TeslaProductAddRequest


class TestTeslaProductAddRequest(unittest.TestCase):
    """TeslaProductAddRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTeslaProductAddRequest(self):
        """Test TeslaProductAddRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = TeslaProductAddRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()