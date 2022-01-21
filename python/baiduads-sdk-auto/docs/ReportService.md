# baiduads.ReportService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_professional_report_id**](ReportService.md#get_professional_report_id) | **POST** /json/sms/service/ReportService/getProfessionalReportId | 
[**get_real_time_data**](ReportService.md#get_real_time_data) | **POST** /json/sms/service/ReportService/getRealTimeData | 
[**get_real_time_query_data**](ReportService.md#get_real_time_query_data) | **POST** /json/sms/service/ReportService/getRealTimeQueryData | 
[**get_report_file_url**](ReportService.md#get_report_file_url) | **POST** /json/sms/service/ReportService/getReportFileUrl | 
[**get_report_state**](ReportService.md#get_report_state) | **POST** /json/sms/service/ReportService/getReportState | 


# **get_professional_report_id**
> GetProfessionalReportIdResponseWrapper get_professional_report_id(get_professional_report_id_request_wrapper)



### Example


```python
import time
import baiduads
from report.api import report_service
from baiduads.report.model.get_professional_report_id_request_wrapper import GetProfessionalReportIdRequestWrapper
from baiduads.report.model.get_professional_report_id_response_wrapper import GetProfessionalReportIdResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_service.ReportService(api_client)
    get_professional_report_id_request_wrapper = GetProfessionalReportIdRequestWrapper(
        header=ApiRequestHeader(),
        body=GetProfessionReportIdParms(
            report_request_type=ReportRequestType(
                subject=1,
                material_style=1,
                performance_data=[
                    "performance_data_example",
                ],
                start_date="start_date_example",
                end_date="end_date_example",
                level_of_details=1,
                id_only=True,
                attributes=[
                    AttributeType(
                        key="key_example",
                        value=[
                            1,
                        ],
                    ),
                ],
                format=1,
                stat_ids=[
                    1,
                ],
                stat_range=1,
                report_type=1,
                unit_of_time=1,
                device=1,
                order=True,
                number=1,
                isrelativetime=1,
                style_type=1,
                platform=1,
                page_index=1,
                producttype=1,
                segment_type=1,
                bind_source=1,
                bid_type=[
                    "bid_type_example",
                ],
                pay_mode=[
                    "pay_mode_example",
                ],
                bstype=1,
            ),
            report_flow_type=1,
        ),
    ) # GetProfessionalReportIdRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_professional_report_id(get_professional_report_id_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportService->get_professional_report_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_professional_report_id_request_wrapper** | [**GetProfessionalReportIdRequestWrapper**](GetProfessionalReportIdRequestWrapper.md)|  |

### Return type

[**GetProfessionalReportIdResponseWrapper**](GetProfessionalReportIdResponseWrapper.md)

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

# **get_real_time_data**
> GetRealTimeDataResponseWrapper get_real_time_data(get_real_time_data_request_wrapper)



### Example


```python
import time
import baiduads
from report.api import report_service
from baiduads.report.model.get_real_time_data_request_wrapper import GetRealTimeDataRequestWrapper
from baiduads.report.model.get_real_time_data_response_wrapper import GetRealTimeDataResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_service.ReportService(api_client)
    get_real_time_data_request_wrapper = GetRealTimeDataRequestWrapper(
        header=ApiRequestHeader(),
        body=GetRealTimeDataParams(
            real_time_request_type=ReportRequestType(
                subject=1,
                material_style=1,
                performance_data=[
                    "performance_data_example",
                ],
                start_date="start_date_example",
                end_date="end_date_example",
                level_of_details=1,
                id_only=True,
                attributes=[
                    AttributeType(
                        key="key_example",
                        value=[
                            1,
                        ],
                    ),
                ],
                format=1,
                stat_ids=[
                    1,
                ],
                stat_range=1,
                report_type=1,
                unit_of_time=1,
                device=1,
                order=True,
                number=1,
                isrelativetime=1,
                style_type=1,
                platform=1,
                page_index=1,
                producttype=1,
                segment_type=1,
                bind_source=1,
                bid_type=[
                    "bid_type_example",
                ],
                pay_mode=[
                    "pay_mode_example",
                ],
                bstype=1,
            ),
            report_flow_type=1,
        ),
    ) # GetRealTimeDataRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_real_time_data(get_real_time_data_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportService->get_real_time_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_real_time_data_request_wrapper** | [**GetRealTimeDataRequestWrapper**](GetRealTimeDataRequestWrapper.md)|  |

### Return type

[**GetRealTimeDataResponseWrapper**](GetRealTimeDataResponseWrapper.md)

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

# **get_real_time_query_data**
> GetRealTimeQueryDataResponseWrapper get_real_time_query_data(get_real_time_query_data_request_wrapper)



### Example


```python
import time
import baiduads
from report.api import report_service
from baiduads.report.model.get_real_time_query_data_response_wrapper import GetRealTimeQueryDataResponseWrapper
from baiduads.report.model.get_real_time_query_data_request_wrapper import GetRealTimeQueryDataRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_service.ReportService(api_client)
    get_real_time_query_data_request_wrapper = GetRealTimeQueryDataRequestWrapper(
        header=ApiRequestHeader(),
        body=GetRealTimeQueryDataParams(
            real_time_query_request_type=ReportRequestType(
                subject=1,
                material_style=1,
                performance_data=[
                    "performance_data_example",
                ],
                start_date="start_date_example",
                end_date="end_date_example",
                level_of_details=1,
                id_only=True,
                attributes=[
                    AttributeType(
                        key="key_example",
                        value=[
                            1,
                        ],
                    ),
                ],
                format=1,
                stat_ids=[
                    1,
                ],
                stat_range=1,
                report_type=1,
                unit_of_time=1,
                device=1,
                order=True,
                number=1,
                isrelativetime=1,
                style_type=1,
                platform=1,
                page_index=1,
                producttype=1,
                segment_type=1,
                bind_source=1,
                bid_type=[
                    "bid_type_example",
                ],
                pay_mode=[
                    "pay_mode_example",
                ],
                bstype=1,
            ),
        ),
    ) # GetRealTimeQueryDataRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_real_time_query_data(get_real_time_query_data_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportService->get_real_time_query_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_real_time_query_data_request_wrapper** | [**GetRealTimeQueryDataRequestWrapper**](GetRealTimeQueryDataRequestWrapper.md)|  |

### Return type

[**GetRealTimeQueryDataResponseWrapper**](GetRealTimeQueryDataResponseWrapper.md)

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

# **get_report_file_url**
> GetReportFileUrlResponseWrapper get_report_file_url(get_report_file_url_request_wrapper)



### Example


```python
import time
import baiduads
from report.api import report_service
from baiduads.report.model.get_report_file_url_response_wrapper import GetReportFileUrlResponseWrapper
from baiduads.report.model.get_report_file_url_request_wrapper import GetReportFileUrlRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_service.ReportService(api_client)
    get_report_file_url_request_wrapper = GetReportFileUrlRequestWrapper(
        header=ApiRequestHeader(),
        body=GetReportStateParams(
            report_id="report_id_example",
        ),
    ) # GetReportFileUrlRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_report_file_url(get_report_file_url_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportService->get_report_file_url: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_report_file_url_request_wrapper** | [**GetReportFileUrlRequestWrapper**](GetReportFileUrlRequestWrapper.md)|  |

### Return type

[**GetReportFileUrlResponseWrapper**](GetReportFileUrlResponseWrapper.md)

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

# **get_report_state**
> GetReportStateResponseWrapper get_report_state(get_report_state_request_wrapper)



### Example


```python
import time
import baiduads
from report.api import report_service
from baiduads.report.model.get_report_state_request_wrapper import GetReportStateRequestWrapper
from baiduads.report.model.get_report_state_response_wrapper import GetReportStateResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_service.ReportService(api_client)
    get_report_state_request_wrapper = GetReportStateRequestWrapper(
        header=ApiRequestHeader(),
        body=GetReportStateParams(
            report_id="report_id_example",
        ),
    ) # GetReportStateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_report_state(get_report_state_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportService->get_report_state: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_report_state_request_wrapper** | [**GetReportStateRequestWrapper**](GetReportStateRequestWrapper.md)|  |

### Return type

[**GetReportStateResponseWrapper**](GetReportStateResponseWrapper.md)

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

