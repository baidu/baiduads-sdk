# PriceStrategyService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPriceStrategy**](PriceStrategyService.md#addPriceStrategy) | **POST** /json/sms/service/PriceStrategyService/addPriceStrategy | 
[**deletePriceStrategy**](PriceStrategyService.md#deletePriceStrategy) | **POST** /json/sms/service/PriceStrategyService/deletePriceStrategy | 
[**getPriceStrategy**](PriceStrategyService.md#getPriceStrategy) | **POST** /json/sms/service/PriceStrategyService/getPriceStrategy | 
[**updatePriceStrategy**](PriceStrategyService.md#updatePriceStrategy) | **POST** /json/sms/service/PriceStrategyService/updatePriceStrategy | 



## addPriceStrategy

> AddPriceStrategyResponseWrapper addPriceStrategy(addPriceStrategyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.pricestrategy.api.PriceStrategyService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PriceStrategyService apiInstance = new PriceStrategyService(defaultClient);
        AddPriceStrategyRequestWrapper addPriceStrategyRequestWrapper = new AddPriceStrategyRequestWrapper(); // AddPriceStrategyRequestWrapper | 
        try {
            AddPriceStrategyResponseWrapper result = apiInstance.addPriceStrategy(addPriceStrategyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PriceStrategyService#addPriceStrategy");
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
 **addPriceStrategyRequestWrapper** | [**AddPriceStrategyRequestWrapper**](AddPriceStrategyRequestWrapper.md)|  |

### Return type

[**AddPriceStrategyResponseWrapper**](AddPriceStrategyResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deletePriceStrategy

> DeletePriceStrategyResponseWrapper deletePriceStrategy(deletePriceStrategyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.pricestrategy.api.PriceStrategyService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PriceStrategyService apiInstance = new PriceStrategyService(defaultClient);
        DeletePriceStrategyRequestWrapper deletePriceStrategyRequestWrapper = new DeletePriceStrategyRequestWrapper(); // DeletePriceStrategyRequestWrapper | 
        try {
            DeletePriceStrategyResponseWrapper result = apiInstance.deletePriceStrategy(deletePriceStrategyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PriceStrategyService#deletePriceStrategy");
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
 **deletePriceStrategyRequestWrapper** | [**DeletePriceStrategyRequestWrapper**](DeletePriceStrategyRequestWrapper.md)|  |

### Return type

[**DeletePriceStrategyResponseWrapper**](DeletePriceStrategyResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getPriceStrategy

> GetPriceStrategyResponseWrapper getPriceStrategy(getPriceStrategyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.pricestrategy.api.PriceStrategyService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PriceStrategyService apiInstance = new PriceStrategyService(defaultClient);
        GetPriceStrategyRequestWrapper getPriceStrategyRequestWrapper = new GetPriceStrategyRequestWrapper(); // GetPriceStrategyRequestWrapper | 
        try {
            GetPriceStrategyResponseWrapper result = apiInstance.getPriceStrategy(getPriceStrategyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PriceStrategyService#getPriceStrategy");
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
 **getPriceStrategyRequestWrapper** | [**GetPriceStrategyRequestWrapper**](GetPriceStrategyRequestWrapper.md)|  |

### Return type

[**GetPriceStrategyResponseWrapper**](GetPriceStrategyResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updatePriceStrategy

> UpdatePriceStrategyResponseWrapper updatePriceStrategy(updatePriceStrategyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.pricestrategy.api.PriceStrategyService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PriceStrategyService apiInstance = new PriceStrategyService(defaultClient);
        UpdatePriceStrategyRequestWrapper updatePriceStrategyRequestWrapper = new UpdatePriceStrategyRequestWrapper(); // UpdatePriceStrategyRequestWrapper | 
        try {
            UpdatePriceStrategyResponseWrapper result = apiInstance.updatePriceStrategy(updatePriceStrategyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PriceStrategyService#updatePriceStrategy");
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
 **updatePriceStrategyRequestWrapper** | [**UpdatePriceStrategyRequestWrapper**](UpdatePriceStrategyRequestWrapper.md)|  |

### Return type

[**UpdatePriceStrategyResponseWrapper**](UpdatePriceStrategyResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

