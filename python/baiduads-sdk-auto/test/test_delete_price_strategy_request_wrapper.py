"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.pricestrategy.model.price_strategy_del_request import PriceStrategyDelRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['PriceStrategyDelRequest'] = PriceStrategyDelRequest
from baiduads.pricestrategy.model.delete_price_strategy_request_wrapper import DeletePriceStrategyRequestWrapper


class TestDeletePriceStrategyRequestWrapper(unittest.TestCase):
    """DeletePriceStrategyRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeletePriceStrategyRequestWrapper(self):
        """Test DeletePriceStrategyRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeletePriceStrategyRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()