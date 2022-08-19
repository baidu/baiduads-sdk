# GrowthPowerService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGrowthPowerDetail**](GrowthPowerService.md#getGrowthPowerDetail) | **POST** /json/sms/service/GrowthPowerService/getGrowthPowerDetail | 
[**getGrowthPowerOverview**](GrowthPowerService.md#getGrowthPowerOverview) | **POST** /json/sms/service/GrowthPowerService/getGrowthPowerOverview | 



## getGrowthPowerDetail

> GetGrowthPowerDetailResponseWrapper getGrowthPowerDetail(getGrowthPowerDetailRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.growthpower.api.GrowthPowerService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        GrowthPowerService apiInstance = new GrowthPowerService(defaultClient);
        GetGrowthPowerDetailRequestWrapper getGrowthPowerDetailRequestWrapper = new GetGrowthPowerDetailRequestWrapper(); // GetGrowthPowerDetailRequestWrapper | 
        try {
            GetGrowthPowerDetailResponseWrapper result = apiInstance.getGrowthPowerDetail(getGrowthPowerDetailRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GrowthPowerService#getGrowthPowerDetail");
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
 **getGrowthPowerDetailRequestWrapper** | [**GetGrowthPowerDetailRequestWrapper**](GetGrowthPowerDetailRequestWrapper.md)|  |

### Return type

[**GetGrowthPowerDetailResponseWrapper**](GetGrowthPowerDetailResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getGrowthPowerOverview

> GetGrowthPowerOverviewResponseWrapper getGrowthPowerOverview(getGrowthPowerOverviewRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.growthpower.api.GrowthPowerService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        GrowthPowerService apiInstance = new GrowthPowerService(defaultClient);
        GetGrowthPowerOverviewRequestWrapper getGrowthPowerOverviewRequestWrapper = new GetGrowthPowerOverviewRequestWrapper(); // GetGrowthPowerOverviewRequestWrapper | 
        try {
            GetGrowthPowerOverviewResponseWrapper result = apiInstance.getGrowthPowerOverview(getGrowthPowerOverviewRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GrowthPowerService#getGrowthPowerOverview");
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
 **getGrowthPowerOverviewRequestWrapper** | [**GetGrowthPowerOverviewRequestWrapper**](GetGrowthPowerOverviewRequestWrapper.md)|  |

### Return type

[**GetGrowthPowerOverviewResponseWrapper**](GetGrowthPowerOverviewResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

