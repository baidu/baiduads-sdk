# baiduads.PlatOrderBusinessService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirm_or_cancel_order**](PlatOrderBusinessService.md#confirm_or_cancel_order) | **POST** /json/sms/service/PlatOrderBusinessService/confirmOrCancelOrder | 
[**deliver_order**](PlatOrderBusinessService.md#deliver_order) | **POST** /json/sms/service/PlatOrderBusinessService/deliverOrder | 
[**reject_order**](PlatOrderBusinessService.md#reject_order) | **POST** /json/sms/service/PlatOrderBusinessService/rejectOrder | 
[**take_order**](PlatOrderBusinessService.md#take_order) | **POST** /json/sms/service/PlatOrderBusinessService/takeOrder | 
[**update_remark**](PlatOrderBusinessService.md#update_remark) | **POST** /json/sms/service/PlatOrderBusinessService/updateRemark | 


# **confirm_or_cancel_order**
> ConfirmOrCancelOrderResponseWrapper confirm_or_cancel_order(confirm_or_cancel_order_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusiness.api import plat_order_business_service
from baiduads.platorderbusiness.model.confirm_or_cancel_order_response_wrapper import ConfirmOrCancelOrderResponseWrapper
from baiduads.platorderbusiness.model.confirm_or_cancel_order_request_wrapper import ConfirmOrCancelOrderRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_service.PlatOrderBusinessService(api_client)
    confirm_or_cancel_order_request_wrapper = ConfirmOrCancelOrderRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatConfirmOrCancelRequest(
            order_id=1,
            type=1,
            shop_id=1,
            app_id=1,
        ),
    ) # ConfirmOrCancelOrderRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.confirm_or_cancel_order(confirm_or_cancel_order_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessService->confirm_or_cancel_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **confirm_or_cancel_order_request_wrapper** | [**ConfirmOrCancelOrderRequestWrapper**](ConfirmOrCancelOrderRequestWrapper.md)|  |

### Return type

[**ConfirmOrCancelOrderResponseWrapper**](ConfirmOrCancelOrderResponseWrapper.md)

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

# **deliver_order**
> DeliverOrderResponseWrapper deliver_order(deliver_order_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusiness.api import plat_order_business_service
from baiduads.platorderbusiness.model.deliver_order_response_wrapper import DeliverOrderResponseWrapper
from baiduads.platorderbusiness.model.deliver_order_request_wrapper import DeliverOrderRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_service.PlatOrderBusinessService(api_client)
    deliver_order_request_wrapper = DeliverOrderRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatOrderDeliverRequest(
            order_id=1,
            tracking_number="tracking_number_example",
            express_name="express_name_example",
            memo="memo_example",
            order_package_infos=[
                PlatExpressPackageRequest(
                    tracking_number="tracking_number_example",
                    express_name="express_name_example",
                    package_memo="package_memo_example",
                    package_id=1,
                    sub_order_ids=[
                        1,
                    ],
                ),
            ],
            additional_deliver_tag=1,
            shop_id=1,
            app_id=1,
        ),
    ) # DeliverOrderRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.deliver_order(deliver_order_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessService->deliver_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliver_order_request_wrapper** | [**DeliverOrderRequestWrapper**](DeliverOrderRequestWrapper.md)|  |

### Return type

[**DeliverOrderResponseWrapper**](DeliverOrderResponseWrapper.md)

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

# **reject_order**
> RejectOrderResponseWrapper reject_order(reject_order_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusiness.api import plat_order_business_service
from baiduads.platorderbusiness.model.reject_order_response_wrapper import RejectOrderResponseWrapper
from baiduads.platorderbusiness.model.reject_order_request_wrapper import RejectOrderRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_service.PlatOrderBusinessService(api_client)
    reject_order_request_wrapper = RejectOrderRequestWrapper(
        header=ApiRequestHeader(),
        body=RejectOrderReq(
            app_id=1,
            uc_id=1,
            shop_id=1,
            biz_id=1,
            order_id=1,
        ),
    ) # RejectOrderRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.reject_order(reject_order_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessService->reject_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reject_order_request_wrapper** | [**RejectOrderRequestWrapper**](RejectOrderRequestWrapper.md)|  |

### Return type

[**RejectOrderResponseWrapper**](RejectOrderResponseWrapper.md)

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

# **take_order**
> TakeOrderResponseWrapper take_order(take_order_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusiness.api import plat_order_business_service
from baiduads.platorderbusiness.model.take_order_response_wrapper import TakeOrderResponseWrapper
from baiduads.platorderbusiness.model.take_order_request_wrapper import TakeOrderRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_service.PlatOrderBusinessService(api_client)
    take_order_request_wrapper = TakeOrderRequestWrapper(
        header=ApiRequestHeader(),
        body=TakeOrderReq(
            app_id=1,
            uc_id=1,
            shop_id=1,
            biz_id=1,
            order_id=1,
            return_data="return_data_example",
        ),
    ) # TakeOrderRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.take_order(take_order_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessService->take_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **take_order_request_wrapper** | [**TakeOrderRequestWrapper**](TakeOrderRequestWrapper.md)|  |

### Return type

[**TakeOrderResponseWrapper**](TakeOrderResponseWrapper.md)

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

# **update_remark**
> UpdateRemarkResponseWrapper update_remark(update_remark_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusiness.api import plat_order_business_service
from baiduads.platorderbusiness.model.update_remark_response_wrapper import UpdateRemarkResponseWrapper
from baiduads.platorderbusiness.model.update_remark_request_wrapper import UpdateRemarkRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_service.PlatOrderBusinessService(api_client)
    update_remark_request_wrapper = UpdateRemarkRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatOrderRemarkUpdateRequest(
            order_id=1,
            remark="remark_example",
            shop_id=1,
            app_id=1,
        ),
    ) # UpdateRemarkRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_remark(update_remark_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessService->update_remark: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_remark_request_wrapper** | [**UpdateRemarkRequestWrapper**](UpdateRemarkRequestWrapper.md)|  |

### Return type

[**UpdateRemarkResponseWrapper**](UpdateRemarkResponseWrapper.md)

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

