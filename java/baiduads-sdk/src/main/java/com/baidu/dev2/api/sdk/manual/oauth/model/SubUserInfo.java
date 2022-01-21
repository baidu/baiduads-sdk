package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.Data;

@Data
public class SubUserInfo {
    /**
     * 同意授权用户关联的子账号ucid
     */
    private Integer ucId;
    /**
     * 同意授权用户关联的子账号ucname
     */
    private String ucName;
}
