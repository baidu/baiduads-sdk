# ApiServiceForExternal

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDataTags**](ApiServiceForExternal.md#createDataTags) | **POST** /json/sms/service/ApiServiceForExternal/createDataTags | 
[**uploadIdStream**](ApiServiceForExternal.md#uploadIdStream) | **POST** /json/sms/service/ApiServiceForExternal/uploadIdStream | 



## createDataTags

> CreateDataTagsResponseWrapper createDataTags(createDataTagsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.apiserviceforexternal.api.ApiServiceForExternal;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ApiServiceForExternal apiInstance = new ApiServiceForExternal(defaultClient);
        CreateDataTagsRequestWrapper createDataTagsRequestWrapper = new CreateDataTagsRequestWrapper(); // CreateDataTagsRequestWrapper | 
        try {
            CreateDataTagsResponseWrapper result = apiInstance.createDataTags(createDataTagsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiServiceForExternal#createDataTags");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDataTagsRequestWrapper** | [**CreateDataTagsRequestWrapper**](CreateDataTagsRequestWrapper.md)|  |

### Return type

[**CreateDataTagsResponseWrapper**](CreateDataTagsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## uploadIdStream

> UploadIdStreamResponseWrapper uploadIdStream(uploadIdStreamRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.apiserviceforexternal.api.ApiServiceForExternal;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ApiServiceForExternal apiInstance = new ApiServiceForExternal(defaultClient);
        UploadIdStreamRequestWrapper uploadIdStreamRequestWrapper = new UploadIdStreamRequestWrapper(); // UploadIdStreamRequestWrapper | 
        try {
            UploadIdStreamResponseWrapper result = apiInstance.uploadIdStream(uploadIdStreamRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiServiceForExternal#uploadIdStream");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadIdStreamRequestWrapper** | [**UploadIdStreamRequestWrapper**](UploadIdStreamRequestWrapper.md)|  |

### Return type

[**UploadIdStreamResponseWrapper**](UploadIdStreamResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

