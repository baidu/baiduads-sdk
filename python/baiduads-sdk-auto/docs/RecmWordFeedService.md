# baiduads.RecmWordFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_recm_word**](RecmWordFeedService.md#get_recm_word) | **POST** /json/feed/v1/RecmWordFeedService/getRecmWord | 


# **get_recm_word**
> GetRecmWordResponseWrapper get_recm_word(get_recm_word_request_wrapper)



### Example


```python
import time
import baiduads
from recmwordfeed.api import recm_word_feed_service
from baiduads.recmwordfeed.model.get_recm_word_response_wrapper import GetRecmWordResponseWrapper
from baiduads.recmwordfeed.model.get_recm_word_request_wrapper import GetRecmWordRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = recm_word_feed_service.RecmWordFeedService(api_client)
    get_recm_word_request_wrapper = GetRecmWordRequestWrapper(
        header=ApiRequestHeader(),
        body=RecmWordRequest(
            query=[
                "query_example",
            ],
            contains=[
                "contains_example",
            ],
            n_contains=[
                "n_contains_example",
            ],
            sort_field="sort_field_example",
            sort_order="sort_order_example",
        ),
    ) # GetRecmWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_recm_word(get_recm_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RecmWordFeedService->get_recm_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_recm_word_request_wrapper** | [**GetRecmWordRequestWrapper**](GetRecmWordRequestWrapper.md)|  |

### Return type

[**GetRecmWordResponseWrapper**](GetRecmWordResponseWrapper.md)

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

