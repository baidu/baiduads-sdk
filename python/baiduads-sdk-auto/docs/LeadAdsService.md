# baiduads.LeadAdsService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_strategies**](LeadAdsService.md#add_strategies) | **POST** /json/sms/service/LeadAdsService/addStrategies | 
[**delete_strategies**](LeadAdsService.md#delete_strategies) | **POST** /json/sms/service/LeadAdsService/deleteStrategies | 
[**get_materials**](LeadAdsService.md#get_materials) | **POST** /json/sms/service/LeadAdsService/getMaterials | 
[**get_strategies**](LeadAdsService.md#get_strategies) | **POST** /json/sms/service/LeadAdsService/getStrategies | 
[**update_strategies**](LeadAdsService.md#update_strategies) | **POST** /json/sms/service/LeadAdsService/updateStrategies | 


# **add_strategies**
> AddStrategiesResponseWrapper add_strategies(add_strategies_request_wrapper)



### Example


```python
import time
import baiduads
from leadads.api import lead_ads_service
from baiduads.leadads.model.add_strategies_request_wrapper import AddStrategiesRequestWrapper
from baiduads.leadads.model.add_strategies_response_wrapper import AddStrategiesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = lead_ads_service.LeadAdsService(api_client)
    add_strategies_request_wrapper = AddStrategiesRequestWrapper(
        header=ApiRequestHeader(),
        body=StrategyModRequest(
            items=[
                {},
            ],
        ),
    ) # AddStrategiesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_strategies(add_strategies_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LeadAdsService->add_strategies: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_strategies_request_wrapper** | [**AddStrategiesRequestWrapper**](AddStrategiesRequestWrapper.md)|  |

### Return type

[**AddStrategiesResponseWrapper**](AddStrategiesResponseWrapper.md)

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

# **delete_strategies**
> DeleteStrategiesResponseWrapper delete_strategies(delete_strategies_request_wrapper)



### Example


```python
import time
import baiduads
from leadads.api import lead_ads_service
from baiduads.leadads.model.delete_strategies_request_wrapper import DeleteStrategiesRequestWrapper
from baiduads.leadads.model.delete_strategies_response_wrapper import DeleteStrategiesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = lead_ads_service.LeadAdsService(api_client)
    delete_strategies_request_wrapper = DeleteStrategiesRequestWrapper(
        header=ApiRequestHeader(),
        body=LongBatchRequest(
            items=[
                1,
            ],
        ),
    ) # DeleteStrategiesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_strategies(delete_strategies_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LeadAdsService->delete_strategies: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_strategies_request_wrapper** | [**DeleteStrategiesRequestWrapper**](DeleteStrategiesRequestWrapper.md)|  |

### Return type

[**DeleteStrategiesResponseWrapper**](DeleteStrategiesResponseWrapper.md)

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

# **get_materials**
> GetMaterialsResponseWrapper get_materials(get_materials_request_wrapper)



### Example


```python
import time
import baiduads
from leadads.api import lead_ads_service
from baiduads.leadads.model.get_materials_response_wrapper import GetMaterialsResponseWrapper
from baiduads.leadads.model.get_materials_request_wrapper import GetMaterialsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = lead_ads_service.LeadAdsService(api_client)
    get_materials_request_wrapper = GetMaterialsRequestWrapper(
        header=ApiRequestHeader(),
        body=QueryListRequest(
            user_id=1,
            field_filters=[
                RowFilter(
                    field="field_example",
                    op="op_example",
                    values=[
                        "values_example",
                    ],
                ),
            ],
            is_desc=True,
            sort_field="sort_field_example",
            ids=[
                1,
            ],
            limit=[
                1,
            ],
        ),
    ) # GetMaterialsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_materials(get_materials_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LeadAdsService->get_materials: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_materials_request_wrapper** | [**GetMaterialsRequestWrapper**](GetMaterialsRequestWrapper.md)|  |

### Return type

[**GetMaterialsResponseWrapper**](GetMaterialsResponseWrapper.md)

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

# **get_strategies**
> GetStrategiesResponseWrapper get_strategies(get_strategies_request_wrapper)



### Example


```python
import time
import baiduads
from leadads.api import lead_ads_service
from baiduads.leadads.model.get_strategies_response_wrapper import GetStrategiesResponseWrapper
from baiduads.leadads.model.get_strategies_request_wrapper import GetStrategiesRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = lead_ads_service.LeadAdsService(api_client)
    get_strategies_request_wrapper = GetStrategiesRequestWrapper(
        header=ApiRequestHeader(),
        body=QueryListRequest(
            user_id=1,
            field_filters=[
                RowFilter(
                    field="field_example",
                    op="op_example",
                    values=[
                        "values_example",
                    ],
                ),
            ],
            is_desc=True,
            sort_field="sort_field_example",
            ids=[
                1,
            ],
            limit=[
                1,
            ],
        ),
    ) # GetStrategiesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_strategies(get_strategies_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LeadAdsService->get_strategies: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_strategies_request_wrapper** | [**GetStrategiesRequestWrapper**](GetStrategiesRequestWrapper.md)|  |

### Return type

[**GetStrategiesResponseWrapper**](GetStrategiesResponseWrapper.md)

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

# **update_strategies**
> UpdateStrategiesResponseWrapper update_strategies(update_strategies_request_wrapper)



### Example


```python
import time
import baiduads
from leadads.api import lead_ads_service
from baiduads.leadads.model.update_strategies_request_wrapper import UpdateStrategiesRequestWrapper
from baiduads.leadads.model.update_strategies_response_wrapper import UpdateStrategiesResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = lead_ads_service.LeadAdsService(api_client)
    update_strategies_request_wrapper = UpdateStrategiesRequestWrapper(
        header=ApiRequestHeader(),
        body=StrategyModRequest(
            items=[
                {},
            ],
        ),
    ) # UpdateStrategiesRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_strategies(update_strategies_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling LeadAdsService->update_strategies: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_strategies_request_wrapper** | [**UpdateStrategiesRequestWrapper**](UpdateStrategiesRequestWrapper.md)|  |

### Return type

[**UpdateStrategiesResponseWrapper**](UpdateStrategiesResponseWrapper.md)

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

