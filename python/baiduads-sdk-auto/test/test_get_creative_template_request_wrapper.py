"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.creative.model.creative_template_request import CreativeTemplateRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['CreativeTemplateRequest'] = CreativeTemplateRequest
from baiduads.creative.model.get_creative_template_request_wrapper import GetCreativeTemplateRequestWrapper


class TestGetCreativeTemplateRequestWrapper(unittest.TestCase):
    """GetCreativeTemplateRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCreativeTemplateRequestWrapper(self):
        """Test GetCreativeTemplateRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCreativeTemplateRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
