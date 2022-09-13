# baiduads.PlatProductService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_product**](PlatProductService.md#delete_product) | **POST** /json/sms/service/PlatProductService/deleteProduct | 
[**get_product_detail**](PlatProductService.md#get_product_detail) | **POST** /json/sms/service/PlatProductService/getProductDetail | 
[**get_product_list**](PlatProductService.md#get_product_list) | **POST** /json/sms/service/PlatProductService/getProductList | 
[**mod_online_status**](PlatProductService.md#mod_online_status) | **POST** /json/sms/service/PlatProductService/modOnlineStatus | 
[**save_or_update_product**](PlatProductService.md#save_or_update_product) | **POST** /json/sms/service/PlatProductService/saveOrUpdateProduct | 


# **delete_product**
> DeleteProductResponseWrapper delete_product(delete_product_request_wrapper)



### Example


```python
import time
import baiduads
from platproduct.api import plat_product_service
from baiduads.platproduct.model.delete_product_request_wrapper import DeleteProductRequestWrapper
from baiduads.platproduct.model.delete_product_response_wrapper import DeleteProductResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_product_service.PlatProductService(api_client)
    delete_product_request_wrapper = DeleteProductRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatProductDeleteRequest(
            app_id=1,
            shop_id=1,
            spu_id=1,
        ),
    ) # DeleteProductRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_product(delete_product_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatProductService->delete_product: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_product_request_wrapper** | [**DeleteProductRequestWrapper**](DeleteProductRequestWrapper.md)|  |

### Return type

[**DeleteProductResponseWrapper**](DeleteProductResponseWrapper.md)

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

# **get_product_detail**
> GetProductDetailResponseWrapper get_product_detail(get_product_detail_request_wrapper)



### Example


```python
import time
import baiduads
from platproduct.api import plat_product_service
from baiduads.platproduct.model.get_product_detail_response_wrapper import GetProductDetailResponseWrapper
from baiduads.platproduct.model.get_product_detail_request_wrapper import GetProductDetailRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_product_service.PlatProductService(api_client)
    get_product_detail_request_wrapper = GetProductDetailRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatProductGetDetailRequest(
            app_id=1,
            shop_id=1,
            spu_id=1,
            query_type=1,
        ),
    ) # GetProductDetailRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_product_detail(get_product_detail_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatProductService->get_product_detail: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_product_detail_request_wrapper** | [**GetProductDetailRequestWrapper**](GetProductDetailRequestWrapper.md)|  |

### Return type

[**GetProductDetailResponseWrapper**](GetProductDetailResponseWrapper.md)

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

# **get_product_list**
> GetProductListResponseWrapper get_product_list(get_product_list_request_wrapper)



### Example


```python
import time
import baiduads
from platproduct.api import plat_product_service
from baiduads.platproduct.model.get_product_list_request_wrapper import GetProductListRequestWrapper
from baiduads.platproduct.model.get_product_list_response_wrapper import GetProductListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_product_service.PlatProductService(api_client)
    get_product_list_request_wrapper = GetProductListRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatProductGetListRequest(
            app_id=1,
            shop_id=1,
            page_num=1,
            page_size=1,
        ),
    ) # GetProductListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_product_list(get_product_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatProductService->get_product_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_product_list_request_wrapper** | [**GetProductListRequestWrapper**](GetProductListRequestWrapper.md)|  |

### Return type

[**GetProductListResponseWrapper**](GetProductListResponseWrapper.md)

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

# **mod_online_status**
> ModOnlineStatusResponseWrapper mod_online_status(mod_online_status_request_wrapper)



### Example


```python
import time
import baiduads
from platproduct.api import plat_product_service
from baiduads.platproduct.model.mod_online_status_response_wrapper import ModOnlineStatusResponseWrapper
from baiduads.platproduct.model.mod_online_status_request_wrapper import ModOnlineStatusRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_product_service.PlatProductService(api_client)
    mod_online_status_request_wrapper = ModOnlineStatusRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatProductModOnlineRequest(
            app_id=1,
            shop_id=1,
            spu_id=1,
            op_type=1,
        ),
    ) # ModOnlineStatusRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.mod_online_status(mod_online_status_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatProductService->mod_online_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mod_online_status_request_wrapper** | [**ModOnlineStatusRequestWrapper**](ModOnlineStatusRequestWrapper.md)|  |

### Return type

[**ModOnlineStatusResponseWrapper**](ModOnlineStatusResponseWrapper.md)

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

# **save_or_update_product**
> SaveOrUpdateProductResponseWrapper save_or_update_product(save_or_update_product_request_wrapper)



### Example


```python
import time
import baiduads
from platproduct.api import plat_product_service
from baiduads.platproduct.model.save_or_update_product_response_wrapper import SaveOrUpdateProductResponseWrapper
from baiduads.platproduct.model.save_or_update_product_request_wrapper import SaveOrUpdateProductRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_product_service.PlatProductService(api_client)
    save_or_update_product_request_wrapper = SaveOrUpdateProductRequestWrapper(
        header=ApiRequestHeader(),
        body=PlatProductSaveRequest(
            spu_unique_id=1,
            app_id=1,
            shop_id=1,
            name="name_example",
            type=1,
            save_flag=1,
            last_category_id=1,
            personalized_labels=[
                ProductPersonalizedLabelVo(
                    name="name_example",
                    desc="desc_example",
                ),
            ],
            attributes=[
                ProductSpuAttributeVo(
                    name="name_example",
                    option_value="option_value_example",
                ),
            ],
            support_pay_type=1,
            specifications=[
                ProductSpuSpecificationVo(
                    name="name_example",
                    values=[
                        "values_example",
                    ],
                ),
            ],
            sku_list=[
                PlatProductSkuVo(
                    sku_id=1,
                    sale_price={},
                    estimated_price={},
                    weight={},
                    stock=1,
                    locked_stock=1,
                    rest_stock=1,
                    image="image_example",
                    sku_ext_image="sku_ext_image_example",
                    sales=1,
                    specifications=[
                        ProductSkuSpecificationVo(
                            name="name_example",
                            option_value="option_value_example",
                        ),
                    ],
                    sku_code="sku_code_example",
                    sku_ext_name="sku_ext_name_example",
                    exchange_code=ProductExchangeCodeVo(
                        type=1,
                        add_code_list=[
                            "add_code_list_example",
                        ],
                        delete_code_list=[
                            "delete_code_list_example",
                        ],
                    ),
                ),
            ],
            virtual_code_start_time="virtual_code_start_time_example",
            virtual_code_end_time="virtual_code_end_time_example",
            image_album=[
                ProductImageVo(
                    scale="scale_example",
                    urls=[
                        "urls_example",
                    ],
                ),
            ],
            description="description_example",
            quotation="quotation_example",
            service_process="service_process_example",
            service_area="service_area_example",
            freight_template_id=1,
            delivery_config=PlatProductDeliveryConfigVo(
                switcher=True,
                predict_delivery_day=1,
            ),
            price={},
            sub_shop_ids=[
                1,
            ],
            send_exchange_code=1,
            service_item=[
                ServiceItem(
                    name="name_example",
                    service_item_value=ServiceItemValue(
                        price={},
                        num=1,
                    ),
                ),
            ],
            shop_brand_id=1,
        ),
    ) # SaveOrUpdateProductRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.save_or_update_product(save_or_update_product_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatProductService->save_or_update_product: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **save_or_update_product_request_wrapper** | [**SaveOrUpdateProductRequestWrapper**](SaveOrUpdateProductRequestWrapper.md)|  |

### Return type

[**SaveOrUpdateProductResponseWrapper**](SaveOrUpdateProductResponseWrapper.md)

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

