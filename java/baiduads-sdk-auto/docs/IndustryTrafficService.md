# IndustryTrafficService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSearchTrendByDev2**](IndustryTrafficService.md#getSearchTrendByDev2) | **POST** /json/sms/service/IndustryTrafficService/getSearchTrendByDev2 | 
[**getSearchWordList**](IndustryTrafficService.md#getSearchWordList) | **POST** /json/sms/service/IndustryTrafficService/getSearchWordList | 
[**getTradeNodeListV2**](IndustryTrafficService.md#getTradeNodeListV2) | **POST** /json/sms/service/IndustryTrafficService/getTradeNodeListV2 | 



## getSearchTrendByDev2

> GetSearchTrendByDev2ResponseWrapper getSearchTrendByDev2(getSearchTrendByDev2RequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.industrytraffic.api.IndustryTrafficService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        IndustryTrafficService apiInstance = new IndustryTrafficService(defaultClient);
        GetSearchTrendByDev2RequestWrapper getSearchTrendByDev2RequestWrapper = new GetSearchTrendByDev2RequestWrapper(); // GetSearchTrendByDev2RequestWrapper | 
        try {
            GetSearchTrendByDev2ResponseWrapper result = apiInstance.getSearchTrendByDev2(getSearchTrendByDev2RequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndustryTrafficService#getSearchTrendByDev2");
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
 **getSearchTrendByDev2RequestWrapper** | [**GetSearchTrendByDev2RequestWrapper**](GetSearchTrendByDev2RequestWrapper.md)|  |

### Return type

[**GetSearchTrendByDev2ResponseWrapper**](GetSearchTrendByDev2ResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getSearchWordList

> GetSearchWordListResponseWrapper getSearchWordList(getSearchWordListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.industrytraffic.api.IndustryTrafficService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        IndustryTrafficService apiInstance = new IndustryTrafficService(defaultClient);
        GetSearchWordListRequestWrapper getSearchWordListRequestWrapper = new GetSearchWordListRequestWrapper(); // GetSearchWordListRequestWrapper | 
        try {
            GetSearchWordListResponseWrapper result = apiInstance.getSearchWordList(getSearchWordListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndustryTrafficService#getSearchWordList");
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
 **getSearchWordListRequestWrapper** | [**GetSearchWordListRequestWrapper**](GetSearchWordListRequestWrapper.md)|  |

### Return type

[**GetSearchWordListResponseWrapper**](GetSearchWordListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getTradeNodeListV2

> GetTradeNodeListV2ResponseWrapper getTradeNodeListV2(getTradeNodeListV2RequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.industrytraffic.api.IndustryTrafficService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        IndustryTrafficService apiInstance = new IndustryTrafficService(defaultClient);
        GetTradeNodeListV2RequestWrapper getTradeNodeListV2RequestWrapper = new GetTradeNodeListV2RequestWrapper(); // GetTradeNodeListV2RequestWrapper | 
        try {
            GetTradeNodeListV2ResponseWrapper result = apiInstance.getTradeNodeListV2(getTradeNodeListV2RequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndustryTrafficService#getTradeNodeListV2");
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
 **getTradeNodeListV2RequestWrapper** | [**GetTradeNodeListV2RequestWrapper**](GetTradeNodeListV2RequestWrapper.md)|  |

### Return type

[**GetTradeNodeListV2ResponseWrapper**](GetTradeNodeListV2ResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

