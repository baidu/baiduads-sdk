# baiduads.PaymentFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_payment_history**](PaymentFeedService.md#get_payment_history) | **POST** /json/feed/v1/PaymentFeedService/getPaymentHistory | 


# **get_payment_history**
> GetPaymentHistoryResponseWrapper get_payment_history(get_payment_history_request_wrapper)



### Example


```python
import time
import baiduads
from paymentfeed.api import payment_feed_service
from baiduads.paymentfeed.model.get_payment_history_request_wrapper import GetPaymentHistoryRequestWrapper
from baiduads.paymentfeed.model.get_payment_history_response_wrapper import GetPaymentHistoryResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = payment_feed_service.PaymentFeedService(api_client)
    get_payment_history_request_wrapper = GetPaymentHistoryRequestWrapper(
        header=ApiRequestHeader(),
        body=PayHistoryRequest(
            fund_type=1,
            id=1,
            page_size=1,
            start_time="start_time_example",
            end_time="end_time_example",
        ),
    ) # GetPaymentHistoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_payment_history(get_payment_history_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PaymentFeedService->get_payment_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_payment_history_request_wrapper** | [**GetPaymentHistoryRequestWrapper**](GetPaymentHistoryRequestWrapper.md)|  |

### Return type

[**GetPaymentHistoryResponseWrapper**](GetPaymentHistoryResponseWrapper.md)

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

