# baiduads.MccHistoryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_account_transfer_history**](MccHistoryService.md#get_account_transfer_history) | **POST** /json/sms/service/MccHistoryService/getAccountTransferHistory | 


# **get_account_transfer_history**
> GetAccountTransferHistoryResponseWrapper get_account_transfer_history(get_account_transfer_history_request_wrapper)



### Example


```python
import time
import baiduads
from mcchistory.api import mcc_history_service
from baiduads.mcchistory.model.get_account_transfer_history_response_wrapper import GetAccountTransferHistoryResponseWrapper
from baiduads.mcchistory.model.get_account_transfer_history_request_wrapper import GetAccountTransferHistoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = mcc_history_service.MccHistoryService(api_client)
    get_account_transfer_history_request_wrapper = GetAccountTransferHistoryRequestWrapper(
        header=ApiRequestHeader(),
        body=TransferHistoryRequest(
            start_time="start_time_example",
            end_time="end_time_example",
        ),
    ) # GetAccountTransferHistoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_account_transfer_history(get_account_transfer_history_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MccHistoryService->get_account_transfer_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_account_transfer_history_request_wrapper** | [**GetAccountTransferHistoryRequestWrapper**](GetAccountTransferHistoryRequestWrapper.md)|  |

### Return type

[**GetAccountTransferHistoryResponseWrapper**](GetAccountTransferHistoryResponseWrapper.md)

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

