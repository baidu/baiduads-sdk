package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOpenIdRequest {
    /**
     * 授权令牌accessToken
     */
    private String accessToken;

    /**
     * 同意授权用户ucid
     */
    private Long userId;
    
}
