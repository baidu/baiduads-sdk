# baiduads.AccountShoppingService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_account_shopping**](AccountShoppingService.md#get_account_shopping) | **POST** /json/sms/service/AccountShoppingService/getAccountShopping | 
[**update_account_shopping**](AccountShoppingService.md#update_account_shopping) | **POST** /json/sms/service/AccountShoppingService/updateAccountShopping | 


# **get_account_shopping**
> GetAccountShoppingResponseWrapper get_account_shopping(get_account_shopping_request_wrapper)



### Example


```python
import time
import baiduads
from accountshopping.api import account_shopping_service
from baiduads.accountshopping.model.get_account_shopping_response_wrapper import GetAccountShoppingResponseWrapper
from baiduads.accountshopping.model.get_account_shopping_request_wrapper import GetAccountShoppingRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = account_shopping_service.AccountShoppingService(api_client)
    get_account_shopping_request_wrapper = GetAccountShoppingRequestWrapper(
        header=ApiRequestHeader(),
        body={},
    ) # GetAccountShoppingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_account_shopping(get_account_shopping_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AccountShoppingService->get_account_shopping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_account_shopping_request_wrapper** | [**GetAccountShoppingRequestWrapper**](GetAccountShoppingRequestWrapper.md)|  |

### Return type

[**GetAccountShoppingResponseWrapper**](GetAccountShoppingResponseWrapper.md)

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

# **update_account_shopping**
> UpdateAccountShoppingResponseWrapper update_account_shopping(update_account_shopping_request_wrapper)



### Example


```python
import time
import baiduads
from accountshopping.api import account_shopping_service
from baiduads.accountshopping.model.update_account_shopping_request_wrapper import UpdateAccountShoppingRequestWrapper
from baiduads.accountshopping.model.update_account_shopping_response_wrapper import UpdateAccountShoppingResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = account_shopping_service.AccountShoppingService(api_client)
    update_account_shopping_request_wrapper = UpdateAccountShoppingRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateAccountShoppingRequest(
            account_shopping_type=AccountShoppingType(
                user_id=1,
                user_stat=1,
                budget=3.14,
                balance=3.14,
                user_name="user_name_example",
            ),
        ),
    ) # UpdateAccountShoppingRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_account_shopping(update_account_shopping_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AccountShoppingService->update_account_shopping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_account_shopping_request_wrapper** | [**UpdateAccountShoppingRequestWrapper**](UpdateAccountShoppingRequestWrapper.md)|  |

### Return type

[**UpdateAccountShoppingResponseWrapper**](UpdateAccountShoppingResponseWrapper.md)

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

