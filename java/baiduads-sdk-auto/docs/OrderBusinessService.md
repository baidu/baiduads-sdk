# OrderBusinessService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**grantCallBack**](OrderBusinessService.md#grantCallBack) | **POST** /json/sms/service/OrderBusinessService/grantCallBack | 



## grantCallBack

> GrantCallBackResponseWrapper grantCallBack(grantCallBackRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.orderbusiness.api.OrderBusinessService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OrderBusinessService apiInstance = new OrderBusinessService(defaultClient);
        GrantCallBackRequestWrapper grantCallBackRequestWrapper = new GrantCallBackRequestWrapper(); // GrantCallBackRequestWrapper | 
        try {
            GrantCallBackResponseWrapper result = apiInstance.grantCallBack(grantCallBackRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderBusinessService#grantCallBack");
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
 **grantCallBackRequestWrapper** | [**GrantCallBackRequestWrapper**](GrantCallBackRequestWrapper.md)|  |

### Return type

[**GrantCallBackResponseWrapper**](GrantCallBackResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

