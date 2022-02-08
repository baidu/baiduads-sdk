package com.baidu.dev2.api.sdk.manual.oauth.model;


public class GetOpenIdRequest {
    /**
     * 授权令牌accessToken
     */
    private String accessToken;

    /**
     * 同意授权用户ucid
     */
    private Long userId;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
