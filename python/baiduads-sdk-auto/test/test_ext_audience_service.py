"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from extaudience.api.ext_audience_service import ExtAudienceService  # noqa: E501


class TestExtAudienceService(unittest.TestCase):
    """ExtAudienceService unit test stubs"""

    def setUp(self):
        self.api = ExtAudienceService()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_empty_group(self):
        """Test case for create_empty_group

        """
        pass

    def test_get_audience_list(self):
        """Test case for get_audience_list

        """
        pass

    def test_update_audience_dsp(self):
        """Test case for update_audience_dsp

        """
        pass

    def test_update_id_upload4_pour(self):
        """Test case for update_id_upload4_pour

        """
        pass


if __name__ == '__main__':
    unittest.main()
