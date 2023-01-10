# CrowdFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBindAdgroup**](CrowdFeedService.md#getBindAdgroup) | **POST** /json/feed/v1/CrowdFeedService/getBindAdgroup | 
[**getEshopEldsCrowds**](CrowdFeedService.md#getEshopEldsCrowds) | **POST** /json/feed/v1/CrowdFeedService/getEshopEldsCrowds | 
[**getEshopTradeCrowds**](CrowdFeedService.md#getEshopTradeCrowds) | **POST** /json/feed/v1/CrowdFeedService/getEshopTradeCrowds | 



## getBindAdgroup

> GetBindAdgroupResponseWrapper getBindAdgroup(getBindAdgroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdfeed.api.CrowdFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdFeedService apiInstance = new CrowdFeedService(defaultClient);
        GetBindAdgroupRequestWrapper getBindAdgroupRequestWrapper = new GetBindAdgroupRequestWrapper(); // GetBindAdgroupRequestWrapper | 
        try {
            GetBindAdgroupResponseWrapper result = apiInstance.getBindAdgroup(getBindAdgroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdFeedService#getBindAdgroup");
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
 **getBindAdgroupRequestWrapper** | [**GetBindAdgroupRequestWrapper**](GetBindAdgroupRequestWrapper.md)|  |

### Return type

[**GetBindAdgroupResponseWrapper**](GetBindAdgroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getEshopEldsCrowds

> GetEshopEldsCrowdsResponseWrapper getEshopEldsCrowds(getEshopEldsCrowdsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdfeed.api.CrowdFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdFeedService apiInstance = new CrowdFeedService(defaultClient);
        GetEshopEldsCrowdsRequestWrapper getEshopEldsCrowdsRequestWrapper = new GetEshopEldsCrowdsRequestWrapper(); // GetEshopEldsCrowdsRequestWrapper | 
        try {
            GetEshopEldsCrowdsResponseWrapper result = apiInstance.getEshopEldsCrowds(getEshopEldsCrowdsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdFeedService#getEshopEldsCrowds");
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
 **getEshopEldsCrowdsRequestWrapper** | [**GetEshopEldsCrowdsRequestWrapper**](GetEshopEldsCrowdsRequestWrapper.md)|  |

### Return type

[**GetEshopEldsCrowdsResponseWrapper**](GetEshopEldsCrowdsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getEshopTradeCrowds

> GetEshopTradeCrowdsResponseWrapper getEshopTradeCrowds(getEshopTradeCrowdsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdfeed.api.CrowdFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdFeedService apiInstance = new CrowdFeedService(defaultClient);
        GetEshopTradeCrowdsRequestWrapper getEshopTradeCrowdsRequestWrapper = new GetEshopTradeCrowdsRequestWrapper(); // GetEshopTradeCrowdsRequestWrapper | 
        try {
            GetEshopTradeCrowdsResponseWrapper result = apiInstance.getEshopTradeCrowds(getEshopTradeCrowdsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdFeedService#getEshopTradeCrowds");
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
 **getEshopTradeCrowdsRequestWrapper** | [**GetEshopTradeCrowdsRequestWrapper**](GetEshopTradeCrowdsRequestWrapper.md)|  |

### Return type

[**GetEshopTradeCrowdsResponseWrapper**](GetEshopTradeCrowdsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

