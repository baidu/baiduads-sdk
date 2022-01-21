# AdgroupService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAdgroup**](AdgroupService.md#addAdgroup) | **POST** /json/sms/service/AdgroupService/addAdgroup | 
[**deleteAdgroup**](AdgroupService.md#deleteAdgroup) | **POST** /json/sms/service/AdgroupService/deleteAdgroup | 
[**getAdgroup**](AdgroupService.md#getAdgroup) | **POST** /json/sms/service/AdgroupService/getAdgroup | 
[**updateAdgroup**](AdgroupService.md#updateAdgroup) | **POST** /json/sms/service/AdgroupService/updateAdgroup | 



## addAdgroup

> AddAdgroupResponseWrapper addAdgroup(addAdgroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroup.api.AdgroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupService apiInstance = new AdgroupService(defaultClient);
        AddAdgroupRequestWrapper addAdgroupRequestWrapper = new AddAdgroupRequestWrapper(); // AddAdgroupRequestWrapper | 
        try {
            AddAdgroupResponseWrapper result = apiInstance.addAdgroup(addAdgroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupService#addAdgroup");
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
 **addAdgroupRequestWrapper** | [**AddAdgroupRequestWrapper**](AddAdgroupRequestWrapper.md)|  |

### Return type

[**AddAdgroupResponseWrapper**](AddAdgroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteAdgroup

> DeleteAdgroupResponseWrapper deleteAdgroup(deleteAdgroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroup.api.AdgroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupService apiInstance = new AdgroupService(defaultClient);
        DeleteAdgroupRequestWrapper deleteAdgroupRequestWrapper = new DeleteAdgroupRequestWrapper(); // DeleteAdgroupRequestWrapper | 
        try {
            DeleteAdgroupResponseWrapper result = apiInstance.deleteAdgroup(deleteAdgroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupService#deleteAdgroup");
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
 **deleteAdgroupRequestWrapper** | [**DeleteAdgroupRequestWrapper**](DeleteAdgroupRequestWrapper.md)|  |

### Return type

[**DeleteAdgroupResponseWrapper**](DeleteAdgroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAdgroup

> GetAdgroupResponseWrapper getAdgroup(getAdgroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroup.api.AdgroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupService apiInstance = new AdgroupService(defaultClient);
        GetAdgroupRequestWrapper getAdgroupRequestWrapper = new GetAdgroupRequestWrapper(); // GetAdgroupRequestWrapper | 
        try {
            GetAdgroupResponseWrapper result = apiInstance.getAdgroup(getAdgroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupService#getAdgroup");
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
 **getAdgroupRequestWrapper** | [**GetAdgroupRequestWrapper**](GetAdgroupRequestWrapper.md)|  |

### Return type

[**GetAdgroupResponseWrapper**](GetAdgroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAdgroup

> UpdateAdgroupResponseWrapper updateAdgroup(updateAdgroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.adgroup.api.AdgroupService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdgroupService apiInstance = new AdgroupService(defaultClient);
        UpdateAdgroupRequestWrapper updateAdgroupRequestWrapper = new UpdateAdgroupRequestWrapper(); // UpdateAdgroupRequestWrapper | 
        try {
            UpdateAdgroupResponseWrapper result = apiInstance.updateAdgroup(updateAdgroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdgroupService#updateAdgroup");
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
 **updateAdgroupRequestWrapper** | [**UpdateAdgroupRequestWrapper**](UpdateAdgroupRequestWrapper.md)|  |

### Return type

[**UpdateAdgroupResponseWrapper**](UpdateAdgroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

