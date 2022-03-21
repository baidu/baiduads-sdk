# MarketApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](MarketApiService.md#cancelOrder) | **POST** /json/sms/service/MarketApiService/cancelOrder | 
[**createOrder**](MarketApiService.md#createOrder) | **POST** /json/sms/service/MarketApiService/createOrder | 
[**getOrderInfo**](MarketApiService.md#getOrderInfo) | **POST** /json/sms/service/MarketApiService/getOrderInfo | 
[**getSiteInfo**](MarketApiService.md#getSiteInfo) | **POST** /json/sms/service/MarketApiService/getSiteInfo | 
[**previewSite**](MarketApiService.md#previewSite) | **POST** /json/sms/service/MarketApiService/previewSite | 



## cancelOrder

> CancelOrderResponseWrapper cancelOrder(cancelOrderRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.marketapi.api.MarketApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MarketApiService apiInstance = new MarketApiService(defaultClient);
        CancelOrderRequestWrapper cancelOrderRequestWrapper = new CancelOrderRequestWrapper(); // CancelOrderRequestWrapper | 
        try {
            CancelOrderResponseWrapper result = apiInstance.cancelOrder(cancelOrderRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApiService#cancelOrder");
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
 **cancelOrderRequestWrapper** | [**CancelOrderRequestWrapper**](CancelOrderRequestWrapper.md)|  |

### Return type

[**CancelOrderResponseWrapper**](CancelOrderResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## createOrder

> CreateOrderResponseWrapper createOrder(createOrderRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.marketapi.api.MarketApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MarketApiService apiInstance = new MarketApiService(defaultClient);
        CreateOrderRequestWrapper createOrderRequestWrapper = new CreateOrderRequestWrapper(); // CreateOrderRequestWrapper | 
        try {
            CreateOrderResponseWrapper result = apiInstance.createOrder(createOrderRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApiService#createOrder");
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
 **createOrderRequestWrapper** | [**CreateOrderRequestWrapper**](CreateOrderRequestWrapper.md)|  |

### Return type

[**CreateOrderResponseWrapper**](CreateOrderResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getOrderInfo

> GetOrderInfoResponseWrapper getOrderInfo(getOrderInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.marketapi.api.MarketApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MarketApiService apiInstance = new MarketApiService(defaultClient);
        GetOrderInfoRequestWrapper getOrderInfoRequestWrapper = new GetOrderInfoRequestWrapper(); // GetOrderInfoRequestWrapper | 
        try {
            GetOrderInfoResponseWrapper result = apiInstance.getOrderInfo(getOrderInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApiService#getOrderInfo");
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
 **getOrderInfoRequestWrapper** | [**GetOrderInfoRequestWrapper**](GetOrderInfoRequestWrapper.md)|  |

### Return type

[**GetOrderInfoResponseWrapper**](GetOrderInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getSiteInfo

> GetSiteInfoResponseWrapper getSiteInfo(getSiteInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.marketapi.api.MarketApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MarketApiService apiInstance = new MarketApiService(defaultClient);
        GetSiteInfoRequestWrapper getSiteInfoRequestWrapper = new GetSiteInfoRequestWrapper(); // GetSiteInfoRequestWrapper | 
        try {
            GetSiteInfoResponseWrapper result = apiInstance.getSiteInfo(getSiteInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApiService#getSiteInfo");
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
 **getSiteInfoRequestWrapper** | [**GetSiteInfoRequestWrapper**](GetSiteInfoRequestWrapper.md)|  |

### Return type

[**GetSiteInfoResponseWrapper**](GetSiteInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## previewSite

> PreviewSiteResponseWrapper previewSite(previewSiteRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.marketapi.api.MarketApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MarketApiService apiInstance = new MarketApiService(defaultClient);
        PreviewSiteRequestWrapper previewSiteRequestWrapper = new PreviewSiteRequestWrapper(); // PreviewSiteRequestWrapper | 
        try {
            PreviewSiteResponseWrapper result = apiInstance.previewSite(previewSiteRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApiService#previewSite");
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
 **previewSiteRequestWrapper** | [**PreviewSiteRequestWrapper**](PreviewSiteRequestWrapper.md)|  |

### Return type

[**PreviewSiteResponseWrapper**](PreviewSiteResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

