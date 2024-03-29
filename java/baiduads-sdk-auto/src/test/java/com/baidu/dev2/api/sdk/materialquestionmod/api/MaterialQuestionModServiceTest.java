/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialquestionmod.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.materialquestionmod.model.AddQuestionRequestWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.AddQuestionResponseWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.DeleteQuestionRequestWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.DeleteQuestionResponseWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.UpdateCategoryRequestWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.UpdateCategoryResponseWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.UpdatePutawayRequestWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.UpdatePutawayResponseWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.UpdateQuestionRequestWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.UpdateQuestionResponseWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.UpdateRankRequestWrapper;
import com.baidu.dev2.api.sdk.materialquestionmod.model.UpdateRankResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MaterialQuestionModService
 */
@Ignore
public class MaterialQuestionModServiceTest {

    private final MaterialQuestionModService api = new MaterialQuestionModService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addQuestionTest() throws ApiException {
        AddQuestionRequestWrapper addQuestionRequestWrapper = null;
        AddQuestionResponseWrapper response = api.addQuestion(addQuestionRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteQuestionTest() throws ApiException {
        DeleteQuestionRequestWrapper deleteQuestionRequestWrapper = null;
        DeleteQuestionResponseWrapper response = api.deleteQuestion(deleteQuestionRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCategoryTest() throws ApiException {
        UpdateCategoryRequestWrapper updateCategoryRequestWrapper = null;
        UpdateCategoryResponseWrapper response = api.updateCategory(updateCategoryRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePutawayTest() throws ApiException {
        UpdatePutawayRequestWrapper updatePutawayRequestWrapper = null;
        UpdatePutawayResponseWrapper response = api.updatePutaway(updatePutawayRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateQuestionTest() throws ApiException {
        UpdateQuestionRequestWrapper updateQuestionRequestWrapper = null;
        UpdateQuestionResponseWrapper response = api.updateQuestion(updateQuestionRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRankTest() throws ApiException {
        UpdateRankRequestWrapper updateRankRequestWrapper = null;
        UpdateRankResponseWrapper response = api.updateRank(updateRankRequestWrapper);

        // TODO: test validations
    }
}
