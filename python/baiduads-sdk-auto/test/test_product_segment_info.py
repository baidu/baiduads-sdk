"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.advice.model.field_filter import FieldFilter
from baiduads.advice.model.product_segment_type import ProductSegmentType
globals()['FieldFilter'] = FieldFilter
globals()['ProductSegmentType'] = ProductSegmentType
from baiduads.advice.model.product_segment_info import ProductSegmentInfo


class TestProductSegmentInfo(unittest.TestCase):
    """ProductSegmentInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testProductSegmentInfo(self):
        """Test ProductSegmentInfo"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ProductSegmentInfo()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
