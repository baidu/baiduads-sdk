package com.baidu.dev2.api.sdk.manual.videoupload.api;

import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.manual.upload.UploadClient;
import com.baidu.dev2.api.sdk.manual.upload.model.MultiUploadOptions;
import com.baidu.dev2.api.sdk.manual.videoupload.model.AddVideoParams;
import com.baidu.dev2.api.sdk.manual.videoupload.model.AddVideoRequest;
import com.baidu.dev2.api.sdk.manual.videoupload.model.AddVideoRequestWrapper;
import com.baidu.dev2.api.sdk.manual.videoupload.model.AddVideoResponseWrapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class VideoUploadService {


    public VideoUploadService() {

    }


    public AddVideoResponseWrapper addVideo(AddVideoRequestWrapper addVideoRequestWrapper) throws ApiException {
        if (addVideoRequestWrapper == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'addVideoRequestWrapper' when calling addVideo");
        }

        // 文件限制 100MB
        if (addVideoRequestWrapper.getBody().getFile().length() > 100 * 1024 * 1024) {
            throw new ApiException("file size too big");
        }

        String localVarPath = "/json/sms/service/VideoUploadService/addVideo";

        Map<String, Object> formParams = new HashMap<String, Object>();
        ObjectNode objectNode = null;
        Integer partParallel = null;
        Integer partSize = null;
        Integer multipartThreshold = null;
        try {
            // set header params
            ApiRequestHeader header = addVideoRequestWrapper.getHeader();
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
            AddVideoRequest body = addVideoRequestWrapper.getBody();
            String signature = body.getSignature();
            formParams.put("signature", signature);
            AddVideoParams params = body.getParams();
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
                addVideoRequestWrapper.getBody().getFile(),
                objectNode,
                null,
                multipartThreshold,
                partSize,
                partParallel,
                addVideoRequestWrapper.getBody().getTimeout(),
                new TypeReference<AddVideoResponseWrapper>() {
                }
        );
    }

}
