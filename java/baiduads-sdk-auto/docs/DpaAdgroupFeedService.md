# DpaAdgroupFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAdgroupFeed**](DpaAdgroupFeedService.md#addAdgroupFeed) | **POST** /json/feed/v1/DpaAdgroupFeedService/addAdgroupFeed | 
[**deleteAdgroupFeed**](DpaAdgroupFeedService.md#deleteAdgroupFeed) | **POST** /json/feed/v1/DpaAdgroupFeedService/deleteAdgroupFeed | 
[**getAdgroupFeed**](DpaAdgroupFeedService.md#getAdgroupFeed) | **POST** /json/feed/v1/DpaAdgroupFeedService/getAdgroupFeed | 
[**updateAdgroupFeed**](DpaAdgroupFeedService.md#updateAdgroupFeed) | **POST** /json/feed/v1/DpaAdgroupFeedService/updateAdgroupFeed | 



## addAdgroupFeed

> AddAdgroupFeedResponseWrapper addAdgroupFeed(addAdgroupFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaadgroupfeed.api.DpaAdgroupFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaAdgroupFeedService apiInstance = new DpaAdgroupFeedService(defaultClient);
        AddAdgroupFeedRequestWrapper addAdgroupFeedRequestWrapper = new AddAdgroupFeedRequestWrapper(); // AddAdgroupFeedRequestWrapper | 
        try {
            AddAdgroupFeedResponseWrapper result = apiInstance.addAdgroupFeed(addAdgroupFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaAdgroupFeedService#addAdgroupFeed");
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
 **addAdgroupFeedRequestWrapper** | [**AddAdgroupFeedRequestWrapper**](AddAdgroupFeedRequestWrapper.md)|  |

### Return type

[**AddAdgroupFeedResponseWrapper**](AddAdgroupFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteAdgroupFeed

> DeleteAdgroupFeedResponseWrapper deleteAdgroupFeed(deleteAdgroupFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaadgroupfeed.api.DpaAdgroupFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaAdgroupFeedService apiInstance = new DpaAdgroupFeedService(defaultClient);
        DeleteAdgroupFeedRequestWrapper deleteAdgroupFeedRequestWrapper = new DeleteAdgroupFeedRequestWrapper(); // DeleteAdgroupFeedRequestWrapper | 
        try {
            DeleteAdgroupFeedResponseWrapper result = apiInstance.deleteAdgroupFeed(deleteAdgroupFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaAdgroupFeedService#deleteAdgroupFeed");
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
 **deleteAdgroupFeedRequestWrapper** | [**DeleteAdgroupFeedRequestWrapper**](DeleteAdgroupFeedRequestWrapper.md)|  |

### Return type

[**DeleteAdgroupFeedResponseWrapper**](DeleteAdgroupFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAdgroupFeed

> GetAdgroupFeedResponseWrapper getAdgroupFeed(getAdgroupFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaadgroupfeed.api.DpaAdgroupFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaAdgroupFeedService apiInstance = new DpaAdgroupFeedService(defaultClient);
        GetAdgroupFeedRequestWrapper getAdgroupFeedRequestWrapper = new GetAdgroupFeedRequestWrapper(); // GetAdgroupFeedRequestWrapper | 
        try {
            GetAdgroupFeedResponseWrapper result = apiInstance.getAdgroupFeed(getAdgroupFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaAdgroupFeedService#getAdgroupFeed");
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
 **getAdgroupFeedRequestWrapper** | [**GetAdgroupFeedRequestWrapper**](GetAdgroupFeedRequestWrapper.md)|  |

### Return type

[**GetAdgroupFeedResponseWrapper**](GetAdgroupFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAdgroupFeed

> UpdateAdgroupFeedResponseWrapper updateAdgroupFeed(updateAdgroupFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaadgroupfeed.api.DpaAdgroupFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaAdgroupFeedService apiInstance = new DpaAdgroupFeedService(defaultClient);
        UpdateAdgroupFeedRequestWrapper updateAdgroupFeedRequestWrapper = new UpdateAdgroupFeedRequestWrapper(); // UpdateAdgroupFeedRequestWrapper | 
        try {
            UpdateAdgroupFeedResponseWrapper result = apiInstance.updateAdgroupFeed(updateAdgroupFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaAdgroupFeedService#updateAdgroupFeed");
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
 **updateAdgroupFeedRequestWrapper** | [**UpdateAdgroupFeedRequestWrapper**](UpdateAdgroupFeedRequestWrapper.md)|  |

### Return type

[**UpdateAdgroupFeedResponseWrapper**](UpdateAdgroupFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

