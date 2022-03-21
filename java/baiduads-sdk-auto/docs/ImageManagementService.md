# ImageManagementService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVideoExtractImage**](ImageManagementService.md#getVideoExtractImage) | **POST** /json/sms/service/ImageManagementService/getVideoExtractImage | 
[**uploadImage**](ImageManagementService.md#uploadImage) | **POST** /json/sms/service/ImageManagementService/uploadImage | 



## getVideoExtractImage

> GetVideoExtractImageResponseWrapper getVideoExtractImage(getVideoExtractImageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagemanagement.api.ImageManagementService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageManagementService apiInstance = new ImageManagementService(defaultClient);
        GetVideoExtractImageRequestWrapper getVideoExtractImageRequestWrapper = new GetVideoExtractImageRequestWrapper(); // GetVideoExtractImageRequestWrapper | 
        try {
            GetVideoExtractImageResponseWrapper result = apiInstance.getVideoExtractImage(getVideoExtractImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManagementService#getVideoExtractImage");
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
 **getVideoExtractImageRequestWrapper** | [**GetVideoExtractImageRequestWrapper**](GetVideoExtractImageRequestWrapper.md)|  |

### Return type

[**GetVideoExtractImageResponseWrapper**](GetVideoExtractImageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## uploadImage

> UploadImageResponseWrapper uploadImage(uploadImageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagemanagement.api.ImageManagementService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageManagementService apiInstance = new ImageManagementService(defaultClient);
        UploadImageRequestWrapper uploadImageRequestWrapper = new UploadImageRequestWrapper(); // UploadImageRequestWrapper | 
        try {
            UploadImageResponseWrapper result = apiInstance.uploadImage(uploadImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManagementService#uploadImage");
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
 **uploadImageRequestWrapper** | [**UploadImageRequestWrapper**](UploadImageRequestWrapper.md)|  |

### Return type

[**UploadImageResponseWrapper**](UploadImageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

