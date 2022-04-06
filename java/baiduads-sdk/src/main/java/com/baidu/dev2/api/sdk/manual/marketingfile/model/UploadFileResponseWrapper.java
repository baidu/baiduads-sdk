package com.baidu.dev2.api.sdk.manual.marketingfile.model;

import com.baidu.dev2.api.sdk.common.ApiResponseHeader;

public class UploadFileResponseWrapper {
    private ApiResponseHeader header;

    private UploadFileResponse body;

    public ApiResponseHeader getHeader() {
        return header;
    }

    public void setHeader(ApiResponseHeader header) {
        this.header = header;
    }

    public UploadFileResponse getBody() {
        return body;
    }

    public void setBody(UploadFileResponse body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "UploadFileResponseWrapper{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
