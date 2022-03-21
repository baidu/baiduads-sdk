# baiduads.ApiDataAssetService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_data_asset**](ApiDataAssetService.md#create_data_asset) | **POST** /json/sms/service/ApiDataAssetService/createDataAsset | 
[**submit_data_asset_task**](ApiDataAssetService.md#submit_data_asset_task) | **POST** /json/sms/service/ApiDataAssetService/submitDataAssetTask | 


# **create_data_asset**
> CreateDataAssetResponseWrapper create_data_asset(create_data_asset_request_wrapper)



### Example


```python
import time
import baiduads
from apidataasset.api import api_data_asset_service
from baiduads.apidataasset.model.create_data_asset_response_wrapper import CreateDataAssetResponseWrapper
from baiduads.apidataasset.model.create_data_asset_request_wrapper import CreateDataAssetRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = api_data_asset_service.ApiDataAssetService(api_client)
    create_data_asset_request_wrapper = CreateDataAssetRequestWrapper(
        header=ApiRequestHeader(),
        body=DataAssetCreateRequest(
            asset_name="asset_name_example",
            asset_type="asset_type_example",
            ext_tags=[
                AssetTag(
                    data_name="data_name_example",
                    show_name="show_name_example",
                    type="type_example",
                ),
            ],
        ),
    ) # CreateDataAssetRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_data_asset(create_data_asset_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ApiDataAssetService->create_data_asset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_data_asset_request_wrapper** | [**CreateDataAssetRequestWrapper**](CreateDataAssetRequestWrapper.md)|  |

### Return type

[**CreateDataAssetResponseWrapper**](CreateDataAssetResponseWrapper.md)

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

# **submit_data_asset_task**
> SubmitDataAssetTaskResponseWrapper submit_data_asset_task(submit_data_asset_task_request_wrapper)



### Example


```python
import time
import baiduads
from apidataasset.api import api_data_asset_service
from baiduads.apidataasset.model.submit_data_asset_task_request_wrapper import SubmitDataAssetTaskRequestWrapper
from baiduads.apidataasset.model.submit_data_asset_task_response_wrapper import SubmitDataAssetTaskResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = api_data_asset_service.ApiDataAssetService(api_client)
    submit_data_asset_task_request_wrapper = SubmitDataAssetTaskRequestWrapper(
        header=ApiRequestHeader(),
        body=DataAssetTaskRequest(
            asset_id=1,
            file_id=1,
        ),
    ) # SubmitDataAssetTaskRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.submit_data_asset_task(submit_data_asset_task_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ApiDataAssetService->submit_data_asset_task: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submit_data_asset_task_request_wrapper** | [**SubmitDataAssetTaskRequestWrapper**](SubmitDataAssetTaskRequestWrapper.md)|  |

### Return type

[**SubmitDataAssetTaskResponseWrapper**](SubmitDataAssetTaskResponseWrapper.md)

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

