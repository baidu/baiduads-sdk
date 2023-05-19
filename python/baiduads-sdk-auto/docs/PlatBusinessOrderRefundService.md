# baiduads.PlatBusinessOrderRefundService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agree_order_refund**](PlatBusinessOrderRefundService.md#agree_order_refund) | **POST** /json/sms/service/PlatBusinessOrderRefundService/agreeOrderRefund | 
[**agree_order_return**](PlatBusinessOrderRefundService.md#agree_order_return) | **POST** /json/sms/service/PlatBusinessOrderRefundService/agreeOrderReturn | 
[**query_order_refund_info**](PlatBusinessOrderRefundService.md#query_order_refund_info) | **POST** /json/sms/service/PlatBusinessOrderRefundService/queryOrderRefundInfo | 
[**query_order_refund_list**](PlatBusinessOrderRefundService.md#query_order_refund_list) | **POST** /json/sms/service/PlatBusinessOrderRefundService/queryOrderRefundList | 
[**reject_order_refund**](PlatBusinessOrderRefundService.md#reject_order_refund) | **POST** /json/sms/service/PlatBusinessOrderRefundService/rejectOrderRefund | 


# **agree_order_refund**
> AgreeOrderRefundResponseWrapper agree_order_refund(agree_order_refund_request_wrapper)



### Example


```python
import time
import baiduads
from platbusinessorderrefund.api import plat_business_order_refund_service
from baiduads.platbusinessorderrefund.model.agree_order_refund_response_wrapper import AgreeOrderRefundResponseWrapper
from baiduads.platbusinessorderrefund.model.agree_order_refund_request_wrapper import AgreeOrderRefundRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_business_order_refund_service.PlatBusinessOrderRefundService(api_client)
    agree_order_refund_request_wrapper = AgreeOrderRefundRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatAgreeOrderRefundRequest(
            ucid=1,
            shop_id=1,
            app_id=1,
            order_id=1,
            refund_id=1,
            sub_order_id=1,
            complaint_id=1,
            operator_type=1,
            operator_desc="operator_desc_example",
            shop_name="shop_name_example",
            shop_logo_url="shop_logo_url_example",
        ),
    ) # AgreeOrderRefundRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.agree_order_refund(agree_order_refund_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatBusinessOrderRefundService->agree_order_refund: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agree_order_refund_request_wrapper** | [**AgreeOrderRefundRequestWrapper**](AgreeOrderRefundRequestWrapper.md)|  |

### Return type

[**AgreeOrderRefundResponseWrapper**](AgreeOrderRefundResponseWrapper.md)

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

# **agree_order_return**
> AgreeOrderReturnResponseWrapper agree_order_return(agree_order_return_request_wrapper)



### Example


```python
import time
import baiduads
from platbusinessorderrefund.api import plat_business_order_refund_service
from baiduads.platbusinessorderrefund.model.agree_order_return_request_wrapper import AgreeOrderReturnRequestWrapper
from baiduads.platbusinessorderrefund.model.agree_order_return_response_wrapper import AgreeOrderReturnResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_business_order_refund_service.PlatBusinessOrderRefundService(api_client)
    agree_order_return_request_wrapper = AgreeOrderReturnRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatAgreeOrderReturnRequest(
            app_id=1,
            refund_id=1,
            order_id=1,
            sub_order_id=1,
            complaint_id=1,
            ucid=1,
            shop_id=1,
            refund_name="refund_name_example",
            refund_phone="refund_phone_example",
            refund_address="refund_address_example",
            operator_type=1,
            operator_desc="operator_desc_example",
            shop_name="shop_name_example",
            shop_logo_url="shop_logo_url_example",
            memo="memo_example",
            province_code="province_code_example",
            province="province_example",
            city_code="city_code_example",
            city="city_example",
            area_code="area_code_example",
            area="area_example",
            address="address_example",
            return_desc="return_desc_example",
        ),
    ) # AgreeOrderReturnRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.agree_order_return(agree_order_return_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatBusinessOrderRefundService->agree_order_return: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agree_order_return_request_wrapper** | [**AgreeOrderReturnRequestWrapper**](AgreeOrderReturnRequestWrapper.md)|  |

### Return type

[**AgreeOrderReturnResponseWrapper**](AgreeOrderReturnResponseWrapper.md)

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

# **query_order_refund_info**
> QueryOrderRefundInfoResponseWrapper query_order_refund_info(query_order_refund_info_request_wrapper)



### Example


```python
import time
import baiduads
from platbusinessorderrefund.api import plat_business_order_refund_service
from baiduads.platbusinessorderrefund.model.query_order_refund_info_request_wrapper import QueryOrderRefundInfoRequestWrapper
from baiduads.platbusinessorderrefund.model.query_order_refund_info_response_wrapper import QueryOrderRefundInfoResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_business_order_refund_service.PlatBusinessOrderRefundService(api_client)
    query_order_refund_info_request_wrapper = QueryOrderRefundInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatRefundInfoRequest(
            ucid=1,
            app_id=1,
            refund_id=1,
            shop_id=1,
        ),
    ) # QueryOrderRefundInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_order_refund_info(query_order_refund_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatBusinessOrderRefundService->query_order_refund_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_order_refund_info_request_wrapper** | [**QueryOrderRefundInfoRequestWrapper**](QueryOrderRefundInfoRequestWrapper.md)|  |

### Return type

[**QueryOrderRefundInfoResponseWrapper**](QueryOrderRefundInfoResponseWrapper.md)

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

# **query_order_refund_list**
> QueryOrderRefundListResponseWrapper query_order_refund_list(query_order_refund_list_request_wrapper)



### Example


```python
import time
import baiduads
from platbusinessorderrefund.api import plat_business_order_refund_service
from baiduads.platbusinessorderrefund.model.query_order_refund_list_request_wrapper import QueryOrderRefundListRequestWrapper
from baiduads.platbusinessorderrefund.model.query_order_refund_list_response_wrapper import QueryOrderRefundListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_business_order_refund_service.PlatBusinessOrderRefundService(api_client)
    query_order_refund_list_request_wrapper = QueryOrderRefundListRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatRefundListRequest(
            ucid=1,
            app_id=1,
            order_id=1,
            shop_id=1,
            passport_id=1,
            refund_id=1,
            refund_type=1,
            refund_status=1,
            refund_reason=1,
            express_phone="express_phone_example",
            page_num=1,
            page_count=1,
            product_type=1,
            start_time="start_time_example",
            end_time="end_time_example",
            product_name="product_name_example",
            express_info="express_info_example",
        ),
    ) # QueryOrderRefundListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_order_refund_list(query_order_refund_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatBusinessOrderRefundService->query_order_refund_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_order_refund_list_request_wrapper** | [**QueryOrderRefundListRequestWrapper**](QueryOrderRefundListRequestWrapper.md)|  |

### Return type

[**QueryOrderRefundListResponseWrapper**](QueryOrderRefundListResponseWrapper.md)

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

# **reject_order_refund**
> RejectOrderRefundResponseWrapper reject_order_refund(reject_order_refund_request_wrapper)



### Example


```python
import time
import baiduads
from platbusinessorderrefund.api import plat_business_order_refund_service
from baiduads.platbusinessorderrefund.model.reject_order_refund_response_wrapper import RejectOrderRefundResponseWrapper
from baiduads.platbusinessorderrefund.model.reject_order_refund_request_wrapper import RejectOrderRefundRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_business_order_refund_service.PlatBusinessOrderRefundService(api_client)
    reject_order_refund_request_wrapper = RejectOrderRefundRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatRejectOrderRefundRequest(
            ucid=1,
            shop_id=1,
            app_id=1,
            refund_id=1,
            order_id=1,
            sub_order_id=1,
            complaint_id=1,
            reject_reason="reject_reason_example",
            reject_proof=[
                "reject_proof_example",
            ],
            shop_name="shop_name_example",
            shop_logo_url="shop_logo_url_example",
            reject_marks="reject_marks_example",
        ),
    ) # RejectOrderRefundRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.reject_order_refund(reject_order_refund_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatBusinessOrderRefundService->reject_order_refund: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reject_order_refund_request_wrapper** | [**RejectOrderRefundRequestWrapper**](RejectOrderRefundRequestWrapper.md)|  |

### Return type

[**RejectOrderRefundResponseWrapper**](RejectOrderRefundResponseWrapper.md)

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

