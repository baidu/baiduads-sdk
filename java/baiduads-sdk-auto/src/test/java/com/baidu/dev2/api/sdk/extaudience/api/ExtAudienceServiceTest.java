/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.extaudience.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.extaudience.model.CreateEmptyGroupRequestWrapper;
import com.baidu.dev2.api.sdk.extaudience.model.CreateEmptyGroupResponseWrapper;
import com.baidu.dev2.api.sdk.extaudience.model.GetAudienceListRequestWrapper;
import com.baidu.dev2.api.sdk.extaudience.model.GetAudienceListResponseWrapper;
import com.baidu.dev2.api.sdk.extaudience.model.UpdateAudienceDspRequestWrapper;
import com.baidu.dev2.api.sdk.extaudience.model.UpdateAudienceDspResponseWrapper;
import com.baidu.dev2.api.sdk.extaudience.model.UpdateIdUpload4PourRequestWrapper;
import com.baidu.dev2.api.sdk.extaudience.model.UpdateIdUpload4PourResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExtAudienceService
 */
@Ignore
public class ExtAudienceServiceTest {

    private final ExtAudienceService api = new ExtAudienceService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmptyGroupTest() throws ApiException {
        CreateEmptyGroupRequestWrapper createEmptyGroupRequestWrapper = null;
        CreateEmptyGroupResponseWrapper response = api.createEmptyGroup(createEmptyGroupRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAudienceListTest() throws ApiException {
        GetAudienceListRequestWrapper getAudienceListRequestWrapper = null;
        GetAudienceListResponseWrapper response = api.getAudienceList(getAudienceListRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAudienceDspTest() throws ApiException {
        UpdateAudienceDspRequestWrapper updateAudienceDspRequestWrapper = null;
        UpdateAudienceDspResponseWrapper response = api.updateAudienceDsp(updateAudienceDspRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIdUpload4PourTest() throws ApiException {
        UpdateIdUpload4PourRequestWrapper updateIdUpload4PourRequestWrapper = null;
        UpdateIdUpload4PourResponseWrapper response = api.updateIdUpload4Pour(updateIdUpload4PourRequestWrapper);

        // TODO: test validations
    }
}
