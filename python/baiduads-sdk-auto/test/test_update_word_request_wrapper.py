"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.keyword.model.api_keyword_update_request import ApiKeywordUpdateRequest
globals()['ApiKeywordUpdateRequest'] = ApiKeywordUpdateRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.keyword.model.update_word_request_wrapper import UpdateWordRequestWrapper


class TestUpdateWordRequestWrapper(unittest.TestCase):
    """UpdateWordRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateWordRequestWrapper(self):
        """Test UpdateWordRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateWordRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
