"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.materialquestionquery.model.tesla_question_list_request import TeslaQuestionListRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TeslaQuestionListRequest'] = TeslaQuestionListRequest
from baiduads.materialquestionquery.model.get_question_list_request_wrapper import GetQuestionListRequestWrapper


class TestGetQuestionListRequestWrapper(unittest.TestCase):
    """GetQuestionListRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetQuestionListRequestWrapper(self):
        """Test GetQuestionListRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetQuestionListRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
