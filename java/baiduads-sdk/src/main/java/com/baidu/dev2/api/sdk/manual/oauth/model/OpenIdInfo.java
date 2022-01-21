package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.Data;

@Data
public class OpenIdInfo {
    /**
     * 授权用户在平台+应用+UID维度下对应的唯一标识
     */
    private String openId;
}
