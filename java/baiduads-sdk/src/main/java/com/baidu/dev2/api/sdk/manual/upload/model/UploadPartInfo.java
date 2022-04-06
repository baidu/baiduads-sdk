package com.baidu.dev2.api.sdk.manual.upload.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UploadPartInfo {

    @JsonProperty("ETag")
    private String eTag;

    public String geteTag() {
        return eTag;
    }

    public void seteTag(String eTag) {
        this.eTag = eTag;
    }

    @Override
    public String toString() {
        return "UploadPartInfo{" +
                "eTag='" + eTag + '\'' +
                '}';
    }
}
