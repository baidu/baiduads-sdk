"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from video.api.video_service import VideoService  # noqa: E501


class TestVideoService(unittest.TestCase):
    """VideoService unit test stubs"""

    def setUp(self):
        self.api = VideoService()  # noqa: E501

    def tearDown(self):
        pass

    def test_delete_videos(self):
        """Test case for delete_videos

        """
        pass

    def test_get_video_infos(self):
        """Test case for get_video_infos

        """
        pass


if __name__ == '__main__':
    unittest.main()
