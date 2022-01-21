package com.baidu.dev2.api.sdk.oauth;


import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.manual.oauth.api.OAuthService;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetAccessTokenRequest;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetAccessTokenResponse;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetOpenIdRequest;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetOpenIdResponse;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetUserInfoRequset;
import com.baidu.dev2.api.sdk.manual.oauth.model.GetUserInfoResponse;
import com.baidu.dev2.api.sdk.manual.oauth.model.RefreshTokenRequest;
import com.baidu.dev2.api.sdk.manual.oauth.model.RefreshTokenResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OAuthServiceTest {
    private OAuthService oAuthService;

    private String appId = "xxxxx";
    private Long userId = 1L;
    private String authCode = "xxxxx";
    private String secretKey = "xxxxx";
    private String accessToken;
    private String refreshToken;
    private String openId;

    @Before
    public void before() {
        oAuthService = new OAuthService();
    }

    @Test
    public void getAccessToken1() throws ApiException {
        GetAccessTokenRequest request = new GetAccessTokenRequest();
        request.setAppId(appId);
        request.setUserId(userId);
        request.setAuthCode(authCode);
        request.setSecretKey(secretKey);
        GetAccessTokenResponse response = oAuthService.getAccessToken(request);
        Assert.assertTrue(response.getCode() == 0);
        Assert.assertNotNull(response.getData());
        Assert.assertNotNull(response.getData().getAccessToken());
        Assert.assertNotNull(response.getData().getRefreshToken());
    }

    @Test
    public void getAccessToken2() throws ApiException {
        GetAccessTokenRequest request = new GetAccessTokenRequest();
        request.setAppId("x");
        request.setUserId(userId);
        request.setAuthCode(authCode);
        request.setSecretKey(secretKey);
        GetAccessTokenResponse response = oAuthService.getAccessToken(request);
        Assert.assertTrue(response.getCode() == 30002);

    }

    @Test
    public void getOpenId() throws ApiException {
        GetAccessTokenRequest req = new GetAccessTokenRequest();
        req.setAppId(appId);
        req.setUserId(userId);
        req.setAuthCode(authCode);
        req.setSecretKey(secretKey);
        GetAccessTokenResponse resp = oAuthService.getAccessToken(req);
        Assert.assertTrue(resp.getCode() == 0);
        accessToken = resp.getData().getAccessToken();
        refreshToken = resp.getData().getRefreshToken();


        GetOpenIdRequest request = new GetOpenIdRequest();
        request.setAccessToken(accessToken);
        request.setUserId(userId);
        GetOpenIdResponse response = oAuthService.getOpenId(request);
        Assert.assertTrue(response.getCode() == 0);
        Assert.assertNotNull(response.getData());
        Assert.assertNotNull(response.getData().getOpenId());
        openId = response.getData().getOpenId();
    }

    @Test
    public void getUserInfo() throws ApiException {
        GetAccessTokenRequest req = new GetAccessTokenRequest();
        req.setAppId(appId);
        req.setUserId(userId);
        req.setAuthCode(authCode);
        req.setSecretKey(secretKey);
        GetAccessTokenResponse resp = oAuthService.getAccessToken(req);
        Assert.assertTrue(resp.getCode() == 0);
        accessToken = resp.getData().getAccessToken();
        refreshToken = resp.getData().getRefreshToken();


        GetOpenIdRequest req2 = new GetOpenIdRequest();
        req2.setAccessToken(accessToken);
        req2.setUserId(userId);
        GetOpenIdResponse resp2 = oAuthService.getOpenId(req2);
        Assert.assertTrue(resp2.getCode() == 0);
        openId = resp2.getData().getOpenId();


        GetUserInfoRequset request = new GetUserInfoRequset();
        request.setUserId(userId);
        request.setAccessToken(accessToken);
        request.setOpenId(openId);
        GetUserInfoResponse response = oAuthService.getUserInfo(request);
        Assert.assertTrue(response.getCode() == 0);
        Assert.assertNotNull(response.getData());
        Assert.assertNotNull(response.getData().getMasterUid());
    }


    @Test
    public void refreshToken() throws ApiException {
        GetAccessTokenRequest req = new GetAccessTokenRequest();
        req.setAppId(appId);
        req.setUserId(userId);
        req.setAuthCode(authCode);
        req.setSecretKey(secretKey);
        GetAccessTokenResponse resp = oAuthService.getAccessToken(req);
        Assert.assertTrue(resp.getCode() == 0);
        accessToken = resp.getData().getAccessToken();
        refreshToken = resp.getData().getRefreshToken();

        RefreshTokenRequest request = new RefreshTokenRequest();
        request.setRefreshToken(refreshToken);
        request.setAppId(appId);
        request.setUserId(userId);
        request.setSecretKey(secretKey);
        RefreshTokenResponse response = oAuthService.refreshToken(request);
        Assert.assertTrue(response.getCode() == 0);
        Assert.assertNotNull(response.getData());
        Assert.assertNotNull(response.getData().getAccessToken());
        Assert.assertNotNull(response.getData().getRefreshToken());
    }
}
