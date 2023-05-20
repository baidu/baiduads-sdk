# baiduads.PageService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_broad_cast_pages**](PageService.md#get_broad_cast_pages) | **POST** /json/sms/service/PageService/getBroadCastPages | 


# **get_broad_cast_pages**
> GetBroadCastPagesResponseWrapper get_broad_cast_pages(get_broad_cast_pages_request_wrapper)



### Example


```python
import time
import baiduads
from page.api import page_service
from baiduads.page.model.get_broad_cast_pages_response_wrapper import GetBroadCastPagesResponseWrapper
from baiduads.page.model.get_broad_cast_pages_request_wrapper import GetBroadCastPagesRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = page_service.PageService(api_client)
    get_broad_cast_pages_request_wrapper = GetBroadCastPagesRequestWrapper(
        header=ApiRequestHeader(),
        body=BroadCastQueryRequest(
            live_room_title="live_room_title_example",
            anchor_name="anchor_name_example",
            live_url="live_url_example",
            status=[
                1,
            ],
        ),
    ) # GetBroadCastPagesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_broad_cast_pages(get_broad_cast_pages_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PageService->get_broad_cast_pages: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_broad_cast_pages_request_wrapper** | [**GetBroadCastPagesRequestWrapper**](GetBroadCastPagesRequestWrapper.md)|  |

### Return type

[**GetBroadCastPagesResponseWrapper**](GetBroadCastPagesResponseWrapper.md)

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

