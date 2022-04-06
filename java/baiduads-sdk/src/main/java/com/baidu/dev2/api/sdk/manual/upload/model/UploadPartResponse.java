package com.baidu.dev2.api.sdk.manual.upload.model;

import java.util.List;

public class UploadPartResponse {

    private List<UploadPartInfo> data;

    public List<UploadPartInfo> getData() {
        return data;
    }

    public void setData(List<UploadPartInfo> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UploadPartResponse{" +
                "data=" + data +
                '}';
    }
}
