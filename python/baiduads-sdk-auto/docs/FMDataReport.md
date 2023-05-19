# baiduads.FMDataReport

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_phone_recordings**](FMDataReport.md#get_phone_recordings) | **POST** /json/sms/service/FMDataReport/getPhoneRecordings | 


# **get_phone_recordings**
> GetPhoneRecordingsResponseWrapper get_phone_recordings(get_phone_recordings_request_wrapper)



### Example


```python
import time
import baiduads
from fmdatareport.api import fm_data_report
from baiduads.fmdatareport.model.get_phone_recordings_response_wrapper import GetPhoneRecordingsResponseWrapper
from baiduads.fmdatareport.model.get_phone_recordings_request_wrapper import GetPhoneRecordingsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = fm_data_report.FMDataReport(api_client)
    get_phone_recordings_request_wrapper = GetPhoneRecordingsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetPhoneRecordingsRequest(
            call_log_ids=[
                1,
            ],
        ),
    ) # GetPhoneRecordingsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_phone_recordings(get_phone_recordings_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling FMDataReport->get_phone_recordings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_phone_recordings_request_wrapper** | [**GetPhoneRecordingsRequestWrapper**](GetPhoneRecordingsRequestWrapper.md)|  |

### Return type

[**GetPhoneRecordingsResponseWrapper**](GetPhoneRecordingsResponseWrapper.md)

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

