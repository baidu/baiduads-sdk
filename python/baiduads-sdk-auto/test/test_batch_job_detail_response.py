"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.appcenterjob.model.batch_job_detail_dto import BatchJobDetailDto
from baiduads.appcenterjob.model.batch_job_result_detail_dto import BatchJobResultDetailDto
globals()['BatchJobDetailDto'] = BatchJobDetailDto
globals()['BatchJobResultDetailDto'] = BatchJobResultDetailDto
from baiduads.appcenterjob.model.batch_job_detail_response import BatchJobDetailResponse


class TestBatchJobDetailResponse(unittest.TestCase):
    """BatchJobDetailResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testBatchJobDetailResponse(self):
        """Test BatchJobDetailResponse"""
        # FIXME: construct object with mandatory attributes with example values
        # model = BatchJobDetailResponse()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
