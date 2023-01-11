/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.materialbindmod.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.materialbindmod.model.AddMaterialBindRequestWrapper;
import com.baidu.dev2.api.sdk.materialbindmod.model.AddMaterialBindResponseWrapper;
import com.baidu.dev2.api.sdk.materialbindmod.model.DeleteMaterialBindRequestWrapper;
import com.baidu.dev2.api.sdk.materialbindmod.model.DeleteMaterialBindResponseWrapper;
import com.baidu.dev2.api.sdk.materialbindmod.model.UpdateMaterialBindRequestWrapper;
import com.baidu.dev2.api.sdk.materialbindmod.model.UpdateMaterialBindResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MaterialBindModService
 */
@Ignore
public class MaterialBindModServiceTest {

    private final MaterialBindModService api = new MaterialBindModService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMaterialBindTest() throws ApiException {
        AddMaterialBindRequestWrapper addMaterialBindRequestWrapper = null;
        AddMaterialBindResponseWrapper response = api.addMaterialBind(addMaterialBindRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMaterialBindTest() throws ApiException {
        DeleteMaterialBindRequestWrapper deleteMaterialBindRequestWrapper = null;
        DeleteMaterialBindResponseWrapper response = api.deleteMaterialBind(deleteMaterialBindRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMaterialBindTest() throws ApiException {
        UpdateMaterialBindRequestWrapper updateMaterialBindRequestWrapper = null;
        UpdateMaterialBindResponseWrapper response = api.updateMaterialBind(updateMaterialBindRequestWrapper);

        // TODO: test validations
    }
}