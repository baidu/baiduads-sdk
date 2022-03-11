# AccountFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountFeed**](AccountFeedService.md#getAccountFeed) | **POST** /json/feed/v1/AccountFeedService/getAccountFeed | 
[**updateAccountFeed**](AccountFeedService.md#updateAccountFeed) | **POST** /json/feed/v1/AccountFeedService/updateAccountFeed | 



## getAccountFeed

> GetAccountFeedResponseWrapper getAccountFeed(getAccountFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.accountfeed.api.AccountFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AccountFeedService apiInstance = new AccountFeedService(defaultClient);
        GetAccountFeedRequestWrapper getAccountFeedRequestWrapper = new GetAccountFeedRequestWrapper(); // GetAccountFeedRequestWrapper | 
        try {
            GetAccountFeedResponseWrapper result = apiInstance.getAccountFeed(getAccountFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountFeedService#getAccountFeed");
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
 **getAccountFeedRequestWrapper** | [**GetAccountFeedRequestWrapper**](GetAccountFeedRequestWrapper.md)|  |

### Return type

[**GetAccountFeedResponseWrapper**](GetAccountFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAccountFeed

> UpdateAccountFeedResponseWrapper updateAccountFeed(updateAccountFeedRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.accountfeed.api.AccountFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AccountFeedService apiInstance = new AccountFeedService(defaultClient);
        UpdateAccountFeedRequestWrapper updateAccountFeedRequestWrapper = new UpdateAccountFeedRequestWrapper(); // UpdateAccountFeedRequestWrapper | 
        try {
            UpdateAccountFeedResponseWrapper result = apiInstance.updateAccountFeed(updateAccountFeedRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountFeedService#updateAccountFeed");
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
 **updateAccountFeedRequestWrapper** | [**UpdateAccountFeedRequestWrapper**](UpdateAccountFeedRequestWrapper.md)|  |

### Return type

[**UpdateAccountFeedResponseWrapper**](UpdateAccountFeedResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

