# baiduads.AppFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_js_kp_app_list**](AppFeedService.md#get_js_kp_app_list) | **POST** /json/feed/v1/AppFeedService/getJsKpAppList | 


# **get_js_kp_app_list**
> GetJsKpAppListResponseWrapper get_js_kp_app_list(get_js_kp_app_list_request_wrapper)



### Example


```python
import time
import baiduads
from appfeed.api import app_feed_service
from baiduads.appfeed.model.get_js_kp_app_list_request_wrapper import GetJsKpAppListRequestWrapper
from baiduads.appfeed.model.get_js_kp_app_list_response_wrapper import GetJsKpAppListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = app_feed_service.AppFeedService(api_client)
    get_js_kp_app_list_request_wrapper = GetJsKpAppListRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetJsKpAppListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_js_kp_app_list(get_js_kp_app_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AppFeedService->get_js_kp_app_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_js_kp_app_list_request_wrapper** | [**GetJsKpAppListRequestWrapper**](GetJsKpAppListRequestWrapper.md)|  |

### Return type

[**GetJsKpAppListResponseWrapper**](GetJsKpAppListResponseWrapper.md)

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

