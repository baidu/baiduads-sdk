# baiduads.StoreFunction

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_store_list_from_company**](StoreFunction.md#get_store_list_from_company) | **POST** /json/sms/service/StoreFunction/getStoreListFromCompany | 


# **get_store_list_from_company**
> GetStoreListFromCompanyResponseWrapper get_store_list_from_company(get_store_list_from_company_request_wrapper)



### Example


```python
import time
import baiduads
from storefunction.api import store_function
from baiduads.storefunction.model.get_store_list_from_company_request_wrapper import GetStoreListFromCompanyRequestWrapper
from baiduads.storefunction.model.get_store_list_from_company_response_wrapper import GetStoreListFromCompanyResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = store_function.StoreFunction(api_client)
    get_store_list_from_company_request_wrapper = GetStoreListFromCompanyRequestWrapper(
        header=ApiRequestHeader(),
        body=FcStoreCrossAccountQueryRequest(
            target_user_id=1,
        ),
    ) # GetStoreListFromCompanyRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_store_list_from_company(get_store_list_from_company_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling StoreFunction->get_store_list_from_company: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_store_list_from_company_request_wrapper** | [**GetStoreListFromCompanyRequestWrapper**](GetStoreListFromCompanyRequestWrapper.md)|  |

### Return type

[**GetStoreListFromCompanyResponseWrapper**](GetStoreListFromCompanyResponseWrapper.md)

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

