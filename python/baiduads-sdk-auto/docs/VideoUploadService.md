# baiduads.VideoUploadService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_video**](VideoUploadService.md#add_video) | **POST** /json/sms/service/VideoUploadService/addVideo | 


# **add_video**
> AddVideoResponseWrapper add_video(add_video_request_wrapper)



### Example


```python
import time
import baiduads
from videoupload.api import video_upload_service
from baiduads.videoupload.model.add_video_request_wrapper import AddVideoRequestWrapper
from baiduads.videoupload.model.add_video_response_wrapper import AddVideoResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_upload_service.VideoUploadService(api_client)
    add_video_request_wrapper = AddVideoRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoAddByBosUrl(
            file_url="file_url_example",
            file_md5="file_md5_example",
            video_name="video_name_example",
            source=1,
            format="format_example",
            http_protocol="http_protocol_example",
            add_video=True,
        ),
    ) # AddVideoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_video(add_video_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoUploadService->add_video: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_video_request_wrapper** | [**AddVideoRequestWrapper**](AddVideoRequestWrapper.md)|  |

### Return type

[**AddVideoResponseWrapper**](AddVideoResponseWrapper.md)

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

