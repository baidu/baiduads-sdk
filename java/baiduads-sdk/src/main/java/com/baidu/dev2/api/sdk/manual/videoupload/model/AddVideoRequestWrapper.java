package com.baidu.dev2.api.sdk.manual.videoupload.model;

import com.baidu.dev2.api.sdk.common.ApiRequestHeader;

public class AddVideoRequestWrapper {

    private ApiRequestHeader header;

    private AddVideoRequest body;

    public ApiRequestHeader getHeader() {
        return header;
    }

    public void setHeader(ApiRequestHeader header) {
        this.header = header;
    }

    public AddVideoRequest getBody() {
        return body;
    }

    public void setBody(AddVideoRequest body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "AddVideoRequestWrapper{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
