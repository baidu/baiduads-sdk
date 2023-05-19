# PlatOrderBusinessQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExpressNameList**](PlatOrderBusinessQueryService.md#getExpressNameList) | **POST** /json/sms/service/PlatOrderBusinessQueryService/getExpressNameList | 
[**getOrderDetail**](PlatOrderBusinessQueryService.md#getOrderDetail) | **POST** /json/sms/service/PlatOrderBusinessQueryService/getOrderDetail | 
[**getOrderExpressPackage**](PlatOrderBusinessQueryService.md#getOrderExpressPackage) | **POST** /json/sms/service/PlatOrderBusinessQueryService/getOrderExpressPackage | 
[**getPartConsignOrderList**](PlatOrderBusinessQueryService.md#getPartConsignOrderList) | **POST** /json/sms/service/PlatOrderBusinessQueryService/getPartConsignOrderList | 



## getExpressNameList

> GetExpressNameListResponseWrapper getExpressNameList(getExpressNameListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusinessquery.api.PlatOrderBusinessQueryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessQueryService apiInstance = new PlatOrderBusinessQueryService(defaultClient);
        GetExpressNameListRequestWrapper getExpressNameListRequestWrapper = new GetExpressNameListRequestWrapper(); // GetExpressNameListRequestWrapper | 
        try {
            GetExpressNameListResponseWrapper result = apiInstance.getExpressNameList(getExpressNameListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessQueryService#getExpressNameList");
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
 **getExpressNameListRequestWrapper** | [**GetExpressNameListRequestWrapper**](GetExpressNameListRequestWrapper.md)|  |

### Return type

[**GetExpressNameListResponseWrapper**](GetExpressNameListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getOrderDetail

> GetOrderDetailResponseWrapper getOrderDetail(getOrderDetailRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusinessquery.api.PlatOrderBusinessQueryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessQueryService apiInstance = new PlatOrderBusinessQueryService(defaultClient);
        GetOrderDetailRequestWrapper getOrderDetailRequestWrapper = new GetOrderDetailRequestWrapper(); // GetOrderDetailRequestWrapper | 
        try {
            GetOrderDetailResponseWrapper result = apiInstance.getOrderDetail(getOrderDetailRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessQueryService#getOrderDetail");
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
 **getOrderDetailRequestWrapper** | [**GetOrderDetailRequestWrapper**](GetOrderDetailRequestWrapper.md)|  |

### Return type

[**GetOrderDetailResponseWrapper**](GetOrderDetailResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getOrderExpressPackage

> GetOrderExpressPackageResponseWrapper getOrderExpressPackage(getOrderExpressPackageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusinessquery.api.PlatOrderBusinessQueryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessQueryService apiInstance = new PlatOrderBusinessQueryService(defaultClient);
        GetOrderExpressPackageRequestWrapper getOrderExpressPackageRequestWrapper = new GetOrderExpressPackageRequestWrapper(); // GetOrderExpressPackageRequestWrapper | 
        try {
            GetOrderExpressPackageResponseWrapper result = apiInstance.getOrderExpressPackage(getOrderExpressPackageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessQueryService#getOrderExpressPackage");
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
 **getOrderExpressPackageRequestWrapper** | [**GetOrderExpressPackageRequestWrapper**](GetOrderExpressPackageRequestWrapper.md)|  |

### Return type

[**GetOrderExpressPackageResponseWrapper**](GetOrderExpressPackageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getPartConsignOrderList

> GetPartConsignOrderListResponseWrapper getPartConsignOrderList(getPartConsignOrderListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusinessquery.api.PlatOrderBusinessQueryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessQueryService apiInstance = new PlatOrderBusinessQueryService(defaultClient);
        GetPartConsignOrderListRequestWrapper getPartConsignOrderListRequestWrapper = new GetPartConsignOrderListRequestWrapper(); // GetPartConsignOrderListRequestWrapper | 
        try {
            GetPartConsignOrderListResponseWrapper result = apiInstance.getPartConsignOrderList(getPartConsignOrderListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessQueryService#getPartConsignOrderList");
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
 **getPartConsignOrderListRequestWrapper** | [**GetPartConsignOrderListRequestWrapper**](GetPartConsignOrderListRequestWrapper.md)|  |

### Return type

[**GetPartConsignOrderListResponseWrapper**](GetPartConsignOrderListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

