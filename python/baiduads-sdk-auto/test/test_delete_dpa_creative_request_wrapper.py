"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.dpaapicreative.model.dpa_delete_creative_request import DpaDeleteCreativeRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['DpaDeleteCreativeRequest'] = DpaDeleteCreativeRequest
from baiduads.dpaapicreative.model.delete_dpa_creative_request_wrapper import DeleteDpaCreativeRequestWrapper


class TestDeleteDpaCreativeRequestWrapper(unittest.TestCase):
    """DeleteDpaCreativeRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteDpaCreativeRequestWrapper(self):
        """Test DeleteDpaCreativeRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteDpaCreativeRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
