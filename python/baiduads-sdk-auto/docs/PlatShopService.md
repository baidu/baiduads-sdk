# baiduads.PlatShopService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_shop_category_list**](PlatShopService.md#get_shop_category_list) | **POST** /json/sms/service/PlatShopService/getShopCategoryList | 


# **get_shop_category_list**
> GetShopCategoryListResponseWrapper get_shop_category_list(get_shop_category_list_request_wrapper)



### Example


```python
import time
import baiduads
from platshop.api import plat_shop_service
from baiduads.platshop.model.get_shop_category_list_request_wrapper import GetShopCategoryListRequestWrapper
from baiduads.platshop.model.get_shop_category_list_response_wrapper import GetShopCategoryListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = plat_shop_service.PlatShopService(api_client)
    get_shop_category_list_request_wrapper = GetShopCategoryListRequestWrapper(
        header=ApiRequestHeader(),
        body=ShopCategoryRequest(
            app_id=1,
            shop_id=1,
            parent_id=1,
            need_all=True,
        ),
    ) # GetShopCategoryListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_shop_category_list(get_shop_category_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling PlatShopService->get_shop_category_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_shop_category_list_request_wrapper** | [**GetShopCategoryListRequestWrapper**](GetShopCategoryListRequestWrapper.md)|  |

### Return type

[**GetShopCategoryListResponseWrapper**](GetShopCategoryListResponseWrapper.md)

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

