package com.baidu.dev2.api.sdk.manual.marketingfile.model;

import com.baidu.dev2.api.sdk.common.ApiRequestHeader;

public class UploadFileRequestWrapper {

    private ApiRequestHeader header;

    private UploadFileRequest body;

    public ApiRequestHeader getHeader() {
        return header;
    }

    public void setHeader(ApiRequestHeader header) {
        this.header = header;
    }

    public UploadFileRequest getBody() {
        return body;
    }

    public void setBody(UploadFileRequest body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "UploadFileRequestWrapper{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
