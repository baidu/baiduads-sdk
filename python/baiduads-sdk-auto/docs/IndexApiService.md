# baiduads.IndexApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_keywords**](IndexApiService.md#check_keywords) | **POST** /json/sms/service/IndexApiService/checkKeywords | 
[**create_task**](IndexApiService.md#create_task) | **POST** /json/sms/service/IndexApiService/createTask | 
[**get_result**](IndexApiService.md#get_result) | **POST** /json/sms/service/IndexApiService/getResult | 


# **check_keywords**
> CheckKeywordsResponseWrapper check_keywords(check_keywords_request_wrapper)



### Example


```python
import time
import baiduads
from indexapi.api import index_api_service
from baiduads.indexapi.model.check_keywords_request_wrapper import CheckKeywordsRequestWrapper
from baiduads.indexapi.model.check_keywords_response_wrapper import CheckKeywordsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = index_api_service.IndexApiService(api_client)
    check_keywords_request_wrapper = CheckKeywordsRequestWrapper(
        header=ApiRequestHeader(),
        body=CheckKeywordRequest(
            keyword=[
                "keyword_example",
            ],
        ),
    ) # CheckKeywordsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.check_keywords(check_keywords_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling IndexApiService->check_keywords: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **check_keywords_request_wrapper** | [**CheckKeywordsRequestWrapper**](CheckKeywordsRequestWrapper.md)|  |

### Return type

[**CheckKeywordsResponseWrapper**](CheckKeywordsResponseWrapper.md)

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

# **create_task**
> CreateTaskResponseWrapper create_task(create_task_request_wrapper)



### Example


```python
import time
import baiduads
from indexapi.api import index_api_service
from baiduads.indexapi.model.create_task_response_wrapper import CreateTaskResponseWrapper
from baiduads.indexapi.model.create_task_request_wrapper import CreateTaskRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = index_api_service.IndexApiService(api_client)
    create_task_request_wrapper = CreateTaskRequestWrapper(
        header=ApiRequestHeader(),
        body=IndexTaskCreateRequest(
            datasource="datasource_example",
            date_range=DateRange(
                start="start_example",
                end="end_example",
            ),
            device=[
                "device_example",
            ],
            region=Region(
                province=[
                    "province_example",
                ],
                city=[
                    "city_example",
                ],
                is_all=True,
            ),
            keyword=[
                "keyword_example",
            ],
        ),
    ) # CreateTaskRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_task(create_task_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling IndexApiService->create_task: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_task_request_wrapper** | [**CreateTaskRequestWrapper**](CreateTaskRequestWrapper.md)|  |

### Return type

[**CreateTaskResponseWrapper**](CreateTaskResponseWrapper.md)

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

# **get_result**
> GetResultResponseWrapper get_result(get_result_request_wrapper)



### Example


```python
import time
import baiduads
from indexapi.api import index_api_service
from baiduads.indexapi.model.get_result_request_wrapper import GetResultRequestWrapper
from baiduads.indexapi.model.get_result_response_wrapper import GetResultResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = index_api_service.IndexApiService(api_client)
    get_result_request_wrapper = GetResultRequestWrapper(
        header=ApiRequestHeader(),
        body=TaskQueryRequest(
            task_id="task_id_example",
        ),
    ) # GetResultRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_result(get_result_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling IndexApiService->get_result: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_result_request_wrapper** | [**GetResultRequestWrapper**](GetResultRequestWrapper.md)|  |

### Return type

[**GetResultResponseWrapper**](GetResultResponseWrapper.md)

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

