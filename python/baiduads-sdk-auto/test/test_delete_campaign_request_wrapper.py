"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.campaign.model.api_campaign_del_request import ApiCampaignDelRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiCampaignDelRequest'] = ApiCampaignDelRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.campaign.model.delete_campaign_request_wrapper import DeleteCampaignRequestWrapper


class TestDeleteCampaignRequestWrapper(unittest.TestCase):
    """DeleteCampaignRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteCampaignRequestWrapper(self):
        """Test DeleteCampaignRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteCampaignRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
