# CrowdService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCrowd**](CrowdService.md#addCrowd) | **POST** /json/sms/service/CrowdService/addCrowd | 
[**deleteCrowd**](CrowdService.md#deleteCrowd) | **POST** /json/sms/service/CrowdService/deleteCrowd | 
[**getCrowd**](CrowdService.md#getCrowd) | **POST** /json/sms/service/CrowdService/getCrowd | 
[**updateCrowd**](CrowdService.md#updateCrowd) | **POST** /json/sms/service/CrowdService/updateCrowd | 



## addCrowd

> AddCrowdResponseWrapper addCrowd(addCrowdRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowd.api.CrowdService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdService apiInstance = new CrowdService(defaultClient);
        AddCrowdRequestWrapper addCrowdRequestWrapper = new AddCrowdRequestWrapper(); // AddCrowdRequestWrapper | 
        try {
            AddCrowdResponseWrapper result = apiInstance.addCrowd(addCrowdRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdService#addCrowd");
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
 **addCrowdRequestWrapper** | [**AddCrowdRequestWrapper**](AddCrowdRequestWrapper.md)|  |

### Return type

[**AddCrowdResponseWrapper**](AddCrowdResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCrowd

> DeleteCrowdResponseWrapper deleteCrowd(deleteCrowdRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowd.api.CrowdService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdService apiInstance = new CrowdService(defaultClient);
        DeleteCrowdRequestWrapper deleteCrowdRequestWrapper = new DeleteCrowdRequestWrapper(); // DeleteCrowdRequestWrapper | 
        try {
            DeleteCrowdResponseWrapper result = apiInstance.deleteCrowd(deleteCrowdRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdService#deleteCrowd");
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
 **deleteCrowdRequestWrapper** | [**DeleteCrowdRequestWrapper**](DeleteCrowdRequestWrapper.md)|  |

### Return type

[**DeleteCrowdResponseWrapper**](DeleteCrowdResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCrowd

> GetCrowdResponseWrapper getCrowd(getCrowdRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowd.api.CrowdService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdService apiInstance = new CrowdService(defaultClient);
        GetCrowdRequestWrapper getCrowdRequestWrapper = new GetCrowdRequestWrapper(); // GetCrowdRequestWrapper | 
        try {
            GetCrowdResponseWrapper result = apiInstance.getCrowd(getCrowdRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdService#getCrowd");
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
 **getCrowdRequestWrapper** | [**GetCrowdRequestWrapper**](GetCrowdRequestWrapper.md)|  |

### Return type

[**GetCrowdResponseWrapper**](GetCrowdResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCrowd

> UpdateCrowdResponseWrapper updateCrowd(updateCrowdRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.crowd.api.CrowdService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        CrowdService apiInstance = new CrowdService(defaultClient);
        UpdateCrowdRequestWrapper updateCrowdRequestWrapper = new UpdateCrowdRequestWrapper(); // UpdateCrowdRequestWrapper | 
        try {
            UpdateCrowdResponseWrapper result = apiInstance.updateCrowd(updateCrowdRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrowdService#updateCrowd");
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
 **updateCrowdRequestWrapper** | [**UpdateCrowdRequestWrapper**](UpdateCrowdRequestWrapper.md)|  |

### Return type

[**UpdateCrowdResponseWrapper**](UpdateCrowdResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

