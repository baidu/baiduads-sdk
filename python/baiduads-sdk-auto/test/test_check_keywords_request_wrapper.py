"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.indexapi.model.check_keyword_request import CheckKeywordRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['CheckKeywordRequest'] = CheckKeywordRequest
from baiduads.indexapi.model.check_keywords_request_wrapper import CheckKeywordsRequestWrapper


class TestCheckKeywordsRequestWrapper(unittest.TestCase):
    """CheckKeywordsRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCheckKeywordsRequestWrapper(self):
        """Test CheckKeywordsRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = CheckKeywordsRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()