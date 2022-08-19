# baiduads.CycTemplateService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_template**](CycTemplateService.md#add_template) | **POST** /json/sms/service/CycTemplateService/addTemplate | 
[**delete_template**](CycTemplateService.md#delete_template) | **POST** /json/sms/service/CycTemplateService/deleteTemplate | 
[**get_bind_cyc_template**](CycTemplateService.md#get_bind_cyc_template) | **POST** /json/sms/service/CycTemplateService/getBindCycTemplate | 
[**get_template**](CycTemplateService.md#get_template) | **POST** /json/sms/service/CycTemplateService/getTemplate | 
[**update_template**](CycTemplateService.md#update_template) | **POST** /json/sms/service/CycTemplateService/updateTemplate | 


# **add_template**
> AddTemplateResponseWrapper add_template(add_template_request_wrapper)



### Example


```python
import time
import baiduads
from cyctemplate.api import cyc_template_service
from baiduads.cyctemplate.model.add_template_response_wrapper import AddTemplateResponseWrapper
from baiduads.cyctemplate.model.add_template_request_wrapper import AddTemplateRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = cyc_template_service.CycTemplateService(api_client)
    add_template_request_wrapper = AddTemplateRequestWrapper(
        header=ApiRequestHeader(),
        body=CycTemplateModRequest(
            cyc_template_types=[
                CycTemplateType(
                    template_id=1,
                    template_name="template_name_example",
                    bind_campaign_count=1,
                    bind_campaign_names=[
                        "bind_campaign_names_example",
                    ],
                    bind_campaign_ids=[
                        1,
                    ],
                    schedule_price_factors=[
                        SchedulePriceFactor(
                            time_id=1,
                            price_factor=3.14,
                        ),
                    ],
                    schedule=[
                        ScheduleType(
                            start_hour=1,
                            end_hour=1,
                            week_day=1,
                        ),
                    ],
                ),
            ],
        ),
    ) # AddTemplateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_template(add_template_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CycTemplateService->add_template: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_template_request_wrapper** | [**AddTemplateRequestWrapper**](AddTemplateRequestWrapper.md)|  |

### Return type

[**AddTemplateResponseWrapper**](AddTemplateResponseWrapper.md)

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

# **delete_template**
> DeleteTemplateResponseWrapper delete_template(delete_template_request_wrapper)



### Example


```python
import time
import baiduads
from cyctemplate.api import cyc_template_service
from baiduads.cyctemplate.model.delete_template_request_wrapper import DeleteTemplateRequestWrapper
from baiduads.cyctemplate.model.delete_template_response_wrapper import DeleteTemplateResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = cyc_template_service.CycTemplateService(api_client)
    delete_template_request_wrapper = DeleteTemplateRequestWrapper(
        header=ApiRequestHeader(),
        body=CycTemplateDelRequest(
            template_ids=[
                1,
            ],
        ),
    ) # DeleteTemplateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_template(delete_template_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CycTemplateService->delete_template: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_template_request_wrapper** | [**DeleteTemplateRequestWrapper**](DeleteTemplateRequestWrapper.md)|  |

### Return type

[**DeleteTemplateResponseWrapper**](DeleteTemplateResponseWrapper.md)

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

# **get_bind_cyc_template**
> GetBindCycTemplateResponseWrapper get_bind_cyc_template(get_bind_cyc_template_request_wrapper)



### Example


```python
import time
import baiduads
from cyctemplate.api import cyc_template_service
from baiduads.cyctemplate.model.get_bind_cyc_template_response_wrapper import GetBindCycTemplateResponseWrapper
from baiduads.cyctemplate.model.get_bind_cyc_template_request_wrapper import GetBindCycTemplateRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = cyc_template_service.CycTemplateService(api_client)
    get_bind_cyc_template_request_wrapper = GetBindCycTemplateRequestWrapper(
        header=ApiRequestHeader(),
        body=CycTemplateBindQueryRequest(
            campaign_ids=[
                1,
            ],
            order_by="order_by_example",
            fields=[
                "fields_example",
            ],
            limit=[
                1,
            ],
            desc=True,
        ),
    ) # GetBindCycTemplateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_bind_cyc_template(get_bind_cyc_template_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CycTemplateService->get_bind_cyc_template: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_bind_cyc_template_request_wrapper** | [**GetBindCycTemplateRequestWrapper**](GetBindCycTemplateRequestWrapper.md)|  |

### Return type

[**GetBindCycTemplateResponseWrapper**](GetBindCycTemplateResponseWrapper.md)

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

# **get_template**
> GetTemplateResponseWrapper get_template(get_template_request_wrapper)



### Example


```python
import time
import baiduads
from cyctemplate.api import cyc_template_service
from baiduads.cyctemplate.model.get_template_response_wrapper import GetTemplateResponseWrapper
from baiduads.cyctemplate.model.get_template_request_wrapper import GetTemplateRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = cyc_template_service.CycTemplateService(api_client)
    get_template_request_wrapper = GetTemplateRequestWrapper(
        header=ApiRequestHeader(),
        body=CycTemplateQueryRequest(
            order_by="order_by_example",
            fields=[
                "fields_example",
            ],
            limit=[
                1,
            ],
            desc=True,
        ),
    ) # GetTemplateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_template(get_template_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CycTemplateService->get_template: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_template_request_wrapper** | [**GetTemplateRequestWrapper**](GetTemplateRequestWrapper.md)|  |

### Return type

[**GetTemplateResponseWrapper**](GetTemplateResponseWrapper.md)

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

# **update_template**
> UpdateTemplateResponseWrapper update_template(update_template_request_wrapper)



### Example


```python
import time
import baiduads
from cyctemplate.api import cyc_template_service
from baiduads.cyctemplate.model.update_template_request_wrapper import UpdateTemplateRequestWrapper
from baiduads.cyctemplate.model.update_template_response_wrapper import UpdateTemplateResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = cyc_template_service.CycTemplateService(api_client)
    update_template_request_wrapper = UpdateTemplateRequestWrapper(
        header=ApiRequestHeader(),
        body=CycTemplateModRequest(
            cyc_template_types=[
                CycTemplateType(
                    template_id=1,
                    template_name="template_name_example",
                    bind_campaign_count=1,
                    bind_campaign_names=[
                        "bind_campaign_names_example",
                    ],
                    bind_campaign_ids=[
                        1,
                    ],
                    schedule_price_factors=[
                        SchedulePriceFactor(
                            time_id=1,
                            price_factor=3.14,
                        ),
                    ],
                    schedule=[
                        ScheduleType(
                            start_hour=1,
                            end_hour=1,
                            week_day=1,
                        ),
                    ],
                ),
            ],
        ),
    ) # UpdateTemplateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_template(update_template_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CycTemplateService->update_template: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_template_request_wrapper** | [**UpdateTemplateRequestWrapper**](UpdateTemplateRequestWrapper.md)|  |

### Return type

[**UpdateTemplateResponseWrapper**](UpdateTemplateResponseWrapper.md)

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

