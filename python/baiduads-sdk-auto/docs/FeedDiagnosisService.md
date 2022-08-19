# baiduads.FeedDiagnosisService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**query_feed_unit_diagnosis_detail**](FeedDiagnosisService.md#query_feed_unit_diagnosis_detail) | **POST** /json/sms/service/FeedDiagnosisService/queryFeedUnitDiagnosisDetail | 


# **query_feed_unit_diagnosis_detail**
> QueryFeedUnitDiagnosisDetailResponseWrapper query_feed_unit_diagnosis_detail(query_feed_unit_diagnosis_detail_request_wrapper)



### Example


```python
import time
import baiduads
from feeddiagnosis.api import feed_diagnosis_service
from baiduads.feeddiagnosis.model.query_feed_unit_diagnosis_detail_response_wrapper import QueryFeedUnitDiagnosisDetailResponseWrapper
from baiduads.feeddiagnosis.model.query_feed_unit_diagnosis_detail_request_wrapper import QueryFeedUnitDiagnosisDetailRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = feed_diagnosis_service.FeedDiagnosisService(api_client)
    query_feed_unit_diagnosis_detail_request_wrapper = QueryFeedUnitDiagnosisDetailRequestWrapper(
        header=ApiRequestHeader(),
        body=FeedUnitDiagnosisDetailRequest(
            adgroup_feed_ids=[
                1,
            ],
        ),
    ) # QueryFeedUnitDiagnosisDetailRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_feed_unit_diagnosis_detail(query_feed_unit_diagnosis_detail_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FeedDiagnosisService->query_feed_unit_diagnosis_detail: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_feed_unit_diagnosis_detail_request_wrapper** | [**QueryFeedUnitDiagnosisDetailRequestWrapper**](QueryFeedUnitDiagnosisDetailRequestWrapper.md)|  |

### Return type

[**QueryFeedUnitDiagnosisDetailResponseWrapper**](QueryFeedUnitDiagnosisDetailResponseWrapper.md)

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

