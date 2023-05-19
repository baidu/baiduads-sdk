# MusicApi

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadMusic**](MusicApi.md#uploadMusic) | **POST** /json/sms/service/MusicAPI/uploadMusic | 



## uploadMusic

> UploadMusicResponseWrapper uploadMusic(uploadMusicRequestWrapper)



### Example

```java
// Import classes:
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.invoke.models.*;
import com.baidu.dev2.api.sdk.musicapi.api.MusicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.baidu.com");

        MusicApi apiInstance = new MusicApi(defaultClient);
        UploadMusicRequestWrapper uploadMusicRequestWrapper = new UploadMusicRequestWrapper(); // UploadMusicRequestWrapper | 
        try {
            UploadMusicResponseWrapper result = apiInstance.uploadMusic(uploadMusicRequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MusicApi#uploadMusic");
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
 **uploadMusicRequestWrapper** | [**UploadMusicRequestWrapper**](UploadMusicRequestWrapper.md)|  |

### Return type

[**UploadMusicResponseWrapper**](UploadMusicResponseWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |

