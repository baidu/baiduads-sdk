# ImageManageService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delImage**](ImageManageService.md#delImage) | **POST** /json/sms/service/ImageManageService/delImage | 
[**getImageList**](ImageManageService.md#getImageList) | **POST** /json/sms/service/ImageManageService/getImageList | 
[**modImage**](ImageManageService.md#modImage) | **POST** /json/sms/service/ImageManageService/modImage | 
[**uploadImage**](ImageManageService.md#uploadImage) | **POST** /json/sms/service/ImageManageService/uploadImage | 



## delImage

> DelImageResponseWrapper delImage(delImageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagemanage.api.ImageManageService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageManageService apiInstance = new ImageManageService(defaultClient);
        DelImageRequestWrapper delImageRequestWrapper = new DelImageRequestWrapper(); // DelImageRequestWrapper | 
        try {
            DelImageResponseWrapper result = apiInstance.delImage(delImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManageService#delImage");
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
 **delImageRequestWrapper** | [**DelImageRequestWrapper**](DelImageRequestWrapper.md)|  |

### Return type

[**DelImageResponseWrapper**](DelImageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getImageList

> GetImageListResponseWrapper getImageList(getImageListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagemanage.api.ImageManageService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageManageService apiInstance = new ImageManageService(defaultClient);
        GetImageListRequestWrapper getImageListRequestWrapper = new GetImageListRequestWrapper(); // GetImageListRequestWrapper | 
        try {
            GetImageListResponseWrapper result = apiInstance.getImageList(getImageListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManageService#getImageList");
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
 **getImageListRequestWrapper** | [**GetImageListRequestWrapper**](GetImageListRequestWrapper.md)|  |

### Return type

[**GetImageListResponseWrapper**](GetImageListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## modImage

> ModImageResponseWrapper modImage(modImageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagemanage.api.ImageManageService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageManageService apiInstance = new ImageManageService(defaultClient);
        ModImageRequestWrapper modImageRequestWrapper = new ModImageRequestWrapper(); // ModImageRequestWrapper | 
        try {
            ModImageResponseWrapper result = apiInstance.modImage(modImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManageService#modImage");
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
 **modImageRequestWrapper** | [**ModImageRequestWrapper**](ModImageRequestWrapper.md)|  |

### Return type

[**ModImageResponseWrapper**](ModImageResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.imagemanage.api.ImageManageService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageManageService apiInstance = new ImageManageService(defaultClient);
        UploadImageRequestWrapper uploadImageRequestWrapper = new UploadImageRequestWrapper(); // UploadImageRequestWrapper | 
        try {
            UploadImageResponseWrapper result = apiInstance.uploadImage(uploadImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManageService#uploadImage");
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

