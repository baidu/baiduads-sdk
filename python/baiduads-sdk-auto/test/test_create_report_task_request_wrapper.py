"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.openapireport.model.report_file_request import ReportFileRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['ReportFileRequest'] = ReportFileRequest
from baiduads.openapireport.model.create_report_task_request_wrapper import CreateReportTaskRequestWrapper


class TestCreateReportTaskRequestWrapper(unittest.TestCase):
    """CreateReportTaskRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCreateReportTaskRequestWrapper(self):
        """Test CreateReportTaskRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = CreateReportTaskRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
