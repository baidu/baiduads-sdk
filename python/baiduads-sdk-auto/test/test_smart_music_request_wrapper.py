"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.videoediter.model.smart_music_request import SmartMusicRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['SmartMusicRequest'] = SmartMusicRequest
from baiduads.videoediter.model.smart_music_request_wrapper import SmartMusicRequestWrapper


class TestSmartMusicRequestWrapper(unittest.TestCase):
    """SmartMusicRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSmartMusicRequestWrapper(self):
        """Test SmartMusicRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = SmartMusicRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()