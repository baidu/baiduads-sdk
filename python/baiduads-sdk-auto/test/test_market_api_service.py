"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from marketapi.api.market_api_service import MarketApiService  # noqa: E501


class TestMarketApiService(unittest.TestCase):
    """MarketApiService unit test stubs"""

    def setUp(self):
        self.api = MarketApiService()  # noqa: E501

    def tearDown(self):
        pass

    def test_cancel_order(self):
        """Test case for cancel_order

        """
        pass

    def test_create_order(self):
        """Test case for create_order

        """
        pass

    def test_get_order_info(self):
        """Test case for get_order_info

        """
        pass

    def test_get_site_info(self):
        """Test case for get_site_info

        """
        pass

    def test_preview_site(self):
        """Test case for preview_site

        """
        pass


if __name__ == '__main__':
    unittest.main()