# baiduads.LeadsNoticeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_notice_list**](LeadsNoticeService.md#get_notice_list) | **POST** /json/sms/service/LeadsNoticeService/getNoticeList | 


# **get_notice_list**
> GetNoticeListResponseWrapper get_notice_list(get_notice_list_request_wrapper)



### Example


```python
import time
import baiduads
from leadsnotice.api import leads_notice_service
from baiduads.leadsnotice.model.get_notice_list_response_wrapper import GetNoticeListResponseWrapper
from baiduads.leadsnotice.model.get_notice_list_request_wrapper import GetNoticeListRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = leads_notice_service.LeadsNoticeService(api_client)
    get_notice_list_request_wrapper = GetNoticeListRequestWrapper(
        header=ApiRequestHeader(),
        body=NoticeListRequest(
            solution_type="solution_type_example",
            start_date="start_date_example",
            end_date="end_date_example",
            page_no=1,
            page_size=1,
        ),
    ) # GetNoticeListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_notice_list(get_notice_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LeadsNoticeService->get_notice_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_notice_list_request_wrapper** | [**GetNoticeListRequestWrapper**](GetNoticeListRequestWrapper.md)|  |

### Return type

[**GetNoticeListResponseWrapper**](GetNoticeListResponseWrapper.md)

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

