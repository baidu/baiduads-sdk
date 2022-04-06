package com.baidu.dev2.api.sdk.manual.upload.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartEtag {
    private int partNumber;

    @JsonProperty("ETag")
    private String eTag;

    public PartEtag(int partNumber, String eTag) {
        this.partNumber = partNumber;
        this.eTag = eTag;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String geteTag() {
        return eTag;
    }

    public void seteTag(String eTag) {
        this.eTag = eTag;
    }

    @Override
    public String toString() {
        return "PartEtag{" +
                "partNumber=" + partNumber +
                ", eTag='" + eTag + '\'' +
                '}';
    }
}
