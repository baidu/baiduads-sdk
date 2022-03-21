/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.custommp.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.custommp.model.AddCustomMPRequestWrapper;
import com.baidu.dev2.api.sdk.custommp.model.AddCustomMPResponseWrapper;
import com.baidu.dev2.api.sdk.custommp.model.DeleteCustomMPRequestWrapper;
import com.baidu.dev2.api.sdk.custommp.model.DeleteCustomMPResponseWrapper;
import com.baidu.dev2.api.sdk.custommp.model.GetCustomMPRequestWrapper;
import com.baidu.dev2.api.sdk.custommp.model.GetCustomMPResponseWrapper;
import com.baidu.dev2.api.sdk.custommp.model.UpdateCustomMPRequestWrapper;
import com.baidu.dev2.api.sdk.custommp.model.UpdateCustomMPResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomMpService
 */
@Ignore
public class CustomMpServiceTest {

    private final CustomMpService api = new CustomMpService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomMPTest() throws ApiException {
        AddCustomMPRequestWrapper addCustomMPRequestWrapper = null;
        AddCustomMPResponseWrapper response = api.addCustomMP(addCustomMPRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomMPTest() throws ApiException {
        DeleteCustomMPRequestWrapper deleteCustomMPRequestWrapper = null;
        DeleteCustomMPResponseWrapper response = api.deleteCustomMP(deleteCustomMPRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomMPTest() throws ApiException {
        GetCustomMPRequestWrapper getCustomMPRequestWrapper = null;
        GetCustomMPResponseWrapper response = api.getCustomMP(getCustomMPRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomMPTest() throws ApiException {
        UpdateCustomMPRequestWrapper updateCustomMPRequestWrapper = null;
        UpdateCustomMPResponseWrapper response = api.updateCustomMP(updateCustomMPRequestWrapper);

        // TODO: test validations
    }
}