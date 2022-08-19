# baiduads.GrowthPowerService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_growth_power_detail**](GrowthPowerService.md#get_growth_power_detail) | **POST** /json/sms/service/GrowthPowerService/getGrowthPowerDetail | 
[**get_growth_power_overview**](GrowthPowerService.md#get_growth_power_overview) | **POST** /json/sms/service/GrowthPowerService/getGrowthPowerOverview | 


# **get_growth_power_detail**
> GetGrowthPowerDetailResponseWrapper get_growth_power_detail(get_growth_power_detail_request_wrapper)



### Example


```python
import time
import baiduads
from growthpower.api import growth_power_service
from baiduads.growthpower.model.get_growth_power_detail_response_wrapper import GetGrowthPowerDetailResponseWrapper
from baiduads.growthpower.model.get_growth_power_detail_request_wrapper import GetGrowthPowerDetailRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = growth_power_service.GrowthPowerService(api_client)
    get_growth_power_detail_request_wrapper = GetGrowthPowerDetailRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetGrowthPowerDetailRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_growth_power_detail(get_growth_power_detail_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling GrowthPowerService->get_growth_power_detail: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_growth_power_detail_request_wrapper** | [**GetGrowthPowerDetailRequestWrapper**](GetGrowthPowerDetailRequestWrapper.md)|  |

### Return type

[**GetGrowthPowerDetailResponseWrapper**](GetGrowthPowerDetailResponseWrapper.md)

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

# **get_growth_power_overview**
> GetGrowthPowerOverviewResponseWrapper get_growth_power_overview(get_growth_power_overview_request_wrapper)



### Example


```python
import time
import baiduads
from growthpower.api import growth_power_service
from baiduads.growthpower.model.get_growth_power_overview_response_wrapper import GetGrowthPowerOverviewResponseWrapper
from baiduads.growthpower.model.get_growth_power_overview_request_wrapper import GetGrowthPowerOverviewRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = growth_power_service.GrowthPowerService(api_client)
    get_growth_power_overview_request_wrapper = GetGrowthPowerOverviewRequestWrapper(
        header=ApiRequestHeader(),
    ) # GetGrowthPowerOverviewRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_growth_power_overview(get_growth_power_overview_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling GrowthPowerService->get_growth_power_overview: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_growth_power_overview_request_wrapper** | [**GetGrowthPowerOverviewRequestWrapper**](GetGrowthPowerOverviewRequestWrapper.md)|  |

### Return type

[**GetGrowthPowerOverviewResponseWrapper**](GetGrowthPowerOverviewResponseWrapper.md)

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

