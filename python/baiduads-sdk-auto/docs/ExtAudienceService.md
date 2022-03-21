# baiduads.ExtAudienceService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_empty_group**](ExtAudienceService.md#create_empty_group) | **POST** /json/sms/service/ExtAudienceService/createEmptyGroup | 
[**get_audience_list**](ExtAudienceService.md#get_audience_list) | **POST** /json/sms/service/ExtAudienceService/getAudienceList | 
[**update_audience_dsp**](ExtAudienceService.md#update_audience_dsp) | **POST** /json/sms/service/ExtAudienceService/updateAudienceDsp | 
[**update_id_upload4_pour**](ExtAudienceService.md#update_id_upload4_pour) | **POST** /json/sms/service/ExtAudienceService/updateIdUpload4Pour | 


# **create_empty_group**
> CreateEmptyGroupResponseWrapper create_empty_group(create_empty_group_request_wrapper)



### Example


```python
import time
import baiduads
from extaudience.api import ext_audience_service
from baiduads.extaudience.model.create_empty_group_request_wrapper import CreateEmptyGroupRequestWrapper
from baiduads.extaudience.model.create_empty_group_response_wrapper import CreateEmptyGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ext_audience_service.ExtAudienceService(api_client)
    create_empty_group_request_wrapper = CreateEmptyGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=APIReqExtAudience(
            user_id=1,
            group_id=1,
            group_name="group_name_example",
            dsp_names="dsp_names_example",
            type="type_example",
            need_idm=True,
            come_type="come_type_example",
        ),
    ) # CreateEmptyGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_empty_group(create_empty_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ExtAudienceService->create_empty_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_empty_group_request_wrapper** | [**CreateEmptyGroupRequestWrapper**](CreateEmptyGroupRequestWrapper.md)|  |

### Return type

[**CreateEmptyGroupResponseWrapper**](CreateEmptyGroupResponseWrapper.md)

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

# **get_audience_list**
> GetAudienceListResponseWrapper get_audience_list(get_audience_list_request_wrapper)



### Example


```python
import time
import baiduads
from extaudience.api import ext_audience_service
from baiduads.extaudience.model.get_audience_list_request_wrapper import GetAudienceListRequestWrapper
from baiduads.extaudience.model.get_audience_list_response_wrapper import GetAudienceListResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ext_audience_service.ExtAudienceService(api_client)
    get_audience_list_request_wrapper = GetAudienceListRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiReqGroupListNew(
            dsps=[
                "dsps_example",
            ],
            group_type=[
                "group_type_example",
            ],
            group_ids=[
                1,
            ],
            group_status=[
                "group_status_example",
            ],
            keywords="keywords_example",
            order_by="order_by_example",
            order="order_example",
            only_theme=True,
            datasource=[
                "datasource_example",
            ],
            client_type="client_type_example",
        ),
    ) # GetAudienceListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_audience_list(get_audience_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ExtAudienceService->get_audience_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_audience_list_request_wrapper** | [**GetAudienceListRequestWrapper**](GetAudienceListRequestWrapper.md)|  |

### Return type

[**GetAudienceListResponseWrapper**](GetAudienceListResponseWrapper.md)

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

# **update_audience_dsp**
> UpdateAudienceDspResponseWrapper update_audience_dsp(update_audience_dsp_request_wrapper)



### Example


```python
import time
import baiduads
from extaudience.api import ext_audience_service
from baiduads.extaudience.model.update_audience_dsp_response_wrapper import UpdateAudienceDspResponseWrapper
from baiduads.extaudience.model.update_audience_dsp_request_wrapper import UpdateAudienceDspRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ext_audience_service.ExtAudienceService(api_client)
    update_audience_dsp_request_wrapper = UpdateAudienceDspRequestWrapper(
        header=ApiRequestHeader(),
        body=APIReqExtAudience(
            user_id=1,
            group_id=1,
            group_name="group_name_example",
            dsp_names="dsp_names_example",
            type="type_example",
            need_idm=True,
            come_type="come_type_example",
        ),
    ) # UpdateAudienceDspRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_audience_dsp(update_audience_dsp_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ExtAudienceService->update_audience_dsp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_audience_dsp_request_wrapper** | [**UpdateAudienceDspRequestWrapper**](UpdateAudienceDspRequestWrapper.md)|  |

### Return type

[**UpdateAudienceDspResponseWrapper**](UpdateAudienceDspResponseWrapper.md)

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

# **update_id_upload4_pour**
> UpdateIdUpload4PourResponseWrapper update_id_upload4_pour(update_id_upload4_pour_request_wrapper)



### Example


```python
import time
import baiduads
from extaudience.api import ext_audience_service
from baiduads.extaudience.model.update_id_upload4_pour_response_wrapper import UpdateIdUpload4PourResponseWrapper
from baiduads.extaudience.model.update_id_upload4_pour_request_wrapper import UpdateIdUpload4PourRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = ext_audience_service.ExtAudienceService(api_client)
    update_id_upload4_pour_request_wrapper = UpdateIdUpload4PourRequestWrapper(
        header=ApiRequestHeader(),
        body=APIReqIdUpload(
            group_id=1,
            group_name="group_name_example",
            user_id=1,
            user_name="user_name_example",
            file_path="file_path_example",
            file_md5="file_md5_example",
            id_type="id_type_example",
            source="source_example",
            come_type="come_type_example",
            dsp_names="dsp_names_example",
            id_mapping=True,
            uuid_count=1,
            req_type="req_type_example",
            file_id=1,
            file_type="file_type_example",
            need_portrait=True,
            need_set_a_crowd=True,
        ),
    ) # UpdateIdUpload4PourRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_id_upload4_pour(update_id_upload4_pour_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ExtAudienceService->update_id_upload4_pour: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_id_upload4_pour_request_wrapper** | [**UpdateIdUpload4PourRequestWrapper**](UpdateIdUpload4PourRequestWrapper.md)|  |

### Return type

[**UpdateIdUpload4PourResponseWrapper**](UpdateIdUpload4PourResponseWrapper.md)

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

