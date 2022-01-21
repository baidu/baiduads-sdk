# baiduads.OpenApiReportService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_report_task**](OpenApiReportService.md#create_report_task) | **POST** /json/sms/service/OpenApiReportService/createReportTask | 
[**get_report_data**](OpenApiReportService.md#get_report_data) | **POST** /json/sms/service/OpenApiReportService/getReportData | 
[**get_task_status**](OpenApiReportService.md#get_task_status) | **POST** /json/sms/service/OpenApiReportService/getTaskStatus | 


# **create_report_task**
> CreateReportTaskResponseWrapper create_report_task(create_report_task_request_wrapper)



### Example


```python
import time
import baiduads
from openapireport.api import open_api_report_service
from baiduads.openapireport.model.create_report_task_request_wrapper import CreateReportTaskRequestWrapper
from baiduads.openapireport.model.create_report_task_response_wrapper import CreateReportTaskResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = open_api_report_service.OpenApiReportService(api_client)
    create_report_task_request_wrapper = CreateReportTaskRequestWrapper(
        header=ApiRequestHeader(),
        body=ReportFileRequest(
            file_retention_time="file_retention_time_example",
            url_expire_time_in_seconds=1,
            need_compress=True,
            mails=[
                "mails_example",
            ],
            file_type="file_type_example",
            data_table="data_table_example",
            with_not_table_header=True,
            report_type=1,
            user_ids=[
                1,
            ],
            start_date="start_date_example",
            end_date="end_date_example",
            time_unit="time_unit_example",
            columns=[
                "columns_example",
            ],
            sorts=[
                Sort(
                    column="column_example",
                    sort_rule="sort_rule_example",
                    compare_field="compare_field_example",
                ),
            ],
            filters=[
                Filter(
                    column="column_example",
                    operator="operator_example",
                    values=[
                        "values_example",
                    ],
                    compare_field="compare_field_example",
                ),
            ],
            start_row=1,
            row_count=1,
            need_sum=True,
            split_column="split_column_example",
            compare_start_date="compare_start_date_example",
            need_cache=True,
            add_zero_rows=True,
            with_column_meta=True,
            bloodline_tag="bloodline_tag_example",
            token="token_example",
        ),
    ) # CreateReportTaskRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_report_task(create_report_task_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OpenApiReportService->create_report_task: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_report_task_request_wrapper** | [**CreateReportTaskRequestWrapper**](CreateReportTaskRequestWrapper.md)|  |

### Return type

[**CreateReportTaskResponseWrapper**](CreateReportTaskResponseWrapper.md)

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

# **get_report_data**
> GetReportDataResponseWrapper get_report_data(get_report_data_request_wrapper)



### Example


```python
import time
import baiduads
from openapireport.api import open_api_report_service
from baiduads.openapireport.model.get_report_data_request_wrapper import GetReportDataRequestWrapper
from baiduads.openapireport.model.get_report_data_response_wrapper import GetReportDataResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = open_api_report_service.OpenApiReportService(api_client)
    get_report_data_request_wrapper = GetReportDataRequestWrapper(
        header=ApiRequestHeader(),
        body=ReportDataRequest(
            report_type=1,
            user_ids=[
                1,
            ],
            start_date="start_date_example",
            end_date="end_date_example",
            time_unit="time_unit_example",
            columns=[
                "columns_example",
            ],
            sorts=[
                Sort(
                    column="column_example",
                    sort_rule="sort_rule_example",
                    compare_field="compare_field_example",
                ),
            ],
            filters=[
                Filter(
                    column="column_example",
                    operator="operator_example",
                    values=[
                        "values_example",
                    ],
                    compare_field="compare_field_example",
                ),
            ],
            start_row=1,
            row_count=1,
            need_sum=True,
            split_column="split_column_example",
            compare_start_date="compare_start_date_example",
            need_cache=True,
            add_zero_rows=True,
            with_column_meta=True,
            bloodline_tag="bloodline_tag_example",
            token="token_example",
        ),
    ) # GetReportDataRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_report_data(get_report_data_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OpenApiReportService->get_report_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_report_data_request_wrapper** | [**GetReportDataRequestWrapper**](GetReportDataRequestWrapper.md)|  |

### Return type

[**GetReportDataResponseWrapper**](GetReportDataResponseWrapper.md)

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

# **get_task_status**
> GetTaskStatusResponseWrapper get_task_status(get_task_status_request_wrapper)



### Example


```python
import time
import baiduads
from openapireport.api import open_api_report_service
from baiduads.openapireport.model.get_task_status_response_wrapper import GetTaskStatusResponseWrapper
from baiduads.openapireport.model.get_task_status_request_wrapper import GetTaskStatusRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = open_api_report_service.OpenApiReportService(api_client)
    get_task_status_request_wrapper = GetTaskStatusRequestWrapper(
        header=ApiRequestHeader(),
        body=GetTaskStatusRequest(
            task_id="task_id_example",
        ),
    ) # GetTaskStatusRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_task_status(get_task_status_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OpenApiReportService->get_task_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_task_status_request_wrapper** | [**GetTaskStatusRequestWrapper**](GetTaskStatusRequestWrapper.md)|  |

### Return type

[**GetTaskStatusResponseWrapper**](GetTaskStatusResponseWrapper.md)

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

