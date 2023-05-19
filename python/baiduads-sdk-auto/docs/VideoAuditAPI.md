# baiduads.VideoAuditAPI

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_audit_task**](VideoAuditAPI.md#create_audit_task) | **POST** /json/sms/service/VideoAuditAPI/createAuditTask | 
[**query_count**](VideoAuditAPI.md#query_count) | **POST** /json/sms/service/VideoAuditAPI/queryCount | 
[**query_task**](VideoAuditAPI.md#query_task) | **POST** /json/sms/service/VideoAuditAPI/queryTask | 


# **create_audit_task**
> CreateAuditTaskResponseWrapper create_audit_task(create_audit_task_request_wrapper)



### Example


```python
import time
import baiduads
from videoauditapi.api import video_audit_api
from baiduads.videoauditapi.model.create_audit_task_response_wrapper import CreateAuditTaskResponseWrapper
from baiduads.videoauditapi.model.create_audit_task_request_wrapper import CreateAuditTaskRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_audit_api.VideoAuditAPI(api_client)
    create_audit_task_request_wrapper = CreateAuditTaskRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoAuditAPIRequest(
            channel=1,
            video_id_list=[
                1,
            ],
        ),
    ) # CreateAuditTaskRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_audit_task(create_audit_task_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoAuditAPI->create_audit_task: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_audit_task_request_wrapper** | [**CreateAuditTaskRequestWrapper**](CreateAuditTaskRequestWrapper.md)|  |

### Return type

[**CreateAuditTaskResponseWrapper**](CreateAuditTaskResponseWrapper.md)

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

# **query_count**
> QueryCountResponseWrapper query_count(query_count_request_wrapper)



### Example


```python
import time
import baiduads
from videoauditapi.api import video_audit_api
from baiduads.videoauditapi.model.query_count_request_wrapper import QueryCountRequestWrapper
from baiduads.videoauditapi.model.query_count_response_wrapper import QueryCountResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_audit_api.VideoAuditAPI(api_client)
    query_count_request_wrapper = QueryCountRequestWrapper(
        header=ApiRequestHeader(),
    ) # QueryCountRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_count(query_count_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoAuditAPI->query_count: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_count_request_wrapper** | [**QueryCountRequestWrapper**](QueryCountRequestWrapper.md)|  |

### Return type

[**QueryCountResponseWrapper**](QueryCountResponseWrapper.md)

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

# **query_task**
> QueryTaskResponseWrapper query_task(query_task_request_wrapper)



### Example


```python
import time
import baiduads
from videoauditapi.api import video_audit_api
from baiduads.videoauditapi.model.query_task_response_wrapper import QueryTaskResponseWrapper
from baiduads.videoauditapi.model.query_task_request_wrapper import QueryTaskRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_audit_api.VideoAuditAPI(api_client)
    query_task_request_wrapper = QueryTaskRequestWrapper(
        header=ApiRequestHeader(),
        body=VideoAuditSelector(
            page=Page(
                offset=1,
                numbers=1,
            ),
            predicates=[
                {},
            ],
        ),
    ) # QueryTaskRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_task(query_task_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoAuditAPI->query_task: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_task_request_wrapper** | [**QueryTaskRequestWrapper**](QueryTaskRequestWrapper.md)|  |

### Return type

[**QueryTaskResponseWrapper**](QueryTaskResponseWrapper.md)

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

