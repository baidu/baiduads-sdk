"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.shield.model.shield_mod_request import ShieldModRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['ShieldModRequest'] = ShieldModRequest
from baiduads.shield.model.del_account_exclude_ip_request_wrapper import DelAccountExcludeIpRequestWrapper


class TestDelAccountExcludeIpRequestWrapper(unittest.TestCase):
    """DelAccountExcludeIpRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDelAccountExcludeIpRequestWrapper(self):
        """Test DelAccountExcludeIpRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DelAccountExcludeIpRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
