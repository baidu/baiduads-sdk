# baiduads.PlatOrderBusinessQueryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_express_name_list**](PlatOrderBusinessQueryService.md#get_express_name_list) | **POST** /json/sms/service/PlatOrderBusinessQueryService/getExpressNameList | 
[**get_order_detail**](PlatOrderBusinessQueryService.md#get_order_detail) | **POST** /json/sms/service/PlatOrderBusinessQueryService/getOrderDetail | 
[**get_order_express_package**](PlatOrderBusinessQueryService.md#get_order_express_package) | **POST** /json/sms/service/PlatOrderBusinessQueryService/getOrderExpressPackage | 
[**get_part_consign_order_list**](PlatOrderBusinessQueryService.md#get_part_consign_order_list) | **POST** /json/sms/service/PlatOrderBusinessQueryService/getPartConsignOrderList | 


# **get_express_name_list**
> GetExpressNameListResponseWrapper get_express_name_list(get_express_name_list_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusinessquery.api import plat_order_business_query_service
from baiduads.platorderbusinessquery.model.get_express_name_list_request_wrapper import GetExpressNameListRequestWrapper
from baiduads.platorderbusinessquery.model.get_express_name_list_response_wrapper import GetExpressNameListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_query_service.PlatOrderBusinessQueryService(api_client)
    get_express_name_list_request_wrapper = GetExpressNameListRequestWrapper(
        header=ApiRequestHeader(),
        body=ExpressNameReq(
            express_name="express_name_example",
            shop_id=1,
            app_id=1,
        ),
    ) # GetExpressNameListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_express_name_list(get_express_name_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessQueryService->get_express_name_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_express_name_list_request_wrapper** | [**GetExpressNameListRequestWrapper**](GetExpressNameListRequestWrapper.md)|  |

### Return type

[**GetExpressNameListResponseWrapper**](GetExpressNameListResponseWrapper.md)

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

# **get_order_detail**
> GetOrderDetailResponseWrapper get_order_detail(get_order_detail_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusinessquery.api import plat_order_business_query_service
from baiduads.platorderbusinessquery.model.get_order_detail_request_wrapper import GetOrderDetailRequestWrapper
from baiduads.platorderbusinessquery.model.get_order_detail_response_wrapper import GetOrderDetailResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_query_service.PlatOrderBusinessQueryService(api_client)
    get_order_detail_request_wrapper = GetOrderDetailRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatOrderIdRequest(
            order_id=1,
            shop_id=1,
            app_id=1,
        ),
    ) # GetOrderDetailRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_order_detail(get_order_detail_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessQueryService->get_order_detail: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_order_detail_request_wrapper** | [**GetOrderDetailRequestWrapper**](GetOrderDetailRequestWrapper.md)|  |

### Return type

[**GetOrderDetailResponseWrapper**](GetOrderDetailResponseWrapper.md)

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

# **get_order_express_package**
> GetOrderExpressPackageResponseWrapper get_order_express_package(get_order_express_package_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusinessquery.api import plat_order_business_query_service
from baiduads.platorderbusinessquery.model.get_order_express_package_response_wrapper import GetOrderExpressPackageResponseWrapper
from baiduads.platorderbusinessquery.model.get_order_express_package_request_wrapper import GetOrderExpressPackageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_query_service.PlatOrderBusinessQueryService(api_client)
    get_order_express_package_request_wrapper = GetOrderExpressPackageRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatOrderExpressInfoRequest(
            order_id=1,
            tracking_number="tracking_number_example",
            shop_id=1,
            app_id=1,
        ),
    ) # GetOrderExpressPackageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_order_express_package(get_order_express_package_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessQueryService->get_order_express_package: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_order_express_package_request_wrapper** | [**GetOrderExpressPackageRequestWrapper**](GetOrderExpressPackageRequestWrapper.md)|  |

### Return type

[**GetOrderExpressPackageResponseWrapper**](GetOrderExpressPackageResponseWrapper.md)

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

# **get_part_consign_order_list**
> GetPartConsignOrderListResponseWrapper get_part_consign_order_list(get_part_consign_order_list_request_wrapper)



### Example


```python
import time
import baiduads
from platorderbusinessquery.api import plat_order_business_query_service
from baiduads.platorderbusinessquery.model.get_part_consign_order_list_response_wrapper import GetPartConsignOrderListResponseWrapper
from baiduads.platorderbusinessquery.model.get_part_consign_order_list_request_wrapper import GetPartConsignOrderListRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_order_business_query_service.PlatOrderBusinessQueryService(api_client)
    get_part_consign_order_list_request_wrapper = GetPartConsignOrderListRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatOrderListRequest(
            order_id=1,
            product_name="product_name_example",
            receiver="receiver_example",
            receiver_mobile="receiver_mobile_example",
            order_status=[
                1,
            ],
            refund_status=[
                1,
            ],
            order_type=[
                1,
            ],
            fields=[
                "fields_example",
            ],
            start_create_time="start_create_time_example",
            end_create_time="end_create_time_example",
            desc=True,
            sort_field="sort_field_example",
            anti_user_id=1,
            express_status=1,
            ucid=1,
            shop_id=1,
            app_id=1,
            order_ids=[
                1,
            ],
            click_type=[
                1,
            ],
            complete_start_time="complete_start_time_example",
            complete_end_time="complete_end_time_example",
            product_id=1,
            tracking_number="tracking_number_example",
            normal_order_type=1,
            abnormal_order_type=1,
            operate_tag=True,
            bring_goods_type=1,
            passport_id=1,
            cuid="cuid_example",
            click_ucid="click_ucid_example",
            download_options=1,
            pay_order_id=1,
            start_update_time="start_update_time_example",
            end_update_time="end_update_time_example",
            page_size=1,
            page_num=1,
        ),
    ) # GetPartConsignOrderListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_part_consign_order_list(get_part_consign_order_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatOrderBusinessQueryService->get_part_consign_order_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_part_consign_order_list_request_wrapper** | [**GetPartConsignOrderListRequestWrapper**](GetPartConsignOrderListRequestWrapper.md)|  |

### Return type

[**GetPartConsignOrderListResponseWrapper**](GetPartConsignOrderListResponseWrapper.md)

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

