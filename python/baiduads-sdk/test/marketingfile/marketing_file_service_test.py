"""
for test MarketingFileService
"""
import time
import unittest

from baiduads.common.model import ApiRequestHeader
from baiduads_manual.marketingfile.api.marketing_file_service import MarketingFileService
from baiduads_manual.marketingfile.model.upload_file_params import UploadFileParams
from baiduads_manual.marketingfile.model.upload_file_request import UploadFileRequest
from baiduads_manual.marketingfile.model.upload_file_request_wrapper import UploadFileRequestWrapper


class TestMarketingFileService(unittest.TestCase):

    def setUp(self):
        self.api = MarketingFileService()

    def tearDown(self):
        pass

    def test_upload_file_simple(self):
        file = "/tmp/a.txt"
        # 请填写自己的信息
        header = ApiRequestHeader(
            token="xxxxx",
            username="xxxxx",
            password="xxxxx",
            target="xxxxx",
            _spec_property_naming=True
        )
        body = UploadFileRequest(
            file=file,
            params=UploadFileParams(fileName="test" + str(time.time()) + ".txt",
                                    fileType="txt",
                                    storeType="temp",
                                    bizFlag="audience")
        )

        upload_file_request_wrapper = UploadFileRequestWrapper(
            header=header,
            body=body
        )
        res = self.api.upload_file(upload_file_request_wrapper)
        assert res.header.status == 0
        print(res)

    def test_upload_file_simple_with_timeout(self):
        file = "/tmp/a.txt"
        # 请填写自己的信息
        header = ApiRequestHeader(
            token="xxxxx",
            username="xxxxx",
            password="xxxxx",
            target="xxxxx",
            _spec_property_naming=True
        )
        body = UploadFileRequest(
            file=file,
            params=UploadFileParams(fileName="test" + str(time.time()) + ".txt",
                                    fileType="txt",
                                    storeType="temp",
                                    bizFlag="audience"),
            timeout=500
        )

        upload_file_request_wrapper = UploadFileRequestWrapper(
            header=header,
            body=body
        )
        res = self.api.upload_file(upload_file_request_wrapper)
        print(res)
        assert res.header.status == 0

    def test_upload_file_multipart(self):
        file = "/tmp/b.txt"
        # 请填写自己的信息
        header = ApiRequestHeader(
            token="xxxxx",
            username="xxxxx",
            password="xxxxx",
            target="xxxxx",
            _spec_property_naming=True
        )
        body = UploadFileRequest(
            file=file,
            params=UploadFileParams(fileName="test" + str(time.time()) + ".txt",
                                    fileType="txt",
                                    storeType="temp",
                                    bizFlag="audience")
        )

        upload_file_request_wrapper = UploadFileRequestWrapper(
            header=header,
            body=body
        )
        res = self.api.upload_file(upload_file_request_wrapper)
        print(res)
        assert res.header.status == 0

    def test_upload_file_multipart_with_timeout(self):
        file = "/tmp/b.txt"
        # 请填写自己的信息
        header = ApiRequestHeader(
            token="xxxxx",
            username="xxxxx",
            password="xxxxx",
            target="xxxxx",
            _spec_property_naming=True
        )
        body = UploadFileRequest(
            file=file,
            params=UploadFileParams(fileName="test" + str(time.time()) + ".txt",
                                    fileType="txt",
                                    storeType="temp",
                                    bizFlag="audience"),
            timeout=10000
        )

        upload_file_request_wrapper = UploadFileRequestWrapper(
            header=header,
            body=body
        )
        res = self.api.upload_file(upload_file_request_wrapper)
        print(res)
        assert res.header.status == 0


if __name__ == '__main__':
    unittest.main()
