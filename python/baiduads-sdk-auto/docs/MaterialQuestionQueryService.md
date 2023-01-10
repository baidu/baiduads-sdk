# baiduads.MaterialQuestionQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_question_list**](MaterialQuestionQueryService.md#get_question_list) | **POST** /json/sms/service/MaterialQuestionQueryService/getQuestionList | 


# **get_question_list**
> GetQuestionListResponseWrapper get_question_list(get_question_list_request_wrapper)



### Example


```python
import time
import baiduads
from materialquestionquery.api import material_question_query_service
from baiduads.materialquestionquery.model.get_question_list_response_wrapper import GetQuestionListResponseWrapper
from baiduads.materialquestionquery.model.get_question_list_request_wrapper import GetQuestionListRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_question_query_service.MaterialQuestionQueryService(api_client)
    get_question_list_request_wrapper = GetQuestionListRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaQuestionListRequest(
            question_id_list=[
                1,
            ],
            question="question_example",
            answer="answer_example",
            status=[
                1,
            ],
            category_id=[
                1,
            ],
            page_size=1,
            page_num=1,
            sort_list=[
                SortingRuleDto(
                    field="field_example",
                    order_by="order_by_example",
                ),
            ],
            question_type=[
                1,
            ],
            content_quality_status=[
                1,
            ],
            update_start_time="update_start_time_example",
            update_end_time="update_end_time_example",
            trade_id=1,
            question_id_list_not_in=[
                1,
            ],
            content_type=1,
        ),
    ) # GetQuestionListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_question_list(get_question_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialQuestionQueryService->get_question_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_question_list_request_wrapper** | [**GetQuestionListRequestWrapper**](GetQuestionListRequestWrapper.md)|  |

### Return type

[**GetQuestionListResponseWrapper**](GetQuestionListResponseWrapper.md)

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

