"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.ocpc.model.mod_package_request import ModPackageRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['ModPackageRequest'] = ModPackageRequest
from baiduads.ocpc.model.add_target_package_request_wrapper import AddTargetPackageRequestWrapper


class TestAddTargetPackageRequestWrapper(unittest.TestCase):
    """AddTargetPackageRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddTargetPackageRequestWrapper(self):
        """Test AddTargetPackageRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddTargetPackageRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
