package com.baidu.dev2.api.sdk.manual.upload.model;

public class InitiateMultipartUploadInfo {

    private String uploadId;

    private Long fileId;

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "InitiateMultipartUploadInfo{" +
                "uploadId='" + uploadId + '\'' +
                ", fileId=" + fileId +
                '}';
    }
}
