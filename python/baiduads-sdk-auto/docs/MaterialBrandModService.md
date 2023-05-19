# baiduads.MaterialBrandModService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_brand**](MaterialBrandModService.md#add_brand) | **POST** /json/sms/service/MaterialBrandModService/addBrand | 
[**delete_brand**](MaterialBrandModService.md#delete_brand) | **POST** /json/sms/service/MaterialBrandModService/deleteBrand | 
[**update_brand**](MaterialBrandModService.md#update_brand) | **POST** /json/sms/service/MaterialBrandModService/updateBrand | 
[**update_putaway**](MaterialBrandModService.md#update_putaway) | **POST** /json/sms/service/MaterialBrandModService/updatePutaway | 


# **add_brand**
> AddBrandResponseWrapper add_brand(add_brand_request_wrapper)



### Example


```python
import time
import baiduads
from materialbrandmod.api import material_brand_mod_service
from baiduads.materialbrandmod.model.add_brand_request_wrapper import AddBrandRequestWrapper
from baiduads.materialbrandmod.model.add_brand_response_wrapper import AddBrandResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_brand_mod_service.MaterialBrandModService(api_client)
    add_brand_request_wrapper = AddBrandRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaBrandAddRequest(
            status=1,
            name="name_example",
            logo=[
                BrandImage(
                    type="type_example",
                    image_url="image_url_example",
                    name="name_example",
                ),
            ],
            slogan="slogan_example",
            service_scope="service_scope_example",
            advantage=[
                "advantage_example",
            ],
            brand_story="brand_story_example",
            video=[
                BrandVideo(
                    video_url="video_url_example",
                    video_id=1,
                    cover_url="cover_url_example",
                    duration=1,
                ),
            ],
            qualification=[
                BrandImage(
                    type="type_example",
                    image_url="image_url_example",
                    name="name_example",
                ),
            ],
            image=[
                BrandImage(
                    type="type_example",
                    image_url="image_url_example",
                    name="name_example",
                ),
            ],
            tags=[
                BrandTags(
                    tag_name="tag_name_example",
                    tag_desc="tag_desc_example",
                ),
            ],
            trade_id=1,
        ),
    ) # AddBrandRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_brand(add_brand_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialBrandModService->add_brand: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_brand_request_wrapper** | [**AddBrandRequestWrapper**](AddBrandRequestWrapper.md)|  |

### Return type

[**AddBrandResponseWrapper**](AddBrandResponseWrapper.md)

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

# **delete_brand**
> DeleteBrandResponseWrapper delete_brand(delete_brand_request_wrapper)



### Example


```python
import time
import baiduads
from materialbrandmod.api import material_brand_mod_service
from baiduads.materialbrandmod.model.delete_brand_response_wrapper import DeleteBrandResponseWrapper
from baiduads.materialbrandmod.model.delete_brand_request_wrapper import DeleteBrandRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_brand_mod_service.MaterialBrandModService(api_client)
    delete_brand_request_wrapper = DeleteBrandRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaBrandDeleteRequest(
            brand_id=[
                1,
            ],
        ),
    ) # DeleteBrandRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_brand(delete_brand_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialBrandModService->delete_brand: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_brand_request_wrapper** | [**DeleteBrandRequestWrapper**](DeleteBrandRequestWrapper.md)|  |

### Return type

[**DeleteBrandResponseWrapper**](DeleteBrandResponseWrapper.md)

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

# **update_brand**
> UpdateBrandResponseWrapper update_brand(update_brand_request_wrapper)



### Example


```python
import time
import baiduads
from materialbrandmod.api import material_brand_mod_service
from baiduads.materialbrandmod.model.update_brand_response_wrapper import UpdateBrandResponseWrapper
from baiduads.materialbrandmod.model.update_brand_request_wrapper import UpdateBrandRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_brand_mod_service.MaterialBrandModService(api_client)
    update_brand_request_wrapper = UpdateBrandRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaBrandUpdateRequest(
            brand_id=1,
            status=1,
            name="name_example",
            logo=[
                BrandImage(
                    type="type_example",
                    image_url="image_url_example",
                    name="name_example",
                ),
            ],
            slogan="slogan_example",
            service_scope="service_scope_example",
            advantage=[
                "advantage_example",
            ],
            brand_story="brand_story_example",
            video=[
                BrandVideo(
                    video_url="video_url_example",
                    video_id=1,
                    cover_url="cover_url_example",
                    duration=1,
                ),
            ],
            qualification=[
                BrandImage(
                    type="type_example",
                    image_url="image_url_example",
                    name="name_example",
                ),
            ],
            image=[
                BrandImage(
                    type="type_example",
                    image_url="image_url_example",
                    name="name_example",
                ),
            ],
            tags=[
                BrandTags(
                    tag_name="tag_name_example",
                    tag_desc="tag_desc_example",
                ),
            ],
            trade_id=1,
        ),
    ) # UpdateBrandRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_brand(update_brand_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialBrandModService->update_brand: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_brand_request_wrapper** | [**UpdateBrandRequestWrapper**](UpdateBrandRequestWrapper.md)|  |

### Return type

[**UpdateBrandResponseWrapper**](UpdateBrandResponseWrapper.md)

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

# **update_putaway**
> UpdatePutawayResponseWrapper update_putaway(update_putaway_request_wrapper)



### Example


```python
import time
import baiduads
from materialbrandmod.api import material_brand_mod_service
from baiduads.materialbrandmod.model.update_putaway_request_wrapper import UpdatePutawayRequestWrapper
from baiduads.materialbrandmod.model.update_putaway_response_wrapper import UpdatePutawayResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_brand_mod_service.MaterialBrandModService(api_client)
    update_putaway_request_wrapper = UpdatePutawayRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaBrandUpdatePutawayRequest(
            brand_id=[
                1,
            ],
            status=1,
        ),
    ) # UpdatePutawayRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_putaway(update_putaway_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialBrandModService->update_putaway: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_putaway_request_wrapper** | [**UpdatePutawayRequestWrapper**](UpdatePutawayRequestWrapper.md)|  |

### Return type

[**UpdatePutawayResponseWrapper**](UpdatePutawayResponseWrapper.md)

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

