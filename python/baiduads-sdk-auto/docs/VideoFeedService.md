# baiduads.VideoFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_video_text_feed**](VideoFeedService.md#get_video_text_feed) | **POST** /json/feed/v1/VideoFeedService/getVideoTextFeed | 


# **get_video_text_feed**
> GetVideoTextFeedResponseWrapper get_video_text_feed(get_video_text_feed_request_wrapper)



### Example


```python
import time
import baiduads
from videofeed.api import video_feed_service
from baiduads.videofeed.model.get_video_text_feed_response_wrapper import GetVideoTextFeedResponseWrapper
from baiduads.videofeed.model.get_video_text_feed_request_wrapper import GetVideoTextFeedRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_feed_service.VideoFeedService(api_client)
    get_video_text_feed_request_wrapper = GetVideoTextFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoTextFeedRequest(
            title="title_example",
        ),
    ) # GetVideoTextFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_video_text_feed(get_video_text_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoFeedService->get_video_text_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_video_text_feed_request_wrapper** | [**GetVideoTextFeedRequestWrapper**](GetVideoTextFeedRequestWrapper.md)|  |

### Return type

[**GetVideoTextFeedResponseWrapper**](GetVideoTextFeedResponseWrapper.md)

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

