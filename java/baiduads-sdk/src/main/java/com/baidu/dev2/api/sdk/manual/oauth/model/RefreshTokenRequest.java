package com.baidu.dev2.api.sdk.manual.oauth.model;


public class RefreshTokenRequest {

    /**
     * 应用 appid
     */
    private String appId;
    /**
     * 已有的更新令牌 refreshToken
     */
    private String refreshToken;
    /**
     * 应用持有的 secretKey
     */
    private String secretKey;
    /**
     * 同意授权的推广账户ID
     */
    private Long userId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
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
}
