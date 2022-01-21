package com.baidu.dev2.api.sdk.manual.oauth.model;

import lombok.Data;

import java.util.List;

@Data
public class UserInfo {
    /**
     * 同意授权用户ucid
     */
    private Integer masterUid;
    /**
     * 同意授权用户对应的ucname
     */
    private String masterName;
    /**
     * 同意授权用户关联的子账号列表
     */
    private List<SubUserInfo> subUserList;
}
