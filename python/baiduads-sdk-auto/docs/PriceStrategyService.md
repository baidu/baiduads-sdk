# baiduads.PriceStrategyService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_price_strategy**](PriceStrategyService.md#add_price_strategy) | **POST** /json/sms/service/PriceStrategyService/addPriceStrategy | 
[**delete_price_strategy**](PriceStrategyService.md#delete_price_strategy) | **POST** /json/sms/service/PriceStrategyService/deletePriceStrategy | 
[**get_price_strategy**](PriceStrategyService.md#get_price_strategy) | **POST** /json/sms/service/PriceStrategyService/getPriceStrategy | 
[**update_price_strategy**](PriceStrategyService.md#update_price_strategy) | **POST** /json/sms/service/PriceStrategyService/updatePriceStrategy | 


# **add_price_strategy**
> AddPriceStrategyResponseWrapper add_price_strategy(add_price_strategy_request_wrapper)



### Example


```python
import time
import baiduads
from pricestrategy.api import price_strategy_service
from baiduads.pricestrategy.model.add_price_strategy_request_wrapper import AddPriceStrategyRequestWrapper
from baiduads.pricestrategy.model.add_price_strategy_response_wrapper import AddPriceStrategyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = price_strategy_service.PriceStrategyService(api_client)
    add_price_strategy_request_wrapper = AddPriceStrategyRequestWrapper(
        header=ApiRequestHeader(),
        body=PriceStrategyModRequest(
            price_strategy_types=[
                PriceStrategyType(
                    user_id=1,
                    strategy_id=1,
                    strategy_name="strategy_name_example",
                    strategy_type=1,
                    target_rank=1,
                    price_factor=3.14,
                    target_url="target_url_example",
                    sub_type=1,
                    is_pause=True,
                    word_count=1,
                    strategy_words=[
                        PriceStrategyWordType(
                            strategy_keyword_id=1,
                            strategy_id=1,
                            keyword_id=1,
                            keyword="keyword_example",
                            price=3.14,
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            status=1,
                            is_delete=True,
                        ),
                    ],
                    strategy_level=1,
                    price_strategy_campaign_types=[
                        PriceStrategyCampaignType(
                            strategy_campaign_id=1,
                            strategy_id=1,
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            is_delete=True,
                        ),
                    ],
                ),
            ],
        ),
    ) # AddPriceStrategyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_price_strategy(add_price_strategy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PriceStrategyService->add_price_strategy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_price_strategy_request_wrapper** | [**AddPriceStrategyRequestWrapper**](AddPriceStrategyRequestWrapper.md)|  |

### Return type

[**AddPriceStrategyResponseWrapper**](AddPriceStrategyResponseWrapper.md)

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

# **delete_price_strategy**
> DeletePriceStrategyResponseWrapper delete_price_strategy(delete_price_strategy_request_wrapper)



### Example


```python
import time
import baiduads
from pricestrategy.api import price_strategy_service
from baiduads.pricestrategy.model.delete_price_strategy_request_wrapper import DeletePriceStrategyRequestWrapper
from baiduads.pricestrategy.model.delete_price_strategy_response_wrapper import DeletePriceStrategyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = price_strategy_service.PriceStrategyService(api_client)
    delete_price_strategy_request_wrapper = DeletePriceStrategyRequestWrapper(
        header=ApiRequestHeader(),
        body=PriceStrategyDelRequest(
            strategy_ids=[
                1,
            ],
        ),
    ) # DeletePriceStrategyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_price_strategy(delete_price_strategy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PriceStrategyService->delete_price_strategy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_price_strategy_request_wrapper** | [**DeletePriceStrategyRequestWrapper**](DeletePriceStrategyRequestWrapper.md)|  |

### Return type

[**DeletePriceStrategyResponseWrapper**](DeletePriceStrategyResponseWrapper.md)

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

# **get_price_strategy**
> GetPriceStrategyResponseWrapper get_price_strategy(get_price_strategy_request_wrapper)



### Example


```python
import time
import baiduads
from pricestrategy.api import price_strategy_service
from baiduads.pricestrategy.model.get_price_strategy_response_wrapper import GetPriceStrategyResponseWrapper
from baiduads.pricestrategy.model.get_price_strategy_request_wrapper import GetPriceStrategyRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = price_strategy_service.PriceStrategyService(api_client)
    get_price_strategy_request_wrapper = GetPriceStrategyRequestWrapper(
        header=ApiRequestHeader(),
        body=PriceStrategyQueryRequest(
            order_by="order_by_example",
            fields=[
                "fields_example",
            ],
            strategy_types=[
                1,
            ],
            strategy_levels=[
                1,
            ],
            ids=[
                1,
            ],
            id_type=1,
        ),
    ) # GetPriceStrategyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_price_strategy(get_price_strategy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PriceStrategyService->get_price_strategy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_price_strategy_request_wrapper** | [**GetPriceStrategyRequestWrapper**](GetPriceStrategyRequestWrapper.md)|  |

### Return type

[**GetPriceStrategyResponseWrapper**](GetPriceStrategyResponseWrapper.md)

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

# **update_price_strategy**
> UpdatePriceStrategyResponseWrapper update_price_strategy(update_price_strategy_request_wrapper)



### Example


```python
import time
import baiduads
from pricestrategy.api import price_strategy_service
from baiduads.pricestrategy.model.update_price_strategy_request_wrapper import UpdatePriceStrategyRequestWrapper
from baiduads.pricestrategy.model.update_price_strategy_response_wrapper import UpdatePriceStrategyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = price_strategy_service.PriceStrategyService(api_client)
    update_price_strategy_request_wrapper = UpdatePriceStrategyRequestWrapper(
        header=ApiRequestHeader(),
        body=PriceStrategyModRequest(
            price_strategy_types=[
                PriceStrategyType(
                    user_id=1,
                    strategy_id=1,
                    strategy_name="strategy_name_example",
                    strategy_type=1,
                    target_rank=1,
                    price_factor=3.14,
                    target_url="target_url_example",
                    sub_type=1,
                    is_pause=True,
                    word_count=1,
                    strategy_words=[
                        PriceStrategyWordType(
                            strategy_keyword_id=1,
                            strategy_id=1,
                            keyword_id=1,
                            keyword="keyword_example",
                            price=3.14,
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            status=1,
                            is_delete=True,
                        ),
                    ],
                    strategy_level=1,
                    price_strategy_campaign_types=[
                        PriceStrategyCampaignType(
                            strategy_campaign_id=1,
                            strategy_id=1,
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            is_delete=True,
                        ),
                    ],
                ),
            ],
        ),
    ) # UpdatePriceStrategyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_price_strategy(update_price_strategy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PriceStrategyService->update_price_strategy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_price_strategy_request_wrapper** | [**UpdatePriceStrategyRequestWrapper**](UpdatePriceStrategyRequestWrapper.md)|  |

### Return type

[**UpdatePriceStrategyResponseWrapper**](UpdatePriceStrategyResponseWrapper.md)

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

