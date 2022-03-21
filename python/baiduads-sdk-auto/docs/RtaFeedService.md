# baiduads.RtaFeedService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_rta_setting**](RtaFeedService.md#add_rta_setting) | **POST** /json/sms/service/RtaFeedService/addRtaSetting | 
[**del_rta_setting**](RtaFeedService.md#del_rta_setting) | **POST** /json/sms/service/RtaFeedService/delRtaSetting | 
[**del_strategy**](RtaFeedService.md#del_strategy) | **POST** /json/sms/service/RtaFeedService/delStrategy | 
[**get_configurable_users**](RtaFeedService.md#get_configurable_users) | **POST** /json/sms/service/RtaFeedService/getConfigurableUsers | 
[**get_rta_setting**](RtaFeedService.md#get_rta_setting) | **POST** /json/sms/service/RtaFeedService/getRtaSetting | 
[**get_rta_token**](RtaFeedService.md#get_rta_token) | **POST** /json/sms/service/RtaFeedService/getRtaToken | 
[**get_strategy**](RtaFeedService.md#get_strategy) | **POST** /json/sms/service/RtaFeedService/getStrategy | 
[**update_rta_setting**](RtaFeedService.md#update_rta_setting) | **POST** /json/sms/service/RtaFeedService/updateRtaSetting | 
[**update_strategy**](RtaFeedService.md#update_strategy) | **POST** /json/sms/service/RtaFeedService/updateStrategy | 


# **add_rta_setting**
> AddRtaSettingResponseWrapper add_rta_setting(add_rta_setting_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.add_rta_setting_request_wrapper import AddRtaSettingRequestWrapper
from baiduads.rtafeed.model.add_rta_setting_response_wrapper import AddRtaSettingResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    add_rta_setting_request_wrapper = AddRtaSettingRequestWrapper(
        header=ApiRequestHeader(),
        body=RtaSettingType(
            id=1,
            url="url_example",
            token="token_example",
            config_user_ids=[
                1,
            ],
            config_users=[
                ConfigurableUser(
                    user_id=1,
                    user_name="user_name_example",
                ),
            ],
            request_timeout_strategy=1,
            cache_time=1,
            status=1,
            add_time="add_time_example",
            mod_time="mod_time_example",
        ),
    ) # AddRtaSettingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_rta_setting(add_rta_setting_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->add_rta_setting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_rta_setting_request_wrapper** | [**AddRtaSettingRequestWrapper**](AddRtaSettingRequestWrapper.md)|  |

### Return type

[**AddRtaSettingResponseWrapper**](AddRtaSettingResponseWrapper.md)

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

# **del_rta_setting**
> DelRtaSettingResponseWrapper del_rta_setting(del_rta_setting_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.del_rta_setting_response_wrapper import DelRtaSettingResponseWrapper
from baiduads.rtafeed.model.del_rta_setting_request_wrapper import DelRtaSettingRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    del_rta_setting_request_wrapper = DelRtaSettingRequestWrapper(
        header=ApiRequestHeader(),
        body=DelSettingRequest(
            id=1,
        ),
    ) # DelRtaSettingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.del_rta_setting(del_rta_setting_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->del_rta_setting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **del_rta_setting_request_wrapper** | [**DelRtaSettingRequestWrapper**](DelRtaSettingRequestWrapper.md)|  |

### Return type

[**DelRtaSettingResponseWrapper**](DelRtaSettingResponseWrapper.md)

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

# **del_strategy**
> DelStrategyResponseWrapper del_strategy(del_strategy_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.del_strategy_request_wrapper import DelStrategyRequestWrapper
from baiduads.rtafeed.model.del_strategy_response_wrapper import DelStrategyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    del_strategy_request_wrapper = DelStrategyRequestWrapper(
        header=ApiRequestHeader(),
        body=DelSettingRequest(
            id=1,
        ),
    ) # DelStrategyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.del_strategy(del_strategy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->del_strategy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **del_strategy_request_wrapper** | [**DelStrategyRequestWrapper**](DelStrategyRequestWrapper.md)|  |

### Return type

[**DelStrategyResponseWrapper**](DelStrategyResponseWrapper.md)

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

# **get_configurable_users**
> GetConfigurableUsersResponseWrapper get_configurable_users(get_configurable_users_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.get_configurable_users_request_wrapper import GetConfigurableUsersRequestWrapper
from baiduads.rtafeed.model.get_configurable_users_response_wrapper import GetConfigurableUsersResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    get_configurable_users_request_wrapper = GetConfigurableUsersRequestWrapper(
        header=ApiRequestHeader(),
        body=GetConfigurableUsersRequest(
            type=1,
            url="url_example",
        ),
    ) # GetConfigurableUsersRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_configurable_users(get_configurable_users_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->get_configurable_users: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_configurable_users_request_wrapper** | [**GetConfigurableUsersRequestWrapper**](GetConfigurableUsersRequestWrapper.md)|  |

### Return type

[**GetConfigurableUsersResponseWrapper**](GetConfigurableUsersResponseWrapper.md)

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

# **get_rta_setting**
> GetRtaSettingResponseWrapper get_rta_setting(get_rta_setting_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.get_rta_setting_response_wrapper import GetRtaSettingResponseWrapper
from baiduads.rtafeed.model.get_rta_setting_request_wrapper import GetRtaSettingRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    get_rta_setting_request_wrapper = GetRtaSettingRequestWrapper(
        header=ApiRequestHeader(),
        body=GetSettingRequest(
            page_no=1,
            page_size=1,
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    value={},
                ),
            ],
        ),
    ) # GetRtaSettingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_rta_setting(get_rta_setting_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->get_rta_setting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_rta_setting_request_wrapper** | [**GetRtaSettingRequestWrapper**](GetRtaSettingRequestWrapper.md)|  |

### Return type

[**GetRtaSettingResponseWrapper**](GetRtaSettingResponseWrapper.md)

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

# **get_rta_token**
> GetRtaTokenResponseWrapper get_rta_token(get_rta_token_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.get_rta_token_request_wrapper import GetRtaTokenRequestWrapper
from baiduads.rtafeed.model.get_rta_token_response_wrapper import GetRtaTokenResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    get_rta_token_request_wrapper = GetRtaTokenRequestWrapper(
        header=ApiRequestHeader(),
        body=GetRtaTokenRequest(
            url="url_example",
        ),
    ) # GetRtaTokenRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_rta_token(get_rta_token_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->get_rta_token: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_rta_token_request_wrapper** | [**GetRtaTokenRequestWrapper**](GetRtaTokenRequestWrapper.md)|  |

### Return type

[**GetRtaTokenResponseWrapper**](GetRtaTokenResponseWrapper.md)

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

# **get_strategy**
> GetStrategyResponseWrapper get_strategy(get_strategy_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.get_strategy_request_wrapper import GetStrategyRequestWrapper
from baiduads.rtafeed.model.get_strategy_response_wrapper import GetStrategyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    get_strategy_request_wrapper = GetStrategyRequestWrapper(
        header=ApiRequestHeader(),
        body=GetSettingRequest(
            page_no=1,
            page_size=1,
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    value={},
                ),
            ],
        ),
    ) # GetStrategyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_strategy(get_strategy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->get_strategy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_strategy_request_wrapper** | [**GetStrategyRequestWrapper**](GetStrategyRequestWrapper.md)|  |

### Return type

[**GetStrategyResponseWrapper**](GetStrategyResponseWrapper.md)

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

# **update_rta_setting**
> UpdateRtaSettingResponseWrapper update_rta_setting(update_rta_setting_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.update_rta_setting_response_wrapper import UpdateRtaSettingResponseWrapper
from baiduads.rtafeed.model.update_rta_setting_request_wrapper import UpdateRtaSettingRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    update_rta_setting_request_wrapper = UpdateRtaSettingRequestWrapper(
        header=ApiRequestHeader(),
        body=RtaSettingType(
            id=1,
            url="url_example",
            token="token_example",
            config_user_ids=[
                1,
            ],
            config_users=[
                ConfigurableUser(
                    user_id=1,
                    user_name="user_name_example",
                ),
            ],
            request_timeout_strategy=1,
            cache_time=1,
            status=1,
            add_time="add_time_example",
            mod_time="mod_time_example",
        ),
    ) # UpdateRtaSettingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_rta_setting(update_rta_setting_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->update_rta_setting: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_rta_setting_request_wrapper** | [**UpdateRtaSettingRequestWrapper**](UpdateRtaSettingRequestWrapper.md)|  |

### Return type

[**UpdateRtaSettingResponseWrapper**](UpdateRtaSettingResponseWrapper.md)

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

# **update_strategy**
> UpdateStrategyResponseWrapper update_strategy(update_strategy_request_wrapper)



### Example


```python
import time
import baiduads
from rtafeed.api import rta_feed_service
from baiduads.rtafeed.model.update_strategy_response_wrapper import UpdateStrategyResponseWrapper
from baiduads.rtafeed.model.update_strategy_request_wrapper import UpdateStrategyRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = rta_feed_service.RtaFeedService(api_client)
    update_strategy_request_wrapper = UpdateStrategyRequestWrapper(
        header=ApiRequestHeader(),
        body=RtaStrategyType(
            id=1,
            strategy_id=1,
            strategy_remark="strategy_remark_example",
            config_user_ids=[
                1,
            ],
            config_users=[
                ConfigurableUser(
                    user_id=1,
                    user_name="user_name_example",
                ),
            ],
        ),
    ) # UpdateStrategyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_strategy(update_strategy_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling RtaFeedService->update_strategy: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_strategy_request_wrapper** | [**UpdateStrategyRequestWrapper**](UpdateStrategyRequestWrapper.md)|  |

### Return type

[**UpdateStrategyResponseWrapper**](UpdateStrategyResponseWrapper.md)

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

