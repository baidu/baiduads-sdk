# VideoUploadService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVideo**](VideoUploadService.md#addVideo) | **POST** /json/sms/service/VideoUploadService/addVideo | 



## addVideo

> AddVideoResponseWrapper addVideo(addVideoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videoupload.api.VideoUploadService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoUploadService apiInstance = new VideoUploadService(defaultClient);
        AddVideoRequestWrapper addVideoRequestWrapper = new AddVideoRequestWrapper(); // AddVideoRequestWrapper | 
        try {
            AddVideoResponseWrapper result = apiInstance.addVideo(addVideoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoUploadService#addVideo");
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
 **addVideoRequestWrapper** | [**AddVideoRequestWrapper**](AddVideoRequestWrapper.md)|  |

### Return type

[**AddVideoResponseWrapper**](AddVideoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

