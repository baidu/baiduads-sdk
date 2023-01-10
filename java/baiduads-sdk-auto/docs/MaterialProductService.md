# MaterialProductService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](MaterialProductService.md#addProduct) | **POST** /json/sms/service/MaterialProductService/addProduct | 
[**deleteProduct**](MaterialProductService.md#deleteProduct) | **POST** /json/sms/service/MaterialProductService/deleteProduct | 
[**getProductList**](MaterialProductService.md#getProductList) | **POST** /json/sms/service/MaterialProductService/getProductList | 
[**updateCategory**](MaterialProductService.md#updateCategory) | **POST** /json/sms/service/MaterialProductService/updateCategory | 
[**updateProduct**](MaterialProductService.md#updateProduct) | **POST** /json/sms/service/MaterialProductService/updateProduct | 
[**updatePutaway**](MaterialProductService.md#updatePutaway) | **POST** /json/sms/service/MaterialProductService/updatePutaway | 
[**updateRank**](MaterialProductService.md#updateRank) | **POST** /json/sms/service/MaterialProductService/updateRank | 



## addProduct

> AddProductResponseWrapper addProduct(addProductRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialproduct.api.MaterialProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialProductService apiInstance = new MaterialProductService(defaultClient);
        AddProductRequestWrapper addProductRequestWrapper = new AddProductRequestWrapper(); // AddProductRequestWrapper | 
        try {
            AddProductResponseWrapper result = apiInstance.addProduct(addProductRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialProductService#addProduct");
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
 **addProductRequestWrapper** | [**AddProductRequestWrapper**](AddProductRequestWrapper.md)|  |

### Return type

[**AddProductResponseWrapper**](AddProductResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteProduct

> DeleteProductResponseWrapper deleteProduct(deleteProductRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialproduct.api.MaterialProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialProductService apiInstance = new MaterialProductService(defaultClient);
        DeleteProductRequestWrapper deleteProductRequestWrapper = new DeleteProductRequestWrapper(); // DeleteProductRequestWrapper | 
        try {
            DeleteProductResponseWrapper result = apiInstance.deleteProduct(deleteProductRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialProductService#deleteProduct");
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


## getProductList

> GetProductListResponseWrapper getProductList(getProductListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialproduct.api.MaterialProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialProductService apiInstance = new MaterialProductService(defaultClient);
        GetProductListRequestWrapper getProductListRequestWrapper = new GetProductListRequestWrapper(); // GetProductListRequestWrapper | 
        try {
            GetProductListResponseWrapper result = apiInstance.getProductList(getProductListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialProductService#getProductList");
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


## updateCategory

> UpdateCategoryResponseWrapper updateCategory(updateCategoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialproduct.api.MaterialProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialProductService apiInstance = new MaterialProductService(defaultClient);
        UpdateCategoryRequestWrapper updateCategoryRequestWrapper = new UpdateCategoryRequestWrapper(); // UpdateCategoryRequestWrapper | 
        try {
            UpdateCategoryResponseWrapper result = apiInstance.updateCategory(updateCategoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialProductService#updateCategory");
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
 **updateCategoryRequestWrapper** | [**UpdateCategoryRequestWrapper**](UpdateCategoryRequestWrapper.md)|  |

### Return type

[**UpdateCategoryResponseWrapper**](UpdateCategoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateProduct

> UpdateProductResponseWrapper updateProduct(updateProductRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialproduct.api.MaterialProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialProductService apiInstance = new MaterialProductService(defaultClient);
        UpdateProductRequestWrapper updateProductRequestWrapper = new UpdateProductRequestWrapper(); // UpdateProductRequestWrapper | 
        try {
            UpdateProductResponseWrapper result = apiInstance.updateProduct(updateProductRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialProductService#updateProduct");
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
 **updateProductRequestWrapper** | [**UpdateProductRequestWrapper**](UpdateProductRequestWrapper.md)|  |

### Return type

[**UpdateProductResponseWrapper**](UpdateProductResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updatePutaway

> UpdatePutawayResponseWrapper updatePutaway(updatePutawayRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialproduct.api.MaterialProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialProductService apiInstance = new MaterialProductService(defaultClient);
        UpdatePutawayRequestWrapper updatePutawayRequestWrapper = new UpdatePutawayRequestWrapper(); // UpdatePutawayRequestWrapper | 
        try {
            UpdatePutawayResponseWrapper result = apiInstance.updatePutaway(updatePutawayRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialProductService#updatePutaway");
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
 **updatePutawayRequestWrapper** | [**UpdatePutawayRequestWrapper**](UpdatePutawayRequestWrapper.md)|  |

### Return type

[**UpdatePutawayResponseWrapper**](UpdatePutawayResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateRank

> UpdateRankResponseWrapper updateRank(updateRankRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialproduct.api.MaterialProductService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialProductService apiInstance = new MaterialProductService(defaultClient);
        UpdateRankRequestWrapper updateRankRequestWrapper = new UpdateRankRequestWrapper(); // UpdateRankRequestWrapper | 
        try {
            UpdateRankResponseWrapper result = apiInstance.updateRank(updateRankRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialProductService#updateRank");
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
 **updateRankRequestWrapper** | [**UpdateRankRequestWrapper**](UpdateRankRequestWrapper.md)|  |

### Return type

[**UpdateRankResponseWrapper**](UpdateRankResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

