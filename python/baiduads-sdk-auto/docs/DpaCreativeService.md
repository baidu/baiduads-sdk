# baiduads.DpaCreativeService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_creative_group**](DpaCreativeService.md#add_creative_group) | **POST** /json/sms/service/DpaCreativeService/addCreativeGroup | 
[**add_creatives**](DpaCreativeService.md#add_creatives) | **POST** /json/sms/service/DpaCreativeService/addCreatives | 
[**bat_set_range**](DpaCreativeService.md#bat_set_range) | **POST** /json/sms/service/DpaCreativeService/batSetRange | 
[**delete_creative_group**](DpaCreativeService.md#delete_creative_group) | **POST** /json/sms/service/DpaCreativeService/deleteCreativeGroup | 
[**delete_creatives**](DpaCreativeService.md#delete_creatives) | **POST** /json/sms/service/DpaCreativeService/deleteCreatives | 
[**get_creative_group**](DpaCreativeService.md#get_creative_group) | **POST** /json/sms/service/DpaCreativeService/getCreativeGroup | 
[**get_creatives**](DpaCreativeService.md#get_creatives) | **POST** /json/sms/service/DpaCreativeService/getCreatives | 
[**get_format_templates**](DpaCreativeService.md#get_format_templates) | **POST** /json/sms/service/DpaCreativeService/getFormatTemplates | 
[**update_creative_group**](DpaCreativeService.md#update_creative_group) | **POST** /json/sms/service/DpaCreativeService/updateCreativeGroup | 
[**update_creatives**](DpaCreativeService.md#update_creatives) | **POST** /json/sms/service/DpaCreativeService/updateCreatives | 


# **add_creative_group**
> AddCreativeGroupResponseWrapper add_creative_group(add_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.add_creative_group_request_wrapper import AddCreativeGroupRequestWrapper
from baiduads.dpacreative.model.add_creative_group_response_wrapper import AddCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->add_creative_group: %s\n" % e)
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
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.add_creatives_request_wrapper import AddCreativesRequestWrapper
from baiduads.dpacreative.model.add_creatives_response_wrapper import AddCreativesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->add_creatives: %s\n" % e)
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

# **bat_set_range**
> BatSetRangeResponseWrapper bat_set_range(bat_set_range_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.bat_set_range_response_wrapper import BatSetRangeResponseWrapper
from baiduads.dpacreative.model.bat_set_range_request_wrapper import BatSetRangeRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->bat_set_range: %s\n" % e)
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
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.delete_creative_group_request_wrapper import DeleteCreativeGroupRequestWrapper
from baiduads.dpacreative.model.delete_creative_group_response_wrapper import DeleteCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->delete_creative_group: %s\n" % e)
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
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.delete_creatives_request_wrapper import DeleteCreativesRequestWrapper
from baiduads.dpacreative.model.delete_creatives_response_wrapper import DeleteCreativesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->delete_creatives: %s\n" % e)
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

# **get_creative_group**
> GetCreativeGroupResponseWrapper get_creative_group(get_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.get_creative_group_response_wrapper import GetCreativeGroupResponseWrapper
from baiduads.dpacreative.model.get_creative_group_request_wrapper import GetCreativeGroupRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->get_creative_group: %s\n" % e)
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
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.get_creatives_response_wrapper import GetCreativesResponseWrapper
from baiduads.dpacreative.model.get_creatives_request_wrapper import GetCreativesRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->get_creatives: %s\n" % e)
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

# **get_format_templates**
> GetFormatTemplatesResponseWrapper get_format_templates(get_format_templates_request_wrapper)



### Example


```python
import time
import baiduads
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.get_format_templates_request_wrapper import GetFormatTemplatesRequestWrapper
from baiduads.dpacreative.model.get_format_templates_response_wrapper import GetFormatTemplatesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->get_format_templates: %s\n" % e)
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
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.update_creative_group_request_wrapper import UpdateCreativeGroupRequestWrapper
from baiduads.dpacreative.model.update_creative_group_response_wrapper import UpdateCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->update_creative_group: %s\n" % e)
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
from dpacreative.api import dpa_creative_service
from baiduads.dpacreative.model.update_creatives_response_wrapper import UpdateCreativesResponseWrapper
from baiduads.dpacreative.model.update_creatives_request_wrapper import UpdateCreativesRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = dpa_creative_service.DpaCreativeService(api_client)
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
        print("Exception when calling DpaCreativeService->update_creatives: %s\n" % e)
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

