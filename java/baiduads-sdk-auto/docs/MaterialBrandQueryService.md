# MaterialBrandQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBrandList**](MaterialBrandQueryService.md#getBrandList) | **POST** /json/sms/service/MaterialBrandQueryService/getBrandList | 



## getBrandList

> GetBrandListResponseWrapper getBrandList(getBrandListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialbrandquery.api.MaterialBrandQueryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialBrandQueryService apiInstance = new MaterialBrandQueryService(defaultClient);
        GetBrandListRequestWrapper getBrandListRequestWrapper = new GetBrandListRequestWrapper(); // GetBrandListRequestWrapper | 
        try {
            GetBrandListResponseWrapper result = apiInstance.getBrandList(getBrandListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialBrandQueryService#getBrandList");
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
 **getBrandListRequestWrapper** | [**GetBrandListRequestWrapper**](GetBrandListRequestWrapper.md)|  |

### Return type

[**GetBrandListResponseWrapper**](GetBrandListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

