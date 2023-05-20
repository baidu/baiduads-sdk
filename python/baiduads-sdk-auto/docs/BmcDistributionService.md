# baiduads.BmcDistributionService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_catalog**](BmcDistributionService.md#get_catalog) | **POST** /json/sms/service/BmcDistributionService/getCatalog | 


# **get_catalog**
> GetCatalogResponseWrapper get_catalog(get_catalog_request_wrapper)



### Example


```python
import time
import baiduads
from bmcdistribution.api import bmc_distribution_service
from baiduads.bmcdistribution.model.get_catalog_request_wrapper import GetCatalogRequestWrapper
from baiduads.bmcdistribution.model.get_catalog_response_wrapper import GetCatalogResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = bmc_distribution_service.BmcDistributionService(api_client)
    get_catalog_request_wrapper = GetCatalogRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetCatalogRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_catalog(get_catalog_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling BmcDistributionService->get_catalog: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_catalog_request_wrapper** | [**GetCatalogRequestWrapper**](GetCatalogRequestWrapper.md)|  |

### Return type

[**GetCatalogResponseWrapper**](GetCatalogResponseWrapper.md)

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

