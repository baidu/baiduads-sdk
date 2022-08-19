# baiduads.DanubeCreativeGroupService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_danube_creative_group**](DanubeCreativeGroupService.md#add_danube_creative_group) | **POST** /json/sms/service/DanubeCreativeGroupService/addDanubeCreativeGroup | 
[**copy_danube_creative_group**](DanubeCreativeGroupService.md#copy_danube_creative_group) | **POST** /json/sms/service/DanubeCreativeGroupService/copyDanubeCreativeGroup | 
[**delete_danube_creative_group**](DanubeCreativeGroupService.md#delete_danube_creative_group) | **POST** /json/sms/service/DanubeCreativeGroupService/deleteDanubeCreativeGroup | 
[**get_danube_constants**](DanubeCreativeGroupService.md#get_danube_constants) | **POST** /json/sms/service/DanubeCreativeGroupService/getDanubeConstants | 
[**get_danube_creative_group**](DanubeCreativeGroupService.md#get_danube_creative_group) | **POST** /json/sms/service/DanubeCreativeGroupService/getDanubeCreativeGroup | 
[**update_danube_creative_group**](DanubeCreativeGroupService.md#update_danube_creative_group) | **POST** /json/sms/service/DanubeCreativeGroupService/updateDanubeCreativeGroup | 


# **add_danube_creative_group**
> AddDanubeCreativeGroupResponseWrapper add_danube_creative_group(add_danube_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from danubecreativegroup.api import danube_creative_group_service
from baiduads.danubecreativegroup.model.add_danube_creative_group_request_wrapper import AddDanubeCreativeGroupRequestWrapper
from baiduads.danubecreativegroup.model.add_danube_creative_group_response_wrapper import AddDanubeCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = danube_creative_group_service.DanubeCreativeGroupService(api_client)
    add_danube_creative_group_request_wrapper = AddDanubeCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeGroupModRequest(
            creative_group_types=[
                DanubeCreativeGroupType(
                    creative_group_id=1,
                    creative_group_name="creative_group_name_example",
                    binding_range=[
                        DanubeWebPlanRangeItemType(
                            user_id=1,
                            campaign_id=1,
                            adgroup_id=1,
                        ),
                    ],
                    material_types=[
                        1,
                    ],
                    binding_level="binding_level_example",
                    category=[
                        1,
                    ],
                    creative_components=DanubeCreativeComponent(
                        select_list=[
                            DanubeSelectListCreative(
                                content=[
                                    SelectList(
                                        key="key_example",
                                        value="value_example",
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        plas=[
                            DanubePlasCreative(
                                content=[
                                    Plas(
                                        name="name_example",
                                        desc="desc_example",
                                        url="url_example",
                                        swan_url="swan_url_example",
                                        deep_link="deep_link_example",
                                        image=[
                                            Image(
                                                url="url_example",
                                                cut_top=3.14,
                                                cut_left=3.14,
                                                cut_width=3.14,
                                                cut_height=3.14,
                                                view_width=3.14,
                                                view_height=3.14,
                                                origin_width=3.14,
                                                origin_height=3.14,
                                                image_id=1,
                                                id="id_example",
                                            ),
                                        ],
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        category=[
                            DanubeCategoryCreative(
                                content=Category(
                                    industry="industry_example",
                                    sub_links=[
                                        SubLink(
                                            label="label_example",
                                            text_link=[
                                                TextLink(
                                                    more_link=True,
                                                    text="text_example",
                                                    link_url="link_url_example",
                                                    swan_url="swan_url_example",
                                                    deep_link="deep_link_example",
                                                    id="id_example",
                                                ),
                                            ],
                                            id="id_example",
                                        ),
                                    ],
                                ),
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        image=[
                            DanubeImageCreative(
                                content=[
                                    Image(
                                        url="url_example",
                                        cut_top=3.14,
                                        cut_left=3.14,
                                        cut_width=3.14,
                                        cut_height=3.14,
                                        view_width=3.14,
                                        view_height=3.14,
                                        origin_width=3.14,
                                        origin_height=3.14,
                                        image_id=1,
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        text_list=[
                            DanubeTextListCreative(
                                content=[
                                    "content_example",
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        list=[
                            DanubeListCreative(
                                content=ListType(
                                    industry="industry_example",
                                    labels=[
                                        "labels_example",
                                    ],
                                    slogan="slogan_example",
                                    rows=[
                                        ListRowType(
                                            product_name="product_name_example",
                                            product_url="product_url_example",
                                            target_url="target_url_example",
                                            labels=[
                                                "labels_example",
                                            ],
                                            swan_url="swan_url_example",
                                            deep_link="deep_link_example",
                                            id="id_example",
                                        ),
                                    ],
                                    max_char_num_by_column=[
                                        1,
                                    ],
                                ),
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                    ),
                    device=1,
                    status=1,
                    pause=True,
                ),
            ],
        ),
    ) # AddDanubeCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_danube_creative_group(add_danube_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DanubeCreativeGroupService->add_danube_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_danube_creative_group_request_wrapper** | [**AddDanubeCreativeGroupRequestWrapper**](AddDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**AddDanubeCreativeGroupResponseWrapper**](AddDanubeCreativeGroupResponseWrapper.md)

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

# **copy_danube_creative_group**
> CopyDanubeCreativeGroupResponseWrapper copy_danube_creative_group(copy_danube_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from danubecreativegroup.api import danube_creative_group_service
from baiduads.danubecreativegroup.model.copy_danube_creative_group_request_wrapper import CopyDanubeCreativeGroupRequestWrapper
from baiduads.danubecreativegroup.model.copy_danube_creative_group_response_wrapper import CopyDanubeCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = danube_creative_group_service.DanubeCreativeGroupService(api_client)
    copy_danube_creative_group_request_wrapper = CopyDanubeCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeGroupModRequest(
            creative_group_types=[
                DanubeCreativeGroupType(
                    creative_group_id=1,
                    creative_group_name="creative_group_name_example",
                    binding_range=[
                        DanubeWebPlanRangeItemType(
                            user_id=1,
                            campaign_id=1,
                            adgroup_id=1,
                        ),
                    ],
                    material_types=[
                        1,
                    ],
                    binding_level="binding_level_example",
                    category=[
                        1,
                    ],
                    creative_components=DanubeCreativeComponent(
                        select_list=[
                            DanubeSelectListCreative(
                                content=[
                                    SelectList(
                                        key="key_example",
                                        value="value_example",
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        plas=[
                            DanubePlasCreative(
                                content=[
                                    Plas(
                                        name="name_example",
                                        desc="desc_example",
                                        url="url_example",
                                        swan_url="swan_url_example",
                                        deep_link="deep_link_example",
                                        image=[
                                            Image(
                                                url="url_example",
                                                cut_top=3.14,
                                                cut_left=3.14,
                                                cut_width=3.14,
                                                cut_height=3.14,
                                                view_width=3.14,
                                                view_height=3.14,
                                                origin_width=3.14,
                                                origin_height=3.14,
                                                image_id=1,
                                                id="id_example",
                                            ),
                                        ],
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        category=[
                            DanubeCategoryCreative(
                                content=Category(
                                    industry="industry_example",
                                    sub_links=[
                                        SubLink(
                                            label="label_example",
                                            text_link=[
                                                TextLink(
                                                    more_link=True,
                                                    text="text_example",
                                                    link_url="link_url_example",
                                                    swan_url="swan_url_example",
                                                    deep_link="deep_link_example",
                                                    id="id_example",
                                                ),
                                            ],
                                            id="id_example",
                                        ),
                                    ],
                                ),
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        image=[
                            DanubeImageCreative(
                                content=[
                                    Image(
                                        url="url_example",
                                        cut_top=3.14,
                                        cut_left=3.14,
                                        cut_width=3.14,
                                        cut_height=3.14,
                                        view_width=3.14,
                                        view_height=3.14,
                                        origin_width=3.14,
                                        origin_height=3.14,
                                        image_id=1,
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        text_list=[
                            DanubeTextListCreative(
                                content=[
                                    "content_example",
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        list=[
                            DanubeListCreative(
                                content=ListType(
                                    industry="industry_example",
                                    labels=[
                                        "labels_example",
                                    ],
                                    slogan="slogan_example",
                                    rows=[
                                        ListRowType(
                                            product_name="product_name_example",
                                            product_url="product_url_example",
                                            target_url="target_url_example",
                                            labels=[
                                                "labels_example",
                                            ],
                                            swan_url="swan_url_example",
                                            deep_link="deep_link_example",
                                            id="id_example",
                                        ),
                                    ],
                                    max_char_num_by_column=[
                                        1,
                                    ],
                                ),
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                    ),
                    device=1,
                    status=1,
                    pause=True,
                ),
            ],
        ),
    ) # CopyDanubeCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.copy_danube_creative_group(copy_danube_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DanubeCreativeGroupService->copy_danube_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **copy_danube_creative_group_request_wrapper** | [**CopyDanubeCreativeGroupRequestWrapper**](CopyDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**CopyDanubeCreativeGroupResponseWrapper**](CopyDanubeCreativeGroupResponseWrapper.md)

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

# **delete_danube_creative_group**
> DeleteDanubeCreativeGroupResponseWrapper delete_danube_creative_group(delete_danube_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from danubecreativegroup.api import danube_creative_group_service
from baiduads.danubecreativegroup.model.delete_danube_creative_group_request_wrapper import DeleteDanubeCreativeGroupRequestWrapper
from baiduads.danubecreativegroup.model.delete_danube_creative_group_response_wrapper import DeleteDanubeCreativeGroupResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = danube_creative_group_service.DanubeCreativeGroupService(api_client)
    delete_danube_creative_group_request_wrapper = DeleteDanubeCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeGroupDelRequest(
            creative_group_ids=[
                1,
            ],
        ),
    ) # DeleteDanubeCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_danube_creative_group(delete_danube_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DanubeCreativeGroupService->delete_danube_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_danube_creative_group_request_wrapper** | [**DeleteDanubeCreativeGroupRequestWrapper**](DeleteDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**DeleteDanubeCreativeGroupResponseWrapper**](DeleteDanubeCreativeGroupResponseWrapper.md)

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

# **get_danube_constants**
> GetDanubeConstantsResponseWrapper get_danube_constants(get_danube_constants_request_wrapper)



### Example


```python
import time
import baiduads
from danubecreativegroup.api import danube_creative_group_service
from baiduads.danubecreativegroup.model.get_danube_constants_request_wrapper import GetDanubeConstantsRequestWrapper
from baiduads.danubecreativegroup.model.get_danube_constants_response_wrapper import GetDanubeConstantsResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = danube_creative_group_service.DanubeCreativeGroupService(api_client)
    get_danube_constants_request_wrapper = GetDanubeConstantsRequestWrapper(
        header=ApiRequestHeader(),
        body=DanubeConstantRequest(
            fields=[
                "fields_example",
            ],
        ),
    ) # GetDanubeConstantsRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_danube_constants(get_danube_constants_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DanubeCreativeGroupService->get_danube_constants: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_danube_constants_request_wrapper** | [**GetDanubeConstantsRequestWrapper**](GetDanubeConstantsRequestWrapper.md)|  |

### Return type

[**GetDanubeConstantsResponseWrapper**](GetDanubeConstantsResponseWrapper.md)

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

# **get_danube_creative_group**
> GetDanubeCreativeGroupResponseWrapper get_danube_creative_group(get_danube_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from danubecreativegroup.api import danube_creative_group_service
from baiduads.danubecreativegroup.model.get_danube_creative_group_response_wrapper import GetDanubeCreativeGroupResponseWrapper
from baiduads.danubecreativegroup.model.get_danube_creative_group_request_wrapper import GetDanubeCreativeGroupRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = danube_creative_group_service.DanubeCreativeGroupService(api_client)
    get_danube_creative_group_request_wrapper = GetDanubeCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=DanubePlanListRequest(
            page_no=1,
            page_size=1,
            fields=[
                "fields_example",
            ],
            creative_group_ids=[
                1,
            ],
        ),
    ) # GetDanubeCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_danube_creative_group(get_danube_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DanubeCreativeGroupService->get_danube_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_danube_creative_group_request_wrapper** | [**GetDanubeCreativeGroupRequestWrapper**](GetDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**GetDanubeCreativeGroupResponseWrapper**](GetDanubeCreativeGroupResponseWrapper.md)

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

# **update_danube_creative_group**
> UpdateDanubeCreativeGroupResponseWrapper update_danube_creative_group(update_danube_creative_group_request_wrapper)



### Example


```python
import time
import baiduads
from danubecreativegroup.api import danube_creative_group_service
from baiduads.danubecreativegroup.model.update_danube_creative_group_response_wrapper import UpdateDanubeCreativeGroupResponseWrapper
from baiduads.danubecreativegroup.model.update_danube_creative_group_request_wrapper import UpdateDanubeCreativeGroupRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = danube_creative_group_service.DanubeCreativeGroupService(api_client)
    update_danube_creative_group_request_wrapper = UpdateDanubeCreativeGroupRequestWrapper(
        header=ApiRequestHeader(),
        body=CreativeGroupModRequest(
            creative_group_types=[
                DanubeCreativeGroupType(
                    creative_group_id=1,
                    creative_group_name="creative_group_name_example",
                    binding_range=[
                        DanubeWebPlanRangeItemType(
                            user_id=1,
                            campaign_id=1,
                            adgroup_id=1,
                        ),
                    ],
                    material_types=[
                        1,
                    ],
                    binding_level="binding_level_example",
                    category=[
                        1,
                    ],
                    creative_components=DanubeCreativeComponent(
                        select_list=[
                            DanubeSelectListCreative(
                                content=[
                                    SelectList(
                                        key="key_example",
                                        value="value_example",
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        plas=[
                            DanubePlasCreative(
                                content=[
                                    Plas(
                                        name="name_example",
                                        desc="desc_example",
                                        url="url_example",
                                        swan_url="swan_url_example",
                                        deep_link="deep_link_example",
                                        image=[
                                            Image(
                                                url="url_example",
                                                cut_top=3.14,
                                                cut_left=3.14,
                                                cut_width=3.14,
                                                cut_height=3.14,
                                                view_width=3.14,
                                                view_height=3.14,
                                                origin_width=3.14,
                                                origin_height=3.14,
                                                image_id=1,
                                                id="id_example",
                                            ),
                                        ],
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        category=[
                            DanubeCategoryCreative(
                                content=Category(
                                    industry="industry_example",
                                    sub_links=[
                                        SubLink(
                                            label="label_example",
                                            text_link=[
                                                TextLink(
                                                    more_link=True,
                                                    text="text_example",
                                                    link_url="link_url_example",
                                                    swan_url="swan_url_example",
                                                    deep_link="deep_link_example",
                                                    id="id_example",
                                                ),
                                            ],
                                            id="id_example",
                                        ),
                                    ],
                                ),
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        image=[
                            DanubeImageCreative(
                                content=[
                                    Image(
                                        url="url_example",
                                        cut_top=3.14,
                                        cut_left=3.14,
                                        cut_width=3.14,
                                        cut_height=3.14,
                                        view_width=3.14,
                                        view_height=3.14,
                                        origin_width=3.14,
                                        origin_height=3.14,
                                        image_id=1,
                                        id="id_example",
                                    ),
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        text_list=[
                            DanubeTextListCreative(
                                content=[
                                    "content_example",
                                ],
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                        list=[
                            DanubeListCreative(
                                content=ListType(
                                    industry="industry_example",
                                    labels=[
                                        "labels_example",
                                    ],
                                    slogan="slogan_example",
                                    rows=[
                                        ListRowType(
                                            product_name="product_name_example",
                                            product_url="product_url_example",
                                            target_url="target_url_example",
                                            labels=[
                                                "labels_example",
                                            ],
                                            swan_url="swan_url_example",
                                            deep_link="deep_link_example",
                                            id="id_example",
                                        ),
                                    ],
                                    max_char_num_by_column=[
                                        1,
                                    ],
                                ),
                                mt_id=1,
                                cn_name="cn_name_example",
                                en_name="en_name_example",
                                style="style_example",
                            ),
                        ],
                    ),
                    device=1,
                    status=1,
                    pause=True,
                ),
            ],
        ),
    ) # UpdateDanubeCreativeGroupRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_danube_creative_group(update_danube_creative_group_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling DanubeCreativeGroupService->update_danube_creative_group: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_danube_creative_group_request_wrapper** | [**UpdateDanubeCreativeGroupRequestWrapper**](UpdateDanubeCreativeGroupRequestWrapper.md)|  |

### Return type

[**UpdateDanubeCreativeGroupResponseWrapper**](UpdateDanubeCreativeGroupResponseWrapper.md)

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

