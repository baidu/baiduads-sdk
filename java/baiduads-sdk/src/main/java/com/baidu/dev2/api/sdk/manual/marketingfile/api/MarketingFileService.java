package com.baidu.dev2.api.sdk.manual.marketingfile.api;

import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.manual.marketingfile.model.UploadFileParams;
import com.baidu.dev2.api.sdk.manual.marketingfile.model.UploadFileRequest;
import com.baidu.dev2.api.sdk.manual.marketingfile.model.UploadFileRequestWrapper;
import com.baidu.dev2.api.sdk.manual.marketingfile.model.UploadFileResponseWrapper;
import com.baidu.dev2.api.sdk.manual.upload.model.MultiUploadOptions;
import com.baidu.dev2.api.sdk.manual.upload.UploadClient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class MarketingFileService {

    public MarketingFileService() {
    }

    public UploadFileResponseWrapper uploadFile(UploadFileRequestWrapper uploadFileRequestWrapper) throws ApiException {
        if (uploadFileRequestWrapper == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'uploadFileRequestWrapper' when calling uploadFile");
        }

        String localVarPath = "/json/sms/service/MarketingFileService/uploadFile";

        Map<String, Object> formParams = new HashMap<String, Object>();
        ObjectNode objectNode = null;
        Integer partParallel = null;
        Integer partSize = null;
        Integer multipartThreshold = null;
        try {
            // set header params
            ApiRequestHeader header = uploadFileRequestWrapper.getHeader();
            Field[] declaredFields = ApiRequestHeader.class.getDeclaredFields();
            for (Field field : declaredFields) {
                if ((Modifier.STATIC & field.getModifiers()) != Modifier.STATIC) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Object value = field.get(header);
                    formParams.put(name, value);
                }
            }

            // set body params
            UploadFileRequest body = uploadFileRequestWrapper.getBody();
            UploadFileParams params = body.getParams();
            ObjectMapper objectMapper = UploadClient.INSTANCE.getApiClient().getObjectMapper();
            objectNode = objectMapper.convertValue(params, ObjectNode.class);
            MultiUploadOptions uploadOptions = body.getUploadOptions();
            if (uploadOptions != null) {
                partParallel = uploadOptions.getPartParallel();
                partSize = uploadOptions.getPartSize();
                multipartThreshold = uploadOptions.getMultipartThreshold();
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }


        return UploadClient.INSTANCE.uploadFile(
                localVarPath,
                formParams,
                uploadFileRequestWrapper.getBody().getFile(),
                objectNode,
                null,
                multipartThreshold,
                partSize,
                partParallel,
                uploadFileRequestWrapper.getBody().getTimeout(),
                new TypeReference<UploadFileResponseWrapper>() {
                }
        );

    }
}
