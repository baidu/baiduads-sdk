/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.kr.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.kr.model.GetFilePathRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetFilePathResponseWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetFileStatusRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetFileStatusResponseWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRByQueryRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRByQueryResponseWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRCustomRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRCustomResponseWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRFileIdByWordsRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRFileIdByWordsResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KrService
 */
@Ignore
public class KrServiceTest {

    private final KrService api = new KrService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilePathTest() throws ApiException {
        GetFilePathRequestWrapper getFilePathRequestWrapper = null;
        GetFilePathResponseWrapper response = api.getFilePath(getFilePathRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileStatusTest() throws ApiException {
        GetFileStatusRequestWrapper getFileStatusRequestWrapper = null;
        GetFileStatusResponseWrapper response = api.getFileStatus(getFileStatusRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKRByQueryTest() throws ApiException {
        GetKRByQueryRequestWrapper getKRByQueryRequestWrapper = null;
        GetKRByQueryResponseWrapper response = api.getKRByQuery(getKRByQueryRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKRCustomTest() throws ApiException {
        GetKRCustomRequestWrapper getKRCustomRequestWrapper = null;
        GetKRCustomResponseWrapper response = api.getKRCustom(getKRCustomRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKRFileIdByWordsTest() throws ApiException {
        GetKRFileIdByWordsRequestWrapper getKRFileIdByWordsRequestWrapper = null;
        GetKRFileIdByWordsResponseWrapper response = api.getKRFileIdByWords(getKRFileIdByWordsRequestWrapper);

        // TODO: test validations
    }
}
