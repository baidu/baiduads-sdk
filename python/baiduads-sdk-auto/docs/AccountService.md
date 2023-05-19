# baiduads.AccountService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_account_info**](AccountService.md#get_account_info) | **POST** /json/sms/service/AccountService/getAccountInfo | 
[**update_account_info**](AccountService.md#update_account_info) | **POST** /json/sms/service/AccountService/updateAccountInfo | 


# **get_account_info**
> GetAccountInfoResponseWrapper get_account_info(get_account_info_request_wrapper)



### Example


```python
import time
import baiduads
from account.api import account_service
from baiduads.account.model.get_account_info_response_wrapper import GetAccountInfoResponseWrapper
from baiduads.account.model.get_account_info_request_wrapper import GetAccountInfoRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = account_service.AccountService(api_client)
    get_account_info_request_wrapper = GetAccountInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiAccountQueryRequest(
            account_fields=[
                "account_fields_example",
            ],
        ),
    ) # GetAccountInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_account_info(get_account_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AccountService->get_account_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_account_info_request_wrapper** | [**GetAccountInfoRequestWrapper**](GetAccountInfoRequestWrapper.md)|  |

### Return type

[**GetAccountInfoResponseWrapper**](GetAccountInfoResponseWrapper.md)

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

# **update_account_info**
> UpdateAccountInfoResponseWrapper update_account_info(update_account_info_request_wrapper)



### Example


```python
import time
import baiduads
from account.api import account_service
from baiduads.account.model.update_account_info_response_wrapper import UpdateAccountInfoResponseWrapper
from baiduads.account.model.update_account_info_request_wrapper import UpdateAccountInfoRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = account_service.AccountService(api_client)
    update_account_info_request_wrapper = UpdateAccountInfoRequestWrapper(
        header=ApiRequestHeader(),
        body=ApiAccountUpdateRequest(
            account_info=ApiAccountType(
                user_id=1,
                balance=3.14,
                pc_balance=3.14,
                cost=3.14,
                payment=3.14,
                budget=3.14,
                region_target=[
                    1,
                ],
                exclude_ip=[
                    "exclude_ip_example",
                ],
                open_domains=[
                    "open_domains_example",
                ],
                budget_type=1,
                reg_domain="reg_domain_example",
                user_stat=1,
                budget_offline_time=[
                    ApiOfflineTimeType(
                        time="time_example",
                        flag=1,
                    ),
                ],
                user_level=1,
                region_price_factor=[
                    RegionPriceFactor(
                        region_id=1,
                        price_factor=3.14,
                    ),
                ],
                cid=1,
                query_region_status=True,
                exclude_query_region_status=True,
                text_optimize_segment_status=True,
                sys_long_link_segment_status=True,
                long_monitor_sublink="long_monitor_sublink_example",
                account_monitor_url="account_monitor_url_example",
                lice_name="lice_name_example",
            ),
        ),
    ) # UpdateAccountInfoRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_account_info(update_account_info_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AccountService->update_account_info: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_account_info_request_wrapper** | [**UpdateAccountInfoRequestWrapper**](UpdateAccountInfoRequestWrapper.md)|  |

### Return type

[**UpdateAccountInfoResponseWrapper**](UpdateAccountInfoResponseWrapper.md)

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

