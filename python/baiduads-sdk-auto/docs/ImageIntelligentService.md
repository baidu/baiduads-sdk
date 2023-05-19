# baiduads.ImageIntelligentService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_smart_template_image**](ImageIntelligentService.md#get_smart_template_image) | **POST** /json/sms/service/ImageIntelligentService/getSmartTemplateImage | 


# **get_smart_template_image**
> GetSmartTemplateImageResponseWrapper get_smart_template_image(get_smart_template_image_request_wrapper)



### Example


```python
import time
import baiduads
from imageintelligent.api import image_intelligent_service
from baiduads.imageintelligent.model.get_smart_template_image_request_wrapper import GetSmartTemplateImageRequestWrapper
from baiduads.imageintelligent.model.get_smart_template_image_response_wrapper import GetSmartTemplateImageResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = image_intelligent_service.ImageIntelligentService(api_client)
    get_smart_template_image_request_wrapper = GetSmartTemplateImageRequestWrapper(
        header=ApiRequestHeader(),
        body=GetSmartTemplateImageRequest(
            major_word="major_word_example",
            minor_word="minor_word_example",
            guide_word="guide_word_example",
            url="url_example",
            logo_url="logo_url_example",
            logo_position="logo_position_example",
            image_sizes=[
                ImageSize(
                    height=1,
                    width=1,
                    offset_x=1,
                    offset_y=1,
                    size=1,
                    offset_height=1,
                    offset_width=1,
                ),
            ],
            save_to_my_repository=True,
            industry="industry_example",
            draft_type=1,
            support_transparent=1,
        ),
    ) # GetSmartTemplateImageRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_smart_template_image(get_smart_template_image_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling ImageIntelligentService->get_smart_template_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_smart_template_image_request_wrapper** | [**GetSmartTemplateImageRequestWrapper**](GetSmartTemplateImageRequestWrapper.md)|  |

### Return type

[**GetSmartTemplateImageResponseWrapper**](GetSmartTemplateImageResponseWrapper.md)

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

