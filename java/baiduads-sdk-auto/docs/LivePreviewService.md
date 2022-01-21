# LivePreviewService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLivePreview**](LivePreviewService.md#getLivePreview) | **POST** /json/sms/service/LivePreviewService/getLivePreview | 



## getLivePreview

> GetLivePreviewResponseWrapper getLivePreview(getLivePreviewRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.livepreview.api.LivePreviewService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        LivePreviewService apiInstance = new LivePreviewService(defaultClient);
        GetLivePreviewRequestWrapper getLivePreviewRequestWrapper = new GetLivePreviewRequestWrapper(); // GetLivePreviewRequestWrapper | 
        try {
            GetLivePreviewResponseWrapper result = apiInstance.getLivePreview(getLivePreviewRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivePreviewService#getLivePreview");
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
 **getLivePreviewRequestWrapper** | [**GetLivePreviewRequestWrapper**](GetLivePreviewRequestWrapper.md)|  |

### Return type

[**GetLivePreviewResponseWrapper**](GetLivePreviewResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

