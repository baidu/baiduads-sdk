"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.materialquestionmod.model.tesla_question_update_request import TeslaQuestionUpdateRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TeslaQuestionUpdateRequest'] = TeslaQuestionUpdateRequest
from baiduads.materialquestionmod.model.update_question_request_wrapper import UpdateQuestionRequestWrapper


class TestUpdateQuestionRequestWrapper(unittest.TestCase):
    """UpdateQuestionRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateQuestionRequestWrapper(self):
        """Test UpdateQuestionRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateQuestionRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()