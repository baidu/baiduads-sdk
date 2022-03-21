# baiduads.DpaApiProductSetService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_product_set**](DpaApiProductSetService.md#add_product_set) | **POST** /json/sms/service/DpaApiProductSetService/addProductSet | 
[**delete_product_set**](DpaApiProductSetService.md#delete_product_set) | **POST** /json/sms/service/DpaApiProductSetService/deleteProductSet | 
[**get_catalog_fields_info**](DpaApiProductSetService.md#get_catalog_fields_info) | **POST** /json/sms/service/DpaApiProductSetService/getCatalogFieldsInfo | 
[**get_catalog_material_fields_info**](DpaApiProductSetService.md#get_catalog_material_fields_info) | **POST** /json/sms/service/DpaApiProductSetService/getCatalogMaterialFieldsInfo | 
[**get_product_set**](DpaApiProductSetService.md#get_product_set) | **POST** /json/sms/service/DpaApiProductSetService/getProductSet | 
[**get_product_set_by_catalog**](DpaApiProductSetService.md#get_product_set_by_catalog) | **POST** /json/sms/service/DpaApiProductSetService/getProductSetByCatalog | 
[**update_product_set**](DpaApiProductSetService.md#update_product_set) | **POST** /json/sms/service/DpaApiProductSetService/updateProductSet | 


# **add_product_set**
> AddProductSetResponseWrapper add_product_set(add_product_set_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapiproductset.api import dpa_api_product_set_service
from baiduads.dpaapiproductset.model.add_product_set_request_wrapper import AddProductSetRequestWrapper
from baiduads.dpaapiproductset.model.add_product_set_response_wrapper import AddProductSetResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_product_set_service.DpaApiProductSetService(api_client)
    add_product_set_request_wrapper = AddProductSetRequestWrapper(
        header=ApiRequestHeader(),
        body=AddPsetRequest(
            product_set_type=ProductSetType(
                user_id=1,
                product_set_id=1,
                product_set_name="product_set_name_example",
                catalog_id=1,
                conditions=[
                    ProductSetRule(
                        field="field_example",
                        operation="operation_example",
                        value="value_example",
                    ),
                ],
                product_num=1,
                product_line="product_line_example",
            ),
        ),
    ) # AddProductSetRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_product_set(add_product_set_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiProductSetService->add_product_set: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_product_set_request_wrapper** | [**AddProductSetRequestWrapper**](AddProductSetRequestWrapper.md)|  |

### Return type

[**AddProductSetResponseWrapper**](AddProductSetResponseWrapper.md)

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

# **delete_product_set**
> DeleteProductSetResponseWrapper delete_product_set(delete_product_set_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapiproductset.api import dpa_api_product_set_service
from baiduads.dpaapiproductset.model.delete_product_set_request_wrapper import DeleteProductSetRequestWrapper
from baiduads.dpaapiproductset.model.delete_product_set_response_wrapper import DeleteProductSetResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_product_set_service.DpaApiProductSetService(api_client)
    delete_product_set_request_wrapper = DeleteProductSetRequestWrapper(
        header=ApiRequestHeader(),
        body=GetPsetRequest(
            product_set_ids=[
                1,
            ],
        ),
    ) # DeleteProductSetRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_product_set(delete_product_set_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiProductSetService->delete_product_set: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_product_set_request_wrapper** | [**DeleteProductSetRequestWrapper**](DeleteProductSetRequestWrapper.md)|  |

### Return type

[**DeleteProductSetResponseWrapper**](DeleteProductSetResponseWrapper.md)

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

# **get_catalog_fields_info**
> GetCatalogFieldsInfoResponseWrapper get_catalog_fields_info(get_catalog_fields_info_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapiproductset.api import dpa_api_product_set_service
from baiduads.dpaapiproductset.model.get_catalog_fields_info_request_wrapper import GetCatalogFieldsInfoRequestWrapper
from baiduads.dpaapiproductset.model.get_catalog_fields_info_response_wrapper import GetCatalogFieldsInfoResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_product_set_service.DpaApiProductSetService(api_client)
    get_catalog_fields_info_request_wrapper = GetCatalogFieldsInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCatalogFieldsInfoRequest(
            catalog_id=1,
        ),
    ) # GetCatalogFieldsInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_catalog_fields_info(get_catalog_fields_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiProductSetService->get_catalog_fields_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_catalog_fields_info_request_wrapper** | [**GetCatalogFieldsInfoRequestWrapper**](GetCatalogFieldsInfoRequestWrapper.md)|  |

### Return type

[**GetCatalogFieldsInfoResponseWrapper**](GetCatalogFieldsInfoResponseWrapper.md)

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

# **get_catalog_material_fields_info**
> GetCatalogMaterialFieldsInfoResponseWrapper get_catalog_material_fields_info(get_catalog_material_fields_info_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapiproductset.api import dpa_api_product_set_service
from baiduads.dpaapiproductset.model.get_catalog_material_fields_info_request_wrapper import GetCatalogMaterialFieldsInfoRequestWrapper
from baiduads.dpaapiproductset.model.get_catalog_material_fields_info_response_wrapper import GetCatalogMaterialFieldsInfoResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_product_set_service.DpaApiProductSetService(api_client)
    get_catalog_material_fields_info_request_wrapper = GetCatalogMaterialFieldsInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=MaterialFieldRequest(
            product_set_id=1,
        ),
    ) # GetCatalogMaterialFieldsInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_catalog_material_fields_info(get_catalog_material_fields_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiProductSetService->get_catalog_material_fields_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_catalog_material_fields_info_request_wrapper** | [**GetCatalogMaterialFieldsInfoRequestWrapper**](GetCatalogMaterialFieldsInfoRequestWrapper.md)|  |

### Return type

[**GetCatalogMaterialFieldsInfoResponseWrapper**](GetCatalogMaterialFieldsInfoResponseWrapper.md)

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

# **get_product_set**
> GetProductSetResponseWrapper get_product_set(get_product_set_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapiproductset.api import dpa_api_product_set_service
from baiduads.dpaapiproductset.model.get_product_set_response_wrapper import GetProductSetResponseWrapper
from baiduads.dpaapiproductset.model.get_product_set_request_wrapper import GetProductSetRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_product_set_service.DpaApiProductSetService(api_client)
    get_product_set_request_wrapper = GetProductSetRequestWrapper(
        header=ApiRequestHeader(),
        body=GetPsetRequest(
            product_set_ids=[
                1,
            ],
        ),
    ) # GetProductSetRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_product_set(get_product_set_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiProductSetService->get_product_set: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_product_set_request_wrapper** | [**GetProductSetRequestWrapper**](GetProductSetRequestWrapper.md)|  |

### Return type

[**GetProductSetResponseWrapper**](GetProductSetResponseWrapper.md)

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

# **get_product_set_by_catalog**
> GetProductSetByCatalogResponseWrapper get_product_set_by_catalog(get_product_set_by_catalog_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapiproductset.api import dpa_api_product_set_service
from baiduads.dpaapiproductset.model.get_product_set_by_catalog_response_wrapper import GetProductSetByCatalogResponseWrapper
from baiduads.dpaapiproductset.model.get_product_set_by_catalog_request_wrapper import GetProductSetByCatalogRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_product_set_service.DpaApiProductSetService(api_client)
    get_product_set_by_catalog_request_wrapper = GetProductSetByCatalogRequestWrapper(
        header=ApiRequestHeader(),
        body=CatalogIdRequest(
            catalog_id=1,
            product_line="product_line_example",
        ),
    ) # GetProductSetByCatalogRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_product_set_by_catalog(get_product_set_by_catalog_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiProductSetService->get_product_set_by_catalog: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_product_set_by_catalog_request_wrapper** | [**GetProductSetByCatalogRequestWrapper**](GetProductSetByCatalogRequestWrapper.md)|  |

### Return type

[**GetProductSetByCatalogResponseWrapper**](GetProductSetByCatalogResponseWrapper.md)

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

# **update_product_set**
> UpdateProductSetResponseWrapper update_product_set(update_product_set_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapiproductset.api import dpa_api_product_set_service
from baiduads.dpaapiproductset.model.update_product_set_response_wrapper import UpdateProductSetResponseWrapper
from baiduads.dpaapiproductset.model.update_product_set_request_wrapper import UpdateProductSetRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_product_set_service.DpaApiProductSetService(api_client)
    update_product_set_request_wrapper = UpdateProductSetRequestWrapper(
        header=ApiRequestHeader(),
        body=AddPsetRequest(
            product_set_type=ProductSetType(
                user_id=1,
                product_set_id=1,
                product_set_name="product_set_name_example",
                catalog_id=1,
                conditions=[
                    ProductSetRule(
                        field="field_example",
                        operation="operation_example",
                        value="value_example",
                    ),
                ],
                product_num=1,
                product_line="product_line_example",
            ),
        ),
    ) # UpdateProductSetRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_product_set(update_product_set_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiProductSetService->update_product_set: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_product_set_request_wrapper** | [**UpdateProductSetRequestWrapper**](UpdateProductSetRequestWrapper.md)|  |

### Return type

[**UpdateProductSetResponseWrapper**](UpdateProductSetResponseWrapper.md)

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

