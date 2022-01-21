# baiduads.ProductAdsKeywordService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_word**](ProductAdsKeywordService.md#add_word) | **POST** /json/sms/service/ProductAdsKeywordService/addWord | 
[**delete_word**](ProductAdsKeywordService.md#delete_word) | **POST** /json/sms/service/ProductAdsKeywordService/deleteWord | 
[**get_paged_word**](ProductAdsKeywordService.md#get_paged_word) | **POST** /json/sms/service/ProductAdsKeywordService/getPagedWord | 
[**pause_keyword**](ProductAdsKeywordService.md#pause_keyword) | **POST** /json/sms/service/ProductAdsKeywordService/pauseKeyword | 
[**start_keyword**](ProductAdsKeywordService.md#start_keyword) | **POST** /json/sms/service/ProductAdsKeywordService/startKeyword | 
[**update_match_type**](ProductAdsKeywordService.md#update_match_type) | **POST** /json/sms/service/ProductAdsKeywordService/updateMatchType | 
[**update_price**](ProductAdsKeywordService.md#update_price) | **POST** /json/sms/service/ProductAdsKeywordService/updatePrice | 
[**update_target_url**](ProductAdsKeywordService.md#update_target_url) | **POST** /json/sms/service/ProductAdsKeywordService/updateTargetUrl | 


# **add_word**
> AddWordResponseWrapper add_word(add_word_request_wrapper)



### Example


```python
import time
import baiduads
from productadskeyword.api import product_ads_keyword_service
from baiduads.productadskeyword.model.add_word_request_wrapper import AddWordRequestWrapper
from baiduads.productadskeyword.model.add_word_response_wrapper import AddWordResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = product_ads_keyword_service.ProductAdsKeywordService(api_client)
    add_word_request_wrapper = AddWordRequestWrapper(
        header=ApiRequestHeader(),
        body=AddOrUpdateWordRequest(
            adgroup_id=1,
            keyword_types=[
                KeywordType(
                    keyword_id=1,
                    adgroup_id=1,
                    campaign_id=1,
                    keyword="keyword_example",
                    price=3.14,
                    target_url="target_url_example",
                    match_type="match_type_example",
                    winfo_type="winfo_type_example",
                    status="status_example",
                ),
            ],
        ),
    ) # AddWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_word(add_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ProductAdsKeywordService->add_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_word_request_wrapper** | [**AddWordRequestWrapper**](AddWordRequestWrapper.md)|  |

### Return type

[**AddWordResponseWrapper**](AddWordResponseWrapper.md)

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

# **delete_word**
> DeleteWordResponseWrapper delete_word(delete_word_request_wrapper)



### Example


```python
import time
import baiduads
from productadskeyword.api import product_ads_keyword_service
from baiduads.productadskeyword.model.delete_word_request_wrapper import DeleteWordRequestWrapper
from baiduads.productadskeyword.model.delete_word_response_wrapper import DeleteWordResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = product_ads_keyword_service.ProductAdsKeywordService(api_client)
    delete_word_request_wrapper = DeleteWordRequestWrapper(
        header=ApiRequestHeader(),
        body=KeywordIdRequest(
            keyword_ids=[
                1,
            ],
        ),
    ) # DeleteWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_word(delete_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ProductAdsKeywordService->delete_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_word_request_wrapper** | [**DeleteWordRequestWrapper**](DeleteWordRequestWrapper.md)|  |

### Return type

[**DeleteWordResponseWrapper**](DeleteWordResponseWrapper.md)

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

# **get_paged_word**
> GetPagedWordResponseWrapper get_paged_word(get_paged_word_request_wrapper)



### Example


```python
import time
import baiduads
from productadskeyword.api import product_ads_keyword_service
from baiduads.productadskeyword.model.get_paged_word_response_wrapper import GetPagedWordResponseWrapper
from baiduads.productadskeyword.model.get_paged_word_request_wrapper import GetPagedWordRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = product_ads_keyword_service.ProductAdsKeywordService(api_client)
    get_paged_word_request_wrapper = GetPagedWordRequestWrapper(
        header=ApiRequestHeader(),
        body=GetWordRequest(
            adgroup_id=1,
            winfo_type="winfo_type_example",
            keyword="keyword_example",
            page_no=1,
            page_size=1,
        ),
    ) # GetPagedWordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_paged_word(get_paged_word_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ProductAdsKeywordService->get_paged_word: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_paged_word_request_wrapper** | [**GetPagedWordRequestWrapper**](GetPagedWordRequestWrapper.md)|  |

### Return type

[**GetPagedWordResponseWrapper**](GetPagedWordResponseWrapper.md)

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

# **pause_keyword**
> PauseKeywordResponseWrapper pause_keyword(pause_keyword_request_wrapper)



### Example


```python
import time
import baiduads
from productadskeyword.api import product_ads_keyword_service
from baiduads.productadskeyword.model.pause_keyword_request_wrapper import PauseKeywordRequestWrapper
from baiduads.productadskeyword.model.pause_keyword_response_wrapper import PauseKeywordResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = product_ads_keyword_service.ProductAdsKeywordService(api_client)
    pause_keyword_request_wrapper = PauseKeywordRequestWrapper(
        header=ApiRequestHeader(),
        body=KeywordIdRequest(
            keyword_ids=[
                1,
            ],
        ),
    ) # PauseKeywordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.pause_keyword(pause_keyword_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ProductAdsKeywordService->pause_keyword: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pause_keyword_request_wrapper** | [**PauseKeywordRequestWrapper**](PauseKeywordRequestWrapper.md)|  |

### Return type

[**PauseKeywordResponseWrapper**](PauseKeywordResponseWrapper.md)

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

# **start_keyword**
> StartKeywordResponseWrapper start_keyword(start_keyword_request_wrapper)



### Example


```python
import time
import baiduads
from productadskeyword.api import product_ads_keyword_service
from baiduads.productadskeyword.model.start_keyword_response_wrapper import StartKeywordResponseWrapper
from baiduads.productadskeyword.model.start_keyword_request_wrapper import StartKeywordRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = product_ads_keyword_service.ProductAdsKeywordService(api_client)
    start_keyword_request_wrapper = StartKeywordRequestWrapper(
        header=ApiRequestHeader(),
        body=KeywordIdRequest(
            keyword_ids=[
                1,
            ],
        ),
    ) # StartKeywordRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.start_keyword(start_keyword_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ProductAdsKeywordService->start_keyword: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_keyword_request_wrapper** | [**StartKeywordRequestWrapper**](StartKeywordRequestWrapper.md)|  |

### Return type

[**StartKeywordResponseWrapper**](StartKeywordResponseWrapper.md)

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

# **update_match_type**
> UpdateMatchTypeResponseWrapper update_match_type(update_match_type_request_wrapper)



### Example


```python
import time
import baiduads
from productadskeyword.api import product_ads_keyword_service
from baiduads.productadskeyword.model.update_match_type_request_wrapper import UpdateMatchTypeRequestWrapper
from baiduads.productadskeyword.model.update_match_type_response_wrapper import UpdateMatchTypeResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = product_ads_keyword_service.ProductAdsKeywordService(api_client)
    update_match_type_request_wrapper = UpdateMatchTypeRequestWrapper(
        header=ApiRequestHeader(),
        body=EditWordMatchTypeRequest(
            keyword_ids=[
                1,
            ],
            match_type="match_type_example",
        ),
    ) # UpdateMatchTypeRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_match_type(update_match_type_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ProductAdsKeywordService->update_match_type: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_match_type_request_wrapper** | [**UpdateMatchTypeRequestWrapper**](UpdateMatchTypeRequestWrapper.md)|  |

### Return type

[**UpdateMatchTypeResponseWrapper**](UpdateMatchTypeResponseWrapper.md)

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

# **update_price**
> UpdatePriceResponseWrapper update_price(update_price_request_wrapper)



### Example


```python
import time
import baiduads
from productadskeyword.api import product_ads_keyword_service
from baiduads.productadskeyword.model.update_price_response_wrapper import UpdatePriceResponseWrapper
from baiduads.productadskeyword.model.update_price_request_wrapper import UpdatePriceRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = product_ads_keyword_service.ProductAdsKeywordService(api_client)
    update_price_request_wrapper = UpdatePriceRequestWrapper(
        header=ApiRequestHeader(),
        body=EditWordPriceRequest(
            keyword_ids=[
                1,
            ],
            price=3.14,
        ),
    ) # UpdatePriceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_price(update_price_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ProductAdsKeywordService->update_price: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_price_request_wrapper** | [**UpdatePriceRequestWrapper**](UpdatePriceRequestWrapper.md)|  |

### Return type

[**UpdatePriceResponseWrapper**](UpdatePriceResponseWrapper.md)

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

# **update_target_url**
> UpdateTargetUrlResponseWrapper update_target_url(update_target_url_request_wrapper)



### Example


```python
import time
import baiduads
from productadskeyword.api import product_ads_keyword_service
from baiduads.productadskeyword.model.update_target_url_response_wrapper import UpdateTargetUrlResponseWrapper
from baiduads.productadskeyword.model.update_target_url_request_wrapper import UpdateTargetUrlRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = product_ads_keyword_service.ProductAdsKeywordService(api_client)
    update_target_url_request_wrapper = UpdateTargetUrlRequestWrapper(
        header=ApiRequestHeader(),
        body=EditWordTargetUrlRequest(
            keyword_ids=[
                1,
            ],
            target_url="target_url_example",
        ),
    ) # UpdateTargetUrlRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_target_url(update_target_url_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ProductAdsKeywordService->update_target_url: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_target_url_request_wrapper** | [**UpdateTargetUrlRequestWrapper**](UpdateTargetUrlRequestWrapper.md)|  |

### Return type

[**UpdateTargetUrlResponseWrapper**](UpdateTargetUrlResponseWrapper.md)

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

