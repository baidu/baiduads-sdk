# SubShopMaterialOpenApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPublicityImage**](SubShopMaterialOpenApiService.md#addPublicityImage) | **POST** /json/sms/service/SubShopMaterialOpenApiService/addPublicityImage | 
[**getAlbumTypes**](SubShopMaterialOpenApiService.md#getAlbumTypes) | **POST** /json/sms/service/SubShopMaterialOpenApiService/getAlbumTypes | 
[**removePublicityImage**](SubShopMaterialOpenApiService.md#removePublicityImage) | **POST** /json/sms/service/SubShopMaterialOpenApiService/removePublicityImage | 



## addPublicityImage

> AddPublicityImageResponseWrapper addPublicityImage(addPublicityImageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.subshopmaterialopenapi.api.SubShopMaterialOpenApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SubShopMaterialOpenApiService apiInstance = new SubShopMaterialOpenApiService(defaultClient);
        AddPublicityImageRequestWrapper addPublicityImageRequestWrapper = new AddPublicityImageRequestWrapper(); // AddPublicityImageRequestWrapper | 
        try {
            AddPublicityImageResponseWrapper result = apiInstance.addPublicityImage(addPublicityImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubShopMaterialOpenApiService#addPublicityImage");
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
 **addPublicityImageRequestWrapper** | [**AddPublicityImageRequestWrapper**](AddPublicityImageRequestWrapper.md)|  |

### Return type

[**AddPublicityImageResponseWrapper**](AddPublicityImageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getAlbumTypes

> GetAlbumTypesResponseWrapper getAlbumTypes(getAlbumTypesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.subshopmaterialopenapi.api.SubShopMaterialOpenApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SubShopMaterialOpenApiService apiInstance = new SubShopMaterialOpenApiService(defaultClient);
        GetAlbumTypesRequestWrapper getAlbumTypesRequestWrapper = new GetAlbumTypesRequestWrapper(); // GetAlbumTypesRequestWrapper | 
        try {
            GetAlbumTypesResponseWrapper result = apiInstance.getAlbumTypes(getAlbumTypesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubShopMaterialOpenApiService#getAlbumTypes");
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
 **getAlbumTypesRequestWrapper** | [**GetAlbumTypesRequestWrapper**](GetAlbumTypesRequestWrapper.md)|  |

### Return type

[**GetAlbumTypesResponseWrapper**](GetAlbumTypesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## removePublicityImage

> RemovePublicityImageResponseWrapper removePublicityImage(removePublicityImageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.subshopmaterialopenapi.api.SubShopMaterialOpenApiService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SubShopMaterialOpenApiService apiInstance = new SubShopMaterialOpenApiService(defaultClient);
        RemovePublicityImageRequestWrapper removePublicityImageRequestWrapper = new RemovePublicityImageRequestWrapper(); // RemovePublicityImageRequestWrapper | 
        try {
            RemovePublicityImageResponseWrapper result = apiInstance.removePublicityImage(removePublicityImageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubShopMaterialOpenApiService#removePublicityImage");
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
 **removePublicityImageRequestWrapper** | [**RemovePublicityImageRequestWrapper**](RemovePublicityImageRequestWrapper.md)|  |

### Return type

[**RemovePublicityImageResponseWrapper**](RemovePublicityImageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

