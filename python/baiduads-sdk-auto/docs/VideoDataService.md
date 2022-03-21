# baiduads.VideoDataService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_label_data**](VideoDataService.md#get_label_data) | **POST** /json/sms/service/VideoDataService/getLabelData | 
[**get_second_level_data**](VideoDataService.md#get_second_level_data) | **POST** /json/sms/service/VideoDataService/getSecondLevelData | 


# **get_label_data**
> GetLabelDataResponseWrapper get_label_data(get_label_data_request_wrapper)



### Example


```python
import time
import baiduads
from videodata.api import video_data_service
from baiduads.videodata.model.get_label_data_request_wrapper import GetLabelDataRequestWrapper
from baiduads.videodata.model.get_label_data_response_wrapper import GetLabelDataResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_data_service.VideoDataService(api_client)
    get_label_data_request_wrapper = GetLabelDataRequestWrapper(
        header=ApiRequestHeader(),
        body=LabelDataRequest(
            video_ids=[
                1,
            ],
        ),
    ) # GetLabelDataRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_label_data(get_label_data_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoDataService->get_label_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_label_data_request_wrapper** | [**GetLabelDataRequestWrapper**](GetLabelDataRequestWrapper.md)|  |

### Return type

[**GetLabelDataResponseWrapper**](GetLabelDataResponseWrapper.md)

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

# **get_second_level_data**
> GetSecondLevelDataResponseWrapper get_second_level_data(get_second_level_data_request_wrapper)



### Example


```python
import time
import baiduads
from videodata.api import video_data_service
from baiduads.videodata.model.get_second_level_data_response_wrapper import GetSecondLevelDataResponseWrapper
from baiduads.videodata.model.get_second_level_data_request_wrapper import GetSecondLevelDataRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = video_data_service.VideoDataService(api_client)
    get_second_level_data_request_wrapper = GetSecondLevelDataRequestWrapper(
        header=ApiRequestHeader(),
        body=SecondLevelDataRequest(
            video_id=1,
            video_md5="video_md5_example",
            start_date="start_date_example",
            end_date="end_date_example",
        ),
    ) # GetSecondLevelDataRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_second_level_data(get_second_level_data_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling VideoDataService->get_second_level_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_second_level_data_request_wrapper** | [**GetSecondLevelDataRequestWrapper**](GetSecondLevelDataRequestWrapper.md)|  |

### Return type

[**GetSecondLevelDataResponseWrapper**](GetSecondLevelDataResponseWrapper.md)

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

