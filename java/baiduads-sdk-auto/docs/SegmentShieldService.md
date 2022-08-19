# SegmentShieldService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSegmentShield**](SegmentShieldService.md#addSegmentShield) | **POST** /json/sms/service/SegmentShieldService/addSegmentShield | 
[**getSegmentShieldPage**](SegmentShieldService.md#getSegmentShieldPage) | **POST** /json/sms/service/SegmentShieldService/getSegmentShieldPage | 



## addSegmentShield

> AddSegmentShieldResponseWrapper addSegmentShield(addSegmentShieldRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.segmentshield.api.SegmentShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SegmentShieldService apiInstance = new SegmentShieldService(defaultClient);
        AddSegmentShieldRequestWrapper addSegmentShieldRequestWrapper = new AddSegmentShieldRequestWrapper(); // AddSegmentShieldRequestWrapper | 
        try {
            AddSegmentShieldResponseWrapper result = apiInstance.addSegmentShield(addSegmentShieldRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentShieldService#addSegmentShield");
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
 **addSegmentShieldRequestWrapper** | [**AddSegmentShieldRequestWrapper**](AddSegmentShieldRequestWrapper.md)|  |

### Return type

[**AddSegmentShieldResponseWrapper**](AddSegmentShieldResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## getSegmentShieldPage

> GetSegmentShieldPageResponseWrapper getSegmentShieldPage(getSegmentShieldPageRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.segmentshield.api.SegmentShieldService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        SegmentShieldService apiInstance = new SegmentShieldService(defaultClient);
        GetSegmentShieldPageRequestWrapper getSegmentShieldPageRequestWrapper = new GetSegmentShieldPageRequestWrapper(); // GetSegmentShieldPageRequestWrapper | 
        try {
            GetSegmentShieldPageResponseWrapper result = apiInstance.getSegmentShieldPage(getSegmentShieldPageRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SegmentShieldService#getSegmentShieldPage");
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
 **getSegmentShieldPageRequestWrapper** | [**GetSegmentShieldPageRequestWrapper**](GetSegmentShieldPageRequestWrapper.md)|  |

### Return type

[**GetSegmentShieldPageResponseWrapper**](GetSegmentShieldPageResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

