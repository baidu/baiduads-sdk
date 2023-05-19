# AccountShoppingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountShopping**](AccountShoppingService.md#getAccountShopping) | **POST** /json/sms/service/AccountShoppingService/getAccountShopping | 
[**updateAccountShopping**](AccountShoppingService.md#updateAccountShopping) | **POST** /json/sms/service/AccountShoppingService/updateAccountShopping | 



## getAccountShopping

> GetAccountShoppingResponseWrapper getAccountShopping(getAccountShoppingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.accountshopping.api.AccountShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AccountShoppingService apiInstance = new AccountShoppingService(defaultClient);
        GetAccountShoppingRequestWrapper getAccountShoppingRequestWrapper = new GetAccountShoppingRequestWrapper(); // GetAccountShoppingRequestWrapper | 
        try {
            GetAccountShoppingResponseWrapper result = apiInstance.getAccountShopping(getAccountShoppingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountShoppingService#getAccountShopping");
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
 **getAccountShoppingRequestWrapper** | [**GetAccountShoppingRequestWrapper**](GetAccountShoppingRequestWrapper.md)|  |

### Return type

[**GetAccountShoppingResponseWrapper**](GetAccountShoppingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateAccountShopping

> UpdateAccountShoppingResponseWrapper updateAccountShopping(updateAccountShoppingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.accountshopping.api.AccountShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AccountShoppingService apiInstance = new AccountShoppingService(defaultClient);
        UpdateAccountShoppingRequestWrapper updateAccountShoppingRequestWrapper = new UpdateAccountShoppingRequestWrapper(); // UpdateAccountShoppingRequestWrapper | 
        try {
            UpdateAccountShoppingResponseWrapper result = apiInstance.updateAccountShopping(updateAccountShoppingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountShoppingService#updateAccountShopping");
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
 **updateAccountShoppingRequestWrapper** | [**UpdateAccountShoppingRequestWrapper**](UpdateAccountShoppingRequestWrapper.md)|  |

### Return type

[**UpdateAccountShoppingResponseWrapper**](UpdateAccountShoppingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

