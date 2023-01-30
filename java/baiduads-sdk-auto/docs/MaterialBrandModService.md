# MaterialBrandModService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBrand**](MaterialBrandModService.md#addBrand) | **POST** /json/sms/service/MaterialBrandModService/addBrand | 
[**deleteBrand**](MaterialBrandModService.md#deleteBrand) | **POST** /json/sms/service/MaterialBrandModService/deleteBrand | 
[**updateBrand**](MaterialBrandModService.md#updateBrand) | **POST** /json/sms/service/MaterialBrandModService/updateBrand | 
[**updatePutaway**](MaterialBrandModService.md#updatePutaway) | **POST** /json/sms/service/MaterialBrandModService/updatePutaway | 



## addBrand

> AddBrandResponseWrapper addBrand(addBrandRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialbrandmod.api.MaterialBrandModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialBrandModService apiInstance = new MaterialBrandModService(defaultClient);
        AddBrandRequestWrapper addBrandRequestWrapper = new AddBrandRequestWrapper(); // AddBrandRequestWrapper | 
        try {
            AddBrandResponseWrapper result = apiInstance.addBrand(addBrandRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialBrandModService#addBrand");
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
 **addBrandRequestWrapper** | [**AddBrandRequestWrapper**](AddBrandRequestWrapper.md)|  |

### Return type

[**AddBrandResponseWrapper**](AddBrandResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteBrand

> DeleteBrandResponseWrapper deleteBrand(deleteBrandRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialbrandmod.api.MaterialBrandModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialBrandModService apiInstance = new MaterialBrandModService(defaultClient);
        DeleteBrandRequestWrapper deleteBrandRequestWrapper = new DeleteBrandRequestWrapper(); // DeleteBrandRequestWrapper | 
        try {
            DeleteBrandResponseWrapper result = apiInstance.deleteBrand(deleteBrandRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialBrandModService#deleteBrand");
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
 **deleteBrandRequestWrapper** | [**DeleteBrandRequestWrapper**](DeleteBrandRequestWrapper.md)|  |

### Return type

[**DeleteBrandResponseWrapper**](DeleteBrandResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateBrand

> UpdateBrandResponseWrapper updateBrand(updateBrandRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialbrandmod.api.MaterialBrandModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialBrandModService apiInstance = new MaterialBrandModService(defaultClient);
        UpdateBrandRequestWrapper updateBrandRequestWrapper = new UpdateBrandRequestWrapper(); // UpdateBrandRequestWrapper | 
        try {
            UpdateBrandResponseWrapper result = apiInstance.updateBrand(updateBrandRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialBrandModService#updateBrand");
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
 **updateBrandRequestWrapper** | [**UpdateBrandRequestWrapper**](UpdateBrandRequestWrapper.md)|  |

### Return type

[**UpdateBrandResponseWrapper**](UpdateBrandResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.materialbrandmod.api.MaterialBrandModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialBrandModService apiInstance = new MaterialBrandModService(defaultClient);
        UpdatePutawayRequestWrapper updatePutawayRequestWrapper = new UpdatePutawayRequestWrapper(); // UpdatePutawayRequestWrapper | 
        try {
            UpdatePutawayResponseWrapper result = apiInstance.updatePutaway(updatePutawayRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialBrandModService#updatePutaway");
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

