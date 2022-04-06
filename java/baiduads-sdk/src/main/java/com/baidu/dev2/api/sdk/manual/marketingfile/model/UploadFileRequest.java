package com.baidu.dev2.api.sdk.manual.marketingfile.model;

import com.baidu.dev2.api.sdk.manual.upload.model.MultiUploadOptions;

import java.io.File;

public class UploadFileRequest {
    /**
     * 上传额外参数
     */
    private UploadFileParams params;
    /**
     * 上传文件
     */
    private File file;

    /**
     * 单位 ms
     * <p>
     * 不填默认：不超时
     */
    private Integer timeout;

    /**
     * 分片上传可选参数, 不填就使用默认值
     */
    private MultiUploadOptions uploadOptions;


    public UploadFileParams getParams() {
        return params;
    }

    public void setParams(UploadFileParams params) {
        this.params = params;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public MultiUploadOptions getUploadOptions() {
        return uploadOptions;
    }

    public void setUploadOptions(MultiUploadOptions uploadOptions) {
        this.uploadOptions = uploadOptions;
    }

    @Override
    public String toString() {
        return "UploadFileRequest{" +
                "params=" + params +
                ", file=" + file +
                ", timeout=" + timeout +
                ", uploadOptions=" + uploadOptions +
                '}';
    }
}
