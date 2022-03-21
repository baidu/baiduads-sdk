# baiduads.ShareService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**save_sharing_batch_dr**](ShareService.md#save_sharing_batch_dr) | **POST** /json/sms/service/ShareService/saveSharingBatchDr | 


# **save_sharing_batch_dr**
> SaveSharingBatchDrResponseWrapper save_sharing_batch_dr(save_sharing_batch_dr_request_wrapper)



### Example


```python
import time
import baiduads
from share.api import share_service
from baiduads.share.model.save_sharing_batch_dr_request_wrapper import SaveSharingBatchDrRequestWrapper
from baiduads.share.model.save_sharing_batch_dr_response_wrapper import SaveSharingBatchDrResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = share_service.ShareService(api_client)
    save_sharing_batch_dr_request_wrapper = SaveSharingBatchDrRequestWrapper(
        header=ApiRequestHeader(),
        body=ShareSaveRequest(
            user_id=1,
            group_id=1,
            grant_user_ids=[
                1,
            ],
            group_ids=[
                1,
            ],
            grant_user_names=[
                "grant_user_names_example",
            ],
            dsp="dsp_example",
            theme_category=[
                "theme_category_example",
            ],
        ),
    ) # SaveSharingBatchDrRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.save_sharing_batch_dr(save_sharing_batch_dr_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ShareService->save_sharing_batch_dr: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **save_sharing_batch_dr_request_wrapper** | [**SaveSharingBatchDrRequestWrapper**](SaveSharingBatchDrRequestWrapper.md)|  |

### Return type

[**SaveSharingBatchDrResponseWrapper**](SaveSharingBatchDrResponseWrapper.md)

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

