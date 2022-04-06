package com.baidu.dev2.api.sdk.manual.upload.model;

/**
 * 分片上传可选参数，不填就使用默认值
 */
public class MultiUploadOptions {
    /**
     * 分片上传阈值：不填默认：100M
     */
    private Integer multipartThreshold;

    /**
     * 分片大小：不填默认：5M
     */
    private Integer partSize;
    
    /**
     * 分片上传并发数：不填默认：5
     */
    private Integer partParallel;

    public Integer getMultipartThreshold() {
        return multipartThreshold;
    }

    public void setMultipartThreshold(Integer multipartThreshold) {
        this.multipartThreshold = multipartThreshold;
    }

    public Integer getPartSize() {
        return partSize;
    }

    public void setPartSize(Integer partSize) {
        this.partSize = partSize;
    }

    public Integer getPartParallel() {
        return partParallel;
    }

    public void setPartParallel(Integer partParallel) {
        this.partParallel = partParallel;
    }

    @Override
    public String toString() {
        return "MultiUploadOptions{" +
                "multipartThreshold=" + multipartThreshold +
                ", partSize=" + partSize +
                ", partParallel=" + partParallel +
                '}';
    }
}
