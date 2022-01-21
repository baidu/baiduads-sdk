/*
 *  Baidu.com Inc.
 *  Copyright (c)  2021 All Rights Reserved.
 */

package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.Data;

/**
 * @author fanliyan
 * @version 1.0
 * @since 2021/9/9 4:52 下午
 */
@Data
public class GetAccessTokenResponse {
    private Integer code;
    private AccessTokenInfo data;
    private String message;
}
