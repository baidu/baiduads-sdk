# baiduads.IndustryTrafficService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_search_trend_by_dev2**](IndustryTrafficService.md#get_search_trend_by_dev2) | **POST** /json/sms/service/IndustryTrafficService/getSearchTrendByDev2 | 
[**get_search_word_list**](IndustryTrafficService.md#get_search_word_list) | **POST** /json/sms/service/IndustryTrafficService/getSearchWordList | 
[**get_trade_node_list_v2**](IndustryTrafficService.md#get_trade_node_list_v2) | **POST** /json/sms/service/IndustryTrafficService/getTradeNodeListV2 | 


# **get_search_trend_by_dev2**
> GetSearchTrendByDev2ResponseWrapper get_search_trend_by_dev2(get_search_trend_by_dev2_request_wrapper)



### Example


```python
import time
import baiduads
from industrytraffic.api import industry_traffic_service
from baiduads.industrytraffic.model.get_search_trend_by_dev2_response_wrapper import GetSearchTrendByDev2ResponseWrapper
from baiduads.industrytraffic.model.get_search_trend_by_dev2_request_wrapper import GetSearchTrendByDev2RequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = industry_traffic_service.IndustryTrafficService(api_client)
    get_search_trend_by_dev2_request_wrapper = GetSearchTrendByDev2RequestWrapper(
        header=ApiRequestHeader(),
        body=SearchTrendRequest(
            first_trade_name="first_trade_name_example",
            second_trade_name="second_trade_name_example",
            device_sources=[
                "device_sources_example",
            ],
            start_date="start_date_example",
            end_date="end_date_example",
            geo_gran="geo_gran_example",
            geo_target=[
                "geo_target_example",
            ],
            type="type_example",
        ),
    ) # GetSearchTrendByDev2RequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_search_trend_by_dev2(get_search_trend_by_dev2_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling IndustryTrafficService->get_search_trend_by_dev2: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_search_trend_by_dev2_request_wrapper** | [**GetSearchTrendByDev2RequestWrapper**](GetSearchTrendByDev2RequestWrapper.md)|  |

### Return type

[**GetSearchTrendByDev2ResponseWrapper**](GetSearchTrendByDev2ResponseWrapper.md)

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

# **get_search_word_list**
> GetSearchWordListResponseWrapper get_search_word_list(get_search_word_list_request_wrapper)



### Example


```python
import time
import baiduads
from industrytraffic.api import industry_traffic_service
from baiduads.industrytraffic.model.get_search_word_list_response_wrapper import GetSearchWordListResponseWrapper
from baiduads.industrytraffic.model.get_search_word_list_request_wrapper import GetSearchWordListRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = industry_traffic_service.IndustryTrafficService(api_client)
    get_search_word_list_request_wrapper = GetSearchWordListRequestWrapper(
        header=ApiRequestHeader(),
        body=SearchTrendRequest(
            first_trade_name="first_trade_name_example",
            second_trade_name="second_trade_name_example",
            device_sources=[
                "device_sources_example",
            ],
            start_date="start_date_example",
            end_date="end_date_example",
            geo_gran="geo_gran_example",
            geo_target=[
                "geo_target_example",
            ],
            type="type_example",
        ),
    ) # GetSearchWordListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_search_word_list(get_search_word_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling IndustryTrafficService->get_search_word_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_search_word_list_request_wrapper** | [**GetSearchWordListRequestWrapper**](GetSearchWordListRequestWrapper.md)|  |

### Return type

[**GetSearchWordListResponseWrapper**](GetSearchWordListResponseWrapper.md)

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

# **get_trade_node_list_v2**
> GetTradeNodeListV2ResponseWrapper get_trade_node_list_v2(get_trade_node_list_v2_request_wrapper)



### Example


```python
import time
import baiduads
from industrytraffic.api import industry_traffic_service
from baiduads.industrytraffic.model.get_trade_node_list_v2_request_wrapper import GetTradeNodeListV2RequestWrapper
from baiduads.industrytraffic.model.get_trade_node_list_v2_response_wrapper import GetTradeNodeListV2ResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = industry_traffic_service.IndustryTrafficService(api_client)
    get_trade_node_list_v2_request_wrapper = GetTradeNodeListV2RequestWrapper(
        header=ApiRequestHeader(),
    ) # GetTradeNodeListV2RequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_trade_node_list_v2(get_trade_node_list_v2_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling IndustryTrafficService->get_trade_node_list_v2: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_trade_node_list_v2_request_wrapper** | [**GetTradeNodeListV2RequestWrapper**](GetTradeNodeListV2RequestWrapper.md)|  |

### Return type

[**GetTradeNodeListV2ResponseWrapper**](GetTradeNodeListV2ResponseWrapper.md)

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

