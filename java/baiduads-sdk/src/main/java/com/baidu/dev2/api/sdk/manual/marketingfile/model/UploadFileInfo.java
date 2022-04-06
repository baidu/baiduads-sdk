package com.baidu.dev2.api.sdk.manual.marketingfile.model;

public class UploadFileInfo {
    /**
     * 文件ID
     */
    private Long fileId;

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "UploadFileInfo{" +
                "fileId=" + fileId +
                '}';
    }
}
