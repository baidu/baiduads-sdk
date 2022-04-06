package com.baidu.dev2.api.sdk.manual.videoupload.model;

import com.baidu.dev2.api.sdk.common.ApiResponseHeader;

public class AddVideoResponseWrapper {

    private ApiResponseHeader header;

    private AddVideoResponse body;

    public ApiResponseHeader getHeader() {
        return header;
    }

    public void setHeader(ApiResponseHeader header) {
        this.header = header;
    }

    public AddVideoResponse getBody() {
        return body;
    }

    public void setBody(AddVideoResponse body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "AddVideoResponseWrapper{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
