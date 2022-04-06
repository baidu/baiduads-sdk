package com.baidu.dev2.api.sdk.manual.marketingfile.model;

import java.util.List;

public class UploadFileResponse {

    private List<UploadFileInfo> data;

    public List<UploadFileInfo> getData() {
        return data;
    }

    public void setData(List<UploadFileInfo> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UploadFileResponse{" +
                "data=" + data +
                '}';
    }
}
