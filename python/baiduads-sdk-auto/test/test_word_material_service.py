"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from wordmaterial.api.word_material_service import WordMaterialService  # noqa: E501


class TestWordMaterialService(unittest.TestCase):
    """WordMaterialService unit test stubs"""

    def setUp(self):
        self.api = WordMaterialService()  # noqa: E501

    def tearDown(self):
        pass

    def test_search(self):
        """Test case for search

        """
        pass


if __name__ == '__main__':
    unittest.main()