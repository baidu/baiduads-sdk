package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefreshTokenRequest {

    /**
     * 应用 appid
     */
    private String appId;
    /**
     * 已有的更新令牌 refreshToken
     */
    private String refreshToken;
    /**
     * 应用持有的 secretKey
     */
    private String secretKey;
    /**
     * 同意授权的推广账户ID
     */
    private Long userId;
}
