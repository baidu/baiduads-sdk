"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.cyctemplate.model.cyc_template_mod_request import CycTemplateModRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['CycTemplateModRequest'] = CycTemplateModRequest
from baiduads.cyctemplate.model.update_template_request_wrapper import UpdateTemplateRequestWrapper


class TestUpdateTemplateRequestWrapper(unittest.TestCase):
    """UpdateTemplateRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateTemplateRequestWrapper(self):
        """Test UpdateTemplateRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateTemplateRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()