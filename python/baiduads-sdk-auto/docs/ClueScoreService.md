# baiduads.ClueScoreService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_clue_result_file_url**](ClueScoreService.md#get_clue_result_file_url) | **POST** /json/sms/service/ClueScoreService/getClueResultFileUrl | 
[**query_clue_task_status**](ClueScoreService.md#query_clue_task_status) | **POST** /json/sms/service/ClueScoreService/queryClueTaskStatus | 
[**submit_clue_task**](ClueScoreService.md#submit_clue_task) | **POST** /json/sms/service/ClueScoreService/submitClueTask | 


# **get_clue_result_file_url**
> GetClueResultFileUrlResponseWrapper get_clue_result_file_url(get_clue_result_file_url_request_wrapper)



### Example


```python
import time
import baiduads
from cluescore.api import clue_score_service
from baiduads.cluescore.model.get_clue_result_file_url_response_wrapper import GetClueResultFileUrlResponseWrapper
from baiduads.cluescore.model.get_clue_result_file_url_request_wrapper import GetClueResultFileUrlRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = clue_score_service.ClueScoreService(api_client)
    get_clue_result_file_url_request_wrapper = GetClueResultFileUrlRequestWrapper(
        header=ApiRequestHeader(),
        body=ClueTaskIdRequest(
            task_id=1,
        ),
    ) # GetClueResultFileUrlRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_clue_result_file_url(get_clue_result_file_url_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ClueScoreService->get_clue_result_file_url: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_clue_result_file_url_request_wrapper** | [**GetClueResultFileUrlRequestWrapper**](GetClueResultFileUrlRequestWrapper.md)|  |

### Return type

[**GetClueResultFileUrlResponseWrapper**](GetClueResultFileUrlResponseWrapper.md)

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

# **query_clue_task_status**
> QueryClueTaskStatusResponseWrapper query_clue_task_status(query_clue_task_status_request_wrapper)



### Example


```python
import time
import baiduads
from cluescore.api import clue_score_service
from baiduads.cluescore.model.query_clue_task_status_response_wrapper import QueryClueTaskStatusResponseWrapper
from baiduads.cluescore.model.query_clue_task_status_request_wrapper import QueryClueTaskStatusRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = clue_score_service.ClueScoreService(api_client)
    query_clue_task_status_request_wrapper = QueryClueTaskStatusRequestWrapper(
        header=ApiRequestHeader(),
        body=QueryClueTaskStatusRequest(
            task_ids=[
                1,
            ],
        ),
    ) # QueryClueTaskStatusRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_clue_task_status(query_clue_task_status_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ClueScoreService->query_clue_task_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_clue_task_status_request_wrapper** | [**QueryClueTaskStatusRequestWrapper**](QueryClueTaskStatusRequestWrapper.md)|  |

### Return type

[**QueryClueTaskStatusResponseWrapper**](QueryClueTaskStatusResponseWrapper.md)

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

# **submit_clue_task**
> SubmitClueTaskResponseWrapper submit_clue_task(submit_clue_task_request_wrapper)



### Example


```python
import time
import baiduads
from cluescore.api import clue_score_service
from baiduads.cluescore.model.submit_clue_task_response_wrapper import SubmitClueTaskResponseWrapper
from baiduads.cluescore.model.submit_clue_task_request_wrapper import SubmitClueTaskRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = clue_score_service.ClueScoreService(api_client)
    submit_clue_task_request_wrapper = SubmitClueTaskRequestWrapper(
        header=ApiRequestHeader(),
        body=SubmitClueTaskRequest(
            task_name="task_name_example",
            description="description_example",
            trade1="trade1_example",
            trade2="trade2_example",
            positive_file_id=1,
            negative_file_id=1,
            evaluate_file_id=1,
        ),
    ) # SubmitClueTaskRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.submit_clue_task(submit_clue_task_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ClueScoreService->submit_clue_task: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submit_clue_task_request_wrapper** | [**SubmitClueTaskRequestWrapper**](SubmitClueTaskRequestWrapper.md)|  |

### Return type

[**SubmitClueTaskResponseWrapper**](SubmitClueTaskResponseWrapper.md)

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

