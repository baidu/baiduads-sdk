"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.materialpersonmod.model.tesla_person_update_request import TeslaPersonUpdateRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TeslaPersonUpdateRequest'] = TeslaPersonUpdateRequest
from baiduads.materialpersonmod.model.update_person_request_wrapper import UpdatePersonRequestWrapper


class TestUpdatePersonRequestWrapper(unittest.TestCase):
    """UpdatePersonRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdatePersonRequestWrapper(self):
        """Test UpdatePersonRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdatePersonRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
