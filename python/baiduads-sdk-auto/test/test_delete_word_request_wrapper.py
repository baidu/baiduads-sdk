"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.keyword.model.api_keyword_del_request import ApiKeywordDelRequest
globals()['ApiKeywordDelRequest'] = ApiKeywordDelRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.keyword.model.delete_word_request_wrapper import DeleteWordRequestWrapper


class TestDeleteWordRequestWrapper(unittest.TestCase):
    """DeleteWordRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteWordRequestWrapper(self):
        """Test DeleteWordRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteWordRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
