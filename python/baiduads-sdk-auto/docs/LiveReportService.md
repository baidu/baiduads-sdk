# baiduads.LiveReportService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_account_live_data**](LiveReportService.md#get_account_live_data) | **POST** /json/sms/service/LiveReportService/getAccountLiveData | 
[**get_keyword_live_data**](LiveReportService.md#get_keyword_live_data) | **POST** /json/sms/service/LiveReportService/getKeywordLiveData | 


# **get_account_live_data**
> GetAccountLiveDataResponseWrapper get_account_live_data(get_account_live_data_request_wrapper)



### Example


```python
import time
import baiduads
from livereport.api import live_report_service
from baiduads.livereport.model.get_account_live_data_request_wrapper import GetAccountLiveDataRequestWrapper
from baiduads.livereport.model.get_account_live_data_response_wrapper import GetAccountLiveDataResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = live_report_service.LiveReportService(api_client)
    get_account_live_data_request_wrapper = GetAccountLiveDataRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAcctOrCmpnLiveDataParams(
            data_type=1,
            device=1,
        ),
    ) # GetAccountLiveDataRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_account_live_data(get_account_live_data_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LiveReportService->get_account_live_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_account_live_data_request_wrapper** | [**GetAccountLiveDataRequestWrapper**](GetAccountLiveDataRequestWrapper.md)|  |

### Return type

[**GetAccountLiveDataResponseWrapper**](GetAccountLiveDataResponseWrapper.md)

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

# **get_keyword_live_data**
> GetKeywordLiveDataResponseWrapper get_keyword_live_data(get_keyword_live_data_request_wrapper)



### Example


```python
import time
import baiduads
from livereport.api import live_report_service
from baiduads.livereport.model.get_keyword_live_data_request_wrapper import GetKeywordLiveDataRequestWrapper
from baiduads.livereport.model.get_keyword_live_data_response_wrapper import GetKeywordLiveDataResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = live_report_service.LiveReportService(api_client)
    get_keyword_live_data_request_wrapper = GetKeywordLiveDataRequestWrapper(
        header=ApiRequestHeader(),
        body=GetKeywordLiveDataParams(
            keyword_ids=[
                1,
            ],
            device=1,
            start_time="start_time_example",
            end_time="end_time_example",
            region_target=[
                1,
            ],
        ),
    ) # GetKeywordLiveDataRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_keyword_live_data(get_keyword_live_data_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LiveReportService->get_keyword_live_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_keyword_live_data_request_wrapper** | [**GetKeywordLiveDataRequestWrapper**](GetKeywordLiveDataRequestWrapper.md)|  |

### Return type

[**GetKeywordLiveDataResponseWrapper**](GetKeywordLiveDataResponseWrapper.md)

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

