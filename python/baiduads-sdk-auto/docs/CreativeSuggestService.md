# baiduads.CreativeSuggestService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_creative_segment_recommend**](CreativeSuggestService.md#get_creative_segment_recommend) | **POST** /json/sms/service/CreativeSuggestService/getCreativeSegmentRecommend | 


# **get_creative_segment_recommend**
> GetCreativeSegmentRecommendResponseWrapper get_creative_segment_recommend(get_creative_segment_recommend_request_wrapper)



### Example


```python
import time
import baiduads
from creativesuggest.api import creative_suggest_service
from baiduads.creativesuggest.model.get_creative_segment_recommend_request_wrapper import GetCreativeSegmentRecommendRequestWrapper
from baiduads.creativesuggest.model.get_creative_segment_recommend_response_wrapper import GetCreativeSegmentRecommendResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = creative_suggest_service.CreativeSuggestService(api_client)
    get_creative_segment_recommend_request_wrapper = GetCreativeSegmentRecommendRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeSegmentRecommendRequest(
            campaign_ids=[
                1,
            ],
            adgroup_ids=[
                1,
            ],
            segment_types=[
                1,
            ],
        ),
    ) # GetCreativeSegmentRecommendRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_segment_recommend(get_creative_segment_recommend_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CreativeSuggestService->get_creative_segment_recommend: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_segment_recommend_request_wrapper** | [**GetCreativeSegmentRecommendRequestWrapper**](GetCreativeSegmentRecommendRequestWrapper.md)|  |

### Return type

[**GetCreativeSegmentRecommendResponseWrapper**](GetCreativeSegmentRecommendResponseWrapper.md)

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

