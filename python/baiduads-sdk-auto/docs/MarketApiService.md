# baiduads.MarketApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_order**](MarketApiService.md#cancel_order) | **POST** /json/sms/service/MarketApiService/cancelOrder | 
[**create_order**](MarketApiService.md#create_order) | **POST** /json/sms/service/MarketApiService/createOrder | 
[**get_order_info**](MarketApiService.md#get_order_info) | **POST** /json/sms/service/MarketApiService/getOrderInfo | 
[**get_site_info**](MarketApiService.md#get_site_info) | **POST** /json/sms/service/MarketApiService/getSiteInfo | 
[**preview_site**](MarketApiService.md#preview_site) | **POST** /json/sms/service/MarketApiService/previewSite | 


# **cancel_order**
> CancelOrderResponseWrapper cancel_order(cancel_order_request_wrapper)



### Example


```python
import time
import baiduads
from marketapi.api import market_api_service
from baiduads.marketapi.model.cancel_order_response_wrapper import CancelOrderResponseWrapper
from baiduads.marketapi.model.cancel_order_request_wrapper import CancelOrderRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = market_api_service.MarketApiService(api_client)
    cancel_order_request_wrapper = CancelOrderRequestWrapper(
        header=ApiRequestHeader(),
        body=SingleRequest(
            item=OpenOrderInfoRequest(
                order_id_list=[
                    1,
                ],
            ),
        ),
    ) # CancelOrderRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.cancel_order(cancel_order_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MarketApiService->cancel_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancel_order_request_wrapper** | [**CancelOrderRequestWrapper**](CancelOrderRequestWrapper.md)|  |

### Return type

[**CancelOrderResponseWrapper**](CancelOrderResponseWrapper.md)

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

# **create_order**
> CreateOrderResponseWrapper create_order(create_order_request_wrapper)



### Example


```python
import time
import baiduads
from marketapi.api import market_api_service
from baiduads.marketapi.model.create_order_response_wrapper import CreateOrderResponseWrapper
from baiduads.marketapi.model.create_order_request_wrapper import CreateOrderRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = market_api_service.MarketApiService(api_client)
    create_order_request_wrapper = CreateOrderRequestWrapper(
        header=ApiRequestHeader(),
        body=SingleRequest(
            item=OpenOrderInfoRequest(
                order_id_list=[
                    1,
                ],
            ),
        ),
    ) # CreateOrderRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_order(create_order_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MarketApiService->create_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_order_request_wrapper** | [**CreateOrderRequestWrapper**](CreateOrderRequestWrapper.md)|  |

### Return type

[**CreateOrderResponseWrapper**](CreateOrderResponseWrapper.md)

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

# **get_order_info**
> GetOrderInfoResponseWrapper get_order_info(get_order_info_request_wrapper)



### Example


```python
import time
import baiduads
from marketapi.api import market_api_service
from baiduads.marketapi.model.get_order_info_request_wrapper import GetOrderInfoRequestWrapper
from baiduads.marketapi.model.get_order_info_response_wrapper import GetOrderInfoResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = market_api_service.MarketApiService(api_client)
    get_order_info_request_wrapper = GetOrderInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=SingleRequest(
            item=OpenOrderInfoRequest(
                order_id_list=[
                    1,
                ],
            ),
        ),
    ) # GetOrderInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_order_info(get_order_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MarketApiService->get_order_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_order_info_request_wrapper** | [**GetOrderInfoRequestWrapper**](GetOrderInfoRequestWrapper.md)|  |

### Return type

[**GetOrderInfoResponseWrapper**](GetOrderInfoResponseWrapper.md)

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

# **get_site_info**
> GetSiteInfoResponseWrapper get_site_info(get_site_info_request_wrapper)



### Example


```python
import time
import baiduads
from marketapi.api import market_api_service
from baiduads.marketapi.model.get_site_info_response_wrapper import GetSiteInfoResponseWrapper
from baiduads.marketapi.model.get_site_info_request_wrapper import GetSiteInfoRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = market_api_service.MarketApiService(api_client)
    get_site_info_request_wrapper = GetSiteInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=SingleRequest(
            item=OpenOrderInfoRequest(
                order_id_list=[
                    1,
                ],
            ),
        ),
    ) # GetSiteInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_site_info(get_site_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MarketApiService->get_site_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_site_info_request_wrapper** | [**GetSiteInfoRequestWrapper**](GetSiteInfoRequestWrapper.md)|  |

### Return type

[**GetSiteInfoResponseWrapper**](GetSiteInfoResponseWrapper.md)

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

# **preview_site**
> PreviewSiteResponseWrapper preview_site(preview_site_request_wrapper)



### Example


```python
import time
import baiduads
from marketapi.api import market_api_service
from baiduads.marketapi.model.preview_site_response_wrapper import PreviewSiteResponseWrapper
from baiduads.marketapi.model.preview_site_request_wrapper import PreviewSiteRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = market_api_service.MarketApiService(api_client)
    preview_site_request_wrapper = PreviewSiteRequestWrapper(
        header=ApiRequestHeader(),
        body=SingleRequest(
            item=OpenOrderInfoRequest(
                order_id_list=[
                    1,
                ],
            ),
        ),
    ) # PreviewSiteRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.preview_site(preview_site_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MarketApiService->preview_site: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preview_site_request_wrapper** | [**PreviewSiteRequestWrapper**](PreviewSiteRequestWrapper.md)|  |

### Return type

[**PreviewSiteResponseWrapper**](PreviewSiteResponseWrapper.md)

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

