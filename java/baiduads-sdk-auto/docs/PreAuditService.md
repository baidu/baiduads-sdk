# PreAuditService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**materialPreAudit**](PreAuditService.md#materialPreAudit) | **POST** /json/sms/service/PreAuditService/materialPreAudit | 



## materialPreAudit

> MaterialPreAuditResponseWrapper materialPreAudit(materialPreAuditRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.preaudit.api.PreAuditService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PreAuditService apiInstance = new PreAuditService(defaultClient);
        MaterialPreAuditRequestWrapper materialPreAuditRequestWrapper = new MaterialPreAuditRequestWrapper(); // MaterialPreAuditRequestWrapper | 
        try {
            MaterialPreAuditResponseWrapper result = apiInstance.materialPreAudit(materialPreAuditRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreAuditService#materialPreAudit");
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
 **materialPreAuditRequestWrapper** | [**MaterialPreAuditRequestWrapper**](MaterialPreAuditRequestWrapper.md)|  |

### Return type

[**MaterialPreAuditResponseWrapper**](MaterialPreAuditResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

