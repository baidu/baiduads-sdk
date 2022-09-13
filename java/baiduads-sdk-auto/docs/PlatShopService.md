# PlatShopService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShopCategoryList**](PlatShopService.md#getShopCategoryList) | **POST** /json/sms/service/PlatShopService/getShopCategoryList | 



## getShopCategoryList

> GetShopCategoryListResponseWrapper getShopCategoryList(getShopCategoryListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platshop.api.PlatShopService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatShopService apiInstance = new PlatShopService(defaultClient);
        GetShopCategoryListRequestWrapper getShopCategoryListRequestWrapper = new GetShopCategoryListRequestWrapper(); // GetShopCategoryListRequestWrapper | 
        try {
            GetShopCategoryListResponseWrapper result = apiInstance.getShopCategoryList(getShopCategoryListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatShopService#getShopCategoryList");
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
 **getShopCategoryListRequestWrapper** | [**GetShopCategoryListRequestWrapper**](GetShopCategoryListRequestWrapper.md)|  |

### Return type

[**GetShopCategoryListResponseWrapper**](GetShopCategoryListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

