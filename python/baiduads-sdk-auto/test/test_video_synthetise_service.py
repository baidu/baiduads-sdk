"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from videosynthetise.api.video_synthetise_service import VideoSynthetiseService  # noqa: E501


class TestVideoSynthetiseService(unittest.TestCase):
    """VideoSynthetiseService unit test stubs"""

    def setUp(self):
        self.api = VideoSynthetiseService()  # noqa: E501

    def tearDown(self):
        pass

    def test_clip_video(self):
        """Test case for clip_video

        """
        pass

    def test_query_video_clip_status(self):
        """Test case for query_video_clip_status

        """
        pass


if __name__ == '__main__':
    unittest.main()
