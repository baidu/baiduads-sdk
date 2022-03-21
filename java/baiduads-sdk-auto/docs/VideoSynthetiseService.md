# VideoSynthetiseService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clipVideo**](VideoSynthetiseService.md#clipVideo) | **POST** /json/sms/service/VideoSynthetiseService/clipVideo | 
[**queryVideoClipStatus**](VideoSynthetiseService.md#queryVideoClipStatus) | **POST** /json/sms/service/VideoSynthetiseService/queryVideoClipStatus | 



## clipVideo

> ClipVideoResponseWrapper clipVideo(clipVideoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        ClipVideoRequestWrapper clipVideoRequestWrapper = new ClipVideoRequestWrapper(); // ClipVideoRequestWrapper | 
        try {
            ClipVideoResponseWrapper result = apiInstance.clipVideo(clipVideoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#clipVideo");
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
 **clipVideoRequestWrapper** | [**ClipVideoRequestWrapper**](ClipVideoRequestWrapper.md)|  |

### Return type

[**ClipVideoResponseWrapper**](ClipVideoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryVideoClipStatus

> QueryVideoClipStatusResponseWrapper queryVideoClipStatus(queryVideoClipStatusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videosynthetise.api.VideoSynthetiseService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoSynthetiseService apiInstance = new VideoSynthetiseService(defaultClient);
        QueryVideoClipStatusRequestWrapper queryVideoClipStatusRequestWrapper = new QueryVideoClipStatusRequestWrapper(); // QueryVideoClipStatusRequestWrapper | 
        try {
            QueryVideoClipStatusResponseWrapper result = apiInstance.queryVideoClipStatus(queryVideoClipStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoSynthetiseService#queryVideoClipStatus");
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
 **queryVideoClipStatusRequestWrapper** | [**QueryVideoClipStatusRequestWrapper**](QueryVideoClipStatusRequestWrapper.md)|  |

### Return type

[**QueryVideoClipStatusResponseWrapper**](QueryVideoClipStatusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

