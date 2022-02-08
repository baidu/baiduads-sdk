package com.baidu.dev2.api.sdk.manual.oauth.model;


public class GetUserInfoRequset {
    /**
     * 授权用户查询标识
     */
    private String openId;

    /**
     * 已有的授权令牌
     */
    private String accessToken;

    /**
     * 同意授权的推广账户ID
     */
    private Long userId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

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
