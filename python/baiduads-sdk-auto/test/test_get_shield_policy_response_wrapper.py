"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.shieldfunction.model.get_shield_policy_response_wrapper_body import GetShieldPolicyResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetShieldPolicyResponseWrapperBody'] = GetShieldPolicyResponseWrapperBody
from baiduads.shieldfunction.model.get_shield_policy_response_wrapper import GetShieldPolicyResponseWrapper


class TestGetShieldPolicyResponseWrapper(unittest.TestCase):
    """GetShieldPolicyResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetShieldPolicyResponseWrapper(self):
        """Test GetShieldPolicyResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetShieldPolicyResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
