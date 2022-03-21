# baiduads.ApiServiceForExternal

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_data_tags**](ApiServiceForExternal.md#create_data_tags) | **POST** /json/sms/service/ApiServiceForExternal/createDataTags | 
[**upload_id_stream**](ApiServiceForExternal.md#upload_id_stream) | **POST** /json/sms/service/ApiServiceForExternal/uploadIdStream | 


# **create_data_tags**
> CreateDataTagsResponseWrapper create_data_tags(create_data_tags_request_wrapper)



### Example


```python
import time
import baiduads
from apiserviceforexternal.api import api_service_for_external
from baiduads.apiserviceforexternal.model.create_data_tags_response_wrapper import CreateDataTagsResponseWrapper
from baiduads.apiserviceforexternal.model.create_data_tags_request_wrapper import CreateDataTagsRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = api_service_for_external.ApiServiceForExternal(api_client)
    create_data_tags_request_wrapper = CreateDataTagsRequestWrapper(
        header=ApiRequestHeader(),
        body=WebUploadBatchParams(
            data=[
                {},
            ],
            auth_header=AuthRequest(
                username="username_example",
                token="token_example",
                target_user_id=1,
            ),
        ),
    ) # CreateDataTagsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_data_tags(create_data_tags_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ApiServiceForExternal->create_data_tags: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_data_tags_request_wrapper** | [**CreateDataTagsRequestWrapper**](CreateDataTagsRequestWrapper.md)|  |

### Return type

[**CreateDataTagsResponseWrapper**](CreateDataTagsResponseWrapper.md)

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

# **upload_id_stream**
> UploadIdStreamResponseWrapper upload_id_stream(upload_id_stream_request_wrapper)



### Example


```python
import time
import baiduads
from apiserviceforexternal.api import api_service_for_external
from baiduads.apiserviceforexternal.model.upload_id_stream_request_wrapper import UploadIdStreamRequestWrapper
from baiduads.apiserviceforexternal.model.upload_id_stream_response_wrapper import UploadIdStreamResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = api_service_for_external.ApiServiceForExternal(api_client)
    upload_id_stream_request_wrapper = UploadIdStreamRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiIdRealTimeRequest(
            data="data_example",
            come_type="come_type_example",
            crowd_id=1,
            sid_type="sid_type_example",
            op_type=1,
            sid_list=[
                "sid_list_example",
            ],
            encrypt=True,
        ),
    ) # UploadIdStreamRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.upload_id_stream(upload_id_stream_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ApiServiceForExternal->upload_id_stream: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_id_stream_request_wrapper** | [**UploadIdStreamRequestWrapper**](UploadIdStreamRequestWrapper.md)|  |

### Return type

[**UploadIdStreamResponseWrapper**](UploadIdStreamResponseWrapper.md)

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

