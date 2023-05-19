# PlatProductService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProduct**](PlatProductService.md#deleteProduct) | **POST** /json/sms/service/PlatProductService/deleteProduct | 
[**getProductDetail**](PlatProductService.md#getProductDetail) | **POST** /json/sms/service/PlatProductService/getProductDetail | 
[**getProductList**](PlatProductService.md#getProductList) | **POST** /json/sms/service/PlatProductService/getProductList | 
[**getProductSkus**](PlatProductService.md#getProductSkus) | **POST** /json/sms/service/PlatProductService/getProductSkus | 
[**modOnlineStatus**](PlatProductService.md#modOnlineStatus) | **POST** /json/sms/service/PlatProductService/modOnlineStatus | 
[**saveOrUpdateProduct**](PlatProductService.md#saveOrUpdateProduct) | **POST** /json/sms/service/PlatProductService/saveOrUpdateProduct | 
[**updateStock**](PlatProductService.md#updateStock) | **POST** /json/sms/service/PlatProductService/updateStock | 



## deleteProduct

> DeleteProductResponseWrapper deleteProduct(deleteProductRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platproduct.api.PlatProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatProductService apiInstance = new PlatProductService(defaultClient);
        DeleteProductRequestWrapper deleteProductRequestWrapper = new DeleteProductRequestWrapper(); // DeleteProductRequestWrapper | 
        try {
            DeleteProductResponseWrapper result = apiInstance.deleteProduct(deleteProductRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatProductService#deleteProduct");
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
 **deleteProductRequestWrapper** | [**DeleteProductRequestWrapper**](DeleteProductRequestWrapper.md)|  |

### Return type

[**DeleteProductResponseWrapper**](DeleteProductResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getProductDetail

> GetProductDetailResponseWrapper getProductDetail(getProductDetailRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platproduct.api.PlatProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatProductService apiInstance = new PlatProductService(defaultClient);
        GetProductDetailRequestWrapper getProductDetailRequestWrapper = new GetProductDetailRequestWrapper(); // GetProductDetailRequestWrapper | 
        try {
            GetProductDetailResponseWrapper result = apiInstance.getProductDetail(getProductDetailRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatProductService#getProductDetail");
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
 **getProductDetailRequestWrapper** | [**GetProductDetailRequestWrapper**](GetProductDetailRequestWrapper.md)|  |

### Return type

[**GetProductDetailResponseWrapper**](GetProductDetailResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getProductList

> GetProductListResponseWrapper getProductList(getProductListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platproduct.api.PlatProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatProductService apiInstance = new PlatProductService(defaultClient);
        GetProductListRequestWrapper getProductListRequestWrapper = new GetProductListRequestWrapper(); // GetProductListRequestWrapper | 
        try {
            GetProductListResponseWrapper result = apiInstance.getProductList(getProductListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatProductService#getProductList");
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
 **getProductListRequestWrapper** | [**GetProductListRequestWrapper**](GetProductListRequestWrapper.md)|  |

### Return type

[**GetProductListResponseWrapper**](GetProductListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getProductSkus

> GetProductSkusResponseWrapper getProductSkus(getProductSkusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platproduct.api.PlatProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatProductService apiInstance = new PlatProductService(defaultClient);
        GetProductSkusRequestWrapper getProductSkusRequestWrapper = new GetProductSkusRequestWrapper(); // GetProductSkusRequestWrapper | 
        try {
            GetProductSkusResponseWrapper result = apiInstance.getProductSkus(getProductSkusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatProductService#getProductSkus");
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
 **getProductSkusRequestWrapper** | [**GetProductSkusRequestWrapper**](GetProductSkusRequestWrapper.md)|  |

### Return type

[**GetProductSkusResponseWrapper**](GetProductSkusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## modOnlineStatus

> ModOnlineStatusResponseWrapper modOnlineStatus(modOnlineStatusRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platproduct.api.PlatProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatProductService apiInstance = new PlatProductService(defaultClient);
        ModOnlineStatusRequestWrapper modOnlineStatusRequestWrapper = new ModOnlineStatusRequestWrapper(); // ModOnlineStatusRequestWrapper | 
        try {
            ModOnlineStatusResponseWrapper result = apiInstance.modOnlineStatus(modOnlineStatusRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatProductService#modOnlineStatus");
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
 **modOnlineStatusRequestWrapper** | [**ModOnlineStatusRequestWrapper**](ModOnlineStatusRequestWrapper.md)|  |

### Return type

[**ModOnlineStatusResponseWrapper**](ModOnlineStatusResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## saveOrUpdateProduct

> SaveOrUpdateProductResponseWrapper saveOrUpdateProduct(saveOrUpdateProductRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platproduct.api.PlatProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatProductService apiInstance = new PlatProductService(defaultClient);
        SaveOrUpdateProductRequestWrapper saveOrUpdateProductRequestWrapper = new SaveOrUpdateProductRequestWrapper(); // SaveOrUpdateProductRequestWrapper | 
        try {
            SaveOrUpdateProductResponseWrapper result = apiInstance.saveOrUpdateProduct(saveOrUpdateProductRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatProductService#saveOrUpdateProduct");
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
 **saveOrUpdateProductRequestWrapper** | [**SaveOrUpdateProductRequestWrapper**](SaveOrUpdateProductRequestWrapper.md)|  |

### Return type

[**SaveOrUpdateProductResponseWrapper**](SaveOrUpdateProductResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateStock

> UpdateStockResponseWrapper updateStock(updateStockRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.platproduct.api.PlatProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        PlatProductService apiInstance = new PlatProductService(defaultClient);
        UpdateStockRequestWrapper updateStockRequestWrapper = new UpdateStockRequestWrapper(); // UpdateStockRequestWrapper | 
        try {
            UpdateStockResponseWrapper result = apiInstance.updateStock(updateStockRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlatProductService#updateStock");
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
 **updateStockRequestWrapper** | [**UpdateStockRequestWrapper**](UpdateStockRequestWrapper.md)|  |

### Return type

[**UpdateStockResponseWrapper**](UpdateStockResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

