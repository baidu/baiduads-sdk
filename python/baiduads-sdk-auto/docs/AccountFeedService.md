# baiduads.AccountFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_account_feed**](AccountFeedService.md#get_account_feed) | **POST** /json/feed/v1/AccountFeedService/getAccountFeed | 
[**update_account_feed**](AccountFeedService.md#update_account_feed) | **POST** /json/feed/v1/AccountFeedService/updateAccountFeed | 


# **get_account_feed**
> GetAccountFeedResponseWrapper get_account_feed(get_account_feed_request_wrapper)



### Example


```python
import time
import baiduads
from accountfeed.api import account_feed_service
from baiduads.accountfeed.model.get_account_feed_request_wrapper import GetAccountFeedRequestWrapper
from baiduads.accountfeed.model.get_account_feed_response_wrapper import GetAccountFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = account_feed_service.AccountFeedService(api_client)
    get_account_feed_request_wrapper = GetAccountFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAccountFeedRequest(
            account_feed_fields=[
                "account_feed_fields_example",
            ],
        ),
    ) # GetAccountFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_account_feed(get_account_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AccountFeedService->get_account_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_account_feed_request_wrapper** | [**GetAccountFeedRequestWrapper**](GetAccountFeedRequestWrapper.md)|  |

### Return type

[**GetAccountFeedResponseWrapper**](GetAccountFeedResponseWrapper.md)

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

# **update_account_feed**
> UpdateAccountFeedResponseWrapper update_account_feed(update_account_feed_request_wrapper)



### Example


```python
import time
import baiduads
from accountfeed.api import account_feed_service
from baiduads.accountfeed.model.update_account_feed_request_wrapper import UpdateAccountFeedRequestWrapper
from baiduads.accountfeed.model.update_account_feed_response_wrapper import UpdateAccountFeedResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = account_feed_service.AccountFeedService(api_client)
    update_account_feed_request_wrapper = UpdateAccountFeedRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateAccountFeedRequestWrapperBody(
            account_feed_type=AccountFeedType(
                user_id=1,
                balance=3.14,
                budget=3.14,
                balance_package=1,
                user_stat=1,
                ua_status=1,
                valid_flows=[
                    1,
                ],
                cid=1,
                budget_offline_time=[
                    {},
                ],
                lice_name="lice_name_example",
            ),
        ),
    ) # UpdateAccountFeedRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_account_feed(update_account_feed_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AccountFeedService->update_account_feed: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_account_feed_request_wrapper** | [**UpdateAccountFeedRequestWrapper**](UpdateAccountFeedRequestWrapper.md)|  |

### Return type

[**UpdateAccountFeedResponseWrapper**](UpdateAccountFeedResponseWrapper.md)

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

