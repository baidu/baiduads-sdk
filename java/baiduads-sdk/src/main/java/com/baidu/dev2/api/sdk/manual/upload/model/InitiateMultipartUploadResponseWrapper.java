package com.baidu.dev2.api.sdk.manual.upload.model;

import com.baidu.dev2.api.sdk.common.ApiResponseHeader;

public class InitiateMultipartUploadResponseWrapper {
    private ApiResponseHeader header;

    private InitiateMultipartUploadResponse body;

    public ApiResponseHeader getHeader() {
        return header;
    }

    public void setHeader(ApiResponseHeader header) {
        this.header = header;
    }

    public InitiateMultipartUploadResponse getBody() {
        return body;
    }

    public void setBody(InitiateMultipartUploadResponse body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "InitiateMultipartUploadResponseWrapper{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
