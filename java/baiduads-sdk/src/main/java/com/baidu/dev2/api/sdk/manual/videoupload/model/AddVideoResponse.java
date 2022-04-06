package com.baidu.dev2.api.sdk.manual.videoupload.model;

import java.util.List;

public class AddVideoResponse {
    private List<VideoInfo> data;

    public List<VideoInfo> getData() {
        return data;
    }

    public void setData(List<VideoInfo> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AddVideoResponse{" +
                "data=" + data +
                '}';
    }
}
