# baiduads.OptimizationCenterService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_adgroup_recommend_hot_query_word**](OptimizationCenterService.md#get_adgroup_recommend_hot_query_word) | **POST** /json/sms/service/OptimizationCenterService/getAdgroupRecommendHotQueryWord | 


# **get_adgroup_recommend_hot_query_word**
> GetAdgroupRecommendHotQueryWordResponseWrapper get_adgroup_recommend_hot_query_word(get_adgroup_recommend_hot_query_word_request_wrapper)



### Example


```python
import time
import baiduads
from optimizationcenter.api import optimization_center_service
from baiduads.optimizationcenter.model.get_adgroup_recommend_hot_query_word_response_wrapper import GetAdgroupRecommendHotQueryWordResponseWrapper
from baiduads.optimizationcenter.model.get_adgroup_recommend_hot_query_word_request_wrapper import GetAdgroupRecommendHotQueryWordRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = optimization_center_service.OptimizationCenterService(api_client)
    get_adgroup_recommend_hot_query_word_request_wrapper = GetAdgroupRecommendHotQueryWordRequestWrapper(
        header=ApiRequestHeader(),
        body=AdgroupRecommendHotQueryWordQueryRequest(
            adgroup_id=1,
            status=1,
        ),
    ) # GetAdgroupRecommendHotQueryWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_adgroup_recommend_hot_query_word(get_adgroup_recommend_hot_query_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OptimizationCenterService->get_adgroup_recommend_hot_query_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_adgroup_recommend_hot_query_word_request_wrapper** | [**GetAdgroupRecommendHotQueryWordRequestWrapper**](GetAdgroupRecommendHotQueryWordRequestWrapper.md)|  |

### Return type

[**GetAdgroupRecommendHotQueryWordResponseWrapper**](GetAdgroupRecommendHotQueryWordResponseWrapper.md)

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

