# MaterialBindModService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMaterialBind**](MaterialBindModService.md#addMaterialBind) | **POST** /json/sms/service/MaterialBindModService/addMaterialBind | 
[**deleteMaterialBind**](MaterialBindModService.md#deleteMaterialBind) | **POST** /json/sms/service/MaterialBindModService/deleteMaterialBind | 
[**updateMaterialBind**](MaterialBindModService.md#updateMaterialBind) | **POST** /json/sms/service/MaterialBindModService/updateMaterialBind | 



## addMaterialBind

> AddMaterialBindResponseWrapper addMaterialBind(addMaterialBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialbindmod.api.MaterialBindModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialBindModService apiInstance = new MaterialBindModService(defaultClient);
        AddMaterialBindRequestWrapper addMaterialBindRequestWrapper = new AddMaterialBindRequestWrapper(); // AddMaterialBindRequestWrapper | 
        try {
            AddMaterialBindResponseWrapper result = apiInstance.addMaterialBind(addMaterialBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialBindModService#addMaterialBind");
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
 **addMaterialBindRequestWrapper** | [**AddMaterialBindRequestWrapper**](AddMaterialBindRequestWrapper.md)|  |

### Return type

[**AddMaterialBindResponseWrapper**](AddMaterialBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteMaterialBind

> DeleteMaterialBindResponseWrapper deleteMaterialBind(deleteMaterialBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialbindmod.api.MaterialBindModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialBindModService apiInstance = new MaterialBindModService(defaultClient);
        DeleteMaterialBindRequestWrapper deleteMaterialBindRequestWrapper = new DeleteMaterialBindRequestWrapper(); // DeleteMaterialBindRequestWrapper | 
        try {
            DeleteMaterialBindResponseWrapper result = apiInstance.deleteMaterialBind(deleteMaterialBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialBindModService#deleteMaterialBind");
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
 **deleteMaterialBindRequestWrapper** | [**DeleteMaterialBindRequestWrapper**](DeleteMaterialBindRequestWrapper.md)|  |

### Return type

[**DeleteMaterialBindResponseWrapper**](DeleteMaterialBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateMaterialBind

> UpdateMaterialBindResponseWrapper updateMaterialBind(updateMaterialBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.materialbindmod.api.MaterialBindModService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MaterialBindModService apiInstance = new MaterialBindModService(defaultClient);
        UpdateMaterialBindRequestWrapper updateMaterialBindRequestWrapper = new UpdateMaterialBindRequestWrapper(); // UpdateMaterialBindRequestWrapper | 
        try {
            UpdateMaterialBindResponseWrapper result = apiInstance.updateMaterialBind(updateMaterialBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaterialBindModService#updateMaterialBind");
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
 **updateMaterialBindRequestWrapper** | [**UpdateMaterialBindRequestWrapper**](UpdateMaterialBindRequestWrapper.md)|  |

### Return type

[**UpdateMaterialBindResponseWrapper**](UpdateMaterialBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

