# baiduads.WordMaterialService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](WordMaterialService.md#search) | **POST** /json/sms/service/WordMaterialService/search | 


# **search**
> SearchResponseWrapper search(search_request_wrapper)



### Example


```python
import time
import baiduads
from wordmaterial.api import word_material_service
from baiduads.wordmaterial.model.search_request_wrapper import SearchRequestWrapper
from baiduads.wordmaterial.model.search_response_wrapper import SearchResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = word_material_service.WordMaterialService(api_client)
    search_request_wrapper = SearchRequestWrapper(
        header=ApiRequestHeader(),
        body=WordSearchRequest(
            query="query_example",
            industry="industry_example",
            page_no=1,
            page_size=1,
        ),
    ) # SearchRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.search(search_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WordMaterialService->search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_request_wrapper** | [**SearchRequestWrapper**](SearchRequestWrapper.md)|  |

### Return type

[**SearchResponseWrapper**](SearchResponseWrapper.md)

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

