# AccountService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountInfo**](AccountService.md#getAccountInfo) | **POST** /json/sms/service/AccountService/getAccountInfo | 
[**updateAccountInfo**](AccountService.md#updateAccountInfo) | **POST** /json/sms/service/AccountService/updateAccountInfo | 



## getAccountInfo

> GetAccountInfoResponseWrapper getAccountInfo(getAccountInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.account.api.AccountService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AccountService apiInstance = new AccountService(defaultClient);
        GetAccountInfoRequestWrapper getAccountInfoRequestWrapper = new GetAccountInfoRequestWrapper(); // GetAccountInfoRequestWrapper | 
        try {
            GetAccountInfoResponseWrapper result = apiInstance.getAccountInfo(getAccountInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountService#getAccountInfo");
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
 **getAccountInfoRequestWrapper** | [**GetAccountInfoRequestWrapper**](GetAccountInfoRequestWrapper.md)|  |

### Return type

[**GetAccountInfoResponseWrapper**](GetAccountInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAccountInfo

> UpdateAccountInfoResponseWrapper updateAccountInfo(updateAccountInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.account.api.AccountService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AccountService apiInstance = new AccountService(defaultClient);
        UpdateAccountInfoRequestWrapper updateAccountInfoRequestWrapper = new UpdateAccountInfoRequestWrapper(); // UpdateAccountInfoRequestWrapper | 
        try {
            UpdateAccountInfoResponseWrapper result = apiInstance.updateAccountInfo(updateAccountInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountService#updateAccountInfo");
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
 **updateAccountInfoRequestWrapper** | [**UpdateAccountInfoRequestWrapper**](UpdateAccountInfoRequestWrapper.md)|  |

### Return type

[**UpdateAccountInfoResponseWrapper**](UpdateAccountInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

