"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from materialpersonmod.api.material_person_mod_service import MaterialPersonModService  # noqa: E501


class TestMaterialPersonModService(unittest.TestCase):
    """MaterialPersonModService unit test stubs"""

    def setUp(self):
        self.api = MaterialPersonModService()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_person(self):
        """Test case for add_person

        """
        pass

    def test_delete_person(self):
        """Test case for delete_person

        """
        pass

    def test_update_category(self):
        """Test case for update_category

        """
        pass

    def test_update_person(self):
        """Test case for update_person

        """
        pass

    def test_update_putaway(self):
        """Test case for update_putaway

        """
        pass

    def test_update_rank(self):
        """Test case for update_rank

        """
        pass


if __name__ == '__main__':
    unittest.main()
