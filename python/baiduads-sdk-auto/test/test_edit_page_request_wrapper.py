"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.jmysite.model.jmy_edit_page_request import JmyEditPageRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['JmyEditPageRequest'] = JmyEditPageRequest
from baiduads.jmysite.model.edit_page_request_wrapper import EditPageRequestWrapper


class TestEditPageRequestWrapper(unittest.TestCase):
    """EditPageRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testEditPageRequestWrapper(self):
        """Test EditPageRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = EditPageRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
