"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.appprocess.model.appinfo_condition_request import AppinfoConditionRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['AppinfoConditionRequest'] = AppinfoConditionRequest
from baiduads.appprocess.model.get_app_list_request_wrapper import GetAppListRequestWrapper


class TestGetAppListRequestWrapper(unittest.TestCase):
    """GetAppListRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetAppListRequestWrapper(self):
        """Test GetAppListRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetAppListRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
