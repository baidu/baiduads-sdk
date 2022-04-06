package com.baidu.dev2.api.sdk.manual.videoupload.model;


public class AddVideoParams {
    /**
     * 上传视频的格式，如:mp4
     */
    private String format;

    /**
     * 视频来源产品线，Feed广告投放平台默认取2
     */
    private int source;

    /**
     * 视频名称
     */
    private String videoName;

    /**
     * 默认 HTTP， 可选值:HTTP、 HTTPS
     */
    private String httpProtocol;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getHttpProtocol() {
        return httpProtocol;
    }

    public void setHttpProtocol(String httpProtocol) {
        this.httpProtocol = httpProtocol;
    }

    @Override
    public String toString() {
        return "AddVideoParams{" +
                "format='" + format + '\'' +
                ", source=" + source +
                ", videoName='" + videoName + '\'' +
                ", httpProtocol='" + httpProtocol + '\'' +
                '}';
    }
}
