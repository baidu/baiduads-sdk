"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from oauthauthorizedtoolapi.api.o_auth_authorized_tool_api import OAuthAuthorizedToolAPI  # noqa: E501


class TestOAuthAuthorizedToolAPI(unittest.TestCase):
    """OAuthAuthorizedToolAPI unit test stubs"""

    def setUp(self):
        self.api = OAuthAuthorizedToolAPI()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_auth_code(self):
        """Test case for get_auth_code

        """
        pass


if __name__ == '__main__':
    unittest.main()
