# ImageProcessingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCropImage**](ImageProcessingService.md#addCropImage) | **POST** /json/feed/v1/ImageProcessingService/addCropImage | 
[**getDefaultVideoCoverFeed**](ImageProcessingService.md#getDefaultVideoCoverFeed) | **POST** /json/feed/v1/ImageProcessingService/getDefaultVideoCoverFeed | 



## addCropImage

> AddCropImageResponseWrapper addCropImage(addCropImageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imageprocessing.api.ImageProcessingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageProcessingService apiInstance = new ImageProcessingService(defaultClient);
        AddCropImageRequestWrapper addCropImageRequestWrapper = new AddCropImageRequestWrapper(); // AddCropImageRequestWrapper | 
        try {
            AddCropImageResponseWrapper result = apiInstance.addCropImage(addCropImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageProcessingService#addCropImage");
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
 **addCropImageRequestWrapper** | [**AddCropImageRequestWrapper**](AddCropImageRequestWrapper.md)|  |

### Return type

[**AddCropImageResponseWrapper**](AddCropImageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getDefaultVideoCoverFeed

> GetDefaultVideoCoverFeedResponseWrapper getDefaultVideoCoverFeed(getDefaultVideoCoverFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imageprocessing.api.ImageProcessingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageProcessingService apiInstance = new ImageProcessingService(defaultClient);
        GetDefaultVideoCoverFeedRequestWrapper getDefaultVideoCoverFeedRequestWrapper = new GetDefaultVideoCoverFeedRequestWrapper(); // GetDefaultVideoCoverFeedRequestWrapper | 
        try {
            GetDefaultVideoCoverFeedResponseWrapper result = apiInstance.getDefaultVideoCoverFeed(getDefaultVideoCoverFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageProcessingService#getDefaultVideoCoverFeed");
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
 **getDefaultVideoCoverFeedRequestWrapper** | [**GetDefaultVideoCoverFeedRequestWrapper**](GetDefaultVideoCoverFeedRequestWrapper.md)|  |

### Return type

[**GetDefaultVideoCoverFeedResponseWrapper**](GetDefaultVideoCoverFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

