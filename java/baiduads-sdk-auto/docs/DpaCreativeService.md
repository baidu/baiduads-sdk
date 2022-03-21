# DpaCreativeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCreativeGroup**](DpaCreativeService.md#addCreativeGroup) | **POST** /json/sms/service/DpaCreativeService/addCreativeGroup | 
[**addCreatives**](DpaCreativeService.md#addCreatives) | **POST** /json/sms/service/DpaCreativeService/addCreatives | 
[**batSetRange**](DpaCreativeService.md#batSetRange) | **POST** /json/sms/service/DpaCreativeService/batSetRange | 
[**deleteCreativeGroup**](DpaCreativeService.md#deleteCreativeGroup) | **POST** /json/sms/service/DpaCreativeService/deleteCreativeGroup | 
[**deleteCreatives**](DpaCreativeService.md#deleteCreatives) | **POST** /json/sms/service/DpaCreativeService/deleteCreatives | 
[**getCreativeGroup**](DpaCreativeService.md#getCreativeGroup) | **POST** /json/sms/service/DpaCreativeService/getCreativeGroup | 
[**getCreatives**](DpaCreativeService.md#getCreatives) | **POST** /json/sms/service/DpaCreativeService/getCreatives | 
[**getFormatTemplates**](DpaCreativeService.md#getFormatTemplates) | **POST** /json/sms/service/DpaCreativeService/getFormatTemplates | 
[**updateCreativeGroup**](DpaCreativeService.md#updateCreativeGroup) | **POST** /json/sms/service/DpaCreativeService/updateCreativeGroup | 
[**updateCreatives**](DpaCreativeService.md#updateCreatives) | **POST** /json/sms/service/DpaCreativeService/updateCreatives | 



## addCreativeGroup

> AddCreativeGroupResponseWrapper addCreativeGroup(addCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        AddCreativeGroupRequestWrapper addCreativeGroupRequestWrapper = new AddCreativeGroupRequestWrapper(); // AddCreativeGroupRequestWrapper | 
        try {
            AddCreativeGroupResponseWrapper result = apiInstance.addCreativeGroup(addCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#addCreativeGroup");
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
 **addCreativeGroupRequestWrapper** | [**AddCreativeGroupRequestWrapper**](AddCreativeGroupRequestWrapper.md)|  |

### Return type

[**AddCreativeGroupResponseWrapper**](AddCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## addCreatives

> AddCreativesResponseWrapper addCreatives(addCreativesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        AddCreativesRequestWrapper addCreativesRequestWrapper = new AddCreativesRequestWrapper(); // AddCreativesRequestWrapper | 
        try {
            AddCreativesResponseWrapper result = apiInstance.addCreatives(addCreativesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#addCreatives");
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
 **addCreativesRequestWrapper** | [**AddCreativesRequestWrapper**](AddCreativesRequestWrapper.md)|  |

### Return type

[**AddCreativesResponseWrapper**](AddCreativesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## batSetRange

> BatSetRangeResponseWrapper batSetRange(batSetRangeRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        BatSetRangeRequestWrapper batSetRangeRequestWrapper = new BatSetRangeRequestWrapper(); // BatSetRangeRequestWrapper | 
        try {
            BatSetRangeResponseWrapper result = apiInstance.batSetRange(batSetRangeRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#batSetRange");
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
 **batSetRangeRequestWrapper** | [**BatSetRangeRequestWrapper**](BatSetRangeRequestWrapper.md)|  |

### Return type

[**BatSetRangeResponseWrapper**](BatSetRangeResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCreativeGroup

> DeleteCreativeGroupResponseWrapper deleteCreativeGroup(deleteCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        DeleteCreativeGroupRequestWrapper deleteCreativeGroupRequestWrapper = new DeleteCreativeGroupRequestWrapper(); // DeleteCreativeGroupRequestWrapper | 
        try {
            DeleteCreativeGroupResponseWrapper result = apiInstance.deleteCreativeGroup(deleteCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#deleteCreativeGroup");
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
 **deleteCreativeGroupRequestWrapper** | [**DeleteCreativeGroupRequestWrapper**](DeleteCreativeGroupRequestWrapper.md)|  |

### Return type

[**DeleteCreativeGroupResponseWrapper**](DeleteCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## deleteCreatives

> DeleteCreativesResponseWrapper deleteCreatives(deleteCreativesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        DeleteCreativesRequestWrapper deleteCreativesRequestWrapper = new DeleteCreativesRequestWrapper(); // DeleteCreativesRequestWrapper | 
        try {
            DeleteCreativesResponseWrapper result = apiInstance.deleteCreatives(deleteCreativesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#deleteCreatives");
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
 **deleteCreativesRequestWrapper** | [**DeleteCreativesRequestWrapper**](DeleteCreativesRequestWrapper.md)|  |

### Return type

[**DeleteCreativesResponseWrapper**](DeleteCreativesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreativeGroup

> GetCreativeGroupResponseWrapper getCreativeGroup(getCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        GetCreativeGroupRequestWrapper getCreativeGroupRequestWrapper = new GetCreativeGroupRequestWrapper(); // GetCreativeGroupRequestWrapper | 
        try {
            GetCreativeGroupResponseWrapper result = apiInstance.getCreativeGroup(getCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#getCreativeGroup");
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
 **getCreativeGroupRequestWrapper** | [**GetCreativeGroupRequestWrapper**](GetCreativeGroupRequestWrapper.md)|  |

### Return type

[**GetCreativeGroupResponseWrapper**](GetCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreatives

> GetCreativesResponseWrapper getCreatives(getCreativesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        GetCreativesRequestWrapper getCreativesRequestWrapper = new GetCreativesRequestWrapper(); // GetCreativesRequestWrapper | 
        try {
            GetCreativesResponseWrapper result = apiInstance.getCreatives(getCreativesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#getCreatives");
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
 **getCreativesRequestWrapper** | [**GetCreativesRequestWrapper**](GetCreativesRequestWrapper.md)|  |

### Return type

[**GetCreativesResponseWrapper**](GetCreativesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getFormatTemplates

> GetFormatTemplatesResponseWrapper getFormatTemplates(getFormatTemplatesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        GetFormatTemplatesRequestWrapper getFormatTemplatesRequestWrapper = new GetFormatTemplatesRequestWrapper(); // GetFormatTemplatesRequestWrapper | 
        try {
            GetFormatTemplatesResponseWrapper result = apiInstance.getFormatTemplates(getFormatTemplatesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#getFormatTemplates");
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
 **getFormatTemplatesRequestWrapper** | [**GetFormatTemplatesRequestWrapper**](GetFormatTemplatesRequestWrapper.md)|  |

### Return type

[**GetFormatTemplatesResponseWrapper**](GetFormatTemplatesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCreativeGroup

> UpdateCreativeGroupResponseWrapper updateCreativeGroup(updateCreativeGroupRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        UpdateCreativeGroupRequestWrapper updateCreativeGroupRequestWrapper = new UpdateCreativeGroupRequestWrapper(); // UpdateCreativeGroupRequestWrapper | 
        try {
            UpdateCreativeGroupResponseWrapper result = apiInstance.updateCreativeGroup(updateCreativeGroupRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#updateCreativeGroup");
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
 **updateCreativeGroupRequestWrapper** | [**UpdateCreativeGroupRequestWrapper**](UpdateCreativeGroupRequestWrapper.md)|  |

### Return type

[**UpdateCreativeGroupResponseWrapper**](UpdateCreativeGroupResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## updateCreatives

> UpdateCreativesResponseWrapper updateCreatives(updateCreativesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dpacreative.api.DpaCreativeService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DpaCreativeService apiInstance = new DpaCreativeService(defaultClient);
        UpdateCreativesRequestWrapper updateCreativesRequestWrapper = new UpdateCreativesRequestWrapper(); // UpdateCreativesRequestWrapper | 
        try {
            UpdateCreativesResponseWrapper result = apiInstance.updateCreatives(updateCreativesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DpaCreativeService#updateCreatives");
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
 **updateCreativesRequestWrapper** | [**UpdateCreativesRequestWrapper**](UpdateCreativesRequestWrapper.md)|  |

### Return type

[**UpdateCreativesResponseWrapper**](UpdateCreativesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

