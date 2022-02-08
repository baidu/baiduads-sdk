package com.baidu.dev2.api.sdk.manual.oauth.model;


public class GetAccessTokenRequest {
    /**
     * 应用ID
     */
    private String appId;
    /**
     * 临时授权码
     */
    private String authCode;
    /**
     * 应用安全码
     */
    private String secretKey;
    /**
     * 授权账户ID
     */
    private Long userId;
    /**
     * 授权令牌获取模式
     */
    private String grantType = "access_token";

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}