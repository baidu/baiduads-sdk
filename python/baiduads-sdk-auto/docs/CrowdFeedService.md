# baiduads.CrowdFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_bind_adgroup**](CrowdFeedService.md#get_bind_adgroup) | **POST** /json/feed/v1/CrowdFeedService/getBindAdgroup | 
[**get_eshop_elds_crowds**](CrowdFeedService.md#get_eshop_elds_crowds) | **POST** /json/feed/v1/CrowdFeedService/getEshopEldsCrowds | 
[**get_eshop_trade_crowds**](CrowdFeedService.md#get_eshop_trade_crowds) | **POST** /json/feed/v1/CrowdFeedService/getEshopTradeCrowds | 


# **get_bind_adgroup**
> GetBindAdgroupResponseWrapper get_bind_adgroup(get_bind_adgroup_request_wrapper)



### Example


```python
import time
import baiduads
from crowdfeed.api import crowd_feed_service
from baiduads.crowdfeed.model.get_bind_adgroup_response_wrapper import GetBindAdgroupResponseWrapper
from baiduads.crowdfeed.model.get_bind_adgroup_request_wrapper import GetBindAdgroupRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_feed_service.CrowdFeedService(api_client)
    get_bind_adgroup_request_wrapper = GetBindAdgroupRequestWrapper(
        header=ApiRequestHeader(),
        body=GetBindAdgroupRequestWrapperBody(
            crowd_feed_types=[
                CrowdFeedType(
                    crowd_id=1,
                    crowd_name="crowd_name_example",
                ),
            ],
        ),
    ) # GetBindAdgroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_bind_adgroup(get_bind_adgroup_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdFeedService->get_bind_adgroup: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_bind_adgroup_request_wrapper** | [**GetBindAdgroupRequestWrapper**](GetBindAdgroupRequestWrapper.md)|  |

### Return type

[**GetBindAdgroupResponseWrapper**](GetBindAdgroupResponseWrapper.md)

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

# **get_eshop_elds_crowds**
> GetEshopEldsCrowdsResponseWrapper get_eshop_elds_crowds(get_eshop_elds_crowds_request_wrapper)



### Example


```python
import time
import baiduads
from crowdfeed.api import crowd_feed_service
from baiduads.crowdfeed.model.get_eshop_elds_crowds_response_wrapper import GetEshopEldsCrowdsResponseWrapper
from baiduads.crowdfeed.model.get_eshop_elds_crowds_request_wrapper import GetEshopEldsCrowdsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_feed_service.CrowdFeedService(api_client)
    get_eshop_elds_crowds_request_wrapper = GetEshopEldsCrowdsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetEshopCrowdRequest(
            campaign_feed_id=1,
        ),
    ) # GetEshopEldsCrowdsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_eshop_elds_crowds(get_eshop_elds_crowds_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdFeedService->get_eshop_elds_crowds: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_eshop_elds_crowds_request_wrapper** | [**GetEshopEldsCrowdsRequestWrapper**](GetEshopEldsCrowdsRequestWrapper.md)|  |

### Return type

[**GetEshopEldsCrowdsResponseWrapper**](GetEshopEldsCrowdsResponseWrapper.md)

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

# **get_eshop_trade_crowds**
> GetEshopTradeCrowdsResponseWrapper get_eshop_trade_crowds(get_eshop_trade_crowds_request_wrapper)



### Example


```python
import time
import baiduads
from crowdfeed.api import crowd_feed_service
from baiduads.crowdfeed.model.get_eshop_trade_crowds_response_wrapper import GetEshopTradeCrowdsResponseWrapper
from baiduads.crowdfeed.model.get_eshop_trade_crowds_request_wrapper import GetEshopTradeCrowdsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_feed_service.CrowdFeedService(api_client)
    get_eshop_trade_crowds_request_wrapper = GetEshopTradeCrowdsRequestWrapper(
        header=ApiRequestHeader(),
        body=GetEshopCrowdRequest(
            campaign_feed_id=1,
        ),
    ) # GetEshopTradeCrowdsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_eshop_trade_crowds(get_eshop_trade_crowds_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdFeedService->get_eshop_trade_crowds: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_eshop_trade_crowds_request_wrapper** | [**GetEshopTradeCrowdsRequestWrapper**](GetEshopTradeCrowdsRequestWrapper.md)|  |

### Return type

[**GetEshopTradeCrowdsResponseWrapper**](GetEshopTradeCrowdsResponseWrapper.md)

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

