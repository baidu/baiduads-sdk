# baiduads.OAuthAuthorizedToolAPI

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_auth_code**](OAuthAuthorizedToolAPI.md#get_auth_code) | **POST** /json/sms/service/OAuthAuthorizedToolAPI/getAuthCode | 


# **get_auth_code**
> GetAuthCodeResponseWrapper get_auth_code(get_auth_code_request_wrapper)



### Example


```python
import time
import baiduads
from oauthauthorizedtoolapi.api import o_auth_authorized_tool_api
from baiduads.oauthauthorizedtoolapi.model.get_auth_code_request_wrapper import GetAuthCodeRequestWrapper
from baiduads.oauthauthorizedtoolapi.model.get_auth_code_response_wrapper import GetAuthCodeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = o_auth_authorized_tool_api.OAuthAuthorizedToolAPI(api_client)
    get_auth_code_request_wrapper = GetAuthCodeRequestWrapper(
        header=ApiRequestHeader(),
        body=AuthorizedToolRequest(
            app_id="app_id_example",
            secret_key="secret_key_example",
            state="state_example",
        ),
    ) # GetAuthCodeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_auth_code(get_auth_code_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling OAuthAuthorizedToolAPI->get_auth_code: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_auth_code_request_wrapper** | [**GetAuthCodeRequestWrapper**](GetAuthCodeRequestWrapper.md)|  |

### Return type

[**GetAuthCodeResponseWrapper**](GetAuthCodeResponseWrapper.md)

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

