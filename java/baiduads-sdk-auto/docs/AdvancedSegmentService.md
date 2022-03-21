# AdvancedSegmentService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSegment**](AdvancedSegmentService.md#addSegment) | **POST** /json/sms/service/AdvancedSegmentService/addSegment | 
[**deleteSegment**](AdvancedSegmentService.md#deleteSegment) | **POST** /json/sms/service/AdvancedSegmentService/deleteSegment | 
[**getSegment**](AdvancedSegmentService.md#getSegment) | **POST** /json/sms/service/AdvancedSegmentService/getSegment | 
[**updateSegment**](AdvancedSegmentService.md#updateSegment) | **POST** /json/sms/service/AdvancedSegmentService/updateSegment | 



## addSegment

> AddSegmentResponseWrapper addSegment(addSegmentRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advancedsegment.api.AdvancedSegmentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdvancedSegmentService apiInstance = new AdvancedSegmentService(defaultClient);
        AddSegmentRequestWrapper addSegmentRequestWrapper = new AddSegmentRequestWrapper(); // AddSegmentRequestWrapper | 
        try {
            AddSegmentResponseWrapper result = apiInstance.addSegment(addSegmentRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedSegmentService#addSegment");
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
 **addSegmentRequestWrapper** | [**AddSegmentRequestWrapper**](AddSegmentRequestWrapper.md)|  |

### Return type

[**AddSegmentResponseWrapper**](AddSegmentResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteSegment

> DeleteSegmentResponseWrapper deleteSegment(deleteSegmentRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advancedsegment.api.AdvancedSegmentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdvancedSegmentService apiInstance = new AdvancedSegmentService(defaultClient);
        DeleteSegmentRequestWrapper deleteSegmentRequestWrapper = new DeleteSegmentRequestWrapper(); // DeleteSegmentRequestWrapper | 
        try {
            DeleteSegmentResponseWrapper result = apiInstance.deleteSegment(deleteSegmentRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedSegmentService#deleteSegment");
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
 **deleteSegmentRequestWrapper** | [**DeleteSegmentRequestWrapper**](DeleteSegmentRequestWrapper.md)|  |

### Return type

[**DeleteSegmentResponseWrapper**](DeleteSegmentResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getSegment

> GetSegmentResponseWrapper getSegment(getSegmentRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advancedsegment.api.AdvancedSegmentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdvancedSegmentService apiInstance = new AdvancedSegmentService(defaultClient);
        GetSegmentRequestWrapper getSegmentRequestWrapper = new GetSegmentRequestWrapper(); // GetSegmentRequestWrapper | 
        try {
            GetSegmentResponseWrapper result = apiInstance.getSegment(getSegmentRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedSegmentService#getSegment");
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
 **getSegmentRequestWrapper** | [**GetSegmentRequestWrapper**](GetSegmentRequestWrapper.md)|  |

### Return type

[**GetSegmentResponseWrapper**](GetSegmentResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateSegment

> UpdateSegmentResponseWrapper updateSegment(updateSegmentRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advancedsegment.api.AdvancedSegmentService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdvancedSegmentService apiInstance = new AdvancedSegmentService(defaultClient);
        UpdateSegmentRequestWrapper updateSegmentRequestWrapper = new UpdateSegmentRequestWrapper(); // UpdateSegmentRequestWrapper | 
        try {
            UpdateSegmentResponseWrapper result = apiInstance.updateSegment(updateSegmentRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedSegmentService#updateSegment");
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
 **updateSegmentRequestWrapper** | [**UpdateSegmentRequestWrapper**](UpdateSegmentRequestWrapper.md)|  |

### Return type

[**UpdateSegmentResponseWrapper**](UpdateSegmentResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

