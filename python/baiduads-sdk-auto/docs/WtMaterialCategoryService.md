# baiduads.WtMaterialCategoryService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_category**](WtMaterialCategoryService.md#delete_category) | **POST** /json/sms/service/WtMaterialCategoryService/deleteCategory | 
[**get_category_list**](WtMaterialCategoryService.md#get_category_list) | **POST** /json/sms/service/WtMaterialCategoryService/getCategoryList | 
[**update_category**](WtMaterialCategoryService.md#update_category) | **POST** /json/sms/service/WtMaterialCategoryService/updateCategory | 


# **delete_category**
> DeleteCategoryResponseWrapper delete_category(delete_category_request_wrapper)



### Example


```python
import time
import baiduads
from wtmaterialcategory.api import wt_material_category_service
from baiduads.wtmaterialcategory.model.delete_category_response_wrapper import DeleteCategoryResponseWrapper
from baiduads.wtmaterialcategory.model.delete_category_request_wrapper import DeleteCategoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = wt_material_category_service.WtMaterialCategoryService(api_client)
    delete_category_request_wrapper = DeleteCategoryRequestWrapper(
        header=ApiRequestHeader(),
        body=DeleteCategoryRequest(
            category_id=1,
            type=1,
        ),
    ) # DeleteCategoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_category(delete_category_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WtMaterialCategoryService->delete_category: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_category_request_wrapper** | [**DeleteCategoryRequestWrapper**](DeleteCategoryRequestWrapper.md)|  |

### Return type

[**DeleteCategoryResponseWrapper**](DeleteCategoryResponseWrapper.md)

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

# **get_category_list**
> GetCategoryListResponseWrapper get_category_list(get_category_list_request_wrapper)



### Example


```python
import time
import baiduads
from wtmaterialcategory.api import wt_material_category_service
from baiduads.wtmaterialcategory.model.get_category_list_request_wrapper import GetCategoryListRequestWrapper
from baiduads.wtmaterialcategory.model.get_category_list_response_wrapper import GetCategoryListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = wt_material_category_service.WtMaterialCategoryService(api_client)
    get_category_list_request_wrapper = GetCategoryListRequestWrapper(
        header=ApiRequestHeader(),
        body=GetCategoryListRequest(
            type=1,
            page_size=1,
            page_num=1,
            status=1,
        ),
    ) # GetCategoryListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_category_list(get_category_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WtMaterialCategoryService->get_category_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_category_list_request_wrapper** | [**GetCategoryListRequestWrapper**](GetCategoryListRequestWrapper.md)|  |

### Return type

[**GetCategoryListResponseWrapper**](GetCategoryListResponseWrapper.md)

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

# **update_category**
> UpdateCategoryResponseWrapper update_category(update_category_request_wrapper)



### Example


```python
import time
import baiduads
from wtmaterialcategory.api import wt_material_category_service
from baiduads.wtmaterialcategory.model.update_category_response_wrapper import UpdateCategoryResponseWrapper
from baiduads.wtmaterialcategory.model.update_category_request_wrapper import UpdateCategoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = wt_material_category_service.WtMaterialCategoryService(api_client)
    update_category_request_wrapper = UpdateCategoryRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateCategoryRequest(
            category_id=1,
            type=1,
            name="name_example",
        ),
    ) # UpdateCategoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_category(update_category_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling WtMaterialCategoryService->update_category: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_category_request_wrapper** | [**UpdateCategoryRequestWrapper**](UpdateCategoryRequestWrapper.md)|  |

### Return type

[**UpdateCategoryResponseWrapper**](UpdateCategoryResponseWrapper.md)

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

