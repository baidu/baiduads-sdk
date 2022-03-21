# baiduads.TraceUrlService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_promotion_urls**](TraceUrlService.md#get_promotion_urls) | **POST** /json/sms/service/TraceUrlService/getPromotionUrls | 


# **get_promotion_urls**
> GetPromotionUrlsResponseWrapper get_promotion_urls(get_promotion_urls_request_wrapper)



### Example


```python
import time
import baiduads
from traceurl.api import trace_url_service
from baiduads.traceurl.model.get_promotion_urls_response_wrapper import GetPromotionUrlsResponseWrapper
from baiduads.traceurl.model.get_promotion_urls_request_wrapper import GetPromotionUrlsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = trace_url_service.TraceUrlService(api_client)
    get_promotion_urls_request_wrapper = GetPromotionUrlsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetPromotionUrlRequest(
            opt_from=1,
            show_type=1,
            limit=[
                1,
            ],
        ),
    ) # GetPromotionUrlsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_promotion_urls(get_promotion_urls_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling TraceUrlService->get_promotion_urls: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_promotion_urls_request_wrapper** | [**GetPromotionUrlsRequestWrapper**](GetPromotionUrlsRequestWrapper.md)|  |

### Return type

[**GetPromotionUrlsResponseWrapper**](GetPromotionUrlsResponseWrapper.md)

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

