# baiduads.VideoContentService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**query_content**](VideoContentService.md#query_content) | **POST** /json/sms/service/VideoContentService/queryContent | 


# **query_content**
> QueryContentResponseWrapper query_content(query_content_request_wrapper)



### Example


```python
import time
import baiduads
from videocontent.api import video_content_service
from baiduads.videocontent.model.query_content_request_wrapper import QueryContentRequestWrapper
from baiduads.videocontent.model.query_content_response_wrapper import QueryContentResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_content_service.VideoContentService(api_client)
    query_content_request_wrapper = QueryContentRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoContentSelector(
            fields=[
                {},
            ],
            page=Page(
                offset=1,
                numbers=1,
            ),
            predicates=[
                {},
            ],
            orderby={},
            query_fields=[
                {},
            ],
            predicate_fields=[
                {},
            ],
            order_fields=[
                {},
            ],
            http_protocol="http_protocol_example",
        ),
    ) # QueryContentRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_content(query_content_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoContentService->query_content: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_content_request_wrapper** | [**QueryContentRequestWrapper**](QueryContentRequestWrapper.md)|  |

### Return type

[**QueryContentResponseWrapper**](QueryContentResponseWrapper.md)

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

