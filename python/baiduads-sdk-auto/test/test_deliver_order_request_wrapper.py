"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.platorderbusiness.model.plat_order_deliver_request import PlatOrderDeliverRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['PlatOrderDeliverRequest'] = PlatOrderDeliverRequest
from baiduads.platorderbusiness.model.deliver_order_request_wrapper import DeliverOrderRequestWrapper


class TestDeliverOrderRequestWrapper(unittest.TestCase):
    """DeliverOrderRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeliverOrderRequestWrapper(self):
        """Test DeliverOrderRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeliverOrderRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()