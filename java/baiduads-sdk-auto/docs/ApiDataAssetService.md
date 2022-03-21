# ApiDataAssetService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDataAsset**](ApiDataAssetService.md#createDataAsset) | **POST** /json/sms/service/ApiDataAssetService/createDataAsset | 
[**submitDataAssetTask**](ApiDataAssetService.md#submitDataAssetTask) | **POST** /json/sms/service/ApiDataAssetService/submitDataAssetTask | 



## createDataAsset

> CreateDataAssetResponseWrapper createDataAsset(createDataAssetRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.apidataasset.api.ApiDataAssetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ApiDataAssetService apiInstance = new ApiDataAssetService(defaultClient);
        CreateDataAssetRequestWrapper createDataAssetRequestWrapper = new CreateDataAssetRequestWrapper(); // CreateDataAssetRequestWrapper | 
        try {
            CreateDataAssetResponseWrapper result = apiInstance.createDataAsset(createDataAssetRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiDataAssetService#createDataAsset");
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
 **createDataAssetRequestWrapper** | [**CreateDataAssetRequestWrapper**](CreateDataAssetRequestWrapper.md)|  |

### Return type

[**CreateDataAssetResponseWrapper**](CreateDataAssetResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## submitDataAssetTask

> SubmitDataAssetTaskResponseWrapper submitDataAssetTask(submitDataAssetTaskRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.apidataasset.api.ApiDataAssetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ApiDataAssetService apiInstance = new ApiDataAssetService(defaultClient);
        SubmitDataAssetTaskRequestWrapper submitDataAssetTaskRequestWrapper = new SubmitDataAssetTaskRequestWrapper(); // SubmitDataAssetTaskRequestWrapper | 
        try {
            SubmitDataAssetTaskResponseWrapper result = apiInstance.submitDataAssetTask(submitDataAssetTaskRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiDataAssetService#submitDataAssetTask");
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
 **submitDataAssetTaskRequestWrapper** | [**SubmitDataAssetTaskRequestWrapper**](SubmitDataAssetTaskRequestWrapper.md)|  |

### Return type

[**SubmitDataAssetTaskResponseWrapper**](SubmitDataAssetTaskResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

