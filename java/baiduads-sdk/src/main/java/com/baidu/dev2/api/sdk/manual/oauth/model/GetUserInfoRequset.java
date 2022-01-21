package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserInfoRequset {
    /**
     * 授权用户查询标识
     */
    private String openId;

    /**
     * 已有的授权令牌
     */
    private String accessToken;

    /**
     * 同意授权的推广账户ID
     */
    private Long userId;
}
