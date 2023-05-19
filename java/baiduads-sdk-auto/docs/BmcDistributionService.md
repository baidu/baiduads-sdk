# BmcDistributionService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCatalog**](BmcDistributionService.md#getCatalog) | **POST** /json/sms/service/BmcDistributionService/getCatalog | 



## getCatalog

> GetCatalogResponseWrapper getCatalog(getCatalogRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.bmcdistribution.api.BmcDistributionService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        BmcDistributionService apiInstance = new BmcDistributionService(defaultClient);
        GetCatalogRequestWrapper getCatalogRequestWrapper = new GetCatalogRequestWrapper(); // GetCatalogRequestWrapper | 
        try {
            GetCatalogResponseWrapper result = apiInstance.getCatalog(getCatalogRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BmcDistributionService#getCatalog");
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
 **getCatalogRequestWrapper** | [**GetCatalogRequestWrapper**](GetCatalogRequestWrapper.md)|  |

### Return type

[**GetCatalogResponseWrapper**](GetCatalogResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

