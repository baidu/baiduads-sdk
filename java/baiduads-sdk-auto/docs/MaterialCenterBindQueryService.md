# MaterialCenterBindQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMaterialBind**](MaterialCenterBindQueryService.md#getMaterialBind) | **POST** /json/sms/service/MaterialCenterBindQueryService/getMaterialBind | 



## getMaterialBind

> GetMaterialBindResponseWrapper getMaterialBind(getMaterialBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialcenterbindquery.api.MaterialCenterBindQueryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialCenterBindQueryService apiInstance = new MaterialCenterBindQueryService(defaultClient);
        GetMaterialBindRequestWrapper getMaterialBindRequestWrapper = new GetMaterialBindRequestWrapper(); // GetMaterialBindRequestWrapper | 
        try {
            GetMaterialBindResponseWrapper result = apiInstance.getMaterialBind(getMaterialBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialCenterBindQueryService#getMaterialBind");
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
 **getMaterialBindRequestWrapper** | [**GetMaterialBindRequestWrapper**](GetMaterialBindRequestWrapper.md)|  |

### Return type

[**GetMaterialBindResponseWrapper**](GetMaterialBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

