# VideoDataService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLabelData**](VideoDataService.md#getLabelData) | **POST** /json/sms/service/VideoDataService/getLabelData | 
[**getSecondLevelData**](VideoDataService.md#getSecondLevelData) | **POST** /json/sms/service/VideoDataService/getSecondLevelData | 



## getLabelData

> GetLabelDataResponseWrapper getLabelData(getLabelDataRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videodata.api.VideoDataService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoDataService apiInstance = new VideoDataService(defaultClient);
        GetLabelDataRequestWrapper getLabelDataRequestWrapper = new GetLabelDataRequestWrapper(); // GetLabelDataRequestWrapper | 
        try {
            GetLabelDataResponseWrapper result = apiInstance.getLabelData(getLabelDataRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoDataService#getLabelData");
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
 **getLabelDataRequestWrapper** | [**GetLabelDataRequestWrapper**](GetLabelDataRequestWrapper.md)|  |

### Return type

[**GetLabelDataResponseWrapper**](GetLabelDataResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getSecondLevelData

> GetSecondLevelDataResponseWrapper getSecondLevelData(getSecondLevelDataRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videodata.api.VideoDataService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoDataService apiInstance = new VideoDataService(defaultClient);
        GetSecondLevelDataRequestWrapper getSecondLevelDataRequestWrapper = new GetSecondLevelDataRequestWrapper(); // GetSecondLevelDataRequestWrapper | 
        try {
            GetSecondLevelDataResponseWrapper result = apiInstance.getSecondLevelData(getSecondLevelDataRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoDataService#getSecondLevelData");
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
 **getSecondLevelDataRequestWrapper** | [**GetSecondLevelDataRequestWrapper**](GetSecondLevelDataRequestWrapper.md)|  |

### Return type

[**GetSecondLevelDataResponseWrapper**](GetSecondLevelDataResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

