# baiduads.BmcProductService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fast_update_products**](BmcProductService.md#fast_update_products) | **POST** /json/sms/service/BmcProductService/fastUpdateProducts | 


# **fast_update_products**
> FastUpdateProductsResponseWrapper fast_update_products(fast_update_products_request_wrapper)



### Example


```python
import time
import baiduads
from bmcproduct.api import bmc_product_service
from baiduads.bmcproduct.model.fast_update_products_request_wrapper import FastUpdateProductsRequestWrapper
from baiduads.bmcproduct.model.fast_update_products_response_wrapper import FastUpdateProductsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bmc_product_service.BmcProductService(api_client)
    fast_update_products_request_wrapper = FastUpdateProductsRequestWrapper(
        header=ApiRequestHeader(),
        body=BatchFastUpdateProductRequest(
            request=[
                FastUpdateProductRequest(
                    outer_id="outer_id_example",
                    catalog_id=1,
                    properties={},
                ),
            ],
        ),
    ) # FastUpdateProductsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.fast_update_products(fast_update_products_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BmcProductService->fast_update_products: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fast_update_products_request_wrapper** | [**FastUpdateProductsRequestWrapper**](FastUpdateProductsRequestWrapper.md)|  |

### Return type

[**FastUpdateProductsResponseWrapper**](FastUpdateProductsResponseWrapper.md)

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

