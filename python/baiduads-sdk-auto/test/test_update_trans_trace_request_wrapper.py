"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.traceapi.model.trans_trace_update_request import TransTraceUpdateRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TransTraceUpdateRequest'] = TransTraceUpdateRequest
from baiduads.traceapi.model.update_trans_trace_request_wrapper import UpdateTransTraceRequestWrapper


class TestUpdateTransTraceRequestWrapper(unittest.TestCase):
    """UpdateTransTraceRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateTransTraceRequestWrapper(self):
        """Test UpdateTransTraceRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateTransTraceRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
