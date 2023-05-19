# PlatOrderBusinessService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmOrCancelOrder**](PlatOrderBusinessService.md#confirmOrCancelOrder) | **POST** /json/sms/service/PlatOrderBusinessService/confirmOrCancelOrder | 
[**deliverOrder**](PlatOrderBusinessService.md#deliverOrder) | **POST** /json/sms/service/PlatOrderBusinessService/deliverOrder | 
[**rejectOrder**](PlatOrderBusinessService.md#rejectOrder) | **POST** /json/sms/service/PlatOrderBusinessService/rejectOrder | 
[**takeOrder**](PlatOrderBusinessService.md#takeOrder) | **POST** /json/sms/service/PlatOrderBusinessService/takeOrder | 
[**updateRemark**](PlatOrderBusinessService.md#updateRemark) | **POST** /json/sms/service/PlatOrderBusinessService/updateRemark | 



## confirmOrCancelOrder

> ConfirmOrCancelOrderResponseWrapper confirmOrCancelOrder(confirmOrCancelOrderRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusiness.api.PlatOrderBusinessService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessService apiInstance = new PlatOrderBusinessService(defaultClient);
        ConfirmOrCancelOrderRequestWrapper confirmOrCancelOrderRequestWrapper = new ConfirmOrCancelOrderRequestWrapper(); // ConfirmOrCancelOrderRequestWrapper | 
        try {
            ConfirmOrCancelOrderResponseWrapper result = apiInstance.confirmOrCancelOrder(confirmOrCancelOrderRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessService#confirmOrCancelOrder");
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
 **confirmOrCancelOrderRequestWrapper** | [**ConfirmOrCancelOrderRequestWrapper**](ConfirmOrCancelOrderRequestWrapper.md)|  |

### Return type

[**ConfirmOrCancelOrderResponseWrapper**](ConfirmOrCancelOrderResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deliverOrder

> DeliverOrderResponseWrapper deliverOrder(deliverOrderRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusiness.api.PlatOrderBusinessService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessService apiInstance = new PlatOrderBusinessService(defaultClient);
        DeliverOrderRequestWrapper deliverOrderRequestWrapper = new DeliverOrderRequestWrapper(); // DeliverOrderRequestWrapper | 
        try {
            DeliverOrderResponseWrapper result = apiInstance.deliverOrder(deliverOrderRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessService#deliverOrder");
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
 **deliverOrderRequestWrapper** | [**DeliverOrderRequestWrapper**](DeliverOrderRequestWrapper.md)|  |

### Return type

[**DeliverOrderResponseWrapper**](DeliverOrderResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## rejectOrder

> RejectOrderResponseWrapper rejectOrder(rejectOrderRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusiness.api.PlatOrderBusinessService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessService apiInstance = new PlatOrderBusinessService(defaultClient);
        RejectOrderRequestWrapper rejectOrderRequestWrapper = new RejectOrderRequestWrapper(); // RejectOrderRequestWrapper | 
        try {
            RejectOrderResponseWrapper result = apiInstance.rejectOrder(rejectOrderRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessService#rejectOrder");
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
 **rejectOrderRequestWrapper** | [**RejectOrderRequestWrapper**](RejectOrderRequestWrapper.md)|  |

### Return type

[**RejectOrderResponseWrapper**](RejectOrderResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## takeOrder

> TakeOrderResponseWrapper takeOrder(takeOrderRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusiness.api.PlatOrderBusinessService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessService apiInstance = new PlatOrderBusinessService(defaultClient);
        TakeOrderRequestWrapper takeOrderRequestWrapper = new TakeOrderRequestWrapper(); // TakeOrderRequestWrapper | 
        try {
            TakeOrderResponseWrapper result = apiInstance.takeOrder(takeOrderRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessService#takeOrder");
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
 **takeOrderRequestWrapper** | [**TakeOrderRequestWrapper**](TakeOrderRequestWrapper.md)|  |

### Return type

[**TakeOrderResponseWrapper**](TakeOrderResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateRemark

> UpdateRemarkResponseWrapper updateRemark(updateRemarkRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platorderbusiness.api.PlatOrderBusinessService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatOrderBusinessService apiInstance = new PlatOrderBusinessService(defaultClient);
        UpdateRemarkRequestWrapper updateRemarkRequestWrapper = new UpdateRemarkRequestWrapper(); // UpdateRemarkRequestWrapper | 
        try {
            UpdateRemarkResponseWrapper result = apiInstance.updateRemark(updateRemarkRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatOrderBusinessService#updateRemark");
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
 **updateRemarkRequestWrapper** | [**UpdateRemarkRequestWrapper**](UpdateRemarkRequestWrapper.md)|  |

### Return type

[**UpdateRemarkResponseWrapper**](UpdateRemarkResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

