# RtaFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRtaSetting**](RtaFeedService.md#addRtaSetting) | **POST** /json/sms/service/RtaFeedService/addRtaSetting | 
[**delRtaSetting**](RtaFeedService.md#delRtaSetting) | **POST** /json/sms/service/RtaFeedService/delRtaSetting | 
[**delStrategy**](RtaFeedService.md#delStrategy) | **POST** /json/sms/service/RtaFeedService/delStrategy | 
[**getConfigurableUsers**](RtaFeedService.md#getConfigurableUsers) | **POST** /json/sms/service/RtaFeedService/getConfigurableUsers | 
[**getRtaSetting**](RtaFeedService.md#getRtaSetting) | **POST** /json/sms/service/RtaFeedService/getRtaSetting | 
[**getRtaToken**](RtaFeedService.md#getRtaToken) | **POST** /json/sms/service/RtaFeedService/getRtaToken | 
[**getStrategy**](RtaFeedService.md#getStrategy) | **POST** /json/sms/service/RtaFeedService/getStrategy | 
[**updateRtaSetting**](RtaFeedService.md#updateRtaSetting) | **POST** /json/sms/service/RtaFeedService/updateRtaSetting | 
[**updateStrategy**](RtaFeedService.md#updateStrategy) | **POST** /json/sms/service/RtaFeedService/updateStrategy | 



## addRtaSetting

> AddRtaSettingResponseWrapper addRtaSetting(addRtaSettingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        AddRtaSettingRequestWrapper addRtaSettingRequestWrapper = new AddRtaSettingRequestWrapper(); // AddRtaSettingRequestWrapper | 
        try {
            AddRtaSettingResponseWrapper result = apiInstance.addRtaSetting(addRtaSettingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#addRtaSetting");
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
 **addRtaSettingRequestWrapper** | [**AddRtaSettingRequestWrapper**](AddRtaSettingRequestWrapper.md)|  |

### Return type

[**AddRtaSettingResponseWrapper**](AddRtaSettingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## delRtaSetting

> DelRtaSettingResponseWrapper delRtaSetting(delRtaSettingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        DelRtaSettingRequestWrapper delRtaSettingRequestWrapper = new DelRtaSettingRequestWrapper(); // DelRtaSettingRequestWrapper | 
        try {
            DelRtaSettingResponseWrapper result = apiInstance.delRtaSetting(delRtaSettingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#delRtaSetting");
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
 **delRtaSettingRequestWrapper** | [**DelRtaSettingRequestWrapper**](DelRtaSettingRequestWrapper.md)|  |

### Return type

[**DelRtaSettingResponseWrapper**](DelRtaSettingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## delStrategy

> DelStrategyResponseWrapper delStrategy(delStrategyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        DelStrategyRequestWrapper delStrategyRequestWrapper = new DelStrategyRequestWrapper(); // DelStrategyRequestWrapper | 
        try {
            DelStrategyResponseWrapper result = apiInstance.delStrategy(delStrategyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#delStrategy");
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
 **delStrategyRequestWrapper** | [**DelStrategyRequestWrapper**](DelStrategyRequestWrapper.md)|  |

### Return type

[**DelStrategyResponseWrapper**](DelStrategyResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getConfigurableUsers

> GetConfigurableUsersResponseWrapper getConfigurableUsers(getConfigurableUsersRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        GetConfigurableUsersRequestWrapper getConfigurableUsersRequestWrapper = new GetConfigurableUsersRequestWrapper(); // GetConfigurableUsersRequestWrapper | 
        try {
            GetConfigurableUsersResponseWrapper result = apiInstance.getConfigurableUsers(getConfigurableUsersRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#getConfigurableUsers");
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
 **getConfigurableUsersRequestWrapper** | [**GetConfigurableUsersRequestWrapper**](GetConfigurableUsersRequestWrapper.md)|  |

### Return type

[**GetConfigurableUsersResponseWrapper**](GetConfigurableUsersResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getRtaSetting

> GetRtaSettingResponseWrapper getRtaSetting(getRtaSettingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        GetRtaSettingRequestWrapper getRtaSettingRequestWrapper = new GetRtaSettingRequestWrapper(); // GetRtaSettingRequestWrapper | 
        try {
            GetRtaSettingResponseWrapper result = apiInstance.getRtaSetting(getRtaSettingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#getRtaSetting");
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
 **getRtaSettingRequestWrapper** | [**GetRtaSettingRequestWrapper**](GetRtaSettingRequestWrapper.md)|  |

### Return type

[**GetRtaSettingResponseWrapper**](GetRtaSettingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getRtaToken

> GetRtaTokenResponseWrapper getRtaToken(getRtaTokenRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        GetRtaTokenRequestWrapper getRtaTokenRequestWrapper = new GetRtaTokenRequestWrapper(); // GetRtaTokenRequestWrapper | 
        try {
            GetRtaTokenResponseWrapper result = apiInstance.getRtaToken(getRtaTokenRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#getRtaToken");
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
 **getRtaTokenRequestWrapper** | [**GetRtaTokenRequestWrapper**](GetRtaTokenRequestWrapper.md)|  |

### Return type

[**GetRtaTokenResponseWrapper**](GetRtaTokenResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getStrategy

> GetStrategyResponseWrapper getStrategy(getStrategyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        GetStrategyRequestWrapper getStrategyRequestWrapper = new GetStrategyRequestWrapper(); // GetStrategyRequestWrapper | 
        try {
            GetStrategyResponseWrapper result = apiInstance.getStrategy(getStrategyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#getStrategy");
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
 **getStrategyRequestWrapper** | [**GetStrategyRequestWrapper**](GetStrategyRequestWrapper.md)|  |

### Return type

[**GetStrategyResponseWrapper**](GetStrategyResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateRtaSetting

> UpdateRtaSettingResponseWrapper updateRtaSetting(updateRtaSettingRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        UpdateRtaSettingRequestWrapper updateRtaSettingRequestWrapper = new UpdateRtaSettingRequestWrapper(); // UpdateRtaSettingRequestWrapper | 
        try {
            UpdateRtaSettingResponseWrapper result = apiInstance.updateRtaSetting(updateRtaSettingRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#updateRtaSetting");
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
 **updateRtaSettingRequestWrapper** | [**UpdateRtaSettingRequestWrapper**](UpdateRtaSettingRequestWrapper.md)|  |

### Return type

[**UpdateRtaSettingResponseWrapper**](UpdateRtaSettingResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateStrategy

> UpdateStrategyResponseWrapper updateStrategy(updateStrategyRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.rtafeed.api.RtaFeedService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        RtaFeedService apiInstance = new RtaFeedService(defaultClient);
        UpdateStrategyRequestWrapper updateStrategyRequestWrapper = new UpdateStrategyRequestWrapper(); // UpdateStrategyRequestWrapper | 
        try {
            UpdateStrategyResponseWrapper result = apiInstance.updateStrategy(updateStrategyRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RtaFeedService#updateStrategy");
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
 **updateStrategyRequestWrapper** | [**UpdateStrategyRequestWrapper**](UpdateStrategyRequestWrapper.md)|  |

### Return type

[**UpdateStrategyResponseWrapper**](UpdateStrategyResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

