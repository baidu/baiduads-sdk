"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.imagesegment.model.delete_image_segment_request_type import DeleteImageSegmentRequestType
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['DeleteImageSegmentRequestType'] = DeleteImageSegmentRequestType
from baiduads.imagesegment.model.delete_image_segment_request_wrapper import DeleteImageSegmentRequestWrapper


class TestDeleteImageSegmentRequestWrapper(unittest.TestCase):
    """DeleteImageSegmentRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteImageSegmentRequestWrapper(self):
        """Test DeleteImageSegmentRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteImageSegmentRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
