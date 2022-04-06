package com.baidu.dev2.api.sdk.manual.videoupload.model;

public class VideoInfo {

    /**
     * 添加时间
     */
    private String addTime;

    /**
     * 音频码率 kbps
     */
    private Double audioRate;

    /**
     * 待审核视频信息
     */
    private String auditContent;

    /**
     * 比特率 kbps
     */
    private Double bitRate;

    /**
     * 视频大小 MB
     */
    private Double capacity;

    /**
     * 审核通过的视频等信息
     */
    private String content;

    /**
     * 视频时长 单位-秒
     */
    private Integer duration;

    /**
     * 视频格式
     */
    private String format;

    /**
     * 帧率 fps
     */
    private Double frameRate;

    /**
     * 视频尺寸-高 单位-像素
     */
    private Integer height;

    /**
     *  修改时间
     */
    private String modTime;

    /**
     * 产品线
     */
    private Integer source;

    /**
     * 封面图 url
     */
    private String thumbnail;

    /**
     * true:该视频已上传过
     * null/false:该视频未上传过
     */
    private Boolean uploaded;

    /**
     * 视频 url
     */
    private String url;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 视频编码容器 举例 h264等
     */
    private String videoCodec;

    /**
     * 视频元信息 md5
     */
    private String videoContentMd5;

    /**
     * 视频 id
     */
    private Long videoId;

    /**
     * 视频 md5
     */
    private String videoMd5;

    /**
     * 视频名称
     */
    private String videoName;

    /**
     * 视频码率 kbps
     */
    private Double videoRate;

    /**
     * 视频尺寸-宽 单位-像素
     */
    private Integer width;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Double getAudioRate() {
        return audioRate;
    }

    public void setAudioRate(Double audioRate) {
        this.audioRate = audioRate;
    }

    public String getAuditContent() {
        return auditContent;
    }

    public void setAuditContent(String auditContent) {
        this.auditContent = auditContent;
    }

    public Double getBitRate() {
        return bitRate;
    }

    public void setBitRate(Double bitRate) {
        this.bitRate = bitRate;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Double getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Boolean getUploaded() {
        return uploaded;
    }

    public void setUploaded(Boolean uploaded) {
        this.uploaded = uploaded;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public String getVideoContentMd5() {
        return videoContentMd5;
    }

    public void setVideoContentMd5(String videoContentMd5) {
        this.videoContentMd5 = videoContentMd5;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getVideoMd5() {
        return videoMd5;
    }

    public void setVideoMd5(String videoMd5) {
        this.videoMd5 = videoMd5;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Double getVideoRate() {
        return videoRate;
    }

    public void setVideoRate(Double videoRate) {
        this.videoRate = videoRate;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "VideoInfo{" +
                "addTime='" + addTime + '\'' +
                ", audioRate=" + audioRate +
                ", auditContent='" + auditContent + '\'' +
                ", bitRate=" + bitRate +
                ", capacity=" + capacity +
                ", content='" + content + '\'' +
                ", duration=" + duration +
                ", format='" + format + '\'' +
                ", frameRate=" + frameRate +
                ", height=" + height +
                ", modTime='" + modTime + '\'' +
                ", source=" + source +
                ", thumbnail='" + thumbnail + '\'' +
                ", uploaded=" + uploaded +
                ", url='" + url + '\'' +
                ", userId=" + userId +
                ", videoCodec='" + videoCodec + '\'' +
                ", videoContentMd5='" + videoContentMd5 + '\'' +
                ", videoId=" + videoId +
                ", videoMd5='" + videoMd5 + '\'' +
                ", videoName='" + videoName + '\'' +
                ", videoRate=" + videoRate +
                ", width=" + width +
                '}';
    }
}
