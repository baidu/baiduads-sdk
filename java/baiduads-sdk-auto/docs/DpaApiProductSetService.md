# DpaApiProductSetService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductSet**](DpaApiProductSetService.md#addProductSet) | **POST** /json/sms/service/DpaApiProductSetService/addProductSet | 
[**deleteProductSet**](DpaApiProductSetService.md#deleteProductSet) | **POST** /json/sms/service/DpaApiProductSetService/deleteProductSet | 
[**getCatalogFieldsInfo**](DpaApiProductSetService.md#getCatalogFieldsInfo) | **POST** /json/sms/service/DpaApiProductSetService/getCatalogFieldsInfo | 
[**getCatalogMaterialFieldsInfo**](DpaApiProductSetService.md#getCatalogMaterialFieldsInfo) | **POST** /json/sms/service/DpaApiProductSetService/getCatalogMaterialFieldsInfo | 
[**getProductSet**](DpaApiProductSetService.md#getProductSet) | **POST** /json/sms/service/DpaApiProductSetService/getProductSet | 
[**getProductSetByCatalog**](DpaApiProductSetService.md#getProductSetByCatalog) | **POST** /json/sms/service/DpaApiProductSetService/getProductSetByCatalog | 
[**updateProductSet**](DpaApiProductSetService.md#updateProductSet) | **POST** /json/sms/service/DpaApiProductSetService/updateProductSet | 



## addProductSet

> AddProductSetResponseWrapper addProductSet(addProductSetRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapiproductset.api.DpaApiProductSetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiProductSetService apiInstance = new DpaApiProductSetService(defaultClient);
        AddProductSetRequestWrapper addProductSetRequestWrapper = new AddProductSetRequestWrapper(); // AddProductSetRequestWrapper | 
        try {
            AddProductSetResponseWrapper result = apiInstance.addProductSet(addProductSetRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiProductSetService#addProductSet");
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
 **addProductSetRequestWrapper** | [**AddProductSetRequestWrapper**](AddProductSetRequestWrapper.md)|  |

### Return type

[**AddProductSetResponseWrapper**](AddProductSetResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteProductSet

> DeleteProductSetResponseWrapper deleteProductSet(deleteProductSetRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapiproductset.api.DpaApiProductSetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiProductSetService apiInstance = new DpaApiProductSetService(defaultClient);
        DeleteProductSetRequestWrapper deleteProductSetRequestWrapper = new DeleteProductSetRequestWrapper(); // DeleteProductSetRequestWrapper | 
        try {
            DeleteProductSetResponseWrapper result = apiInstance.deleteProductSet(deleteProductSetRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiProductSetService#deleteProductSet");
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
 **deleteProductSetRequestWrapper** | [**DeleteProductSetRequestWrapper**](DeleteProductSetRequestWrapper.md)|  |

### Return type

[**DeleteProductSetResponseWrapper**](DeleteProductSetResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCatalogFieldsInfo

> GetCatalogFieldsInfoResponseWrapper getCatalogFieldsInfo(getCatalogFieldsInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapiproductset.api.DpaApiProductSetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiProductSetService apiInstance = new DpaApiProductSetService(defaultClient);
        GetCatalogFieldsInfoRequestWrapper getCatalogFieldsInfoRequestWrapper = new GetCatalogFieldsInfoRequestWrapper(); // GetCatalogFieldsInfoRequestWrapper | 
        try {
            GetCatalogFieldsInfoResponseWrapper result = apiInstance.getCatalogFieldsInfo(getCatalogFieldsInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiProductSetService#getCatalogFieldsInfo");
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
 **getCatalogFieldsInfoRequestWrapper** | [**GetCatalogFieldsInfoRequestWrapper**](GetCatalogFieldsInfoRequestWrapper.md)|  |

### Return type

[**GetCatalogFieldsInfoResponseWrapper**](GetCatalogFieldsInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCatalogMaterialFieldsInfo

> GetCatalogMaterialFieldsInfoResponseWrapper getCatalogMaterialFieldsInfo(getCatalogMaterialFieldsInfoRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapiproductset.api.DpaApiProductSetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiProductSetService apiInstance = new DpaApiProductSetService(defaultClient);
        GetCatalogMaterialFieldsInfoRequestWrapper getCatalogMaterialFieldsInfoRequestWrapper = new GetCatalogMaterialFieldsInfoRequestWrapper(); // GetCatalogMaterialFieldsInfoRequestWrapper | 
        try {
            GetCatalogMaterialFieldsInfoResponseWrapper result = apiInstance.getCatalogMaterialFieldsInfo(getCatalogMaterialFieldsInfoRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiProductSetService#getCatalogMaterialFieldsInfo");
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
 **getCatalogMaterialFieldsInfoRequestWrapper** | [**GetCatalogMaterialFieldsInfoRequestWrapper**](GetCatalogMaterialFieldsInfoRequestWrapper.md)|  |

### Return type

[**GetCatalogMaterialFieldsInfoResponseWrapper**](GetCatalogMaterialFieldsInfoResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getProductSet

> GetProductSetResponseWrapper getProductSet(getProductSetRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapiproductset.api.DpaApiProductSetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiProductSetService apiInstance = new DpaApiProductSetService(defaultClient);
        GetProductSetRequestWrapper getProductSetRequestWrapper = new GetProductSetRequestWrapper(); // GetProductSetRequestWrapper | 
        try {
            GetProductSetResponseWrapper result = apiInstance.getProductSet(getProductSetRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiProductSetService#getProductSet");
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
 **getProductSetRequestWrapper** | [**GetProductSetRequestWrapper**](GetProductSetRequestWrapper.md)|  |

### Return type

[**GetProductSetResponseWrapper**](GetProductSetResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getProductSetByCatalog

> GetProductSetByCatalogResponseWrapper getProductSetByCatalog(getProductSetByCatalogRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapiproductset.api.DpaApiProductSetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiProductSetService apiInstance = new DpaApiProductSetService(defaultClient);
        GetProductSetByCatalogRequestWrapper getProductSetByCatalogRequestWrapper = new GetProductSetByCatalogRequestWrapper(); // GetProductSetByCatalogRequestWrapper | 
        try {
            GetProductSetByCatalogResponseWrapper result = apiInstance.getProductSetByCatalog(getProductSetByCatalogRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiProductSetService#getProductSetByCatalog");
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
 **getProductSetByCatalogRequestWrapper** | [**GetProductSetByCatalogRequestWrapper**](GetProductSetByCatalogRequestWrapper.md)|  |

### Return type

[**GetProductSetByCatalogResponseWrapper**](GetProductSetByCatalogResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateProductSet

> UpdateProductSetResponseWrapper updateProductSet(updateProductSetRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpaapiproductset.api.DpaApiProductSetService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaApiProductSetService apiInstance = new DpaApiProductSetService(defaultClient);
        UpdateProductSetRequestWrapper updateProductSetRequestWrapper = new UpdateProductSetRequestWrapper(); // UpdateProductSetRequestWrapper | 
        try {
            UpdateProductSetResponseWrapper result = apiInstance.updateProductSet(updateProductSetRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaApiProductSetService#updateProductSet");
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
 **updateProductSetRequestWrapper** | [**UpdateProductSetRequestWrapper**](UpdateProductSetRequestWrapper.md)|  |

### Return type

[**UpdateProductSetResponseWrapper**](UpdateProductSetResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

