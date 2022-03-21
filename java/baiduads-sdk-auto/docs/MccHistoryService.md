# MccHistoryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountTransferHistory**](MccHistoryService.md#getAccountTransferHistory) | **POST** /json/sms/service/MccHistoryService/getAccountTransferHistory | 



## getAccountTransferHistory

> GetAccountTransferHistoryResponseWrapper getAccountTransferHistory(getAccountTransferHistoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.mcchistory.api.MccHistoryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MccHistoryService apiInstance = new MccHistoryService(defaultClient);
        GetAccountTransferHistoryRequestWrapper getAccountTransferHistoryRequestWrapper = new GetAccountTransferHistoryRequestWrapper(); // GetAccountTransferHistoryRequestWrapper | 
        try {
            GetAccountTransferHistoryResponseWrapper result = apiInstance.getAccountTransferHistory(getAccountTransferHistoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MccHistoryService#getAccountTransferHistory");
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
 **getAccountTransferHistoryRequestWrapper** | [**GetAccountTransferHistoryRequestWrapper**](GetAccountTransferHistoryRequestWrapper.md)|  |

### Return type

[**GetAccountTransferHistoryResponseWrapper**](GetAccountTransferHistoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

