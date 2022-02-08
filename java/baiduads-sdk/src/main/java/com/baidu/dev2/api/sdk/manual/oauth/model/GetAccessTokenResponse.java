/*
 *  Baidu.com Inc.
 *  Copyright (c)  2021 All Rights Reserved.
 */

package com.baidu.dev2.api.sdk.manual.oauth.model;


/**
 * @author fanliyan
 * @version 1.0
 * @since 2021/9/9 4:52 下午
 */
public class GetAccessTokenResponse {
    private Integer code;
    private AccessTokenInfo data;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public AccessTokenInfo getData() {
        return data;
    }

    public void setData(AccessTokenInfo data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
