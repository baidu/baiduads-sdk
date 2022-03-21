# baiduads.AdviceLandingPageApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**query_landing_page_correlation**](AdviceLandingPageApiService.md#query_landing_page_correlation) | **POST** /json/sms/service/AdviceLandingPageApiService/queryLandingPageCorrelation | 
[**query_landing_page_quality**](AdviceLandingPageApiService.md#query_landing_page_quality) | **POST** /json/sms/service/AdviceLandingPageApiService/queryLandingPageQuality | 


# **query_landing_page_correlation**
> QueryLandingPageCorrelationResponseWrapper query_landing_page_correlation(query_landing_page_correlation_request_wrapper)



### Example


```python
import time
import baiduads
from advicelandingpageapi.api import advice_landing_page_api_service
from baiduads.advicelandingpageapi.model.query_landing_page_correlation_request_wrapper import QueryLandingPageCorrelationRequestWrapper
from baiduads.advicelandingpageapi.model.query_landing_page_correlation_response_wrapper import QueryLandingPageCorrelationResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_landing_page_api_service.AdviceLandingPageApiService(api_client)
    query_landing_page_correlation_request_wrapper = QueryLandingPageCorrelationRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceDetailQueryRequest(
            condition=DetailQueryCondition(
                limit=[
                    1,
                ],
                sort_field="sort_field_example",
                desc=True,
                filters=[
                    FieldFilter(
                        field="field_example",
                        op="op_example",
                        values=[
                            "values_example",
                        ],
                    ),
                ],
                id_type=1,
                ids=[
                    1,
                ],
                part_type=1,
                start_time="start_time_example",
                end_time="end_time_example",
                fields=[
                    "fields_example",
                ],
            ),
            req_newest=True,
            source=1,
            advice_id=1,
            advice_key="advice_key_example",
        ),
    ) # QueryLandingPageCorrelationRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_landing_page_correlation(query_landing_page_correlation_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceLandingPageApiService->query_landing_page_correlation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_landing_page_correlation_request_wrapper** | [**QueryLandingPageCorrelationRequestWrapper**](QueryLandingPageCorrelationRequestWrapper.md)|  |

### Return type

[**QueryLandingPageCorrelationResponseWrapper**](QueryLandingPageCorrelationResponseWrapper.md)

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

# **query_landing_page_quality**
> QueryLandingPageQualityResponseWrapper query_landing_page_quality(query_landing_page_quality_request_wrapper)



### Example


```python
import time
import baiduads
from advicelandingpageapi.api import advice_landing_page_api_service
from baiduads.advicelandingpageapi.model.query_landing_page_quality_request_wrapper import QueryLandingPageQualityRequestWrapper
from baiduads.advicelandingpageapi.model.query_landing_page_quality_response_wrapper import QueryLandingPageQualityResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_landing_page_api_service.AdviceLandingPageApiService(api_client)
    query_landing_page_quality_request_wrapper = QueryLandingPageQualityRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceDetailQueryRequest(
            condition=DetailQueryCondition(
                limit=[
                    1,
                ],
                sort_field="sort_field_example",
                desc=True,
                filters=[
                    FieldFilter(
                        field="field_example",
                        op="op_example",
                        values=[
                            "values_example",
                        ],
                    ),
                ],
                id_type=1,
                ids=[
                    1,
                ],
                part_type=1,
                start_time="start_time_example",
                end_time="end_time_example",
                fields=[
                    "fields_example",
                ],
            ),
            req_newest=True,
            source=1,
            advice_id=1,
            advice_key="advice_key_example",
        ),
    ) # QueryLandingPageQualityRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_landing_page_quality(query_landing_page_quality_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceLandingPageApiService->query_landing_page_quality: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_landing_page_quality_request_wrapper** | [**QueryLandingPageQualityRequestWrapper**](QueryLandingPageQualityRequestWrapper.md)|  |

### Return type

[**QueryLandingPageQualityResponseWrapper**](QueryLandingPageQualityResponseWrapper.md)

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

