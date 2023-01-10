package com.baidu.dev2.api.sdk.marketingfile;

import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.manual.marketingfile.api.MarketingFileService;
import com.baidu.dev2.api.sdk.manual.marketingfile.model.UploadFileParams;
import com.baidu.dev2.api.sdk.manual.marketingfile.model.UploadFileRequest;
import com.baidu.dev2.api.sdk.manual.marketingfile.model.UploadFileRequestWrapper;
import com.baidu.dev2.api.sdk.manual.marketingfile.model.UploadFileResponseWrapper;
import com.baidu.dev2.api.sdk.manual.upload.model.MultiUploadOptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class MarketingFileServiceTest {

    private MarketingFileService service;
    private ApiRequestHeader header;

    @Before
    public void before() {
        service = new MarketingFileService();
        header = new ApiRequestHeader();
        // 请填写自己的信息
        header.setAccessToken("xxxxx"); // 替换为授权生成的accessToken
        header.setUserName("xxxxx"); // 替换为自己的用户名
    }

    /***
     * 测试简单文件上传
     * @throws Exception
     */
    @Test
    public void testUploadFileSimple() throws Exception {
        UploadFileRequestWrapper uploadFileRequestWrapper = new UploadFileRequestWrapper();
        uploadFileRequestWrapper.setHeader(header);

        File file = new File("/tmp/a.txt");

        UploadFileRequest uploadFileRequest = new UploadFileRequest();
        uploadFileRequest.setFile(file);

        UploadFileParams uploadFileParams = new UploadFileParams();
        uploadFileParams.setFileName("test" + System.currentTimeMillis() + ".txt");
        uploadFileParams.setFileType("txt");
        uploadFileParams.setStoreType("temp");
        uploadFileParams.setBizFlag("audience");
        uploadFileRequest.setParams(uploadFileParams);

        uploadFileRequestWrapper.setBody(uploadFileRequest);

        UploadFileResponseWrapper uploadFileResponseWrapper = service.uploadFile(uploadFileRequestWrapper);
        System.out.println(uploadFileResponseWrapper);
        Assert.assertTrue(uploadFileResponseWrapper.getHeader().getStatus() == 0);
    }

    /**
     * 测试大文件的分片上传
     * @throws Exception
     */
    @Test
    public void testUploadFileMulti() throws Exception {
        UploadFileRequestWrapper uploadFileRequestWrapper = new UploadFileRequestWrapper();
        uploadFileRequestWrapper.setHeader(header);

        File file = new File("/tmp/b.txt");

        UploadFileRequest uploadFileRequest = new UploadFileRequest();
        uploadFileRequest.setFile(file);

        UploadFileParams uploadFileParams = new UploadFileParams();
        uploadFileParams.setFileName("test" + System.currentTimeMillis() + ".txt");
        uploadFileParams.setFileType("txt");
        uploadFileParams.setStoreType("temp");
        uploadFileParams.setBizFlag("audience");
        uploadFileRequest.setParams(uploadFileParams);

        uploadFileRequestWrapper.setBody(uploadFileRequest);

        UploadFileResponseWrapper uploadFileResponseWrapper = service.uploadFile(uploadFileRequestWrapper);
        System.out.println(uploadFileResponseWrapper);
        Assert.assertTrue(uploadFileResponseWrapper.getHeader().getStatus() == 0);
    }

    /**
     * 测试大文件的分片上传 超时
     * @throws Exception
     */
    @Test
    public void testUploadFileMultiWithTimeOut() throws Exception {
        UploadFileRequestWrapper uploadFileRequestWrapper = new UploadFileRequestWrapper();
        uploadFileRequestWrapper.setHeader(header);

        File file = new File("/tmp/b.txt");

        UploadFileRequest uploadFileRequest = new UploadFileRequest();
        uploadFileRequest.setFile(file);

        UploadFileParams uploadFileParams = new UploadFileParams();
        uploadFileParams.setFileName("test" + System.currentTimeMillis() + ".txt");
        uploadFileParams.setFileType("txt");
        uploadFileParams.setStoreType("temp");
        uploadFileParams.setBizFlag("audience");
        uploadFileRequest.setParams(uploadFileParams);
        uploadFileRequest.setTimeout(1000); // 设置1000ms

        uploadFileRequestWrapper.setBody(uploadFileRequest);

        UploadFileResponseWrapper uploadFileResponseWrapper = service.uploadFile(uploadFileRequestWrapper);
        System.out.println(uploadFileResponseWrapper);
        Assert.assertTrue(uploadFileResponseWrapper.getHeader().getStatus() == 0);
    }

    /**
     * 测试大文件上传 参数调优
     * @throws Exception
     */
    @Test
    public void testUploadFileMultiWithOptions() throws Exception {
        UploadFileRequestWrapper uploadFileRequestWrapper = new UploadFileRequestWrapper();
        uploadFileRequestWrapper.setHeader(header);

        File file = new File("/tmp/a.txt");

        UploadFileRequest uploadFileRequest = new UploadFileRequest();
        uploadFileRequest.setFile(file);

        UploadFileParams uploadFileParams = new UploadFileParams();
        uploadFileParams.setFileName("test" + System.currentTimeMillis() + ".txt");
        uploadFileParams.setFileType("txt");
        uploadFileParams.setStoreType("temp");
        uploadFileParams.setBizFlag("audience");
        uploadFileRequest.setParams(uploadFileParams);
        MultiUploadOptions options = new MultiUploadOptions();
        options.setMultipartThreshold(1024); // 1kb
        options.setPartSize(100 * 1024); // 100kb 最小100kb
        uploadFileRequest.setUploadOptions(options);

        uploadFileRequestWrapper.setBody(uploadFileRequest);

        UploadFileResponseWrapper uploadFileResponseWrapper = service.uploadFile(uploadFileRequestWrapper);
        System.out.println(uploadFileResponseWrapper);
        Assert.assertTrue(uploadFileResponseWrapper.getHeader().getStatus() == 0);
    }



    /**
     * 测试大文件上传 参数调优
     * @throws Exception
     */
    @Test
    public void testUploadFileMultiWithOptions2() throws Exception {
        UploadFileRequestWrapper uploadFileRequestWrapper = new UploadFileRequestWrapper();
        uploadFileRequestWrapper.setHeader(header);

        File file = new File("/tmp/b.txt");

        UploadFileRequest uploadFileRequest = new UploadFileRequest();
        uploadFileRequest.setFile(file);

        UploadFileParams uploadFileParams = new UploadFileParams();
        uploadFileParams.setFileName("test" + System.currentTimeMillis() + ".txt");
        uploadFileParams.setFileType("txt");
        uploadFileParams.setStoreType("temp");
        uploadFileParams.setBizFlag("audience");
        uploadFileRequest.setParams(uploadFileParams);
        MultiUploadOptions options = new MultiUploadOptions();
        options.setMultipartThreshold(100 * 1024 * 1024); // 100MB
        options.setPartSize(50 * 1024 * 1024); // 50MB
        uploadFileRequest.setUploadOptions(options);

        uploadFileRequestWrapper.setBody(uploadFileRequest);

        UploadFileResponseWrapper uploadFileResponseWrapper = service.uploadFile(uploadFileRequestWrapper);
        System.out.println(uploadFileResponseWrapper);
        Assert.assertTrue(uploadFileResponseWrapper.getHeader().getStatus() == 0);
    }
}
