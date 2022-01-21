# AppFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJsKpAppList**](AppFeedService.md#getJsKpAppList) | **POST** /json/feed/v1/AppFeedService/getJsKpAppList | 



## getJsKpAppList

> GetJsKpAppListResponseWrapper getJsKpAppList(getJsKpAppListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.appfeed.api.AppFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AppFeedService apiInstance = new AppFeedService(defaultClient);
        GetJsKpAppListRequestWrapper getJsKpAppListRequestWrapper = new GetJsKpAppListRequestWrapper(); // GetJsKpAppListRequestWrapper | 
        try {
            GetJsKpAppListResponseWrapper result = apiInstance.getJsKpAppList(getJsKpAppListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppFeedService#getJsKpAppList");
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
 **getJsKpAppListRequestWrapper** | [**GetJsKpAppListRequestWrapper**](GetJsKpAppListRequestWrapper.md)|  |

### Return type

[**GetJsKpAppListResponseWrapper**](GetJsKpAppListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

