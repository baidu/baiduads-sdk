"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.imageintelligent.model.get_smart_template_image_request import GetSmartTemplateImageRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetSmartTemplateImageRequest'] = GetSmartTemplateImageRequest
from baiduads.imageintelligent.model.get_smart_template_image_request_wrapper import GetSmartTemplateImageRequestWrapper


class TestGetSmartTemplateImageRequestWrapper(unittest.TestCase):
    """GetSmartTemplateImageRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetSmartTemplateImageRequestWrapper(self):
        """Test GetSmartTemplateImageRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetSmartTemplateImageRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()