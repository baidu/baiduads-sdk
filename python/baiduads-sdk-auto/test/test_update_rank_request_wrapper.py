"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.materialquestionmod.model.tesla_question_update_rank_request import TeslaQuestionUpdateRankRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TeslaQuestionUpdateRankRequest'] = TeslaQuestionUpdateRankRequest
from baiduads.materialquestionmod.model.update_rank_request_wrapper import UpdateRankRequestWrapper


class TestUpdateRankRequestWrapper(unittest.TestCase):
    """UpdateRankRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateRankRequestWrapper(self):
        """Test UpdateRankRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateRankRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
