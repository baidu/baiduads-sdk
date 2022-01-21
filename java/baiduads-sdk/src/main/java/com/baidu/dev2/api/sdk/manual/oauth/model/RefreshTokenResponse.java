package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.Data;

@Data
public class RefreshTokenResponse {
    private Integer code;
    private String message;
    private AccessTokenInfo data;
}
