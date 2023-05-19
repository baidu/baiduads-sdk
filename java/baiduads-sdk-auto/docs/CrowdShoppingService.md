# CrowdShoppingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEshopTradeCrowds**](CrowdShoppingService.md#getEshopTradeCrowds) | **POST** /json/sms/service/CrowdShoppingService/getEshopTradeCrowds | 



## getEshopTradeCrowds

> GetEshopTradeCrowdsResponseWrapper getEshopTradeCrowds(getEshopTradeCrowdsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdshopping.api.CrowdShoppingService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdShoppingService apiInstance = new CrowdShoppingService(defaultClient);
        GetEshopTradeCrowdsRequestWrapper getEshopTradeCrowdsRequestWrapper = new GetEshopTradeCrowdsRequestWrapper(); // GetEshopTradeCrowdsRequestWrapper | 
        try {
            GetEshopTradeCrowdsResponseWrapper result = apiInstance.getEshopTradeCrowds(getEshopTradeCrowdsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdShoppingService#getEshopTradeCrowds");
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

