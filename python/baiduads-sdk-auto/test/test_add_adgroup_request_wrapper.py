"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.adgroup.model.api_adgroup_add_request import ApiAdgroupAddRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiAdgroupAddRequest'] = ApiAdgroupAddRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.adgroup.model.add_adgroup_request_wrapper import AddAdgroupRequestWrapper


class TestAddAdgroupRequestWrapper(unittest.TestCase):
    """AddAdgroupRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddAdgroupRequestWrapper(self):
        """Test AddAdgroupRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddAdgroupRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
