"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.styleanalyse.model.decode_response_wrapper_body import DecodeResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['DecodeResponseWrapperBody'] = DecodeResponseWrapperBody
from baiduads.styleanalyse.model.decode_response_wrapper import DecodeResponseWrapper


class TestDecodeResponseWrapper(unittest.TestCase):
    """DecodeResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDecodeResponseWrapper(self):
        """Test DecodeResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DecodeResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
