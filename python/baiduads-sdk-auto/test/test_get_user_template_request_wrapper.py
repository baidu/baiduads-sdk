"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.huituapiv2.model.huitu_get_user_template_request import HuituGetUserTemplateRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['HuituGetUserTemplateRequest'] = HuituGetUserTemplateRequest
from baiduads.huituapiv2.model.get_user_template_request_wrapper import GetUserTemplateRequestWrapper


class TestGetUserTemplateRequestWrapper(unittest.TestCase):
    """GetUserTemplateRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetUserTemplateRequestWrapper(self):
        """Test GetUserTemplateRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetUserTemplateRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
