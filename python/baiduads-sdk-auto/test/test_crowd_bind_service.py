"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from crowdbind.api.crowd_bind_service import CrowdBindService  # noqa: E501


class TestCrowdBindService(unittest.TestCase):
    """CrowdBindService unit test stubs"""

    def setUp(self):
        self.api = CrowdBindService()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_bind(self):
        """Test case for add_bind

        """
        pass

    def test_delete_bind(self):
        """Test case for delete_bind

        """
        pass

    def test_get_bind(self):
        """Test case for get_bind

        """
        pass

    def test_update_bind(self):
        """Test case for update_bind

        """
        pass


if __name__ == '__main__':
    unittest.main()