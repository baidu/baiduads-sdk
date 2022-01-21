# OcpcService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTargetPackage**](OcpcService.md#addTargetPackage) | **POST** /json/sms/service/OcpcService/addTargetPackage | 
[**deleteTargetPackage**](OcpcService.md#deleteTargetPackage) | **POST** /json/sms/service/OcpcService/deleteTargetPackage | 
[**getHintAuditTime**](OcpcService.md#getHintAuditTime) | **POST** /json/sms/service/OcpcService/getHintAuditTime | 
[**getTargetPackageList**](OcpcService.md#getTargetPackageList) | **POST** /json/sms/service/OcpcService/getTargetPackageList | 
[**updateTargetPackage**](OcpcService.md#updateTargetPackage) | **POST** /json/sms/service/OcpcService/updateTargetPackage | 



## addTargetPackage

> AddTargetPackageResponseWrapper addTargetPackage(addTargetPackageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.ocpc.api.OcpcService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OcpcService apiInstance = new OcpcService(defaultClient);
        AddTargetPackageRequestWrapper addTargetPackageRequestWrapper = new AddTargetPackageRequestWrapper(); // AddTargetPackageRequestWrapper | 
        try {
            AddTargetPackageResponseWrapper result = apiInstance.addTargetPackage(addTargetPackageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OcpcService#addTargetPackage");
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
 **addTargetPackageRequestWrapper** | [**AddTargetPackageRequestWrapper**](AddTargetPackageRequestWrapper.md)|  |

### Return type

[**AddTargetPackageResponseWrapper**](AddTargetPackageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteTargetPackage

> DeleteTargetPackageResponseWrapper deleteTargetPackage(deleteTargetPackageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.ocpc.api.OcpcService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OcpcService apiInstance = new OcpcService(defaultClient);
        DeleteTargetPackageRequestWrapper deleteTargetPackageRequestWrapper = new DeleteTargetPackageRequestWrapper(); // DeleteTargetPackageRequestWrapper | 
        try {
            DeleteTargetPackageResponseWrapper result = apiInstance.deleteTargetPackage(deleteTargetPackageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OcpcService#deleteTargetPackage");
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
 **deleteTargetPackageRequestWrapper** | [**DeleteTargetPackageRequestWrapper**](DeleteTargetPackageRequestWrapper.md)|  |

### Return type

[**DeleteTargetPackageResponseWrapper**](DeleteTargetPackageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getHintAuditTime

> GetHintAuditTimeResponseWrapper getHintAuditTime(getHintAuditTimeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.ocpc.api.OcpcService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OcpcService apiInstance = new OcpcService(defaultClient);
        GetHintAuditTimeRequestWrapper getHintAuditTimeRequestWrapper = new GetHintAuditTimeRequestWrapper(); // GetHintAuditTimeRequestWrapper | 
        try {
            GetHintAuditTimeResponseWrapper result = apiInstance.getHintAuditTime(getHintAuditTimeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OcpcService#getHintAuditTime");
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
 **getHintAuditTimeRequestWrapper** | [**GetHintAuditTimeRequestWrapper**](GetHintAuditTimeRequestWrapper.md)|  |

### Return type

[**GetHintAuditTimeResponseWrapper**](GetHintAuditTimeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getTargetPackageList

> GetTargetPackageListResponseWrapper getTargetPackageList(getTargetPackageListRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.ocpc.api.OcpcService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OcpcService apiInstance = new OcpcService(defaultClient);
        GetTargetPackageListRequestWrapper getTargetPackageListRequestWrapper = new GetTargetPackageListRequestWrapper(); // GetTargetPackageListRequestWrapper | 
        try {
            GetTargetPackageListResponseWrapper result = apiInstance.getTargetPackageList(getTargetPackageListRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OcpcService#getTargetPackageList");
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
 **getTargetPackageListRequestWrapper** | [**GetTargetPackageListRequestWrapper**](GetTargetPackageListRequestWrapper.md)|  |

### Return type

[**GetTargetPackageListResponseWrapper**](GetTargetPackageListResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateTargetPackage

> UpdateTargetPackageResponseWrapper updateTargetPackage(updateTargetPackageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.ocpc.api.OcpcService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        OcpcService apiInstance = new OcpcService(defaultClient);
        UpdateTargetPackageRequestWrapper updateTargetPackageRequestWrapper = new UpdateTargetPackageRequestWrapper(); // UpdateTargetPackageRequestWrapper | 
        try {
            UpdateTargetPackageResponseWrapper result = apiInstance.updateTargetPackage(updateTargetPackageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OcpcService#updateTargetPackage");
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
 **updateTargetPackageRequestWrapper** | [**UpdateTargetPackageRequestWrapper**](UpdateTargetPackageRequestWrapper.md)|  |

### Return type

[**UpdateTargetPackageResponseWrapper**](UpdateTargetPackageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

