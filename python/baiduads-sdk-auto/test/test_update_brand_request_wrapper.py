"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.materialbrandmod.model.tesla_brand_update_request import TeslaBrandUpdateRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TeslaBrandUpdateRequest'] = TeslaBrandUpdateRequest
from baiduads.materialbrandmod.model.update_brand_request_wrapper import UpdateBrandRequestWrapper


class TestUpdateBrandRequestWrapper(unittest.TestCase):
    """UpdateBrandRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateBrandRequestWrapper(self):
        """Test UpdateBrandRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateBrandRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
