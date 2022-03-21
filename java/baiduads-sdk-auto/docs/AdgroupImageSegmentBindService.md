# AdgroupImageSegmentBindService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAdgroupImageSegmentBind**](AdgroupImageSegmentBindService.md#addAdgroupImageSegmentBind) | **POST** /json/sms/service/AdgroupImageSegmentBindService/addAdgroupImageSegmentBind | 
[**deleteAdgroupImageSegmentBind**](AdgroupImageSegmentBindService.md#deleteAdgroupImageSegmentBind) | **POST** /json/sms/service/AdgroupImageSegmentBindService/deleteAdgroupImageSegmentBind | 
[**getAdgroupImageSegmentBind**](AdgroupImageSegmentBindService.md#getAdgroupImageSegmentBind) | **POST** /json/sms/service/AdgroupImageSegmentBindService/getAdgroupImageSegmentBind | 



## addAdgroupImageSegmentBind

> AddAdgroupImageSegmentBindResponseWrapper addAdgroupImageSegmentBind(addAdgroupImageSegmentBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroupimagesegmentbind.api.AdgroupImageSegmentBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupImageSegmentBindService apiInstance = new AdgroupImageSegmentBindService(defaultClient);
        AddAdgroupImageSegmentBindRequestWrapper addAdgroupImageSegmentBindRequestWrapper = new AddAdgroupImageSegmentBindRequestWrapper(); // AddAdgroupImageSegmentBindRequestWrapper | 
        try {
            AddAdgroupImageSegmentBindResponseWrapper result = apiInstance.addAdgroupImageSegmentBind(addAdgroupImageSegmentBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupImageSegmentBindService#addAdgroupImageSegmentBind");
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
 **addAdgroupImageSegmentBindRequestWrapper** | [**AddAdgroupImageSegmentBindRequestWrapper**](AddAdgroupImageSegmentBindRequestWrapper.md)|  |

### Return type

[**AddAdgroupImageSegmentBindResponseWrapper**](AddAdgroupImageSegmentBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteAdgroupImageSegmentBind

> DeleteAdgroupImageSegmentBindResponseWrapper deleteAdgroupImageSegmentBind(deleteAdgroupImageSegmentBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroupimagesegmentbind.api.AdgroupImageSegmentBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupImageSegmentBindService apiInstance = new AdgroupImageSegmentBindService(defaultClient);
        DeleteAdgroupImageSegmentBindRequestWrapper deleteAdgroupImageSegmentBindRequestWrapper = new DeleteAdgroupImageSegmentBindRequestWrapper(); // DeleteAdgroupImageSegmentBindRequestWrapper | 
        try {
            DeleteAdgroupImageSegmentBindResponseWrapper result = apiInstance.deleteAdgroupImageSegmentBind(deleteAdgroupImageSegmentBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupImageSegmentBindService#deleteAdgroupImageSegmentBind");
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
 **deleteAdgroupImageSegmentBindRequestWrapper** | [**DeleteAdgroupImageSegmentBindRequestWrapper**](DeleteAdgroupImageSegmentBindRequestWrapper.md)|  |

### Return type

[**DeleteAdgroupImageSegmentBindResponseWrapper**](DeleteAdgroupImageSegmentBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAdgroupImageSegmentBind

> GetAdgroupImageSegmentBindResponseWrapper getAdgroupImageSegmentBind(getAdgroupImageSegmentBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroupimagesegmentbind.api.AdgroupImageSegmentBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupImageSegmentBindService apiInstance = new AdgroupImageSegmentBindService(defaultClient);
        GetAdgroupImageSegmentBindRequestWrapper getAdgroupImageSegmentBindRequestWrapper = new GetAdgroupImageSegmentBindRequestWrapper(); // GetAdgroupImageSegmentBindRequestWrapper | 
        try {
            GetAdgroupImageSegmentBindResponseWrapper result = apiInstance.getAdgroupImageSegmentBind(getAdgroupImageSegmentBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupImageSegmentBindService#getAdgroupImageSegmentBind");
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
 **getAdgroupImageSegmentBindRequestWrapper** | [**GetAdgroupImageSegmentBindRequestWrapper**](GetAdgroupImageSegmentBindRequestWrapper.md)|  |

### Return type

[**GetAdgroupImageSegmentBindResponseWrapper**](GetAdgroupImageSegmentBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

