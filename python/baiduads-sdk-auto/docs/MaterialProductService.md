# baiduads.MaterialProductService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_product**](MaterialProductService.md#add_product) | **POST** /json/sms/service/MaterialProductService/addProduct | 
[**delete_product**](MaterialProductService.md#delete_product) | **POST** /json/sms/service/MaterialProductService/deleteProduct | 
[**get_product_list**](MaterialProductService.md#get_product_list) | **POST** /json/sms/service/MaterialProductService/getProductList | 
[**update_category**](MaterialProductService.md#update_category) | **POST** /json/sms/service/MaterialProductService/updateCategory | 
[**update_product**](MaterialProductService.md#update_product) | **POST** /json/sms/service/MaterialProductService/updateProduct | 
[**update_putaway**](MaterialProductService.md#update_putaway) | **POST** /json/sms/service/MaterialProductService/updatePutaway | 
[**update_rank**](MaterialProductService.md#update_rank) | **POST** /json/sms/service/MaterialProductService/updateRank | 


# **add_product**
> AddProductResponseWrapper add_product(add_product_request_wrapper)



### Example


```python
import time
import baiduads
from materialproduct.api import material_product_service
from baiduads.materialproduct.model.add_product_request_wrapper import AddProductRequestWrapper
from baiduads.materialproduct.model.add_product_response_wrapper import AddProductResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_product_service.MaterialProductService(api_client)
    add_product_request_wrapper = AddProductRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaProductAddRequest(
            category_id=1,
            product_title="product_title_example",
            desc="desc_example",
            content="content_example",
            status=1,
            product_short_title="product_short_title_example",
            image=[
                ProductImage(
                    type="type_example",
                    value=[
                        ProductImageDto(
                            url="url_example",
                        ),
                    ],
                ),
            ],
            product_ext=ProductExtDto(
                tags=[
                    "tags_example",
                ],
                params=[
                    ParamsDto(
                        key="key_example",
                        value="value_example",
                    ),
                ],
                price=PriceDto(
                    original="original_example",
                    current="current_example",
                    original_unit=1,
                    current_unit=1,
                    original_optional_unit="original_optional_unit_example",
                    current_optional_unit="current_optional_unit_example",
                    type=1,
                    extend="extend_example",
                ),
                subject=[
                    1,
                ],
                author="author_example",
                serial_status=1,
                word_count=WordCountDto(
                    count=1,
                    unit=1,
                ),
                year=1,
                ios_address="ios_address_example",
                android_address="android_address_example",
                suitable_crowd="suitable_crowd_example",
                suitable_basic=1,
                student_count=1,
                course_highlights=[
                    "course_highlights_example",
                ],
                trial_object=[
                    "trial_object_example",
                ],
                learn_goals="learn_goals_example",
                teach_form=[
                    1,
                ],
                teach_features=[
                    1,
                ],
                feature_desc="feature_desc_example",
                class_name="class_name_example",
                class_date="class_date_example",
                class_date_interval=[
                    "class_date_interval_example",
                ],
                class_time="class_time_example",
                class_number=1,
                bash_info=ProductEstateBashInfoDto(
                    sales_status="sales_status_example",
                    property_type="property_type_example",
                    start_time="start_time_example",
                    most_door_model=[
                        "most_door_model_example",
                    ],
                    price=PriceDto(
                        original="original_example",
                        current="current_example",
                        original_unit=1,
                        current_unit=1,
                        original_optional_unit="original_optional_unit_example",
                        current_optional_unit="current_optional_unit_example",
                        type=1,
                        extend="extend_example",
                    ),
                    total_price="total_price_example",
                    year="year_example",
                ),
                unit_type_info=[
                    ProductEstateUnitTypeInfoDto(
                        name="name_example",
                        type="type_example",
                        sales_status="sales_status_example",
                        bedroom="bedroom_example",
                        building_area="building_area_example",
                        indoor_area="indoor_area_example",
                        giving_area="giving_area_example",
                        toward="toward_example",
                        high=3.14,
                        house_rate=3.14,
                        all_num=1,
                        unit_type_image=ProductImage(
                            type="type_example",
                            value=[
                                ProductImageDto(
                                    url="url_example",
                                ),
                            ],
                        ),
                        sample_room_image=ProductImage(
                            type="type_example",
                            value=[
                                ProductImageDto(
                                    url="url_example",
                                ),
                            ],
                        ),
                        price=PriceDto(
                            original="original_example",
                            current="current_example",
                            original_unit=1,
                            current_unit=1,
                            original_optional_unit="original_optional_unit_example",
                            current_optional_unit="current_optional_unit_example",
                            type=1,
                            extend="extend_example",
                        ),
                    ),
                ],
                area_info="area_info_example",
                houses_details=ProductEstateHousesDetailsDto(
                    plan_period=1,
                    plan_households=1,
                    current_period_households=1,
                    plan_dong=1,
                    current_period_dong=1,
                    dong_situation="dong_situation_example",
                    land_area=3.14,
                    build_area=3.14,
                    plot_ratio=3.14,
                    green_rate=3.14,
                    entrance_num=1,
                    in_out_way="in_out_way_example",
                    close_situation="close_situation_example",
                    people_and_car="people_and_car_example",
                    park_spot_num=1,
                    park_spot_ratio=3.14,
                    supply_water="supply_water_example",
                    supply_electricity="supply_electricity_example",
                    supply_warm="supply_warm_example",
                    supply_gas="supply_gas_example",
                    elevator="elevator_example",
                    elevator_config="elevator_config_example",
                    license="license_example",
                    furnish="furnish_example",
                    start_time="start_time_example",
                    handover_time="handover_time_example",
                    property_cost=3.14,
                    address="address_example",
                    phone="phone_example",
                    pre_sale="pre_sale_example",
                    images=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    forensics="forensics_example",
                    build="build_example",
                ),
                other_images=ProductEstateImagesDto(
                    real_scene=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    matching=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    planning=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    traffic=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    construction=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    sand_table=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                ),
                related_company="related_company_example",
                estate_dynamic="estate_dynamic_example",
                join_in_project="join_in_project_example",
                franchisee_info="franchisee_info_example",
                qualification_info="qualification_info_example",
                detail_category=[
                    DetailCategoryDto(
                        id="id_example",
                        name="name_example",
                    ),
                ],
                class_type=1,
            ),
            trade_id=1,
            video=[
                ProductVideo(
                    type="type_example",
                    value=[
                        ProductVideoDto(
                            cover_url="cover_url_example",
                            video_url="video_url_example",
                            name="name_example",
                            video_id=1,
                            duration=1,
                        ),
                    ],
                ),
            ],
            data_version=1,
            rec_title=[
                "rec_title_example",
            ],
        ),
    ) # AddProductRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.add_product(add_product_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialProductService->add_product: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_product_request_wrapper** | [**AddProductRequestWrapper**](AddProductRequestWrapper.md)|  |

### Return type

[**AddProductResponseWrapper**](AddProductResponseWrapper.md)

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

# **delete_product**
> DeleteProductResponseWrapper delete_product(delete_product_request_wrapper)



### Example


```python
import time
import baiduads
from materialproduct.api import material_product_service
from baiduads.materialproduct.model.delete_product_response_wrapper import DeleteProductResponseWrapper
from baiduads.materialproduct.model.delete_product_request_wrapper import DeleteProductRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_product_service.MaterialProductService(api_client)
    delete_product_request_wrapper = DeleteProductRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaProductDeleteRequest(
            product_id_list=[
                1,
            ],
        ),
    ) # DeleteProductRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.delete_product(delete_product_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialProductService->delete_product: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete_product_request_wrapper** | [**DeleteProductRequestWrapper**](DeleteProductRequestWrapper.md)|  |

### Return type

[**DeleteProductResponseWrapper**](DeleteProductResponseWrapper.md)

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

# **get_product_list**
> GetProductListResponseWrapper get_product_list(get_product_list_request_wrapper)



### Example


```python
import time
import baiduads
from materialproduct.api import material_product_service
from baiduads.materialproduct.model.get_product_list_response_wrapper import GetProductListResponseWrapper
from baiduads.materialproduct.model.get_product_list_request_wrapper import GetProductListRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_product_service.MaterialProductService(api_client)
    get_product_list_request_wrapper = GetProductListRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaProductQueryRequest(
            product_id_list=[
                1,
            ],
            product_short_title="product_short_title_example",
            status=[
                1,
            ],
            category_id=[
                1,
            ],
            page_size=1,
            page_num=1,
            sort_list=[
                SortingRuleDto(
                    field="field_example",
                    order_by="order_by_example",
                ),
            ],
            product_title="product_title_example",
            trade_id_list=[
                1,
            ],
            product_query_filter=ProductQueryFilterDto(
                filter_query_field=[
                    "filter_query_field_example",
                ],
                ext_query_field=[
                    "ext_query_field_example",
                ],
            ),
            data_version=1,
            content_quality_status=[
                1,
            ],
            update_start_time="update_start_time_example",
            update_end_time="update_end_time_example",
            product_id_list_not_in=[
                1,
            ],
            content_type=1,
        ),
    ) # GetProductListRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.get_product_list(get_product_list_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialProductService->get_product_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_product_list_request_wrapper** | [**GetProductListRequestWrapper**](GetProductListRequestWrapper.md)|  |

### Return type

[**GetProductListResponseWrapper**](GetProductListResponseWrapper.md)

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

# **update_category**
> UpdateCategoryResponseWrapper update_category(update_category_request_wrapper)



### Example


```python
import time
import baiduads
from materialproduct.api import material_product_service
from baiduads.materialproduct.model.update_category_response_wrapper import UpdateCategoryResponseWrapper
from baiduads.materialproduct.model.update_category_request_wrapper import UpdateCategoryRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_product_service.MaterialProductService(api_client)
    update_category_request_wrapper = UpdateCategoryRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaProductUpdateCategoryRequest(
            product_id_list=[
                1,
            ],
            category_id=1,
        ),
    ) # UpdateCategoryRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_category(update_category_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialProductService->update_category: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_category_request_wrapper** | [**UpdateCategoryRequestWrapper**](UpdateCategoryRequestWrapper.md)|  |

### Return type

[**UpdateCategoryResponseWrapper**](UpdateCategoryResponseWrapper.md)

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

# **update_product**
> UpdateProductResponseWrapper update_product(update_product_request_wrapper)



### Example


```python
import time
import baiduads
from materialproduct.api import material_product_service
from baiduads.materialproduct.model.update_product_response_wrapper import UpdateProductResponseWrapper
from baiduads.materialproduct.model.update_product_request_wrapper import UpdateProductRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_product_service.MaterialProductService(api_client)
    update_product_request_wrapper = UpdateProductRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaProductUpdateRequest(
            product_id=1,
            category_id=1,
            product_title="product_title_example",
            desc="desc_example",
            content="content_example",
            status=1,
            product_short_title="product_short_title_example",
            image=[
                ProductImage(
                    type="type_example",
                    value=[
                        ProductImageDto(
                            url="url_example",
                        ),
                    ],
                ),
            ],
            product_ext=ProductExtDto(
                tags=[
                    "tags_example",
                ],
                params=[
                    ParamsDto(
                        key="key_example",
                        value="value_example",
                    ),
                ],
                price=PriceDto(
                    original="original_example",
                    current="current_example",
                    original_unit=1,
                    current_unit=1,
                    original_optional_unit="original_optional_unit_example",
                    current_optional_unit="current_optional_unit_example",
                    type=1,
                    extend="extend_example",
                ),
                subject=[
                    1,
                ],
                author="author_example",
                serial_status=1,
                word_count=WordCountDto(
                    count=1,
                    unit=1,
                ),
                year=1,
                ios_address="ios_address_example",
                android_address="android_address_example",
                suitable_crowd="suitable_crowd_example",
                suitable_basic=1,
                student_count=1,
                course_highlights=[
                    "course_highlights_example",
                ],
                trial_object=[
                    "trial_object_example",
                ],
                learn_goals="learn_goals_example",
                teach_form=[
                    1,
                ],
                teach_features=[
                    1,
                ],
                feature_desc="feature_desc_example",
                class_name="class_name_example",
                class_date="class_date_example",
                class_date_interval=[
                    "class_date_interval_example",
                ],
                class_time="class_time_example",
                class_number=1,
                bash_info=ProductEstateBashInfoDto(
                    sales_status="sales_status_example",
                    property_type="property_type_example",
                    start_time="start_time_example",
                    most_door_model=[
                        "most_door_model_example",
                    ],
                    price=PriceDto(
                        original="original_example",
                        current="current_example",
                        original_unit=1,
                        current_unit=1,
                        original_optional_unit="original_optional_unit_example",
                        current_optional_unit="current_optional_unit_example",
                        type=1,
                        extend="extend_example",
                    ),
                    total_price="total_price_example",
                    year="year_example",
                ),
                unit_type_info=[
                    ProductEstateUnitTypeInfoDto(
                        name="name_example",
                        type="type_example",
                        sales_status="sales_status_example",
                        bedroom="bedroom_example",
                        building_area="building_area_example",
                        indoor_area="indoor_area_example",
                        giving_area="giving_area_example",
                        toward="toward_example",
                        high=3.14,
                        house_rate=3.14,
                        all_num=1,
                        unit_type_image=ProductImage(
                            type="type_example",
                            value=[
                                ProductImageDto(
                                    url="url_example",
                                ),
                            ],
                        ),
                        sample_room_image=ProductImage(
                            type="type_example",
                            value=[
                                ProductImageDto(
                                    url="url_example",
                                ),
                            ],
                        ),
                        price=PriceDto(
                            original="original_example",
                            current="current_example",
                            original_unit=1,
                            current_unit=1,
                            original_optional_unit="original_optional_unit_example",
                            current_optional_unit="current_optional_unit_example",
                            type=1,
                            extend="extend_example",
                        ),
                    ),
                ],
                area_info="area_info_example",
                houses_details=ProductEstateHousesDetailsDto(
                    plan_period=1,
                    plan_households=1,
                    current_period_households=1,
                    plan_dong=1,
                    current_period_dong=1,
                    dong_situation="dong_situation_example",
                    land_area=3.14,
                    build_area=3.14,
                    plot_ratio=3.14,
                    green_rate=3.14,
                    entrance_num=1,
                    in_out_way="in_out_way_example",
                    close_situation="close_situation_example",
                    people_and_car="people_and_car_example",
                    park_spot_num=1,
                    park_spot_ratio=3.14,
                    supply_water="supply_water_example",
                    supply_electricity="supply_electricity_example",
                    supply_warm="supply_warm_example",
                    supply_gas="supply_gas_example",
                    elevator="elevator_example",
                    elevator_config="elevator_config_example",
                    license="license_example",
                    furnish="furnish_example",
                    start_time="start_time_example",
                    handover_time="handover_time_example",
                    property_cost=3.14,
                    address="address_example",
                    phone="phone_example",
                    pre_sale="pre_sale_example",
                    images=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    forensics="forensics_example",
                    build="build_example",
                ),
                other_images=ProductEstateImagesDto(
                    real_scene=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    matching=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    planning=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    traffic=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    construction=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                    sand_table=ProductImage(
                        type="type_example",
                        value=[
                            ProductImageDto(
                                url="url_example",
                            ),
                        ],
                    ),
                ),
                related_company="related_company_example",
                estate_dynamic="estate_dynamic_example",
                join_in_project="join_in_project_example",
                franchisee_info="franchisee_info_example",
                qualification_info="qualification_info_example",
                detail_category=[
                    DetailCategoryDto(
                        id="id_example",
                        name="name_example",
                    ),
                ],
                class_type=1,
            ),
            video=[
                ProductVideo(
                    type="type_example",
                    value=[
                        ProductVideoDto(
                            cover_url="cover_url_example",
                            video_url="video_url_example",
                            name="name_example",
                            video_id=1,
                            duration=1,
                        ),
                    ],
                ),
            ],
            data_version=1,
        ),
    ) # UpdateProductRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_product(update_product_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialProductService->update_product: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_product_request_wrapper** | [**UpdateProductRequestWrapper**](UpdateProductRequestWrapper.md)|  |

### Return type

[**UpdateProductResponseWrapper**](UpdateProductResponseWrapper.md)

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

# **update_putaway**
> UpdatePutawayResponseWrapper update_putaway(update_putaway_request_wrapper)



### Example


```python
import time
import baiduads
from materialproduct.api import material_product_service
from baiduads.materialproduct.model.update_putaway_request_wrapper import UpdatePutawayRequestWrapper
from baiduads.materialproduct.model.update_putaway_response_wrapper import UpdatePutawayResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_product_service.MaterialProductService(api_client)
    update_putaway_request_wrapper = UpdatePutawayRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaProductUpdatePutawayRequest(
            product_id_list=[
                1,
            ],
            status=1,
        ),
    ) # UpdatePutawayRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_putaway(update_putaway_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialProductService->update_putaway: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_putaway_request_wrapper** | [**UpdatePutawayRequestWrapper**](UpdatePutawayRequestWrapper.md)|  |

### Return type

[**UpdatePutawayResponseWrapper**](UpdatePutawayResponseWrapper.md)

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

# **update_rank**
> UpdateRankResponseWrapper update_rank(update_rank_request_wrapper)



### Example


```python
import time
import baiduads
from materialproduct.api import material_product_service
from baiduads.materialproduct.model.update_rank_request_wrapper import UpdateRankRequestWrapper
from baiduads.materialproduct.model.update_rank_response_wrapper import UpdateRankResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = material_product_service.MaterialProductService(api_client)
    update_rank_request_wrapper = UpdateRankRequestWrapper(
        header=ApiRequestHeader(),
        body=TeslaProductUpdateRankRequest(
            product_id_list=[
                1,
            ],
            rank=1,
        ),
    ) # UpdateRankRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_rank(update_rank_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling MaterialProductService->update_rank: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_rank_request_wrapper** | [**UpdateRankRequestWrapper**](UpdateRankRequestWrapper.md)|  |

### Return type

[**UpdateRankResponseWrapper**](UpdateRankResponseWrapper.md)

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

