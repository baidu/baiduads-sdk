package com.baidu.dev2.api.sdk.manual.videoupload.model;

import com.baidu.dev2.api.sdk.manual.upload.model.MultiUploadOptions;

import java.io.File;

public class AddVideoRequest {
    /**
     * 上传文件
     */
    private File file;

    /**
     * 视频文件md5签名
     */
    private String signature;

    /**
     * 标准json格式，接口业务请求参数
     */
    private AddVideoParams params;

    /**
     * 分片上传可选参数, 不填就使用默认值  该接口：暂不支持分片
     */
    private MultiUploadOptions uploadOptions;

    /**
     * 单位 ms
     * <p>
     * 不填默认：不超时
     */
    private Integer timeout;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public AddVideoParams getParams() {
        return params;
    }

    public void setParams(AddVideoParams params) {
        this.params = params;
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
        return "AddVideoRequest{" +
                "file=" + file +
                ", signature='" + signature + '\'' +
                ", params=" + params +
                ", uploadOptions=" + uploadOptions +
                ", timeout=" + timeout +
                '}';
    }
}
