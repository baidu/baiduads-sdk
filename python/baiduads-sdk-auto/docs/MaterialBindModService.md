# baiduads.MaterialBindModService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_material_bind**](MaterialBindModService.md#add_material_bind) | **POST** /json/sms/service/MaterialBindModService/addMaterialBind | 
[**delete_material_bind**](MaterialBindModService.md#delete_material_bind) | **POST** /json/sms/service/MaterialBindModService/deleteMaterialBind | 
[**update_material_bind**](MaterialBindModService.md#update_material_bind) | **POST** /json/sms/service/MaterialBindModService/updateMaterialBind | 


# **add_material_bind**
> AddMaterialBindResponseWrapper add_material_bind(add_material_bind_request_wrapper)



### Example


```python
import time
import baiduads
from materialbindmod.api import material_bind_mod_service
from baiduads.materialbindmod.model.add_material_bind_response_wrapper import AddMaterialBindResponseWrapper
from baiduads.materialbindmod.model.add_material_bind_request_wrapper import AddMaterialBindRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_bind_mod_service.MaterialBindModService(api_client)
    add_material_bind_request_wrapper = AddMaterialBindRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaMaterialBindAddRequest(
            material_id=1,
            material_type=1,
            bind_material_id=[
                1,
            ],
            bind_material_type=1,
        ),
    ) # AddMaterialBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_material_bind(add_material_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialBindModService->add_material_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_material_bind_request_wrapper** | [**AddMaterialBindRequestWrapper**](AddMaterialBindRequestWrapper.md)|  |

### Return type

[**AddMaterialBindResponseWrapper**](AddMaterialBindResponseWrapper.md)

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

# **delete_material_bind**
> DeleteMaterialBindResponseWrapper delete_material_bind(delete_material_bind_request_wrapper)



### Example


```python
import time
import baiduads
from materialbindmod.api import material_bind_mod_service
from baiduads.materialbindmod.model.delete_material_bind_request_wrapper import DeleteMaterialBindRequestWrapper
from baiduads.materialbindmod.model.delete_material_bind_response_wrapper import DeleteMaterialBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_bind_mod_service.MaterialBindModService(api_client)
    delete_material_bind_request_wrapper = DeleteMaterialBindRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaMaterialBindDeleteRequest(
            material_id=1,
            material_type=1,
            bind_material_id=[
                1,
            ],
            bind_material_type=1,
        ),
    ) # DeleteMaterialBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_material_bind(delete_material_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialBindModService->delete_material_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_material_bind_request_wrapper** | [**DeleteMaterialBindRequestWrapper**](DeleteMaterialBindRequestWrapper.md)|  |

### Return type

[**DeleteMaterialBindResponseWrapper**](DeleteMaterialBindResponseWrapper.md)

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

# **update_material_bind**
> UpdateMaterialBindResponseWrapper update_material_bind(update_material_bind_request_wrapper)



### Example


```python
import time
import baiduads
from materialbindmod.api import material_bind_mod_service
from baiduads.materialbindmod.model.update_material_bind_request_wrapper import UpdateMaterialBindRequestWrapper
from baiduads.materialbindmod.model.update_material_bind_response_wrapper import UpdateMaterialBindResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_bind_mod_service.MaterialBindModService(api_client)
    update_material_bind_request_wrapper = UpdateMaterialBindRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaMaterialBindUpdateRequest(
            material_id=1,
            material_type=1,
            bind_material_id=[
                1,
            ],
            bind_material_type=1,
        ),
    ) # UpdateMaterialBindRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_material_bind(update_material_bind_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialBindModService->update_material_bind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_material_bind_request_wrapper** | [**UpdateMaterialBindRequestWrapper**](UpdateMaterialBindRequestWrapper.md)|  |

### Return type

[**UpdateMaterialBindResponseWrapper**](UpdateMaterialBindResponseWrapper.md)

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

