"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.dpacreative.model.creative_group_id import CreativeGroupId
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['CreativeGroupId'] = CreativeGroupId
from baiduads.dpacreative.model.get_creatives_request_wrapper import GetCreativesRequestWrapper


class TestGetCreativesRequestWrapper(unittest.TestCase):
    """GetCreativesRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCreativesRequestWrapper(self):
        """Test GetCreativesRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCreativesRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
