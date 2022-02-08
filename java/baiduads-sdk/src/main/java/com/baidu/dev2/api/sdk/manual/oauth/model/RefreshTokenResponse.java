package com.baidu.dev2.api.sdk.manual.oauth.model;


public class RefreshTokenResponse {
    private Integer code;
    private String message;
    private AccessTokenInfo data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AccessTokenInfo getData() {
        return data;
    }

    public void setData(AccessTokenInfo data) {
        this.data = data;
    }
}
