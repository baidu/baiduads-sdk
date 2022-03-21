# AppCenterJobService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBatchPackages**](AppCenterJobService.md#addBatchPackages) | **POST** /json/sms/service/AppCenterJobService/addBatchPackages | 
[**getBatchJobDetails**](AppCenterJobService.md#getBatchJobDetails) | **POST** /json/sms/service/AppCenterJobService/getBatchJobDetails | 
[**getBatchJobListResults**](AppCenterJobService.md#getBatchJobListResults) | **POST** /json/sms/service/AppCenterJobService/getBatchJobListResults | 



## addBatchPackages

> AddBatchPackagesResponseWrapper addBatchPackages(addBatchPackagesRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.appcenterjob.api.AppCenterJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AppCenterJobService apiInstance = new AppCenterJobService(defaultClient);
        AddBatchPackagesRequestWrapper addBatchPackagesRequestWrapper = new AddBatchPackagesRequestWrapper(); // AddBatchPackagesRequestWrapper | 
        try {
            AddBatchPackagesResponseWrapper result = apiInstance.addBatchPackages(addBatchPackagesRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCenterJobService#addBatchPackages");
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
 **addBatchPackagesRequestWrapper** | [**AddBatchPackagesRequestWrapper**](AddBatchPackagesRequestWrapper.md)|  |

### Return type

[**AddBatchPackagesResponseWrapper**](AddBatchPackagesResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getBatchJobDetails

> GetBatchJobDetailsResponseWrapper getBatchJobDetails(getBatchJobDetailsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.appcenterjob.api.AppCenterJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AppCenterJobService apiInstance = new AppCenterJobService(defaultClient);
        GetBatchJobDetailsRequestWrapper getBatchJobDetailsRequestWrapper = new GetBatchJobDetailsRequestWrapper(); // GetBatchJobDetailsRequestWrapper | 
        try {
            GetBatchJobDetailsResponseWrapper result = apiInstance.getBatchJobDetails(getBatchJobDetailsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCenterJobService#getBatchJobDetails");
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
 **getBatchJobDetailsRequestWrapper** | [**GetBatchJobDetailsRequestWrapper**](GetBatchJobDetailsRequestWrapper.md)|  |

### Return type

[**GetBatchJobDetailsResponseWrapper**](GetBatchJobDetailsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getBatchJobListResults

> GetBatchJobListResultsResponseWrapper getBatchJobListResults(getBatchJobListResultsRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.appcenterjob.api.AppCenterJobService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        AppCenterJobService apiInstance = new AppCenterJobService(defaultClient);
        GetBatchJobListResultsRequestWrapper getBatchJobListResultsRequestWrapper = new GetBatchJobListResultsRequestWrapper(); // GetBatchJobListResultsRequestWrapper | 
        try {
            GetBatchJobListResultsResponseWrapper result = apiInstance.getBatchJobListResults(getBatchJobListResultsRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCenterJobService#getBatchJobListResults");
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
 **getBatchJobListResultsRequestWrapper** | [**GetBatchJobListResultsRequestWrapper**](GetBatchJobListResultsRequestWrapper.md)|  |

### Return type

[**GetBatchJobListResultsResponseWrapper**](GetBatchJobListResultsResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

