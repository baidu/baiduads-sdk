# baiduads.MusicAPI

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**upload_music**](MusicAPI.md#upload_music) | **POST** /json/sms/service/MusicAPI/uploadMusic | 


# **upload_music**
> UploadMusicResponseWrapper upload_music(upload_music_request_wrapper)



### Example


```python
import time
import baiduads
from musicapi.api import music_api
from baiduads.musicapi.model.upload_music_response_wrapper import UploadMusicResponseWrapper
from baiduads.musicapi.model.upload_music_request_wrapper import UploadMusicRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = music_api.MusicAPI(api_client)
    upload_music_request_wrapper = UploadMusicRequestWrapper(
        header=ApiRequestHeader(),
        body=UploadMusicRequest(
            file_name="file_name_example",
            base64="base64_example",
        ),
    ) # UploadMusicRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.upload_music(upload_music_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MusicAPI->upload_music: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_music_request_wrapper** | [**UploadMusicRequestWrapper**](UploadMusicRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

