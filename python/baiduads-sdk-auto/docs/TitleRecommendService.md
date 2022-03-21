# baiduads.TitleRecommendService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_title**](TitleRecommendService.md#get_title) | **POST** /json/feed/v1/TitleRecommendService/getTitle | 


# **get_title**
> GetTitleResponseWrapper get_title(get_title_request_wrapper)



### Example


```python
import time
import baiduads
from titlerecommend.api import title_recommend_service
from baiduads.titlerecommend.model.get_title_response_wrapper import GetTitleResponseWrapper
from baiduads.titlerecommend.model.get_title_request_wrapper import GetTitleRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = title_recommend_service.TitleRecommendService(api_client)
    get_title_request_wrapper = GetTitleRequestWrapper(
        header=ApiRequestHeader(),
        body=GetTitleRequest(
            adgroup_id=1,
            query="query_example",
            limit=1,
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    values=[
                        {},
                    ],
                ),
            ],
            org_title="org_title_example",
            src="src_example",
            query_type=1,
            length_level=1,
            sort_field="sort_field_example",
            sort_order="sort_order_example",
            page_no=1,
            page_size=1,
        ),
    ) # GetTitleRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_title(get_title_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling TitleRecommendService->get_title: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_title_request_wrapper** | [**GetTitleRequestWrapper**](GetTitleRequestWrapper.md)|  |

### Return type

[**GetTitleResponseWrapper**](GetTitleResponseWrapper.md)

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

