# baiduads.AdgroupService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_adgroup**](AdgroupService.md#add_adgroup) | **POST** /json/sms/service/AdgroupService/addAdgroup | 
[**delete_adgroup**](AdgroupService.md#delete_adgroup) | **POST** /json/sms/service/AdgroupService/deleteAdgroup | 
[**get_adgroup**](AdgroupService.md#get_adgroup) | **POST** /json/sms/service/AdgroupService/getAdgroup | 
[**update_adgroup**](AdgroupService.md#update_adgroup) | **POST** /json/sms/service/AdgroupService/updateAdgroup | 


# **add_adgroup**
> AddAdgroupResponseWrapper add_adgroup(add_adgroup_request_wrapper)



### Example


```python
import time
import baiduads
from adgroup.api import adgroup_service
from baiduads.adgroup.model.add_adgroup_request_wrapper import AddAdgroupRequestWrapper
from baiduads.adgroup.model.add_adgroup_response_wrapper import AddAdgroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_service.AdgroupService(api_client)
    add_adgroup_request_wrapper = AddAdgroupRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiAdgroupAddRequest(
            adgroup_types=[
                ApiAdgroupType(
                    adgroup_id=1,
                    campaign_id=1,
                    adgroup_name="adgroup_name_example",
                    max_price=3.14,
                    pause=True,
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    status=1,
                    price_ratio=3.14,
                    pc_price_ratio=3.14,
                    ad_type=1,
                    segment_recommend_status=1,
                    product_set_id=1,
                    pa_price=3.14,
                    monitor_url="monitor_url_example",
                    create_time="create_time_example",
                    adgroup_auto_targeting_status=True,
                    pc_final_url="pc_final_url_example",
                    pc_track_param="pc_track_param_example",
                    pc_track_template="pc_track_template_example",
                    mobile_final_url="mobile_final_url_example",
                    mobile_track_param="mobile_track_param_example",
                    mobile_track_template="mobile_track_template_example",
                    creative_text_optimization_status=True,
                ),
            ],
            ad_type=1,
        ),
    ) # AddAdgroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_adgroup(add_adgroup_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupService->add_adgroup: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_adgroup_request_wrapper** | [**AddAdgroupRequestWrapper**](AddAdgroupRequestWrapper.md)|  |

### Return type

[**AddAdgroupResponseWrapper**](AddAdgroupResponseWrapper.md)

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

# **delete_adgroup**
> DeleteAdgroupResponseWrapper delete_adgroup(delete_adgroup_request_wrapper)



### Example


```python
import time
import baiduads
from adgroup.api import adgroup_service
from baiduads.adgroup.model.delete_adgroup_request_wrapper import DeleteAdgroupRequestWrapper
from baiduads.adgroup.model.delete_adgroup_response_wrapper import DeleteAdgroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_service.AdgroupService(api_client)
    delete_adgroup_request_wrapper = DeleteAdgroupRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiAdgroupDelRequest(
            adgroup_ids=[
                1,
            ],
        ),
    ) # DeleteAdgroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_adgroup(delete_adgroup_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupService->delete_adgroup: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_adgroup_request_wrapper** | [**DeleteAdgroupRequestWrapper**](DeleteAdgroupRequestWrapper.md)|  |

### Return type

[**DeleteAdgroupResponseWrapper**](DeleteAdgroupResponseWrapper.md)

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

# **get_adgroup**
> GetAdgroupResponseWrapper get_adgroup(get_adgroup_request_wrapper)



### Example


```python
import time
import baiduads
from adgroup.api import adgroup_service
from baiduads.adgroup.model.get_adgroup_response_wrapper import GetAdgroupResponseWrapper
from baiduads.adgroup.model.get_adgroup_request_wrapper import GetAdgroupRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_service.AdgroupService(api_client)
    get_adgroup_request_wrapper = GetAdgroupRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiAdgroupQueryRequest(
            ids=[
                1,
            ],
            adgroup_fields=[
                "adgroup_fields_example",
            ],
            id_type=1,
            get_temp=1,
        ),
    ) # GetAdgroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_adgroup(get_adgroup_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupService->get_adgroup: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_adgroup_request_wrapper** | [**GetAdgroupRequestWrapper**](GetAdgroupRequestWrapper.md)|  |

### Return type

[**GetAdgroupResponseWrapper**](GetAdgroupResponseWrapper.md)

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

# **update_adgroup**
> UpdateAdgroupResponseWrapper update_adgroup(update_adgroup_request_wrapper)



### Example


```python
import time
import baiduads
from adgroup.api import adgroup_service
from baiduads.adgroup.model.update_adgroup_response_wrapper import UpdateAdgroupResponseWrapper
from baiduads.adgroup.model.update_adgroup_request_wrapper import UpdateAdgroupRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = adgroup_service.AdgroupService(api_client)
    update_adgroup_request_wrapper = UpdateAdgroupRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiAdgroupUpdateRequest(
            adgroup_types=[
                ApiAdgroupType(
                    adgroup_id=1,
                    campaign_id=1,
                    adgroup_name="adgroup_name_example",
                    max_price=3.14,
                    pause=True,
                    negative_words=[
                        "negative_words_example",
                    ],
                    exact_negative_words=[
                        "exact_negative_words_example",
                    ],
                    status=1,
                    price_ratio=3.14,
                    pc_price_ratio=3.14,
                    ad_type=1,
                    segment_recommend_status=1,
                    product_set_id=1,
                    pa_price=3.14,
                    monitor_url="monitor_url_example",
                    create_time="create_time_example",
                    adgroup_auto_targeting_status=True,
                    pc_final_url="pc_final_url_example",
                    pc_track_param="pc_track_param_example",
                    pc_track_template="pc_track_template_example",
                    mobile_final_url="mobile_final_url_example",
                    mobile_track_param="mobile_track_param_example",
                    mobile_track_template="mobile_track_template_example",
                    creative_text_optimization_status=True,
                ),
            ],
        ),
    ) # UpdateAdgroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_adgroup(update_adgroup_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdgroupService->update_adgroup: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_adgroup_request_wrapper** | [**UpdateAdgroupRequestWrapper**](UpdateAdgroupRequestWrapper.md)|  |

### Return type

[**UpdateAdgroupResponseWrapper**](UpdateAdgroupResponseWrapper.md)

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

