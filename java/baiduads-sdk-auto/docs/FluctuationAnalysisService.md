# FluctuationAnalysisService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryFluctuationReasons**](FluctuationAnalysisService.md#queryFluctuationReasons) | **POST** /json/sms/service/FluctuationAnalysisService/queryFluctuationReasons | 



## queryFluctuationReasons

> QueryFluctuationReasonsResponseWrapper queryFluctuationReasons(queryFluctuationReasonsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.fluctuationanalysis.api.FluctuationAnalysisService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        FluctuationAnalysisService apiInstance = new FluctuationAnalysisService(defaultClient);
        QueryFluctuationReasonsRequestWrapper queryFluctuationReasonsRequestWrapper = new QueryFluctuationReasonsRequestWrapper(); // QueryFluctuationReasonsRequestWrapper | 
        try {
            QueryFluctuationReasonsResponseWrapper result = apiInstance.queryFluctuationReasons(queryFluctuationReasonsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FluctuationAnalysisService#queryFluctuationReasons");
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
 **queryFluctuationReasonsRequestWrapper** | [**QueryFluctuationReasonsRequestWrapper**](QueryFluctuationReasonsRequestWrapper.md)|  |

### Return type

[**QueryFluctuationReasonsResponseWrapper**](QueryFluctuationReasonsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

