"""
for test UploadClient
"""
import time
import unittest

from baiduads_manual.upload.upload_client import UploadClient


class TestUploadClient(unittest.TestCase):

    def setUp(self):
        self.client = UploadClient()

    def tearDown(self):
        pass

    def test_file_upload(self):
        file = "/tmp/test2.mp4"
        params = {"format": "mp4", "source": 2, "videoName": "test" + str(time.time()) + ".mp4", "httpProtocol": "HTTP"}
        path = "/json/sms/service/VideoUploadService/addVideo"
        # 请填写自己的信息
        form = [("token", "xxxxx"),
                ("username", "xxxxx"),
                ("password", "xxxxx"),
                ("target", "xxxxx"),
                ("signature", "xxxxx")]
        res = self.client.upload_file(
            path,
            file,
            form,
            params
        )
        print(res)


if __name__ == '__main__':
    unittest.main()
