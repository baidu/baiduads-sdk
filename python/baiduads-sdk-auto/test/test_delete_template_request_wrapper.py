"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.cyctemplate.model.cyc_template_del_request import CycTemplateDelRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['CycTemplateDelRequest'] = CycTemplateDelRequest
from baiduads.cyctemplate.model.delete_template_request_wrapper import DeleteTemplateRequestWrapper


class TestDeleteTemplateRequestWrapper(unittest.TestCase):
    """DeleteTemplateRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteTemplateRequestWrapper(self):
        """Test DeleteTemplateRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteTemplateRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
