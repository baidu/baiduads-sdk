# baiduads.DpaApiCreativeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_dpa_creative**](DpaApiCreativeService.md#add_dpa_creative) | **POST** /json/sms/service/DpaApiCreativeService/addDpaCreative | 
[**delete_dpa_creative**](DpaApiCreativeService.md#delete_dpa_creative) | **POST** /json/sms/service/DpaApiCreativeService/deleteDpaCreative | 
[**get_dpa_creative**](DpaApiCreativeService.md#get_dpa_creative) | **POST** /json/sms/service/DpaApiCreativeService/getDpaCreative | 
[**get_dpa_material_types**](DpaApiCreativeService.md#get_dpa_material_types) | **POST** /json/sms/service/DpaApiCreativeService/getDpaMaterialTypes | 
[**update_dpa_creative**](DpaApiCreativeService.md#update_dpa_creative) | **POST** /json/sms/service/DpaApiCreativeService/updateDpaCreative | 


# **add_dpa_creative**
> AddDpaCreativeResponseWrapper add_dpa_creative(add_dpa_creative_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapicreative.api import dpa_api_creative_service
from baiduads.dpaapicreative.model.add_dpa_creative_response_wrapper import AddDpaCreativeResponseWrapper
from baiduads.dpaapicreative.model.add_dpa_creative_request_wrapper import AddDpaCreativeRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_creative_service.DpaApiCreativeService(api_client)
    add_dpa_creative_request_wrapper = AddDpaCreativeRequestWrapper(
        header=ApiRequestHeader(),
        body=DpaAddCreativeRequest(
            dpa_creative_types=[
                DpaCreativeType(
                    user_id=1,
                    campaign_id=1,
                    adgroup_id=1,
                    basic_creative=DpaBasicCreativeType(
                        title="title_example",
                        desc="desc_example",
                        pc_link_url="pc_link_url_example",
                        wireless_link_url="wireless_link_url_example",
                        wireless_link_url_box_app="wireless_link_url_box_app_example",
                        wireless_link_url_deep_link="wireless_link_url_deep_link_example",
                    ),
                    product_creatives=[
                        DpaProductCreativeType(
                            creative_id=1,
                            mt_id=1,
                            template_id=1,
                            status="status_example",
                            en_name="en_name_example",
                            data={},
                            huitu_creative=DpaHuituCreative(
                                group_id=1,
                                schema_id=1,
                                template_id=1,
                                mt_id=1,
                                version=1,
                                name="name_example",
                                fields=[
                                    HuituCreativeField(
                                        name="name_example",
                                        value="value_example",
                                        color="color_example",
                                    ),
                                ],
                                status="status_example",
                            ),
                            index=1,
                        ),
                    ],
                    show_url="show_url_example",
                    index=1,
                    monitor_url="monitor_url_example",
                ),
            ],
        ),
    ) # AddDpaCreativeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_dpa_creative(add_dpa_creative_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiCreativeService->add_dpa_creative: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_dpa_creative_request_wrapper** | [**AddDpaCreativeRequestWrapper**](AddDpaCreativeRequestWrapper.md)|  |

### Return type

[**AddDpaCreativeResponseWrapper**](AddDpaCreativeResponseWrapper.md)

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

# **delete_dpa_creative**
> DeleteDpaCreativeResponseWrapper delete_dpa_creative(delete_dpa_creative_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapicreative.api import dpa_api_creative_service
from baiduads.dpaapicreative.model.delete_dpa_creative_request_wrapper import DeleteDpaCreativeRequestWrapper
from baiduads.dpaapicreative.model.delete_dpa_creative_response_wrapper import DeleteDpaCreativeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_creative_service.DpaApiCreativeService(api_client)
    delete_dpa_creative_request_wrapper = DeleteDpaCreativeRequestWrapper(
        header=ApiRequestHeader(),
        body=DpaDeleteCreativeRequest(
            creative_ids=[
                1,
            ],
            adgroup_ids=[
                1,
            ],
        ),
    ) # DeleteDpaCreativeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_dpa_creative(delete_dpa_creative_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiCreativeService->delete_dpa_creative: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_dpa_creative_request_wrapper** | [**DeleteDpaCreativeRequestWrapper**](DeleteDpaCreativeRequestWrapper.md)|  |

### Return type

[**DeleteDpaCreativeResponseWrapper**](DeleteDpaCreativeResponseWrapper.md)

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

# **get_dpa_creative**
> GetDpaCreativeResponseWrapper get_dpa_creative(get_dpa_creative_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapicreative.api import dpa_api_creative_service
from baiduads.dpaapicreative.model.get_dpa_creative_response_wrapper import GetDpaCreativeResponseWrapper
from baiduads.dpaapicreative.model.get_dpa_creative_request_wrapper import GetDpaCreativeRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_creative_service.DpaApiCreativeService(api_client)
    get_dpa_creative_request_wrapper = GetDpaCreativeRequestWrapper(
        header=ApiRequestHeader(),
        body=DpaGetCreativeRequest(
            id_type=1,
            ids=[
                1,
            ],
            fields=[
                "fields_example",
            ],
        ),
    ) # GetDpaCreativeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_dpa_creative(get_dpa_creative_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiCreativeService->get_dpa_creative: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_dpa_creative_request_wrapper** | [**GetDpaCreativeRequestWrapper**](GetDpaCreativeRequestWrapper.md)|  |

### Return type

[**GetDpaCreativeResponseWrapper**](GetDpaCreativeResponseWrapper.md)

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

# **get_dpa_material_types**
> GetDpaMaterialTypesResponseWrapper get_dpa_material_types(get_dpa_material_types_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapicreative.api import dpa_api_creative_service
from baiduads.dpaapicreative.model.get_dpa_material_types_request_wrapper import GetDpaMaterialTypesRequestWrapper
from baiduads.dpaapicreative.model.get_dpa_material_types_response_wrapper import GetDpaMaterialTypesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_creative_service.DpaApiCreativeService(api_client)
    get_dpa_material_types_request_wrapper = GetDpaMaterialTypesRequestWrapper(
        header=ApiRequestHeader(),
        body=DpaGetMaterialTypeRequest(
            adgroup_id=1,
        ),
    ) # GetDpaMaterialTypesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_dpa_material_types(get_dpa_material_types_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiCreativeService->get_dpa_material_types: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_dpa_material_types_request_wrapper** | [**GetDpaMaterialTypesRequestWrapper**](GetDpaMaterialTypesRequestWrapper.md)|  |

### Return type

[**GetDpaMaterialTypesResponseWrapper**](GetDpaMaterialTypesResponseWrapper.md)

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

# **update_dpa_creative**
> UpdateDpaCreativeResponseWrapper update_dpa_creative(update_dpa_creative_request_wrapper)



### Example


```python
import time
import baiduads
from dpaapicreative.api import dpa_api_creative_service
from baiduads.dpaapicreative.model.update_dpa_creative_response_wrapper import UpdateDpaCreativeResponseWrapper
from baiduads.dpaapicreative.model.update_dpa_creative_request_wrapper import UpdateDpaCreativeRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_api_creative_service.DpaApiCreativeService(api_client)
    update_dpa_creative_request_wrapper = UpdateDpaCreativeRequestWrapper(
        header=ApiRequestHeader(),
        body=DpaUpdateCreativeRequest(
            dpa_creative_types=[
                DpaCreativeType(
                    user_id=1,
                    campaign_id=1,
                    adgroup_id=1,
                    basic_creative=DpaBasicCreativeType(
                        title="title_example",
                        desc="desc_example",
                        pc_link_url="pc_link_url_example",
                        wireless_link_url="wireless_link_url_example",
                        wireless_link_url_box_app="wireless_link_url_box_app_example",
                        wireless_link_url_deep_link="wireless_link_url_deep_link_example",
                    ),
                    product_creatives=[
                        DpaProductCreativeType(
                            creative_id=1,
                            mt_id=1,
                            template_id=1,
                            status="status_example",
                            en_name="en_name_example",
                            data={},
                            huitu_creative=DpaHuituCreative(
                                group_id=1,
                                schema_id=1,
                                template_id=1,
                                mt_id=1,
                                version=1,
                                name="name_example",
                                fields=[
                                    HuituCreativeField(
                                        name="name_example",
                                        value="value_example",
                                        color="color_example",
                                    ),
                                ],
                                status="status_example",
                            ),
                            index=1,
                        ),
                    ],
                    show_url="show_url_example",
                    index=1,
                    monitor_url="monitor_url_example",
                ),
            ],
        ),
    ) # UpdateDpaCreativeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_dpa_creative(update_dpa_creative_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DpaApiCreativeService->update_dpa_creative: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_dpa_creative_request_wrapper** | [**UpdateDpaCreativeRequestWrapper**](UpdateDpaCreativeRequestWrapper.md)|  |

### Return type

[**UpdateDpaCreativeResponseWrapper**](UpdateDpaCreativeResponseWrapper.md)

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

