# baiduads.VideoEditerService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smart_audio**](VideoEditerService.md#smart_audio) | **POST** /json/sms/service/VideoEditerService/smartAudio | 
[**smart_music**](VideoEditerService.md#smart_music) | **POST** /json/sms/service/VideoEditerService/smartMusic | 


# **smart_audio**
> SmartAudioResponseWrapper smart_audio(smart_audio_request_wrapper)



### Example


```python
import time
import baiduads
from videoediter.api import video_editer_service
from baiduads.videoediter.model.smart_audio_request_wrapper import SmartAudioRequestWrapper
from baiduads.videoediter.model.smart_audio_response_wrapper import SmartAudioResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_editer_service.VideoEditerService(api_client)
    smart_audio_request_wrapper = SmartAudioRequestWrapper(
        header=ApiRequestHeader(),
        body=SmartAudioRequest(
            url="url_example",
        ),
    ) # SmartAudioRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.smart_audio(smart_audio_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoEditerService->smart_audio: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smart_audio_request_wrapper** | [**SmartAudioRequestWrapper**](SmartAudioRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_music**
> SmartMusicResponseWrapper smart_music(smart_music_request_wrapper)



### Example


```python
import time
import baiduads
from videoediter.api import video_editer_service
from baiduads.videoediter.model.smart_music_request_wrapper import SmartMusicRequestWrapper
from baiduads.videoediter.model.smart_music_response_wrapper import SmartMusicResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_editer_service.VideoEditerService(api_client)
    smart_music_request_wrapper = SmartMusicRequestWrapper(
        header=ApiRequestHeader(),
        body=SmartMusicRequest(
            videoid=1,
            volume=3.14,
            video_being_second=3.14,
            music_begin_second=3.14,
            music_end_second=3.14,
            music_url="music_url_example",
            music_volume=3.14,
        ),
    ) # SmartMusicRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.smart_music(smart_music_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoEditerService->smart_music: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smart_music_request_wrapper** | [**SmartMusicRequestWrapper**](SmartMusicRequestWrapper.md)|  |

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
**200** | response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

