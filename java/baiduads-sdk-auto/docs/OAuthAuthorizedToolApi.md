# OAuthAuthorizedToolApi

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthCode**](OAuthAuthorizedToolApi.md#getAuthCode) | **POST** /json/sms/service/OAuthAuthorizedToolAPI/getAuthCode | 



## getAuthCode

> GetAuthCodeResponseWrapper getAuthCode(getAuthCodeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.oauthauthorizedtoolapi.api.OAuthAuthorizedToolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OAuthAuthorizedToolApi apiInstance = new OAuthAuthorizedToolApi(defaultClient);
        GetAuthCodeRequestWrapper getAuthCodeRequestWrapper = new GetAuthCodeRequestWrapper(); // GetAuthCodeRequestWrapper | 
        try {
            GetAuthCodeResponseWrapper result = apiInstance.getAuthCode(getAuthCodeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuthAuthorizedToolApi#getAuthCode");
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
 **getAuthCodeRequestWrapper** | [**GetAuthCodeRequestWrapper**](GetAuthCodeRequestWrapper.md)|  |

### Return type

[**GetAuthCodeResponseWrapper**](GetAuthCodeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

