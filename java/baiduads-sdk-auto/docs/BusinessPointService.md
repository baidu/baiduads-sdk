# BusinessPointService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllBusinessPoint**](BusinessPointService.md#getAllBusinessPoint) | **POST** /json/sms/service/BusinessPointService/getAllBusinessPoint | 



## getAllBusinessPoint

> GetAllBusinessPointResponseWrapper getAllBusinessPoint(getAllBusinessPointRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.businesspoint.api.BusinessPointService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BusinessPointService apiInstance = new BusinessPointService(defaultClient);
        GetAllBusinessPointRequestWrapper getAllBusinessPointRequestWrapper = new GetAllBusinessPointRequestWrapper(); // GetAllBusinessPointRequestWrapper | 
        try {
            GetAllBusinessPointResponseWrapper result = apiInstance.getAllBusinessPoint(getAllBusinessPointRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessPointService#getAllBusinessPoint");
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
 **getAllBusinessPointRequestWrapper** | [**GetAllBusinessPointRequestWrapper**](GetAllBusinessPointRequestWrapper.md)|  |

### Return type

[**GetAllBusinessPointResponseWrapper**](GetAllBusinessPointResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

