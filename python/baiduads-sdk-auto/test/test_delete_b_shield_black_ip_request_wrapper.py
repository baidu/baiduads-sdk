"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.shield.model.shield_ip_del_request import ShieldIPDelRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['ShieldIPDelRequest'] = ShieldIPDelRequest
from baiduads.shield.model.delete_b_shield_black_ip_request_wrapper import DeleteBShieldBlackIPRequestWrapper


class TestDeleteBShieldBlackIPRequestWrapper(unittest.TestCase):
    """DeleteBShieldBlackIPRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteBShieldBlackIPRequestWrapper(self):
        """Test DeleteBShieldBlackIPRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteBShieldBlackIPRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()