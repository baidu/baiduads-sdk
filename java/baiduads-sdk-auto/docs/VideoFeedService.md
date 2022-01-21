# VideoFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVideoTextFeed**](VideoFeedService.md#getVideoTextFeed) | **POST** /json/feed/v1/VideoFeedService/getVideoTextFeed | 



## getVideoTextFeed

> GetVideoTextFeedResponseWrapper getVideoTextFeed(getVideoTextFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videofeed.api.VideoFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoFeedService apiInstance = new VideoFeedService(defaultClient);
        GetVideoTextFeedRequestWrapper getVideoTextFeedRequestWrapper = new GetVideoTextFeedRequestWrapper(); // GetVideoTextFeedRequestWrapper | 
        try {
            GetVideoTextFeedResponseWrapper result = apiInstance.getVideoTextFeed(getVideoTextFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoFeedService#getVideoTextFeed");
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
 **getVideoTextFeedRequestWrapper** | [**GetVideoTextFeedRequestWrapper**](GetVideoTextFeedRequestWrapper.md)|  |

### Return type

[**GetVideoTextFeedResponseWrapper**](GetVideoTextFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

