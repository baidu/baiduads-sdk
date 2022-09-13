# PlatBusinessOrderRefundService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agreeOrderRefund**](PlatBusinessOrderRefundService.md#agreeOrderRefund) | **POST** /json/sms/service/PlatBusinessOrderRefundService/agreeOrderRefund | 
[**agreeOrderReturn**](PlatBusinessOrderRefundService.md#agreeOrderReturn) | **POST** /json/sms/service/PlatBusinessOrderRefundService/agreeOrderReturn | 
[**queryOrderRefundInfo**](PlatBusinessOrderRefundService.md#queryOrderRefundInfo) | **POST** /json/sms/service/PlatBusinessOrderRefundService/queryOrderRefundInfo | 
[**queryOrderRefundList**](PlatBusinessOrderRefundService.md#queryOrderRefundList) | **POST** /json/sms/service/PlatBusinessOrderRefundService/queryOrderRefundList | 
[**rejectOrderRefund**](PlatBusinessOrderRefundService.md#rejectOrderRefund) | **POST** /json/sms/service/PlatBusinessOrderRefundService/rejectOrderRefund | 



## agreeOrderRefund

> AgreeOrderRefundResponseWrapper agreeOrderRefund(agreeOrderRefundRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.api.PlatBusinessOrderRefundService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatBusinessOrderRefundService apiInstance = new PlatBusinessOrderRefundService(defaultClient);
        AgreeOrderRefundRequestWrapper agreeOrderRefundRequestWrapper = new AgreeOrderRefundRequestWrapper(); // AgreeOrderRefundRequestWrapper | 
        try {
            AgreeOrderRefundResponseWrapper result = apiInstance.agreeOrderRefund(agreeOrderRefundRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatBusinessOrderRefundService#agreeOrderRefund");
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
 **agreeOrderRefundRequestWrapper** | [**AgreeOrderRefundRequestWrapper**](AgreeOrderRefundRequestWrapper.md)|  |

### Return type

[**AgreeOrderRefundResponseWrapper**](AgreeOrderRefundResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## agreeOrderReturn

> AgreeOrderReturnResponseWrapper agreeOrderReturn(agreeOrderReturnRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.api.PlatBusinessOrderRefundService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatBusinessOrderRefundService apiInstance = new PlatBusinessOrderRefundService(defaultClient);
        AgreeOrderReturnRequestWrapper agreeOrderReturnRequestWrapper = new AgreeOrderReturnRequestWrapper(); // AgreeOrderReturnRequestWrapper | 
        try {
            AgreeOrderReturnResponseWrapper result = apiInstance.agreeOrderReturn(agreeOrderReturnRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatBusinessOrderRefundService#agreeOrderReturn");
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
 **agreeOrderReturnRequestWrapper** | [**AgreeOrderReturnRequestWrapper**](AgreeOrderReturnRequestWrapper.md)|  |

### Return type

[**AgreeOrderReturnResponseWrapper**](AgreeOrderReturnResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryOrderRefundInfo

> QueryOrderRefundInfoResponseWrapper queryOrderRefundInfo(queryOrderRefundInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.api.PlatBusinessOrderRefundService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatBusinessOrderRefundService apiInstance = new PlatBusinessOrderRefundService(defaultClient);
        QueryOrderRefundInfoRequestWrapper queryOrderRefundInfoRequestWrapper = new QueryOrderRefundInfoRequestWrapper(); // QueryOrderRefundInfoRequestWrapper | 
        try {
            QueryOrderRefundInfoResponseWrapper result = apiInstance.queryOrderRefundInfo(queryOrderRefundInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatBusinessOrderRefundService#queryOrderRefundInfo");
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
 **queryOrderRefundInfoRequestWrapper** | [**QueryOrderRefundInfoRequestWrapper**](QueryOrderRefundInfoRequestWrapper.md)|  |

### Return type

[**QueryOrderRefundInfoResponseWrapper**](QueryOrderRefundInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## queryOrderRefundList

> QueryOrderRefundListResponseWrapper queryOrderRefundList(queryOrderRefundListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.api.PlatBusinessOrderRefundService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatBusinessOrderRefundService apiInstance = new PlatBusinessOrderRefundService(defaultClient);
        QueryOrderRefundListRequestWrapper queryOrderRefundListRequestWrapper = new QueryOrderRefundListRequestWrapper(); // QueryOrderRefundListRequestWrapper | 
        try {
            QueryOrderRefundListResponseWrapper result = apiInstance.queryOrderRefundList(queryOrderRefundListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatBusinessOrderRefundService#queryOrderRefundList");
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
 **queryOrderRefundListRequestWrapper** | [**QueryOrderRefundListRequestWrapper**](QueryOrderRefundListRequestWrapper.md)|  |

### Return type

[**QueryOrderRefundListResponseWrapper**](QueryOrderRefundListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## rejectOrderRefund

> RejectOrderRefundResponseWrapper rejectOrderRefund(rejectOrderRefundRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platbusinessorderrefund.api.PlatBusinessOrderRefundService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatBusinessOrderRefundService apiInstance = new PlatBusinessOrderRefundService(defaultClient);
        RejectOrderRefundRequestWrapper rejectOrderRefundRequestWrapper = new RejectOrderRefundRequestWrapper(); // RejectOrderRefundRequestWrapper | 
        try {
            RejectOrderRefundResponseWrapper result = apiInstance.rejectOrderRefund(rejectOrderRefundRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatBusinessOrderRefundService#rejectOrderRefund");
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
 **rejectOrderRefundRequestWrapper** | [**RejectOrderRefundRequestWrapper**](RejectOrderRefundRequestWrapper.md)|  |

### Return type

[**RejectOrderRefundResponseWrapper**](RejectOrderRefundResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

