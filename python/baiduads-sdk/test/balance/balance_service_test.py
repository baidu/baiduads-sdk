"""
for test BalanceService
"""
import unittest

from baiduads.balance.balance_service import BalanceService
from baiduads.balance.model import GetBalanceInfoRequestWrapper, GetBalanceInfoRequest
from baiduads.common.model import ApiRequestHeader


class TestBalanceService(unittest.TestCase):

    def setUp(self):
        self.api = BalanceService()

    def tearDown(self):
        pass

    def test_get_balance_info(self):
        """Test case for get_balance_info

        """
        request_header = ApiRequestHeader(
            token="xxxxx",
            username="xxxxx",
            password="xxxxx",
            _spec_property_naming=True
        )

        request_body = GetBalanceInfoRequest(
            productIds=[1, 502],
            _spec_property_naming=True
        )

        get_balance_info_request_wrapper = GetBalanceInfoRequestWrapper(
            header=request_header,
            body=request_body,
            _spec_property_naming=True
        )

        response_wrapper = self.api.get_balance_info(get_balance_info_request_wrapper)

        assert response_wrapper.header.status == 0
        print(response_wrapper)


if __name__ == '__main__':
    unittest.main()
