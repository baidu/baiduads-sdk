# AdviceLandingPageApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryLandingPageCorrelation**](AdviceLandingPageApiService.md#queryLandingPageCorrelation) | **POST** /json/sms/service/AdviceLandingPageApiService/queryLandingPageCorrelation | 
[**queryLandingPageQuality**](AdviceLandingPageApiService.md#queryLandingPageQuality) | **POST** /json/sms/service/AdviceLandingPageApiService/queryLandingPageQuality | 



## queryLandingPageCorrelation

> QueryLandingPageCorrelationResponseWrapper queryLandingPageCorrelation(queryLandingPageCorrelationRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advicelandingpageapi.api.AdviceLandingPageApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceLandingPageApiService apiInstance = new AdviceLandingPageApiService(defaultClient);
        QueryLandingPageCorrelationRequestWrapper queryLandingPageCorrelationRequestWrapper = new QueryLandingPageCorrelationRequestWrapper(); // QueryLandingPageCorrelationRequestWrapper | 
        try {
            QueryLandingPageCorrelationResponseWrapper result = apiInstance.queryLandingPageCorrelation(queryLandingPageCorrelationRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceLandingPageApiService#queryLandingPageCorrelation");
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
 **queryLandingPageCorrelationRequestWrapper** | [**QueryLandingPageCorrelationRequestWrapper**](QueryLandingPageCorrelationRequestWrapper.md)|  |

### Return type

[**QueryLandingPageCorrelationResponseWrapper**](QueryLandingPageCorrelationResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryLandingPageQuality

> QueryLandingPageQualityResponseWrapper queryLandingPageQuality(queryLandingPageQualityRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.advicelandingpageapi.api.AdviceLandingPageApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AdviceLandingPageApiService apiInstance = new AdviceLandingPageApiService(defaultClient);
        QueryLandingPageQualityRequestWrapper queryLandingPageQualityRequestWrapper = new QueryLandingPageQualityRequestWrapper(); // QueryLandingPageQualityRequestWrapper | 
        try {
            QueryLandingPageQualityResponseWrapper result = apiInstance.queryLandingPageQuality(queryLandingPageQualityRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdviceLandingPageApiService#queryLandingPageQuality");
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
 **queryLandingPageQualityRequestWrapper** | [**QueryLandingPageQualityRequestWrapper**](QueryLandingPageQualityRequestWrapper.md)|  |

### Return type

[**QueryLandingPageQualityResponseWrapper**](QueryLandingPageQualityResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

