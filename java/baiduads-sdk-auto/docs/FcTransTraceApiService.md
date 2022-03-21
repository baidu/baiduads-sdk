# FcTransTraceApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFcTransTrace**](FcTransTraceApiService.md#addFcTransTrace) | **POST** /json/sms/service/FcTransTraceApiService/addFcTransTrace | 
[**deleteFcTransTrace**](FcTransTraceApiService.md#deleteFcTransTrace) | **POST** /json/sms/service/FcTransTraceApiService/deleteFcTransTrace | 
[**getFcTransTraceList**](FcTransTraceApiService.md#getFcTransTraceList) | **POST** /json/sms/service/FcTransTraceApiService/getFcTransTraceList | 
[**updateFcTransTrace**](FcTransTraceApiService.md#updateFcTransTrace) | **POST** /json/sms/service/FcTransTraceApiService/updateFcTransTrace | 



## addFcTransTrace

> AddFcTransTraceResponseWrapper addFcTransTrace(addFcTransTraceRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fctranstraceapi.api.FcTransTraceApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FcTransTraceApiService apiInstance = new FcTransTraceApiService(defaultClient);
        AddFcTransTraceRequestWrapper addFcTransTraceRequestWrapper = new AddFcTransTraceRequestWrapper(); // AddFcTransTraceRequestWrapper | 
        try {
            AddFcTransTraceResponseWrapper result = apiInstance.addFcTransTrace(addFcTransTraceRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FcTransTraceApiService#addFcTransTrace");
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
 **addFcTransTraceRequestWrapper** | [**AddFcTransTraceRequestWrapper**](AddFcTransTraceRequestWrapper.md)|  |

### Return type

[**AddFcTransTraceResponseWrapper**](AddFcTransTraceResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteFcTransTrace

> DeleteFcTransTraceResponseWrapper deleteFcTransTrace(deleteFcTransTraceRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fctranstraceapi.api.FcTransTraceApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FcTransTraceApiService apiInstance = new FcTransTraceApiService(defaultClient);
        DeleteFcTransTraceRequestWrapper deleteFcTransTraceRequestWrapper = new DeleteFcTransTraceRequestWrapper(); // DeleteFcTransTraceRequestWrapper | 
        try {
            DeleteFcTransTraceResponseWrapper result = apiInstance.deleteFcTransTrace(deleteFcTransTraceRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FcTransTraceApiService#deleteFcTransTrace");
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
 **deleteFcTransTraceRequestWrapper** | [**DeleteFcTransTraceRequestWrapper**](DeleteFcTransTraceRequestWrapper.md)|  |

### Return type

[**DeleteFcTransTraceResponseWrapper**](DeleteFcTransTraceResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getFcTransTraceList

> GetFcTransTraceListResponseWrapper getFcTransTraceList(getFcTransTraceListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fctranstraceapi.api.FcTransTraceApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FcTransTraceApiService apiInstance = new FcTransTraceApiService(defaultClient);
        GetFcTransTraceListRequestWrapper getFcTransTraceListRequestWrapper = new GetFcTransTraceListRequestWrapper(); // GetFcTransTraceListRequestWrapper | 
        try {
            GetFcTransTraceListResponseWrapper result = apiInstance.getFcTransTraceList(getFcTransTraceListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FcTransTraceApiService#getFcTransTraceList");
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
 **getFcTransTraceListRequestWrapper** | [**GetFcTransTraceListRequestWrapper**](GetFcTransTraceListRequestWrapper.md)|  |

### Return type

[**GetFcTransTraceListResponseWrapper**](GetFcTransTraceListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateFcTransTrace

> UpdateFcTransTraceResponseWrapper updateFcTransTrace(updateFcTransTraceRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fctranstraceapi.api.FcTransTraceApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FcTransTraceApiService apiInstance = new FcTransTraceApiService(defaultClient);
        UpdateFcTransTraceRequestWrapper updateFcTransTraceRequestWrapper = new UpdateFcTransTraceRequestWrapper(); // UpdateFcTransTraceRequestWrapper | 
        try {
            UpdateFcTransTraceResponseWrapper result = apiInstance.updateFcTransTrace(updateFcTransTraceRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FcTransTraceApiService#updateFcTransTrace");
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
 **updateFcTransTraceRequestWrapper** | [**UpdateFcTransTraceRequestWrapper**](UpdateFcTransTraceRequestWrapper.md)|  |

### Return type

[**UpdateFcTransTraceResponseWrapper**](UpdateFcTransTraceResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

