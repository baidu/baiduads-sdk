# AdvancedSegmentBindService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSegmentBind**](AdvancedSegmentBindService.md#addSegmentBind) | **POST** /json/sms/service/AdvancedSegmentBindService/addSegmentBind | 
[**deleteSegmentBind**](AdvancedSegmentBindService.md#deleteSegmentBind) | **POST** /json/sms/service/AdvancedSegmentBindService/deleteSegmentBind | 
[**getSegmentBind**](AdvancedSegmentBindService.md#getSegmentBind) | **POST** /json/sms/service/AdvancedSegmentBindService/getSegmentBind | 
[**updateSegmentBind**](AdvancedSegmentBindService.md#updateSegmentBind) | **POST** /json/sms/service/AdvancedSegmentBindService/updateSegmentBind | 



## addSegmentBind

> AddSegmentBindResponseWrapper addSegmentBind(addSegmentBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advancedsegmentbind.api.AdvancedSegmentBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdvancedSegmentBindService apiInstance = new AdvancedSegmentBindService(defaultClient);
        AddSegmentBindRequestWrapper addSegmentBindRequestWrapper = new AddSegmentBindRequestWrapper(); // AddSegmentBindRequestWrapper | 
        try {
            AddSegmentBindResponseWrapper result = apiInstance.addSegmentBind(addSegmentBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedSegmentBindService#addSegmentBind");
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
 **addSegmentBindRequestWrapper** | [**AddSegmentBindRequestWrapper**](AddSegmentBindRequestWrapper.md)|  |

### Return type

[**AddSegmentBindResponseWrapper**](AddSegmentBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteSegmentBind

> DeleteSegmentBindResponseWrapper deleteSegmentBind(deleteSegmentBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advancedsegmentbind.api.AdvancedSegmentBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdvancedSegmentBindService apiInstance = new AdvancedSegmentBindService(defaultClient);
        DeleteSegmentBindRequestWrapper deleteSegmentBindRequestWrapper = new DeleteSegmentBindRequestWrapper(); // DeleteSegmentBindRequestWrapper | 
        try {
            DeleteSegmentBindResponseWrapper result = apiInstance.deleteSegmentBind(deleteSegmentBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedSegmentBindService#deleteSegmentBind");
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
 **deleteSegmentBindRequestWrapper** | [**DeleteSegmentBindRequestWrapper**](DeleteSegmentBindRequestWrapper.md)|  |

### Return type

[**DeleteSegmentBindResponseWrapper**](DeleteSegmentBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getSegmentBind

> GetSegmentBindResponseWrapper getSegmentBind(getSegmentBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advancedsegmentbind.api.AdvancedSegmentBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdvancedSegmentBindService apiInstance = new AdvancedSegmentBindService(defaultClient);
        GetSegmentBindRequestWrapper getSegmentBindRequestWrapper = new GetSegmentBindRequestWrapper(); // GetSegmentBindRequestWrapper | 
        try {
            GetSegmentBindResponseWrapper result = apiInstance.getSegmentBind(getSegmentBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedSegmentBindService#getSegmentBind");
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
 **getSegmentBindRequestWrapper** | [**GetSegmentBindRequestWrapper**](GetSegmentBindRequestWrapper.md)|  |

### Return type

[**GetSegmentBindResponseWrapper**](GetSegmentBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateSegmentBind

> UpdateSegmentBindResponseWrapper updateSegmentBind(updateSegmentBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advancedsegmentbind.api.AdvancedSegmentBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdvancedSegmentBindService apiInstance = new AdvancedSegmentBindService(defaultClient);
        UpdateSegmentBindRequestWrapper updateSegmentBindRequestWrapper = new UpdateSegmentBindRequestWrapper(); // UpdateSegmentBindRequestWrapper | 
        try {
            UpdateSegmentBindResponseWrapper result = apiInstance.updateSegmentBind(updateSegmentBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedSegmentBindService#updateSegmentBind");
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
 **updateSegmentBindRequestWrapper** | [**UpdateSegmentBindRequestWrapper**](UpdateSegmentBindRequestWrapper.md)|  |

### Return type

[**UpdateSegmentBindResponseWrapper**](UpdateSegmentBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

