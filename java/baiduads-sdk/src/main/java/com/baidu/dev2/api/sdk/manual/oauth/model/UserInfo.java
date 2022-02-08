package com.baidu.dev2.api.sdk.manual.oauth.model;


import java.util.List;

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

    public Integer getMasterUid() {
        return masterUid;
    }

    public void setMasterUid(Integer masterUid) {
        this.masterUid = masterUid;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public List<SubUserInfo> getSubUserList() {
        return subUserList;
    }

    public void setSubUserList(List<SubUserInfo> subUserList) {
        this.subUserList = subUserList;
    }
}
