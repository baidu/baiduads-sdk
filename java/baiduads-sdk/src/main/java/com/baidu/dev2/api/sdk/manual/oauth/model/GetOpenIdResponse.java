package com.baidu.dev2.api.sdk.manual.oauth.model;


public class GetOpenIdResponse {
    private Integer code;
    private String message;
    private OpenIdInfo data;

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

    public OpenIdInfo getData() {
        return data;
    }

    public void setData(OpenIdInfo data) {
        this.data = data;
    }
}
