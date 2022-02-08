/*
 *  Baidu.com Inc.
 *  Copyright (c)  2021 All Rights Reserved.
 */

package com.baidu.dev2.api.sdk.manual.oauth.model;


import java.util.Map;

/**
 * @author fanliyan
 * @version 1.0
 * @since  2021/9/9 4:55 下午
 */
public class AccessTokenInfo {
    /**
     * 授权令牌
     */
    private String accessToken;

    /**
     * 更新令牌
     */
    private String refreshToken;

    /**
     * 授权令牌到期时间
     */
    private String expiresTime;

    /**
     * 更新令牌到期时间
     */
    private String refreshExpiresTime;

    /**
     * 授权令牌剩余有效时间，单位：秒
     */
    private Integer expiresIn;

    /**
     * 更新令牌剩余有效时间，单位：秒
     */
    private Integer refreshExpiresIn;

    /**
     * 应用的权限列表，客户关注value即可
     */
    private Map<String, String> scope;

    /**
     * 授权用户在应用+账户ID维度下对应的唯一标识
     */
    private String openId;

    /**
     * 授权账户ID
     */
    private Long userId;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(String expiresTime) {
        this.expiresTime = expiresTime;
    }

    public String getRefreshExpiresTime() {
        return refreshExpiresTime;
    }

    public void setRefreshExpiresTime(String refreshExpiresTime) {
        this.refreshExpiresTime = refreshExpiresTime;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Integer getRefreshExpiresIn() {
        return refreshExpiresIn;
    }

    public void setRefreshExpiresIn(Integer refreshExpiresIn) {
        this.refreshExpiresIn = refreshExpiresIn;
    }

    public Map<String, String> getScope() {
        return scope;
    }

    public void setScope(Map<String, String> scope) {
        this.scope = scope;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
