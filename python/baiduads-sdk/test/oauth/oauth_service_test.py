"""
for test OAuthService
"""
import unittest

from baiduads_manual.oauth.api.oauth_service import OAuthService
from baiduads_manual.oauth.model.get_access_token_request import GetAccessTokenRequest
from baiduads_manual.oauth.model.get_open_id_request import GetOpenIdRequest
from baiduads_manual.oauth.model.get_user_info_request import GetUserInfoRequest
from baiduads_manual.oauth.model.refresh_token_request import RefreshTokenRequest


class TestOAuthService(unittest.TestCase):

    def setUp(self):
        self.api = OAuthService()  # noqa: E501
        self.authCode = "xxxxx"
        self.secretKey = "xxxxx"
        self.appId = "xxxxx"
        self.userId = 0
        self.grantType = "access_token"

    def tearDown(self):
        pass

    def test_get_access_token1(self):
        """Test case for get_access_token

        测试异常情况
        """
        request = GetAccessTokenRequest("x", "x", "x", "x", 1)
        res = self.api.get_access_token(request)
        assert res.code == 30002
        assert res.message == "应用不存在"

    def test_get_access_token2(self):
        """Test case for  get_access_token
        """
        request = GetAccessTokenRequest(self.appId,
                                        self.authCode,
                                        self.secretKey,
                                        self.grantType,
                                        self.userId)
        res = self.api.get_access_token(request)
        assert res.code == 0
        assert res.data.accessToken is not None
        assert res.data.refreshToken is not None

    def test_get_open_id1(self):
        request = GetOpenIdRequest("x", 1)
        res = self.api.get_open_id(request)
        assert res.code == 50004

    def test_get_open_id2(self):
        request = GetAccessTokenRequest(self.appId,
                                        self.authCode,
                                        self.secretKey,
                                        self.grantType,
                                        self.userId)
        res = self.api.get_access_token(request)
        accessToken = res.data.accessToken

        request = GetOpenIdRequest(accessToken, self.userId)
        res = self.api.get_open_id(request)
        assert res.code == 0
        assert res.data.openId is not None

    def test_refresh_token1(self):
        request = RefreshTokenRequest("x", "x", "x", 1)
        res = self.api.refresh_token(request)
        assert res.code == 50004
        assert res.message == "token验证不通过"

    def test_refresh_token2(self):
        request = GetAccessTokenRequest(self.appId,
                                        self.authCode,
                                        self.secretKey,
                                        self.grantType,
                                        self.userId)
        res = self.api.get_access_token(request)
        refreshToken = res.data.refreshToken

        request = RefreshTokenRequest(self.appId,
                                      refreshToken,
                                      self.secretKey,
                                      self.userId)
        res = self.api.refresh_token(request)
        assert res.code == 0
        assert res.data.accessToken is not None
        self.access_token = res.data.accessToken

    def test_get_user_info1(self):
        request = GetAccessTokenRequest(self.appId,
                                        self.authCode,
                                        self.secretKey,
                                        self.grantType,
                                        self.userId)
        res = self.api.get_access_token(request)
        accessToken = res.data.accessToken

        request = GetOpenIdRequest(accessToken, self.userId)
        res = self.api.get_open_id(request)
        openId = res.data.openId

        request = GetUserInfoRequest(accessToken,
                                     self.userId,
                                     openId)
        res = self.api.get_user_info(request)
        assert res.code == 0
        assert res.data.masterUid is not None

    def test_get_user_info2(self):
        request = GetUserInfoRequest("x",
                                     self.userId,
                                     "x")
        res = self.api.get_user_info(request)
        assert res.code == 50004


if __name__ == '__main__':
    unittest.main()
