"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.campaignshopping.model.material import Material
from baiduads.campaignshopping.model.schedule import Schedule
globals()['Material'] = Material
globals()['Schedule'] = Schedule
from baiduads.campaignshopping.model.campaign_shopping_type import CampaignShoppingType


class TestCampaignShoppingType(unittest.TestCase):
    """CampaignShoppingType unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCampaignShoppingType(self):
        """Test CampaignShoppingType"""
        # FIXME: construct object with mandatory attributes with example values
        # model = CampaignShoppingType()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()