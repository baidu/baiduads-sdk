# SubShopOpenApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubShop**](SubShopOpenApiService.md#createSubShop) | **POST** /json/sms/service/SubShopOpenApiService/createSubShop | 
[**updateSubShop**](SubShopOpenApiService.md#updateSubShop) | **POST** /json/sms/service/SubShopOpenApiService/updateSubShop | 



## createSubShop

> CreateSubShopResponseWrapper createSubShop(createSubShopRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.subshopopenapi.api.SubShopOpenApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SubShopOpenApiService apiInstance = new SubShopOpenApiService(defaultClient);
        CreateSubShopRequestWrapper createSubShopRequestWrapper = new CreateSubShopRequestWrapper(); // CreateSubShopRequestWrapper | 
        try {
            CreateSubShopResponseWrapper result = apiInstance.createSubShop(createSubShopRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubShopOpenApiService#createSubShop");
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
 **createSubShopRequestWrapper** | [**CreateSubShopRequestWrapper**](CreateSubShopRequestWrapper.md)|  |

### Return type

[**CreateSubShopResponseWrapper**](CreateSubShopResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateSubShop

> UpdateSubShopResponseWrapper updateSubShop(updateSubShopRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.subshopopenapi.api.SubShopOpenApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SubShopOpenApiService apiInstance = new SubShopOpenApiService(defaultClient);
        UpdateSubShopRequestWrapper updateSubShopRequestWrapper = new UpdateSubShopRequestWrapper(); // UpdateSubShopRequestWrapper | 
        try {
            UpdateSubShopResponseWrapper result = apiInstance.updateSubShop(updateSubShopRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubShopOpenApiService#updateSubShop");
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
 **updateSubShopRequestWrapper** | [**UpdateSubShopRequestWrapper**](UpdateSubShopRequestWrapper.md)|  |

### Return type

[**UpdateSubShopResponseWrapper**](UpdateSubShopResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

