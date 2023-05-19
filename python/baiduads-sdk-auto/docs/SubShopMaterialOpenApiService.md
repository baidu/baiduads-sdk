# baiduads.SubShopMaterialOpenApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_publicity_image**](SubShopMaterialOpenApiService.md#add_publicity_image) | **POST** /json/sms/service/SubShopMaterialOpenApiService/addPublicityImage | 
[**get_album_types**](SubShopMaterialOpenApiService.md#get_album_types) | **POST** /json/sms/service/SubShopMaterialOpenApiService/getAlbumTypes | 
[**remove_publicity_image**](SubShopMaterialOpenApiService.md#remove_publicity_image) | **POST** /json/sms/service/SubShopMaterialOpenApiService/removePublicityImage | 


# **add_publicity_image**
> AddPublicityImageResponseWrapper add_publicity_image(add_publicity_image_request_wrapper)



### Example


```python
import time
import baiduads
from subshopmaterialopenapi.api import sub_shop_material_open_api_service
from baiduads.subshopmaterialopenapi.model.add_publicity_image_request_wrapper import AddPublicityImageRequestWrapper
from baiduads.subshopmaterialopenapi.model.add_publicity_image_response_wrapper import AddPublicityImageResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = sub_shop_material_open_api_service.SubShopMaterialOpenApiService(api_client)
    add_publicity_image_request_wrapper = AddPublicityImageRequestWrapper(
        header=ApiRequestHeader(),
        body=PublicityImageRequest(
            sub_shop_ids=[
                1,
            ],
            urls=[
                "urls_example",
            ],
            album_id=1,
        ),
    ) # AddPublicityImageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_publicity_image(add_publicity_image_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SubShopMaterialOpenApiService->add_publicity_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_publicity_image_request_wrapper** | [**AddPublicityImageRequestWrapper**](AddPublicityImageRequestWrapper.md)|  |

### Return type

[**AddPublicityImageResponseWrapper**](AddPublicityImageResponseWrapper.md)

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

# **get_album_types**
> GetAlbumTypesResponseWrapper get_album_types(get_album_types_request_wrapper)



### Example


```python
import time
import baiduads
from subshopmaterialopenapi.api import sub_shop_material_open_api_service
from baiduads.subshopmaterialopenapi.model.get_album_types_request_wrapper import GetAlbumTypesRequestWrapper
from baiduads.subshopmaterialopenapi.model.get_album_types_response_wrapper import GetAlbumTypesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = sub_shop_material_open_api_service.SubShopMaterialOpenApiService(api_client)
    get_album_types_request_wrapper = GetAlbumTypesRequestWrapper(
        header=ApiRequestHeader(),
        body=BaseRequest(
            app_id=1,
            sub_shop_id=1,
        ),
    ) # GetAlbumTypesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_album_types(get_album_types_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SubShopMaterialOpenApiService->get_album_types: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_album_types_request_wrapper** | [**GetAlbumTypesRequestWrapper**](GetAlbumTypesRequestWrapper.md)|  |

### Return type

[**GetAlbumTypesResponseWrapper**](GetAlbumTypesResponseWrapper.md)

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

# **remove_publicity_image**
> RemovePublicityImageResponseWrapper remove_publicity_image(remove_publicity_image_request_wrapper)



### Example


```python
import time
import baiduads
from subshopmaterialopenapi.api import sub_shop_material_open_api_service
from baiduads.subshopmaterialopenapi.model.remove_publicity_image_response_wrapper import RemovePublicityImageResponseWrapper
from baiduads.subshopmaterialopenapi.model.remove_publicity_image_request_wrapper import RemovePublicityImageRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = sub_shop_material_open_api_service.SubShopMaterialOpenApiService(api_client)
    remove_publicity_image_request_wrapper = RemovePublicityImageRequestWrapper(
        header=ApiRequestHeader(),
        body=PublicityImageRequest(
            sub_shop_ids=[
                1,
            ],
            urls=[
                "urls_example",
            ],
            album_id=1,
        ),
    ) # RemovePublicityImageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.remove_publicity_image(remove_publicity_image_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SubShopMaterialOpenApiService->remove_publicity_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **remove_publicity_image_request_wrapper** | [**RemovePublicityImageRequestWrapper**](RemovePublicityImageRequestWrapper.md)|  |

### Return type

[**RemovePublicityImageResponseWrapper**](RemovePublicityImageResponseWrapper.md)

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

