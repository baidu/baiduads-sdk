package com.baidu.dev2.api.sdk.manual.marketingfile.model;

public class UploadFileParams {

    /**
     * 文件名 长度不超过30个字符。例如：a.txt
     */
    private String fileName;

    /**
     * 文件类型 当前仅支持txt文件，固定传：txt
     */
    private String fileType;

    /**
     * 文件存储类型  固定传：temp
     */
    private String storeType;
    
    /**
     * 业务标识
     * <p>
     * 人群文件传：audience
     * 资产文件传：dataAsset
     */
    private String bizFlag;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getBizFlag() {
        return bizFlag;
    }

    public void setBizFlag(String bizFlag) {
        this.bizFlag = bizFlag;
    }

    @Override
    public String toString() {
        return "UploadFileParams{" +
                "fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", storeType='" + storeType + '\'' +
                ", bizFlag='" + bizFlag + '\'' +
                '}';
    }
}
