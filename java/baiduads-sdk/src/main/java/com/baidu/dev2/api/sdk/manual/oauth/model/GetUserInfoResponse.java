package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.Data;

@Data
public class GetUserInfoResponse {
    private Integer code;
    private String message;
    private UserInfo data;
}
