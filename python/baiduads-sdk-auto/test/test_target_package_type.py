"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.ocpc.model.target_package_bind_info import TargetPackageBindInfo
from baiduads.ocpc.model.target_package_dataflow_info import TargetPackageDataflowInfo
from baiduads.ocpc.model.unbind_shared_budget_info import UnbindSharedBudgetInfo
globals()['TargetPackageBindInfo'] = TargetPackageBindInfo
globals()['TargetPackageDataflowInfo'] = TargetPackageDataflowInfo
globals()['UnbindSharedBudgetInfo'] = UnbindSharedBudgetInfo
from baiduads.ocpc.model.target_package_type import TargetPackageType


class TestTargetPackageType(unittest.TestCase):
    """TargetPackageType unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTargetPackageType(self):
        """Test TargetPackageType"""
        # FIXME: construct object with mandatory attributes with example values
        # model = TargetPackageType()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
