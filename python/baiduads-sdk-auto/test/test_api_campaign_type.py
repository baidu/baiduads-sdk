"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.campaign.model.api_offline_time_type import ApiOfflineTimeType
from baiduads.campaign.model.api_schedule_type import ApiScheduleType
from baiduads.campaign.model.api_store_page_info_type import ApiStorePageInfoType
from baiduads.campaign.model.region_price_factor import RegionPriceFactor
from baiduads.campaign.model.schedule_price_factor import SchedulePriceFactor
globals()['ApiOfflineTimeType'] = ApiOfflineTimeType
globals()['ApiScheduleType'] = ApiScheduleType
globals()['ApiStorePageInfoType'] = ApiStorePageInfoType
globals()['RegionPriceFactor'] = RegionPriceFactor
globals()['SchedulePriceFactor'] = SchedulePriceFactor
from baiduads.campaign.model.api_campaign_type import ApiCampaignType


class TestApiCampaignType(unittest.TestCase):
    """ApiCampaignType unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testApiCampaignType(self):
        """Test ApiCampaignType"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ApiCampaignType()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
