package com.baidu.dev2.api.sdk.manual.upload.model;

import com.baidu.dev2.api.sdk.common.ApiResponseHeader;

public class UploadPartResponseWrapper {

    private ApiResponseHeader header;

    private UploadPartResponse body;

    public ApiResponseHeader getHeader() {
        return header;
    }

    public void setHeader(ApiResponseHeader header) {
        this.header = header;
    }

    public UploadPartResponse getBody() {
        return body;
    }

    public void setBody(UploadPartResponse body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "UploadPartResponseWrapper{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
