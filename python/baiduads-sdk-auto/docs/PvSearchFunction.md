# baiduads.PvSearchFunction

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_pv_search**](PvSearchFunction.md#get_pv_search) | **POST** /json/sms/service/PvSearchFunction/getPvSearch | 


# **get_pv_search**
> GetPvSearchResponseWrapper get_pv_search(get_pv_search_request_wrapper)



### Example


```python
import time
import baiduads
from pvsearchfunction.api import pv_search_function
from baiduads.pvsearchfunction.model.get_pv_search_response_wrapper import GetPvSearchResponseWrapper
from baiduads.pvsearchfunction.model.get_pv_search_request_wrapper import GetPvSearchRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pv_search_function.PvSearchFunction(api_client)
    get_pv_search_request_wrapper = GetPvSearchRequestWrapper(
        header=ApiRequestHeader(),
        body=PvSearchRequest(
            bid_word_source="bid_word_source_example",
            device=1,
            order_by="order_by_example",
            order="order_example",
            keyword_list=[
                PvSearchRequestWordItem(
                    keyword_name="keyword_name_example",
                    match_type=1,
                    phrase_type=1,
                ),
            ],
        ),
    ) # GetPvSearchRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_pv_search(get_pv_search_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PvSearchFunction->get_pv_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_pv_search_request_wrapper** | [**GetPvSearchRequestWrapper**](GetPvSearchRequestWrapper.md)|  |

### Return type

[**GetPvSearchResponseWrapper**](GetPvSearchResponseWrapper.md)

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

