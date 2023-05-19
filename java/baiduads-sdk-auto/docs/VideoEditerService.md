# VideoEditerService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smartAudio**](VideoEditerService.md#smartAudio) | **POST** /json/sms/service/VideoEditerService/smartAudio | 
[**smartMusic**](VideoEditerService.md#smartMusic) | **POST** /json/sms/service/VideoEditerService/smartMusic | 



## smartAudio

> SmartAudioResponseWrapper smartAudio(smartAudioRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videoediter.api.VideoEditerService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoEditerService apiInstance = new VideoEditerService(defaultClient);
        SmartAudioRequestWrapper smartAudioRequestWrapper = new SmartAudioRequestWrapper(); // SmartAudioRequestWrapper | 
        try {
            SmartAudioResponseWrapper result = apiInstance.smartAudio(smartAudioRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoEditerService#smartAudio");
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
 **smartAudioRequestWrapper** | [**SmartAudioRequestWrapper**](SmartAudioRequestWrapper.md)|  |

### Return type

[**SmartAudioResponseWrapper**](SmartAudioResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |


## smartMusic

> SmartMusicResponseWrapper smartMusic(smartMusicRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.videoediter.api.VideoEditerService;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        VideoEditerService apiInstance = new VideoEditerService(defaultClient);
        SmartMusicRequestWrapper smartMusicRequestWrapper = new SmartMusicRequestWrapper(); // SmartMusicRequestWrapper | 
        try {
            SmartMusicResponseWrapper result = apiInstance.smartMusic(smartMusicRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VideoEditerService#smartMusic");
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
 **smartMusicRequestWrapper** | [**SmartMusicRequestWrapper**](SmartMusicRequestWrapper.md)|  |

### Return type

[**SmartMusicResponseWrapper**](SmartMusicResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

