"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from accountshopping.api.account_shopping_service import AccountShoppingService  # noqa: E501


class TestAccountShoppingService(unittest.TestCase):
    """AccountShoppingService unit test stubs"""

    def setUp(self):
        self.api = AccountShoppingService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_account_shopping(self):
        """Test case for get_account_shopping

        """
        pass

    def test_update_account_shopping(self):
        """Test case for update_account_shopping

        """
        pass


if __name__ == '__main__':
    unittest.main()