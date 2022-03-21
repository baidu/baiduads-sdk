# baiduads.MccFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_user_list_by_mccid**](MccFeedService.md#get_user_list_by_mccid) | **POST** /json/feed/v1/MccFeedService/getUserListByMccid | 


# **get_user_list_by_mccid**
> GetUserListByMccidResponseWrapper get_user_list_by_mccid(get_user_list_by_mccid_request_wrapper)



### Example


```python
import time
import baiduads
from mccfeed.api import mcc_feed_service
from baiduads.mccfeed.model.get_user_list_by_mccid_response_wrapper import GetUserListByMccidResponseWrapper
from baiduads.mccfeed.model.get_user_list_by_mccid_request_wrapper import GetUserListByMccidRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = mcc_feed_service.MccFeedService(api_client)
    get_user_list_by_mccid_request_wrapper = GetUserListByMccidRequestWrapper(
        header=ApiRequestHeader(),
        body=GetMccRequest(
            mccid=1,
        ),
    ) # GetUserListByMccidRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_user_list_by_mccid(get_user_list_by_mccid_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MccFeedService->get_user_list_by_mccid: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_user_list_by_mccid_request_wrapper** | [**GetUserListByMccidRequestWrapper**](GetUserListByMccidRequestWrapper.md)|  |

### Return type

[**GetUserListByMccidResponseWrapper**](GetUserListByMccidResponseWrapper.md)

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

