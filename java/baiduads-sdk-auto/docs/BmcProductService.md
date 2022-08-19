# BmcProductService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fastUpdateProducts**](BmcProductService.md#fastUpdateProducts) | **POST** /json/sms/service/BmcProductService/fastUpdateProducts | 



## fastUpdateProducts

> FastUpdateProductsResponseWrapper fastUpdateProducts(fastUpdateProductsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bmcproduct.api.BmcProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BmcProductService apiInstance = new BmcProductService(defaultClient);
        FastUpdateProductsRequestWrapper fastUpdateProductsRequestWrapper = new FastUpdateProductsRequestWrapper(); // FastUpdateProductsRequestWrapper | 
        try {
            FastUpdateProductsResponseWrapper result = apiInstance.fastUpdateProducts(fastUpdateProductsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BmcProductService#fastUpdateProducts");
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
 **fastUpdateProductsRequestWrapper** | [**FastUpdateProductsRequestWrapper**](FastUpdateProductsRequestWrapper.md)|  |

### Return type

[**FastUpdateProductsResponseWrapper**](FastUpdateProductsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

