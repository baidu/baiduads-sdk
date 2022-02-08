package com.baidu.dev2.api.sdk.manual.oauth.model;


public class GetUserInfoResponse {
    private Integer code;
    private String message;
    private UserInfo data;

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

    public UserInfo getData() {
        return data;
    }

    public void setData(UserInfo data) {
        this.data = data;
    }
}
