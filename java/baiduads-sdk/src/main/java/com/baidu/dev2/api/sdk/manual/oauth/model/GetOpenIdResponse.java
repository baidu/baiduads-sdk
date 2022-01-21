package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.Data;

@Data
public class GetOpenIdResponse {
    private Integer code;
    private String message;
    private OpenIdInfo data;
}
