"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.ocpc.model.del_package_request import DelPackageRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['DelPackageRequest'] = DelPackageRequest
from baiduads.ocpc.model.delete_target_package_request_wrapper import DeleteTargetPackageRequestWrapper


class TestDeleteTargetPackageRequestWrapper(unittest.TestCase):
    """DeleteTargetPackageRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteTargetPackageRequestWrapper(self):
        """Test DeleteTargetPackageRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteTargetPackageRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
