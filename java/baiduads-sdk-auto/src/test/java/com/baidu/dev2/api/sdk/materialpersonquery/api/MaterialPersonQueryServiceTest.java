/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialpersonquery.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.materialpersonquery.model.GetPersonListRequestWrapper;
import com.baidu.dev2.api.sdk.materialpersonquery.model.GetPersonListResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MaterialPersonQueryService
 */
@Ignore
public class MaterialPersonQueryServiceTest {

    private final MaterialPersonQueryService api = new MaterialPersonQueryService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPersonListTest() throws ApiException {
        GetPersonListRequestWrapper getPersonListRequestWrapper = null;
        GetPersonListResponseWrapper response = api.getPersonList(getPersonListRequestWrapper);

        // TODO: test validations
    }
}
