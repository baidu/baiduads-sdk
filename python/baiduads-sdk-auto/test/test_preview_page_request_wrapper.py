"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.jmysite.model.jmy_preview_page_request import JmyPreviewPageRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['JmyPreviewPageRequest'] = JmyPreviewPageRequest
from baiduads.jmysite.model.preview_page_request_wrapper import PreviewPageRequestWrapper


class TestPreviewPageRequestWrapper(unittest.TestCase):
    """PreviewPageRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testPreviewPageRequestWrapper(self):
        """Test PreviewPageRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = PreviewPageRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
