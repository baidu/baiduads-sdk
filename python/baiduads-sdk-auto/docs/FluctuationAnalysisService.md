# baiduads.FluctuationAnalysisService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**query_fluctuation_reasons**](FluctuationAnalysisService.md#query_fluctuation_reasons) | **POST** /json/sms/service/FluctuationAnalysisService/queryFluctuationReasons | 


# **query_fluctuation_reasons**
> QueryFluctuationReasonsResponseWrapper query_fluctuation_reasons(query_fluctuation_reasons_request_wrapper)



### Example


```python
import time
import baiduads
from fluctuationanalysis.api import fluctuation_analysis_service
from baiduads.fluctuationanalysis.model.query_fluctuation_reasons_response_wrapper import QueryFluctuationReasonsResponseWrapper
from baiduads.fluctuationanalysis.model.query_fluctuation_reasons_request_wrapper import QueryFluctuationReasonsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fluctuation_analysis_service.FluctuationAnalysisService(api_client)
    query_fluctuation_reasons_request_wrapper = QueryFluctuationReasonsRequestWrapper(
        header=ApiRequestHeader(),
        body=FluctuationAnalysisRequest(
            id_type=1,
            ids=[
                1,
            ],
            time_range=1,
            compare_type=1,
            diagnosis_date="diagnosis_date_example",
            dimension=1,
        ),
    ) # QueryFluctuationReasonsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_fluctuation_reasons(query_fluctuation_reasons_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FluctuationAnalysisService->query_fluctuation_reasons: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_fluctuation_reasons_request_wrapper** | [**QueryFluctuationReasonsRequestWrapper**](QueryFluctuationReasonsRequestWrapper.md)|  |

### Return type

[**QueryFluctuationReasonsResponseWrapper**](QueryFluctuationReasonsResponseWrapper.md)

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

