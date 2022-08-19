# FmLeadsUpdateService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMark**](FmLeadsUpdateService.md#addMark) | **POST** /json/sms/service/FmLeadsUpdateService/addMark | 



## addMark

> AddMarkResponseWrapper addMark(addMarkRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fmleadsupdate.api.FmLeadsUpdateService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FmLeadsUpdateService apiInstance = new FmLeadsUpdateService(defaultClient);
        AddMarkRequestWrapper addMarkRequestWrapper = new AddMarkRequestWrapper(); // AddMarkRequestWrapper | 
        try {
            AddMarkResponseWrapper result = apiInstance.addMark(addMarkRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FmLeadsUpdateService#addMark");
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
 **addMarkRequestWrapper** | [**AddMarkRequestWrapper**](AddMarkRequestWrapper.md)|  |

### Return type

[**AddMarkResponseWrapper**](AddMarkResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

