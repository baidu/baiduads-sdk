"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.videoauditapi.model.query_task_response_wrapper_body import QueryTaskResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['QueryTaskResponseWrapperBody'] = QueryTaskResponseWrapperBody
from baiduads.videoauditapi.model.query_task_response_wrapper import QueryTaskResponseWrapper


class TestQueryTaskResponseWrapper(unittest.TestCase):
    """QueryTaskResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testQueryTaskResponseWrapper(self):
        """Test QueryTaskResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = QueryTaskResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
