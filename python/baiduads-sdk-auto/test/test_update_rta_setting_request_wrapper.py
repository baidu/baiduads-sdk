"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.rtafeed.model.rta_setting_type import RtaSettingType
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['RtaSettingType'] = RtaSettingType
from baiduads.rtafeed.model.update_rta_setting_request_wrapper import UpdateRtaSettingRequestWrapper


class TestUpdateRtaSettingRequestWrapper(unittest.TestCase):
    """UpdateRtaSettingRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateRtaSettingRequestWrapper(self):
        """Test UpdateRtaSettingRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateRtaSettingRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
