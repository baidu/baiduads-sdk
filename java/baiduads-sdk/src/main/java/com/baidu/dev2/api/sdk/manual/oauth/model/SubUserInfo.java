package com.baidu.dev2.api.sdk.manual.oauth.model;


public class SubUserInfo {
    /**
     * 同意授权用户关联的子账号ucid
     */
    private Integer ucId;
    /**
     * 同意授权用户关联的子账号ucname
     */
    private String ucName;

    public Integer getUcId() {
        return ucId;
    }

    public void setUcId(Integer ucId) {
        this.ucId = ucId;
    }

    public String getUcName() {
        return ucName;
    }

    public void setUcName(String ucName) {
        this.ucName = ucName;
    }
}
