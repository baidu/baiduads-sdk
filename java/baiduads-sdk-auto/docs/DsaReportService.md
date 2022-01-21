# DsaReportService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCreativeDetailReport**](DsaReportService.md#getCreativeDetailReport) | **POST** /json/ao/v1/DSAReportService/getCreativeDetailReport | 
[**getCreativeGroupDetailReport**](DsaReportService.md#getCreativeGroupDetailReport) | **POST** /json/ao/v1/DSAReportService/getCreativeGroupDetailReport | 
[**getCreativeGroupReport**](DsaReportService.md#getCreativeGroupReport) | **POST** /json/ao/v1/DSAReportService/getCreativeGroupReport | 
[**getProductDetailReport**](DsaReportService.md#getProductDetailReport) | **POST** /json/ao/v1/DSAReportService/getProductDetailReport | 



## getCreativeDetailReport

> GetCreativeDetailReportResponseWrapper getCreativeDetailReport(getCreativeDetailReportRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dsareport.api.DsaReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DsaReportService apiInstance = new DsaReportService(defaultClient);
        GetCreativeDetailReportRequestWrapper getCreativeDetailReportRequestWrapper = new GetCreativeDetailReportRequestWrapper(); // GetCreativeDetailReportRequestWrapper | 
        try {
            GetCreativeDetailReportResponseWrapper result = apiInstance.getCreativeDetailReport(getCreativeDetailReportRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DsaReportService#getCreativeDetailReport");
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
 **getCreativeDetailReportRequestWrapper** | [**GetCreativeDetailReportRequestWrapper**](GetCreativeDetailReportRequestWrapper.md)|  |

### Return type

[**GetCreativeDetailReportResponseWrapper**](GetCreativeDetailReportResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreativeGroupDetailReport

> GetCreativeGroupDetailReportResponseWrapper getCreativeGroupDetailReport(getCreativeGroupDetailReportRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dsareport.api.DsaReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DsaReportService apiInstance = new DsaReportService(defaultClient);
        GetCreativeGroupDetailReportRequestWrapper getCreativeGroupDetailReportRequestWrapper = new GetCreativeGroupDetailReportRequestWrapper(); // GetCreativeGroupDetailReportRequestWrapper | 
        try {
            GetCreativeGroupDetailReportResponseWrapper result = apiInstance.getCreativeGroupDetailReport(getCreativeGroupDetailReportRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DsaReportService#getCreativeGroupDetailReport");
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
 **getCreativeGroupDetailReportRequestWrapper** | [**GetCreativeGroupDetailReportRequestWrapper**](GetCreativeGroupDetailReportRequestWrapper.md)|  |

### Return type

[**GetCreativeGroupDetailReportResponseWrapper**](GetCreativeGroupDetailReportResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getCreativeGroupReport

> GetCreativeGroupReportResponseWrapper getCreativeGroupReport(getCreativeGroupReportRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dsareport.api.DsaReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DsaReportService apiInstance = new DsaReportService(defaultClient);
        GetCreativeGroupReportRequestWrapper getCreativeGroupReportRequestWrapper = new GetCreativeGroupReportRequestWrapper(); // GetCreativeGroupReportRequestWrapper | 
        try {
            GetCreativeGroupReportResponseWrapper result = apiInstance.getCreativeGroupReport(getCreativeGroupReportRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DsaReportService#getCreativeGroupReport");
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
 **getCreativeGroupReportRequestWrapper** | [**GetCreativeGroupReportRequestWrapper**](GetCreativeGroupReportRequestWrapper.md)|  |

### Return type

[**GetCreativeGroupReportResponseWrapper**](GetCreativeGroupReportResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getProductDetailReport

> GetProductDetailReportResponseWrapper getProductDetailReport(getProductDetailReportRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.dsareport.api.DsaReportService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        DsaReportService apiInstance = new DsaReportService(defaultClient);
        GetProductDetailReportRequestWrapper getProductDetailReportRequestWrapper = new GetProductDetailReportRequestWrapper(); // GetProductDetailReportRequestWrapper | 
        try {
            GetProductDetailReportResponseWrapper result = apiInstance.getProductDetailReport(getProductDetailReportRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DsaReportService#getProductDetailReport");
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
 **getProductDetailReportRequestWrapper** | [**GetProductDetailReportRequestWrapper**](GetProductDetailReportRequestWrapper.md)|  |

### Return type

[**GetProductDetailReportResponseWrapper**](GetProductDetailReportResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

