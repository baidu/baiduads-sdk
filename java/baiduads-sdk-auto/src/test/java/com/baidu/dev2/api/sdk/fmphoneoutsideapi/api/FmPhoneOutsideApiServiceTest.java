/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.fmphoneoutsideapi.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.fmphoneoutsideapi.model.GetVirtualPhoneRequestWrapper;
import com.baidu.dev2.api.sdk.fmphoneoutsideapi.model.GetVirtualPhoneResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FmPhoneOutsideApiService
 */
@Ignore
public class FmPhoneOutsideApiServiceTest {

    private final FmPhoneOutsideApiService api = new FmPhoneOutsideApiService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVirtualPhoneTest() throws ApiException {
        GetVirtualPhoneRequestWrapper getVirtualPhoneRequestWrapper = null;
        GetVirtualPhoneResponseWrapper response = api.getVirtualPhone(getVirtualPhoneRequestWrapper);

        // TODO: test validations
    }
}
