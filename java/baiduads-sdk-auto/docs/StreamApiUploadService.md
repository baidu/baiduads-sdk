# StreamApiUploadService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadIdStream**](StreamApiUploadService.md#uploadIdStream) | **POST** /json/sms/service/StreamApiUploadService/uploadIdStream | 



## uploadIdStream

> UploadIdStreamResponseWrapper uploadIdStream(uploadIdStreamRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.streamapiupload.api.StreamApiUploadService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        StreamApiUploadService apiInstance = new StreamApiUploadService(defaultClient);
        UploadIdStreamRequestWrapper uploadIdStreamRequestWrapper = new UploadIdStreamRequestWrapper(); // UploadIdStreamRequestWrapper | 
        try {
            UploadIdStreamResponseWrapper result = apiInstance.uploadIdStream(uploadIdStreamRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamApiUploadService#uploadIdStream");
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

