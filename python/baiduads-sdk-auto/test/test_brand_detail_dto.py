"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.materialbrandquery.model.brand_image import BrandImage
from baiduads.materialbrandquery.model.brand_video import BrandVideo
globals()['BrandImage'] = BrandImage
globals()['BrandVideo'] = BrandVideo
from baiduads.materialbrandquery.model.brand_detail_dto import BrandDetailDto


class TestBrandDetailDto(unittest.TestCase):
    """BrandDetailDto unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testBrandDetailDto(self):
        """Test BrandDetailDto"""
        # FIXME: construct object with mandatory attributes with example values
        # model = BrandDetailDto()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
