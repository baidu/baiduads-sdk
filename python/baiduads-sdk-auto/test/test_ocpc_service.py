"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from ocpc.api.ocpc_service import OcpcService  # noqa: E501


class TestOcpcService(unittest.TestCase):
    """OcpcService unit test stubs"""

    def setUp(self):
        self.api = OcpcService()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_target_package(self):
        """Test case for add_target_package

        """
        pass

    def test_delete_target_package(self):
        """Test case for delete_target_package

        """
        pass

    def test_get_hint_audit_time(self):
        """Test case for get_hint_audit_time

        """
        pass

    def test_get_target_package_list(self):
        """Test case for get_target_package_list

        """
        pass

    def test_update_target_package(self):
        """Test case for update_target_package

        """
        pass


if __name__ == '__main__':
    unittest.main()
