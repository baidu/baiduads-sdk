"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from creativesuggest.api.creative_suggest_service import CreativeSuggestService  # noqa: E501


class TestCreativeSuggestService(unittest.TestCase):
    """CreativeSuggestService unit test stubs"""

    def setUp(self):
        self.api = CreativeSuggestService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_creative_segment_recommend(self):
        """Test case for get_creative_segment_recommend

        """
        pass


if __name__ == '__main__':
    unittest.main()
