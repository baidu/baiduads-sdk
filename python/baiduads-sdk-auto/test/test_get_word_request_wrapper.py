"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.keyword.model.api_keyword_query_request import ApiKeywordQueryRequest
globals()['ApiKeywordQueryRequest'] = ApiKeywordQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.keyword.model.get_word_request_wrapper import GetWordRequestWrapper


class TestGetWordRequestWrapper(unittest.TestCase):
    """GetWordRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetWordRequestWrapper(self):
        """Test GetWordRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetWordRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
