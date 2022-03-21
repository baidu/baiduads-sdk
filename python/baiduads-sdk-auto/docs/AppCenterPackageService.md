# baiduads.AppCenterPackageService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_packagelist**](AppCenterPackageService.md#get_app_packagelist) | **POST** /json/sms/service/AppCenterPackageService/getAppPackagelist | 


# **get_app_packagelist**
> GetAppPackagelistResponseWrapper get_app_packagelist(get_app_packagelist_request_wrapper)



### Example


```python
import time
import baiduads
from appcenterpackage.api import app_center_package_service
from baiduads.appcenterpackage.model.get_app_packagelist_request_wrapper import GetAppPackagelistRequestWrapper
from baiduads.appcenterpackage.model.get_app_packagelist_response_wrapper import GetAppPackagelistResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = app_center_package_service.AppCenterPackageService(api_client)
    get_app_packagelist_request_wrapper = GetAppPackagelistRequestWrapper(
        header=ApiRequestHeader(),
        body=GetAppPackageListRequest(
            state=1,
            search_query="search_query_example",
            is_desc=True,
            sort_field="sort_field_example",
            search_type="search_type_example",
            start_time="start_time_example",
            end_time="end_time_example",
            states=[
                1,
            ],
            judge_login=1,
            is_gather=1,
            type=1,
            target_user_id=1,
            filters=[
                FilterCondition(
                    field="field_example",
                    op="op_example",
                    values=[
                        "values_example",
                    ],
                ),
            ],
            page_size=1,
            page_no=1,
        ),
    ) # GetAppPackagelistRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_app_packagelist(get_app_packagelist_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AppCenterPackageService->get_app_packagelist: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_app_packagelist_request_wrapper** | [**GetAppPackagelistRequestWrapper**](GetAppPackagelistRequestWrapper.md)|  |

### Return type

[**GetAppPackagelistResponseWrapper**](GetAppPackagelistResponseWrapper.md)

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

