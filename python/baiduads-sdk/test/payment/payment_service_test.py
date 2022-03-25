"""
for test PaymentService
"""
import unittest

from baiduads.common.model import ApiRequestHeader
from baiduads.payment.api import PaymentService
from baiduads.payment.model import GetPaymentRecordRequestWrapper, GetPaymentRecordRequest, Condition, Paytime, Status, \
    Offset, IdOffset, Sort


class TestPaymentService(unittest.TestCase):

    def setUp(self):
        self.api = PaymentService()

    def tearDown(self):
        pass

    def test_get_payment_record(self):
        """Test case for get_payment_record

        """
        request_header = ApiRequestHeader(
            token="xxxxx",
            username="xxxxx",
            password="xxxxx",
            _spec_property_naming=True
        )

        conditon = Condition(
            paytime=Paytime(
                lte="2022-03-15 00:00:00",
                gte="2022-03-01 00:00:00",
                _spec_property_naming=True
            ),
            status=Status(_in=[0, 1, 2]),
            _spec_property_naming=True
        )

        offset = Offset(
            id=IdOffset(
                gt=0,
                _spec_property_naming=True
            ),
            _spec_property_naming=True
        )

        sort = Sort(
            _in=["id asc"],
            _spec_property_naming=True
        )

        request_body = GetPaymentRecordRequest(
            fundtype=1,
            condition=conditon,
            chunksize=10,
            offset=offset,
            sort=sort,
            _spec_property_naming=True
        )

        get_payment_record_request_wrapper = GetPaymentRecordRequestWrapper(
            header=request_header,
            body=request_body,
            _spec_property_naming=True
        )

        response_wrapper = self.api.get_payment_record(get_payment_record_request_wrapper)

        assert response_wrapper.header.status == 0
        print(response_wrapper)


if __name__ == '__main__':
    unittest.main()
