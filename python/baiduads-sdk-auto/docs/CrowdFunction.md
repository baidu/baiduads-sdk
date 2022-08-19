# baiduads.CrowdFunction

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_crowd_estimate**](CrowdFunction.md#get_crowd_estimate) | **POST** /json/sms/service/CrowdFunction/getCrowdEstimate | 


# **get_crowd_estimate**
> GetCrowdEstimateResponseWrapper get_crowd_estimate(get_crowd_estimate_request_wrapper)



### Example


```python
import time
import baiduads
from crowdfunction.api import crowd_function
from baiduads.crowdfunction.model.get_crowd_estimate_request_wrapper import GetCrowdEstimateRequestWrapper
from baiduads.crowdfunction.model.get_crowd_estimate_response_wrapper import GetCrowdEstimateResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = crowd_function.CrowdFunction(api_client)
    get_crowd_estimate_request_wrapper = GetCrowdEstimateRequestWrapper(
        header=ApiRequestHeader(),
        body=CrowdEstimateRequest(
            sex=1,
            age=[
                1,
            ],
            in_people=[
                1,
            ],
            table_name="table_name_example",
            keys=[
                "keys_example",
            ],
        ),
    ) # GetCrowdEstimateRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_crowd_estimate(get_crowd_estimate_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling CrowdFunction->get_crowd_estimate: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_crowd_estimate_request_wrapper** | [**GetCrowdEstimateRequestWrapper**](GetCrowdEstimateRequestWrapper.md)|  |

### Return type

[**GetCrowdEstimateResponseWrapper**](GetCrowdEstimateResponseWrapper.md)

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

