"""
for test VideoUploadService
"""
import time
import unittest

from baiduads.common.model import ApiRequestHeader
from baiduads_manual.videoupload.api.video_upload_service import VideoUploadService
from baiduads_manual.videoupload.model.add_video_params import AddVideoParams
from baiduads_manual.videoupload.model.add_video_request import AddVideoRequest
from baiduads_manual.videoupload.model.add_video_request_wrapper import AddVideoRequestWrapper


class TestVideoUploadService(unittest.TestCase):

    def setUp(self):
        self.api = VideoUploadService()

    def tearDown(self):
        pass

    def test_add_video(self):
        file = "/tmp/test2.mp4"
        # 请填写自己的信息
        header = ApiRequestHeader(
            token="xxxxx",
            username="xxxxx",
            password="xxxxx",
            target="xxxxx",
            _spec_property_naming=True
        )
        body = AddVideoRequest(
            file=file,
            signature="8e26c5df42a9efe908370591a670b358",
            params=AddVideoParams(_format="mp4", source=2, videoName="test" + str(time.time()) + ".mp4",
                                  httpProtocol="HTTP")
        )
        add_video_request_wrapper = AddVideoRequestWrapper(
            header=header,
            body=body
        )
        res = self.api.add_video(add_video_request_wrapper)
        assert res.header.status == 0
        print(res)


if __name__ == '__main__':
    unittest.main()
