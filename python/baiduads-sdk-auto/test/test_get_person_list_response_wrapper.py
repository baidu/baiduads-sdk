"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.materialpersonquery.model.get_person_list_response_wrapper_body import GetPersonListResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetPersonListResponseWrapperBody'] = GetPersonListResponseWrapperBody
from baiduads.materialpersonquery.model.get_person_list_response_wrapper import GetPersonListResponseWrapper


class TestGetPersonListResponseWrapper(unittest.TestCase):
    """GetPersonListResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetPersonListResponseWrapper(self):
        """Test GetPersonListResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetPersonListResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()