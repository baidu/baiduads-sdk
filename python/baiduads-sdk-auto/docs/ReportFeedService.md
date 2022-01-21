# baiduads.ReportFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_real_time_feed_data**](ReportFeedService.md#get_real_time_feed_data) | **POST** /json/feed/v1/ReportFeedService/getRealTimeFeedData | 
[**get_report_feed_file_url**](ReportFeedService.md#get_report_feed_file_url) | **POST** /json/feed/v1/ReportFeedService/getReportFeedFileUrl | 
[**get_report_feed_id**](ReportFeedService.md#get_report_feed_id) | **POST** /json/feed/v1/ReportFeedService/getReportFeedId | 
[**get_report_feed_state**](ReportFeedService.md#get_report_feed_state) | **POST** /json/feed/v1/ReportFeedService/getReportFeedState | 


# **get_real_time_feed_data**
> GetRealTimeFeedDataResponseWrapper get_real_time_feed_data(get_real_time_feed_data_request_wrapper)



### Example


```python
import time
import baiduads
from reportfeed.api import report_feed_service
from baiduads.reportfeed.model.get_real_time_feed_data_request_wrapper import GetRealTimeFeedDataRequestWrapper
from baiduads.reportfeed.model.get_real_time_feed_data_response_wrapper import GetRealTimeFeedDataResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_feed_service.ReportFeedService(api_client)
    get_real_time_feed_data_request_wrapper = GetRealTimeFeedDataRequestWrapper(
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
    ) # GetRealTimeFeedDataRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_real_time_feed_data(get_real_time_feed_data_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportFeedService->get_real_time_feed_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_real_time_feed_data_request_wrapper** | [**GetRealTimeFeedDataRequestWrapper**](GetRealTimeFeedDataRequestWrapper.md)|  |

### Return type

[**GetRealTimeFeedDataResponseWrapper**](GetRealTimeFeedDataResponseWrapper.md)

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

# **get_report_feed_file_url**
> GetReportFeedFileUrlResponseWrapper get_report_feed_file_url(get_report_feed_file_url_request_wrapper)



### Example


```python
import time
import baiduads
from reportfeed.api import report_feed_service
from baiduads.reportfeed.model.get_report_feed_file_url_request_wrapper import GetReportFeedFileUrlRequestWrapper
from baiduads.reportfeed.model.get_report_feed_file_url_response_wrapper import GetReportFeedFileUrlResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_feed_service.ReportFeedService(api_client)
    get_report_feed_file_url_request_wrapper = GetReportFeedFileUrlRequestWrapper(
        header=ApiRequestHeader(),
        body=GetReportStateParams(
            report_id="report_id_example",
        ),
    ) # GetReportFeedFileUrlRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_report_feed_file_url(get_report_feed_file_url_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportFeedService->get_report_feed_file_url: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_report_feed_file_url_request_wrapper** | [**GetReportFeedFileUrlRequestWrapper**](GetReportFeedFileUrlRequestWrapper.md)|  |

### Return type

[**GetReportFeedFileUrlResponseWrapper**](GetReportFeedFileUrlResponseWrapper.md)

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

# **get_report_feed_id**
> GetReportFeedIdResponseWrapper get_report_feed_id(get_report_feed_id_request_wrapper)



### Example


```python
import time
import baiduads
from reportfeed.api import report_feed_service
from baiduads.reportfeed.model.get_report_feed_id_request_wrapper import GetReportFeedIdRequestWrapper
from baiduads.reportfeed.model.get_report_feed_id_response_wrapper import GetReportFeedIdResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_feed_service.ReportFeedService(api_client)
    get_report_feed_id_request_wrapper = GetReportFeedIdRequestWrapper(
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
    ) # GetReportFeedIdRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_report_feed_id(get_report_feed_id_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportFeedService->get_report_feed_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_report_feed_id_request_wrapper** | [**GetReportFeedIdRequestWrapper**](GetReportFeedIdRequestWrapper.md)|  |

### Return type

[**GetReportFeedIdResponseWrapper**](GetReportFeedIdResponseWrapper.md)

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

# **get_report_feed_state**
> GetReportFeedStateResponseWrapper get_report_feed_state(get_report_feed_state_request_wrapper)



### Example


```python
import time
import baiduads
from reportfeed.api import report_feed_service
from baiduads.reportfeed.model.get_report_feed_state_response_wrapper import GetReportFeedStateResponseWrapper
from baiduads.reportfeed.model.get_report_feed_state_request_wrapper import GetReportFeedStateRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = report_feed_service.ReportFeedService(api_client)
    get_report_feed_state_request_wrapper = GetReportFeedStateRequestWrapper(
        header=ApiRequestHeader(),
        body=GetReportStateParams(
            report_id="report_id_example",
        ),
    ) # GetReportFeedStateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_report_feed_state(get_report_feed_state_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ReportFeedService->get_report_feed_state: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_report_feed_state_request_wrapper** | [**GetReportFeedStateRequestWrapper**](GetReportFeedStateRequestWrapper.md)|  |

### Return type

[**GetReportFeedStateResponseWrapper**](GetReportFeedStateResponseWrapper.md)

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

