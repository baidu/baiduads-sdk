# CrowdBindService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBind**](CrowdBindService.md#addBind) | **POST** /json/sms/service/CrowdBindService/addBind | 
[**deleteBind**](CrowdBindService.md#deleteBind) | **POST** /json/sms/service/CrowdBindService/deleteBind | 
[**getBind**](CrowdBindService.md#getBind) | **POST** /json/sms/service/CrowdBindService/getBind | 
[**updateBind**](CrowdBindService.md#updateBind) | **POST** /json/sms/service/CrowdBindService/updateBind | 



## addBind

> AddBindResponseWrapper addBind(addBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdbind.api.CrowdBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdBindService apiInstance = new CrowdBindService(defaultClient);
        AddBindRequestWrapper addBindRequestWrapper = new AddBindRequestWrapper(); // AddBindRequestWrapper | 
        try {
            AddBindResponseWrapper result = apiInstance.addBind(addBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdBindService#addBind");
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
 **addBindRequestWrapper** | [**AddBindRequestWrapper**](AddBindRequestWrapper.md)|  |

### Return type

[**AddBindResponseWrapper**](AddBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteBind

> DeleteBindResponseWrapper deleteBind(deleteBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdbind.api.CrowdBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdBindService apiInstance = new CrowdBindService(defaultClient);
        DeleteBindRequestWrapper deleteBindRequestWrapper = new DeleteBindRequestWrapper(); // DeleteBindRequestWrapper | 
        try {
            DeleteBindResponseWrapper result = apiInstance.deleteBind(deleteBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdBindService#deleteBind");
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
 **deleteBindRequestWrapper** | [**DeleteBindRequestWrapper**](DeleteBindRequestWrapper.md)|  |

### Return type

[**DeleteBindResponseWrapper**](DeleteBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getBind

> GetBindResponseWrapper getBind(getBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdbind.api.CrowdBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdBindService apiInstance = new CrowdBindService(defaultClient);
        GetBindRequestWrapper getBindRequestWrapper = new GetBindRequestWrapper(); // GetBindRequestWrapper | 
        try {
            GetBindResponseWrapper result = apiInstance.getBind(getBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdBindService#getBind");
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
 **getBindRequestWrapper** | [**GetBindRequestWrapper**](GetBindRequestWrapper.md)|  |

### Return type

[**GetBindResponseWrapper**](GetBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateBind

> UpdateBindResponseWrapper updateBind(updateBindRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowdbind.api.CrowdBindService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdBindService apiInstance = new CrowdBindService(defaultClient);
        UpdateBindRequestWrapper updateBindRequestWrapper = new UpdateBindRequestWrapper(); // UpdateBindRequestWrapper | 
        try {
            UpdateBindResponseWrapper result = apiInstance.updateBind(updateBindRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdBindService#updateBind");
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
 **updateBindRequestWrapper** | [**UpdateBindRequestWrapper**](UpdateBindRequestWrapper.md)|  |

### Return type

[**UpdateBindResponseWrapper**](UpdateBindResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

