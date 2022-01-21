package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAccessTokenRequest {
    /**
     * 应用ID
     */
    private String appId;
    /**
     * 临时授权码
     */
    private String authCode;
    /**
     * 应用安全码
     */
    private String secretKey;
    /**
     * 授权账户ID
     */
    private Long userId;
    /**
     * 授权令牌获取模式
     */
    private String grantType = "access_token";

}