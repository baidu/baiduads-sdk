# AdgroupAppService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAdgroupAppBind**](AdgroupAppService.md#addAdgroupAppBind) | **POST** /json/sms/service/AdgroupAppService/addAdgroupAppBind | 
[**deleteAdgroupAppBind**](AdgroupAppService.md#deleteAdgroupAppBind) | **POST** /json/sms/service/AdgroupAppService/deleteAdgroupAppBind | 
[**getAdgroupAppBind**](AdgroupAppService.md#getAdgroupAppBind) | **POST** /json/sms/service/AdgroupAppService/getAdgroupAppBind | 



## addAdgroupAppBind

> AddAdgroupAppBindResponseWrapper addAdgroupAppBind(addAdgroupAppBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroupapp.api.AdgroupAppService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupAppService apiInstance = new AdgroupAppService(defaultClient);
        AddAdgroupAppBindRequestWrapper addAdgroupAppBindRequestWrapper = new AddAdgroupAppBindRequestWrapper(); // AddAdgroupAppBindRequestWrapper | 
        try {
            AddAdgroupAppBindResponseWrapper result = apiInstance.addAdgroupAppBind(addAdgroupAppBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupAppService#addAdgroupAppBind");
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
 **addAdgroupAppBindRequestWrapper** | [**AddAdgroupAppBindRequestWrapper**](AddAdgroupAppBindRequestWrapper.md)|  |

### Return type

[**AddAdgroupAppBindResponseWrapper**](AddAdgroupAppBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteAdgroupAppBind

> DeleteAdgroupAppBindResponseWrapper deleteAdgroupAppBind(deleteAdgroupAppBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroupapp.api.AdgroupAppService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupAppService apiInstance = new AdgroupAppService(defaultClient);
        DeleteAdgroupAppBindRequestWrapper deleteAdgroupAppBindRequestWrapper = new DeleteAdgroupAppBindRequestWrapper(); // DeleteAdgroupAppBindRequestWrapper | 
        try {
            DeleteAdgroupAppBindResponseWrapper result = apiInstance.deleteAdgroupAppBind(deleteAdgroupAppBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupAppService#deleteAdgroupAppBind");
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
 **deleteAdgroupAppBindRequestWrapper** | [**DeleteAdgroupAppBindRequestWrapper**](DeleteAdgroupAppBindRequestWrapper.md)|  |

### Return type

[**DeleteAdgroupAppBindResponseWrapper**](DeleteAdgroupAppBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAdgroupAppBind

> GetAdgroupAppBindResponseWrapper getAdgroupAppBind(getAdgroupAppBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroupapp.api.AdgroupAppService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupAppService apiInstance = new AdgroupAppService(defaultClient);
        GetAdgroupAppBindRequestWrapper getAdgroupAppBindRequestWrapper = new GetAdgroupAppBindRequestWrapper(); // GetAdgroupAppBindRequestWrapper | 
        try {
            GetAdgroupAppBindResponseWrapper result = apiInstance.getAdgroupAppBind(getAdgroupAppBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupAppService#getAdgroupAppBind");
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
 **getAdgroupAppBindRequestWrapper** | [**GetAdgroupAppBindRequestWrapper**](GetAdgroupAppBindRequestWrapper.md)|  |

### Return type

[**GetAdgroupAppBindResponseWrapper**](GetAdgroupAppBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

