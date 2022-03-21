# PvSearchFunction

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPvSearch**](PvSearchFunction.md#getPvSearch) | **POST** /json/sms/service/PvSearchFunction/getPvSearch | 



## getPvSearch

> GetPvSearchResponseWrapper getPvSearch(getPvSearchRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.pvsearchfunction.api.PvSearchFunction;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PvSearchFunction apiInstance = new PvSearchFunction(defaultClient);
        GetPvSearchRequestWrapper getPvSearchRequestWrapper = new GetPvSearchRequestWrapper(); // GetPvSearchRequestWrapper | 
        try {
            GetPvSearchResponseWrapper result = apiInstance.getPvSearch(getPvSearchRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PvSearchFunction#getPvSearch");
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
 **getPvSearchRequestWrapper** | [**GetPvSearchRequestWrapper**](GetPvSearchRequestWrapper.md)|  |

### Return type

[**GetPvSearchResponseWrapper**](GetPvSearchResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

