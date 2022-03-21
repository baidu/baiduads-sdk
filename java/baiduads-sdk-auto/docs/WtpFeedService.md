# WtpFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWtpFeed**](WtpFeedService.md#addWtpFeed) | **POST** /json/feed/v1/WtpFeedService/addWtpFeed | 
[**deleteWtpFeed**](WtpFeedService.md#deleteWtpFeed) | **POST** /json/feed/v1/WtpFeedService/deleteWtpFeed | 
[**getWtpFeed**](WtpFeedService.md#getWtpFeed) | **POST** /json/feed/v1/WtpFeedService/getWtpFeed | 
[**updateWtpFeed**](WtpFeedService.md#updateWtpFeed) | **POST** /json/feed/v1/WtpFeedService/updateWtpFeed | 



## addWtpFeed

> AddWtpFeedResponseWrapper addWtpFeed(addWtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.wtpfeed.api.WtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WtpFeedService apiInstance = new WtpFeedService(defaultClient);
        AddWtpFeedRequestWrapper addWtpFeedRequestWrapper = new AddWtpFeedRequestWrapper(); // AddWtpFeedRequestWrapper | 
        try {
            AddWtpFeedResponseWrapper result = apiInstance.addWtpFeed(addWtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WtpFeedService#addWtpFeed");
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
 **addWtpFeedRequestWrapper** | [**AddWtpFeedRequestWrapper**](AddWtpFeedRequestWrapper.md)|  |

### Return type

[**AddWtpFeedResponseWrapper**](AddWtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteWtpFeed

> DeleteWtpFeedResponseWrapper deleteWtpFeed(deleteWtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.wtpfeed.api.WtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WtpFeedService apiInstance = new WtpFeedService(defaultClient);
        DeleteWtpFeedRequestWrapper deleteWtpFeedRequestWrapper = new DeleteWtpFeedRequestWrapper(); // DeleteWtpFeedRequestWrapper | 
        try {
            DeleteWtpFeedResponseWrapper result = apiInstance.deleteWtpFeed(deleteWtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WtpFeedService#deleteWtpFeed");
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
 **deleteWtpFeedRequestWrapper** | [**DeleteWtpFeedRequestWrapper**](DeleteWtpFeedRequestWrapper.md)|  |

### Return type

[**DeleteWtpFeedResponseWrapper**](DeleteWtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getWtpFeed

> GetWtpFeedResponseWrapper getWtpFeed(getWtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.wtpfeed.api.WtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WtpFeedService apiInstance = new WtpFeedService(defaultClient);
        GetWtpFeedRequestWrapper getWtpFeedRequestWrapper = new GetWtpFeedRequestWrapper(); // GetWtpFeedRequestWrapper | 
        try {
            GetWtpFeedResponseWrapper result = apiInstance.getWtpFeed(getWtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WtpFeedService#getWtpFeed");
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
 **getWtpFeedRequestWrapper** | [**GetWtpFeedRequestWrapper**](GetWtpFeedRequestWrapper.md)|  |

### Return type

[**GetWtpFeedResponseWrapper**](GetWtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateWtpFeed

> UpdateWtpFeedResponseWrapper updateWtpFeed(updateWtpFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.wtpfeed.api.WtpFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WtpFeedService apiInstance = new WtpFeedService(defaultClient);
        UpdateWtpFeedRequestWrapper updateWtpFeedRequestWrapper = new UpdateWtpFeedRequestWrapper(); // UpdateWtpFeedRequestWrapper | 
        try {
            UpdateWtpFeedResponseWrapper result = apiInstance.updateWtpFeed(updateWtpFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WtpFeedService#updateWtpFeed");
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
 **updateWtpFeedRequestWrapper** | [**UpdateWtpFeedRequestWrapper**](UpdateWtpFeedRequestWrapper.md)|  |

### Return type

[**UpdateWtpFeedResponseWrapper**](UpdateWtpFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

