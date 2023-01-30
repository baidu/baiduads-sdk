# WtMaterialCategoryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCategory**](WtMaterialCategoryService.md#deleteCategory) | **POST** /json/sms/service/WtMaterialCategoryService/deleteCategory | 
[**getCategoryList**](WtMaterialCategoryService.md#getCategoryList) | **POST** /json/sms/service/WtMaterialCategoryService/getCategoryList | 
[**updateCategory**](WtMaterialCategoryService.md#updateCategory) | **POST** /json/sms/service/WtMaterialCategoryService/updateCategory | 



## deleteCategory

> DeleteCategoryResponseWrapper deleteCategory(deleteCategoryRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.wtmaterialcategory.api.WtMaterialCategoryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WtMaterialCategoryService apiInstance = new WtMaterialCategoryService(defaultClient);
        DeleteCategoryRequestWrapper deleteCategoryRequestWrapper = new DeleteCategoryRequestWrapper(); // DeleteCategoryRequestWrapper | 
        try {
            DeleteCategoryResponseWrapper result = apiInstance.deleteCategory(deleteCategoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WtMaterialCategoryService#deleteCategory");
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
 **deleteCategoryRequestWrapper** | [**DeleteCategoryRequestWrapper**](DeleteCategoryRequestWrapper.md)|  |

### Return type

[**DeleteCategoryResponseWrapper**](DeleteCategoryResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCategoryList

> GetCategoryListResponseWrapper getCategoryList(getCategoryListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.wtmaterialcategory.api.WtMaterialCategoryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WtMaterialCategoryService apiInstance = new WtMaterialCategoryService(defaultClient);
        GetCategoryListRequestWrapper getCategoryListRequestWrapper = new GetCategoryListRequestWrapper(); // GetCategoryListRequestWrapper | 
        try {
            GetCategoryListResponseWrapper result = apiInstance.getCategoryList(getCategoryListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WtMaterialCategoryService#getCategoryList");
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
 **getCategoryListRequestWrapper** | [**GetCategoryListRequestWrapper**](GetCategoryListRequestWrapper.md)|  |

### Return type

[**GetCategoryListResponseWrapper**](GetCategoryListResponseWrapper.md)

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
import com.baidu.dev2.api.sdk.wtmaterialcategory.api.WtMaterialCategoryService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        WtMaterialCategoryService apiInstance = new WtMaterialCategoryService(defaultClient);
        UpdateCategoryRequestWrapper updateCategoryRequestWrapper = new UpdateCategoryRequestWrapper(); // UpdateCategoryRequestWrapper | 
        try {
            UpdateCategoryResponseWrapper result = apiInstance.updateCategory(updateCategoryRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WtMaterialCategoryService#updateCategory");
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

