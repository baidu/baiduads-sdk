# VideoService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteVideos**](VideoService.md#deleteVideos) | **POST** /json/sms/service/VideoService/deleteVideos | 
[**getVideoInfos**](VideoService.md#getVideoInfos) | **POST** /json/sms/service/VideoService/getVideoInfos | 



## deleteVideos

> DeleteVideosResponseWrapper deleteVideos(deleteVideosRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.video.api.VideoService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoService apiInstance = new VideoService(defaultClient);
        DeleteVideosRequestWrapper deleteVideosRequestWrapper = new DeleteVideosRequestWrapper(); // DeleteVideosRequestWrapper | 
        try {
            DeleteVideosResponseWrapper result = apiInstance.deleteVideos(deleteVideosRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoService#deleteVideos");
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
 **deleteVideosRequestWrapper** | [**DeleteVideosRequestWrapper**](DeleteVideosRequestWrapper.md)|  |

### Return type

[**DeleteVideosResponseWrapper**](DeleteVideosResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getVideoInfos

> GetVideoInfosResponseWrapper getVideoInfos(getVideoInfosRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.video.api.VideoService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoService apiInstance = new VideoService(defaultClient);
        GetVideoInfosRequestWrapper getVideoInfosRequestWrapper = new GetVideoInfosRequestWrapper(); // GetVideoInfosRequestWrapper | 
        try {
            GetVideoInfosResponseWrapper result = apiInstance.getVideoInfos(getVideoInfosRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoService#getVideoInfos");
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
 **getVideoInfosRequestWrapper** | [**GetVideoInfosRequestWrapper**](GetVideoInfosRequestWrapper.md)|  |

### Return type

[**GetVideoInfosResponseWrapper**](GetVideoInfosResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

