"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.rtafeed.model.del_setting_request import DelSettingRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['DelSettingRequest'] = DelSettingRequest
from baiduads.rtafeed.model.del_strategy_request_wrapper import DelStrategyRequestWrapper


class TestDelStrategyRequestWrapper(unittest.TestCase):
    """DelStrategyRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDelStrategyRequestWrapper(self):
        """Test DelStrategyRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DelStrategyRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
