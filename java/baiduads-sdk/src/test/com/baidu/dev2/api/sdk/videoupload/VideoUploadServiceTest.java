package com.baidu.dev2.api.sdk.videoupload;

import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.manual.upload.model.MultiUploadOptions;
import com.baidu.dev2.api.sdk.manual.videoupload.api.VideoUploadService;
import com.baidu.dev2.api.sdk.manual.videoupload.model.AddVideoParams;
import com.baidu.dev2.api.sdk.manual.videoupload.model.AddVideoRequest;
import com.baidu.dev2.api.sdk.manual.videoupload.model.AddVideoRequestWrapper;
import com.baidu.dev2.api.sdk.manual.videoupload.model.AddVideoResponseWrapper;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class VideoUploadServiceTest {
    private VideoUploadService service;
    private ApiRequestHeader header;

    @Before
    public void before() {
        service = new VideoUploadService();
        header = new ApiRequestHeader();
        // 请填写自己的信息
        header.setAccessToken("xxxxx"); // 替换为授权生成的accessToken
        header.setUserName("xxxxx"); // 替换为自己的用户名
    }

    @Test
    public void testAddVideo() throws Exception {
        AddVideoRequestWrapper addVideoRequestWrapper = new AddVideoRequestWrapper();
        addVideoRequestWrapper.setHeader(header);

        File file = new File("/tmp/test2.mp4");
        String md5Str = DigestUtils.md5Hex(new FileInputStream(file));

        AddVideoRequest addVideoRequest = new AddVideoRequest();
        addVideoRequest.setFile(file);
        addVideoRequest.setSignature(md5Str);

        AddVideoParams addVideoParams = new AddVideoParams();
        addVideoParams.setVideoName("test" + System.currentTimeMillis() + ".mp4");
        addVideoParams.setHttpProtocol("HTTP");
        addVideoParams.setSource(2);
        addVideoParams.setFormat("mp4");
        addVideoRequest.setParams(addVideoParams);

        addVideoRequestWrapper.setBody(addVideoRequest);

        AddVideoResponseWrapper addVideoResponseWrapper = service.addVideo(addVideoRequestWrapper);
        System.out.println(addVideoResponseWrapper);
        Assert.assertTrue(addVideoResponseWrapper.getHeader().getStatus() == 0);
    }


    @Test
    public void testAddVideoMultiupload() throws Exception {
        AddVideoRequestWrapper addVideoRequestWrapper = new AddVideoRequestWrapper();
        addVideoRequestWrapper.setHeader(header);

        File file = new File("/tmp/test2.mp4");
        String md5Str = DigestUtils.md5Hex(new FileInputStream(file));

        AddVideoRequest addVideoRequest = new AddVideoRequest();
        addVideoRequest.setFile(file);
        addVideoRequest.setSignature(md5Str);

        AddVideoParams addVideoParams = new AddVideoParams();
        addVideoParams.setVideoName("test" + System.currentTimeMillis() + ".mp4");
        addVideoParams.setHttpProtocol("HTTP");
        addVideoParams.setSource(2);
        addVideoParams.setFormat("mp4");
        addVideoRequest.setParams(addVideoParams);

        MultiUploadOptions options = new MultiUploadOptions();
        options.setMultipartThreshold(100 * 1024); // 100kb
        addVideoRequest.setUploadOptions(options);


        addVideoRequestWrapper.setBody(addVideoRequest);

        AddVideoResponseWrapper addVideoResponseWrapper = service.addVideo(addVideoRequestWrapper);
        System.out.println(addVideoResponseWrapper);
        Assert.assertTrue(addVideoResponseWrapper.getHeader().getStatus() == 0);
    }
}
