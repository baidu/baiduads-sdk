"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.crowd.model.crowd_del_request import CrowdDelRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['CrowdDelRequest'] = CrowdDelRequest
from baiduads.crowd.model.delete_crowd_request_wrapper import DeleteCrowdRequestWrapper


class TestDeleteCrowdRequestWrapper(unittest.TestCase):
    """DeleteCrowdRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteCrowdRequestWrapper(self):
        """Test DeleteCrowdRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteCrowdRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
