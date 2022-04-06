package com.baidu.dev2.api.sdk.manual.upload.model;

import java.util.List;

public class InitiateMultipartUploadResponse {

    private List<InitiateMultipartUploadInfo> data;

    public List<InitiateMultipartUploadInfo> getData() {
        return data;
    }

    public void setData(List<InitiateMultipartUploadInfo> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "InitiateMultipartUploadResponse{" +
                "data=" + data +
                '}';
    }
}
