"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from preaudit.api.pre_audit_service import PreAuditService  # noqa: E501


class TestPreAuditService(unittest.TestCase):
    """PreAuditService unit test stubs"""

    def setUp(self):
        self.api = PreAuditService()  # noqa: E501

    def tearDown(self):
        pass

    def test_material_pre_audit(self):
        """Test case for material_pre_audit

        """
        pass


if __name__ == '__main__':
    unittest.main()
