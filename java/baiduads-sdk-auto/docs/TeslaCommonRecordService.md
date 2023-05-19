# TeslaCommonRecordService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDictInfo**](TeslaCommonRecordService.md#getDictInfo) | **POST** /json/sms/service/TeslaCommonRecordService/getDictInfo | 



## getDictInfo

> GetDictInfoResponseWrapper getDictInfo(getDictInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.teslacommonrecord.api.TeslaCommonRecordService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        TeslaCommonRecordService apiInstance = new TeslaCommonRecordService(defaultClient);
        GetDictInfoRequestWrapper getDictInfoRequestWrapper = new GetDictInfoRequestWrapper(); // GetDictInfoRequestWrapper | 
        try {
            GetDictInfoResponseWrapper result = apiInstance.getDictInfo(getDictInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeslaCommonRecordService#getDictInfo");
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
 **getDictInfoRequestWrapper** | [**GetDictInfoRequestWrapper**](GetDictInfoRequestWrapper.md)|  |

### Return type

[**GetDictInfoResponseWrapper**](GetDictInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

