"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.materialbrandmod.model.brand_image import BrandImage
from baiduads.materialbrandmod.model.brand_video import BrandVideo
globals()['BrandImage'] = BrandImage
globals()['BrandVideo'] = BrandVideo
from baiduads.materialbrandmod.model.tesla_brand_add_request import TeslaBrandAddRequest


class TestTeslaBrandAddRequest(unittest.TestCase):
    """TeslaBrandAddRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTeslaBrandAddRequest(self):
        """Test TeslaBrandAddRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = TeslaBrandAddRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()