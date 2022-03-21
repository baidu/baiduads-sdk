# ImageSegmentService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addImageSegment**](ImageSegmentService.md#addImageSegment) | **POST** /json/sms/service/ImageSegmentService/addImageSegment | 
[**deleteImageSegment**](ImageSegmentService.md#deleteImageSegment) | **POST** /json/sms/service/ImageSegmentService/deleteImageSegment | 
[**getImageSegment**](ImageSegmentService.md#getImageSegment) | **POST** /json/sms/service/ImageSegmentService/getImageSegment | 
[**updateImageSegment**](ImageSegmentService.md#updateImageSegment) | **POST** /json/sms/service/ImageSegmentService/updateImageSegment | 



## addImageSegment

> AddImageSegmentResponseWrapper addImageSegment(addImageSegmentRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagesegment.api.ImageSegmentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageSegmentService apiInstance = new ImageSegmentService(defaultClient);
        AddImageSegmentRequestWrapper addImageSegmentRequestWrapper = new AddImageSegmentRequestWrapper(); // AddImageSegmentRequestWrapper | 
        try {
            AddImageSegmentResponseWrapper result = apiInstance.addImageSegment(addImageSegmentRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageSegmentService#addImageSegment");
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
 **addImageSegmentRequestWrapper** | [**AddImageSegmentRequestWrapper**](AddImageSegmentRequestWrapper.md)|  |

### Return type

[**AddImageSegmentResponseWrapper**](AddImageSegmentResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteImageSegment

> DeleteImageSegmentResponseWrapper deleteImageSegment(deleteImageSegmentRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagesegment.api.ImageSegmentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageSegmentService apiInstance = new ImageSegmentService(defaultClient);
        DeleteImageSegmentRequestWrapper deleteImageSegmentRequestWrapper = new DeleteImageSegmentRequestWrapper(); // DeleteImageSegmentRequestWrapper | 
        try {
            DeleteImageSegmentResponseWrapper result = apiInstance.deleteImageSegment(deleteImageSegmentRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageSegmentService#deleteImageSegment");
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
 **deleteImageSegmentRequestWrapper** | [**DeleteImageSegmentRequestWrapper**](DeleteImageSegmentRequestWrapper.md)|  |

### Return type

[**DeleteImageSegmentResponseWrapper**](DeleteImageSegmentResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getImageSegment

> GetImageSegmentResponseWrapper getImageSegment(getImageSegmentRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagesegment.api.ImageSegmentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageSegmentService apiInstance = new ImageSegmentService(defaultClient);
        GetImageSegmentRequestWrapper getImageSegmentRequestWrapper = new GetImageSegmentRequestWrapper(); // GetImageSegmentRequestWrapper | 
        try {
            GetImageSegmentResponseWrapper result = apiInstance.getImageSegment(getImageSegmentRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageSegmentService#getImageSegment");
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
 **getImageSegmentRequestWrapper** | [**GetImageSegmentRequestWrapper**](GetImageSegmentRequestWrapper.md)|  |

### Return type

[**GetImageSegmentResponseWrapper**](GetImageSegmentResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateImageSegment

> UpdateImageSegmentResponseWrapper updateImageSegment(updateImageSegmentRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.imagesegment.api.ImageSegmentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        ImageSegmentService apiInstance = new ImageSegmentService(defaultClient);
        UpdateImageSegmentRequestWrapper updateImageSegmentRequestWrapper = new UpdateImageSegmentRequestWrapper(); // UpdateImageSegmentRequestWrapper | 
        try {
            UpdateImageSegmentResponseWrapper result = apiInstance.updateImageSegment(updateImageSegmentRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageSegmentService#updateImageSegment");
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
 **updateImageSegmentRequestWrapper** | [**UpdateImageSegmentRequestWrapper**](UpdateImageSegmentRequestWrapper.md)|  |

### Return type

[**UpdateImageSegmentResponseWrapper**](UpdateImageSegmentResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

