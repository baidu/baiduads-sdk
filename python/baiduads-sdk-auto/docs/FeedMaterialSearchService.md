# baiduads.FeedMaterialSearchService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_material_info_by_search**](FeedMaterialSearchService.md#get_material_info_by_search) | **POST** /json/sms/service/FeedMaterialSearchService/getMaterialInfoBySearch | 


# **get_material_info_by_search**
> GetMaterialInfoBySearchResponseWrapper get_material_info_by_search(get_material_info_by_search_request_wrapper)



### Example


```python
import time
import baiduads
from feedmaterialsearch.api import feed_material_search_service
from baiduads.feedmaterialsearch.model.get_material_info_by_search_request_wrapper import GetMaterialInfoBySearchRequestWrapper
from baiduads.feedmaterialsearch.model.get_material_info_by_search_response_wrapper import GetMaterialInfoBySearchResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = feed_material_search_service.FeedMaterialSearchService(api_client)
    get_material_info_by_search_request_wrapper = GetMaterialInfoBySearchRequestWrapper(
        header=ApiRequestHeader(),
        body=FeedMaterialSearchRequest(
            material_search_name="material_search_name_example",
            page_num=1,
            page_size=1,
            search_type=1,
            search_level=1,
            material_fields=[
                "material_fields_example",
            ],
        ),
    ) # GetMaterialInfoBySearchRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_material_info_by_search(get_material_info_by_search_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FeedMaterialSearchService->get_material_info_by_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_material_info_by_search_request_wrapper** | [**GetMaterialInfoBySearchRequestWrapper**](GetMaterialInfoBySearchRequestWrapper.md)|  |

### Return type

[**GetMaterialInfoBySearchResponseWrapper**](GetMaterialInfoBySearchResponseWrapper.md)

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

