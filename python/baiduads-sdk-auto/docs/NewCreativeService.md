# baiduads.NewCreativeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_creative_group**](NewCreativeService.md#add_creative_group) | **POST** /json/sms/service/NewCreativeService/addCreativeGroup | 
[**add_creatives**](NewCreativeService.md#add_creatives) | **POST** /json/sms/service/NewCreativeService/addCreatives | 
[**add_dpa_creative**](NewCreativeService.md#add_dpa_creative) | **POST** /json/sms/service/NewCreativeService/addDpaCreative | 
[**bat_set_range**](NewCreativeService.md#bat_set_range) | **POST** /json/sms/service/NewCreativeService/batSetRange | 
[**delete_creative_group**](NewCreativeService.md#delete_creative_group) | **POST** /json/sms/service/NewCreativeService/deleteCreativeGroup | 
[**delete_creatives**](NewCreativeService.md#delete_creatives) | **POST** /json/sms/service/NewCreativeService/deleteCreatives | 
[**delete_dpa_creative**](NewCreativeService.md#delete_dpa_creative) | **POST** /json/sms/service/NewCreativeService/deleteDpaCreative | 
[**get_creative_group**](NewCreativeService.md#get_creative_group) | **POST** /json/sms/service/NewCreativeService/getCreativeGroup | 
[**get_creatives**](NewCreativeService.md#get_creatives) | **POST** /json/sms/service/NewCreativeService/getCreatives | 
[**get_dpa_creative**](NewCreativeService.md#get_dpa_creative) | **POST** /json/sms/service/NewCreativeService/getDpaCreative | 
[**get_dpa_material_types**](NewCreativeService.md#get_dpa_material_types) | **POST** /json/sms/service/NewCreativeService/getDpaMaterialTypes | 
[**get_format_templates**](NewCreativeService.md#get_format_templates) | **POST** /json/sms/service/NewCreativeService/getFormatTemplates | 
[**update_creative_group**](NewCreativeService.md#update_creative_group) | **POST** /json/sms/service/NewCreativeService/updateCreativeGroup | 
[**update_creatives**](NewCreativeService.md#update_creatives) | **POST** /json/sms/service/NewCreativeService/updateCreatives | 
[**update_dpa_creative**](NewCreativeService.md#update_dpa_creative) | **POST** /json/sms/service/NewCreativeService/updateDpaCreative | 


# **add_creative_group**
> AddCreativeGroupResponseWrapper add_creative_group(add_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.add_creative_group_request_wrapper import AddCreativeGroupRequestWrapper
from baiduads.newcreative.model.add_creative_group_response_wrapper import AddCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    add_creative_group_request_wrapper = AddCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=AddCreativeGroupRequest(
            creative_group_type=CreativeGroupType(
                creative_group_id=1,
                creative_group_name="creative_group_name_example",
                product_set_id=1,
                catalog_id=1,
                range_items=[
                    RangeItem(
                        campaign_id=1,
                        adgroup_id=1,
                        user_id=1,
                    ),
                ],
                format_ids=[
                    1,
                ],
                pause=True,
                monitor_url="monitor_url_example",
            ),
        ),
    ) # AddCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_creative_group(add_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->add_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_creative_group_request_wrapper** | [**AddCreativeGroupRequestWrapper**](AddCreativeGroupRequestWrapper.md)|  |

### Return type

[**AddCreativeGroupResponseWrapper**](AddCreativeGroupResponseWrapper.md)

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

# **add_creatives**
> AddCreativesResponseWrapper add_creatives(add_creatives_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.add_creatives_request_wrapper import AddCreativesRequestWrapper
from baiduads.newcreative.model.add_creatives_response_wrapper import AddCreativesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    add_creatives_request_wrapper = AddCreativesRequestWrapper(
        header=ApiRequestHeader(),
        body=AddCreativeRequest(
            creative_group_id=1,
            creative_types=[
                CreativeType(
                    creative_group_id=1,
                    format_id=1,
                    template_id=1,
                    template_fields="template_fields_example",
                ),
            ],
        ),
    ) # AddCreativesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_creatives(add_creatives_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->add_creatives: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_creatives_request_wrapper** | [**AddCreativesRequestWrapper**](AddCreativesRequestWrapper.md)|  |

### Return type

[**AddCreativesResponseWrapper**](AddCreativesResponseWrapper.md)

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

# **add_dpa_creative**
> AddDpaCreativeResponseWrapper add_dpa_creative(add_dpa_creative_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.add_dpa_creative_response_wrapper import AddDpaCreativeResponseWrapper
from baiduads.newcreative.model.add_dpa_creative_request_wrapper import AddDpaCreativeRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
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
        print("Exception when calling NewCreativeService->add_dpa_creative: %s\n" % e)
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

# **bat_set_range**
> BatSetRangeResponseWrapper bat_set_range(bat_set_range_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.bat_set_range_response_wrapper import BatSetRangeResponseWrapper
from baiduads.newcreative.model.bat_set_range_request_wrapper import BatSetRangeRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    bat_set_range_request_wrapper = BatSetRangeRequestWrapper(
        header=ApiRequestHeader(),
        body=BatchSetRangeRequest(
            bat_range_items=[
                SetRangeRequest(
                    creative_group_id=1,
                    range_items=[
                        RangeItem(
                            campaign_id=1,
                            adgroup_id=1,
                            user_id=1,
                        ),
                    ],
                ),
            ],
        ),
    ) # BatSetRangeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.bat_set_range(bat_set_range_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->bat_set_range: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bat_set_range_request_wrapper** | [**BatSetRangeRequestWrapper**](BatSetRangeRequestWrapper.md)|  |

### Return type

[**BatSetRangeResponseWrapper**](BatSetRangeResponseWrapper.md)

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

# **delete_creative_group**
> DeleteCreativeGroupResponseWrapper delete_creative_group(delete_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.delete_creative_group_request_wrapper import DeleteCreativeGroupRequestWrapper
from baiduads.newcreative.model.delete_creative_group_response_wrapper import DeleteCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    delete_creative_group_request_wrapper = DeleteCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeGroupIdRequest(
            creative_group_id=[
                1,
            ],
        ),
    ) # DeleteCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_creative_group(delete_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->delete_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_creative_group_request_wrapper** | [**DeleteCreativeGroupRequestWrapper**](DeleteCreativeGroupRequestWrapper.md)|  |

### Return type

[**DeleteCreativeGroupResponseWrapper**](DeleteCreativeGroupResponseWrapper.md)

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

# **delete_creatives**
> DeleteCreativesResponseWrapper delete_creatives(delete_creatives_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.delete_creatives_request_wrapper import DeleteCreativesRequestWrapper
from baiduads.newcreative.model.delete_creatives_response_wrapper import DeleteCreativesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    delete_creatives_request_wrapper = DeleteCreativesRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeIdRequest(
            creative_group_id=1,
            format_id=[
                1,
            ],
        ),
    ) # DeleteCreativesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_creatives(delete_creatives_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->delete_creatives: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_creatives_request_wrapper** | [**DeleteCreativesRequestWrapper**](DeleteCreativesRequestWrapper.md)|  |

### Return type

[**DeleteCreativesResponseWrapper**](DeleteCreativesResponseWrapper.md)

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
from newcreative.api import new_creative_service
from baiduads.newcreative.model.delete_dpa_creative_request_wrapper import DeleteDpaCreativeRequestWrapper
from baiduads.newcreative.model.delete_dpa_creative_response_wrapper import DeleteDpaCreativeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
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
        print("Exception when calling NewCreativeService->delete_dpa_creative: %s\n" % e)
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

# **get_creative_group**
> GetCreativeGroupResponseWrapper get_creative_group(get_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.get_creative_group_request_wrapper import GetCreativeGroupRequestWrapper
from baiduads.newcreative.model.get_creative_group_response_wrapper import GetCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    get_creative_group_request_wrapper = GetCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeGroupIdRequest(
            creative_group_id=[
                1,
            ],
        ),
    ) # GetCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creative_group(get_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->get_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creative_group_request_wrapper** | [**GetCreativeGroupRequestWrapper**](GetCreativeGroupRequestWrapper.md)|  |

### Return type

[**GetCreativeGroupResponseWrapper**](GetCreativeGroupResponseWrapper.md)

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

# **get_creatives**
> GetCreativesResponseWrapper get_creatives(get_creatives_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.get_creatives_response_wrapper import GetCreativesResponseWrapper
from baiduads.newcreative.model.get_creatives_request_wrapper import GetCreativesRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    get_creatives_request_wrapper = GetCreativesRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeGroupId(
            creative_group_id=1,
        ),
    ) # GetCreativesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_creatives(get_creatives_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->get_creatives: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_creatives_request_wrapper** | [**GetCreativesRequestWrapper**](GetCreativesRequestWrapper.md)|  |

### Return type

[**GetCreativesResponseWrapper**](GetCreativesResponseWrapper.md)

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
from newcreative.api import new_creative_service
from baiduads.newcreative.model.get_dpa_creative_request_wrapper import GetDpaCreativeRequestWrapper
from baiduads.newcreative.model.get_dpa_creative_response_wrapper import GetDpaCreativeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
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
        print("Exception when calling NewCreativeService->get_dpa_creative: %s\n" % e)
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
from newcreative.api import new_creative_service
from baiduads.newcreative.model.get_dpa_material_types_response_wrapper import GetDpaMaterialTypesResponseWrapper
from baiduads.newcreative.model.get_dpa_material_types_request_wrapper import GetDpaMaterialTypesRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
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
        print("Exception when calling NewCreativeService->get_dpa_material_types: %s\n" % e)
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

# **get_format_templates**
> GetFormatTemplatesResponseWrapper get_format_templates(get_format_templates_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.get_format_templates_request_wrapper import GetFormatTemplatesRequestWrapper
from baiduads.newcreative.model.get_format_templates_response_wrapper import GetFormatTemplatesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    get_format_templates_request_wrapper = GetFormatTemplatesRequestWrapper(
        header=ApiRequestHeader(),
        body=ProductSetIdRequest(
            product_set_id=1,
        ),
    ) # GetFormatTemplatesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_format_templates(get_format_templates_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->get_format_templates: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_format_templates_request_wrapper** | [**GetFormatTemplatesRequestWrapper**](GetFormatTemplatesRequestWrapper.md)|  |

### Return type

[**GetFormatTemplatesResponseWrapper**](GetFormatTemplatesResponseWrapper.md)

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

# **update_creative_group**
> UpdateCreativeGroupResponseWrapper update_creative_group(update_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.update_creative_group_response_wrapper import UpdateCreativeGroupResponseWrapper
from baiduads.newcreative.model.update_creative_group_request_wrapper import UpdateCreativeGroupRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    update_creative_group_request_wrapper = UpdateCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=AddCreativeGroupRequest(
            creative_group_type=CreativeGroupType(
                creative_group_id=1,
                creative_group_name="creative_group_name_example",
                product_set_id=1,
                catalog_id=1,
                range_items=[
                    RangeItem(
                        campaign_id=1,
                        adgroup_id=1,
                        user_id=1,
                    ),
                ],
                format_ids=[
                    1,
                ],
                pause=True,
                monitor_url="monitor_url_example",
            ),
        ),
    ) # UpdateCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_creative_group(update_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->update_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_creative_group_request_wrapper** | [**UpdateCreativeGroupRequestWrapper**](UpdateCreativeGroupRequestWrapper.md)|  |

### Return type

[**UpdateCreativeGroupResponseWrapper**](UpdateCreativeGroupResponseWrapper.md)

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

# **update_creatives**
> UpdateCreativesResponseWrapper update_creatives(update_creatives_request_wrapper)



### Example


```python
import time
import baiduads
from newcreative.api import new_creative_service
from baiduads.newcreative.model.update_creatives_response_wrapper import UpdateCreativesResponseWrapper
from baiduads.newcreative.model.update_creatives_request_wrapper import UpdateCreativesRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
    update_creatives_request_wrapper = UpdateCreativesRequestWrapper(
        header=ApiRequestHeader(),
        body=AddCreativeRequest(
            creative_group_id=1,
            creative_types=[
                CreativeType(
                    creative_group_id=1,
                    format_id=1,
                    template_id=1,
                    template_fields="template_fields_example",
                ),
            ],
        ),
    ) # UpdateCreativesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_creatives(update_creatives_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling NewCreativeService->update_creatives: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_creatives_request_wrapper** | [**UpdateCreativesRequestWrapper**](UpdateCreativesRequestWrapper.md)|  |

### Return type

[**UpdateCreativesResponseWrapper**](UpdateCreativesResponseWrapper.md)

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
from newcreative.api import new_creative_service
from baiduads.newcreative.model.update_dpa_creative_request_wrapper import UpdateDpaCreativeRequestWrapper
from baiduads.newcreative.model.update_dpa_creative_response_wrapper import UpdateDpaCreativeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = new_creative_service.NewCreativeService(api_client)
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
        print("Exception when calling NewCreativeService->update_dpa_creative: %s\n" % e)
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

