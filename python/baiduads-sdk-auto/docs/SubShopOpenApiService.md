# baiduads.SubShopOpenApiService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_sub_shop**](SubShopOpenApiService.md#create_sub_shop) | **POST** /json/sms/service/SubShopOpenApiService/createSubShop | 
[**update_sub_shop**](SubShopOpenApiService.md#update_sub_shop) | **POST** /json/sms/service/SubShopOpenApiService/updateSubShop | 


# **create_sub_shop**
> CreateSubShopResponseWrapper create_sub_shop(create_sub_shop_request_wrapper)



### Example


```python
import time
import baiduads
from subshopopenapi.api import sub_shop_open_api_service
from baiduads.subshopopenapi.model.create_sub_shop_response_wrapper import CreateSubShopResponseWrapper
from baiduads.subshopopenapi.model.create_sub_shop_request_wrapper import CreateSubShopRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = sub_shop_open_api_service.SubShopOpenApiService(api_client)
    create_sub_shop_request_wrapper = CreateSubShopRequestWrapper(
        header=ApiRequestHeader(),
        body=CreateSubShopRequest(
            shop_id=1,
            save_flag=1,
            shop_vo=PlatShopBasicVo(
                name="name_example",
                name_qualify_list=[
                    ShopQualifyVo(
                        image="image_example",
                        start_valid_time="start_valid_time_example",
                        end_valid_time="end_valid_time_example",
                        category_id=1,
                    ),
                ],
                logo="logo_example",
                logo_qualify_list=[
                    ShopQualifyVo(
                        image="image_example",
                        start_valid_time="start_valid_time_example",
                        end_valid_time="end_valid_time_example",
                        category_id=1,
                    ),
                ],
                desc="desc_example",
                category_list=[
                    ShopCategoryVo(
                        id=1,
                        name="name_example",
                        qualify_list=[
                            ShopQualifyVo(
                                image="image_example",
                                start_valid_time="start_valid_time_example",
                                end_valid_time="end_valid_time_example",
                                category_id=1,
                            ),
                        ],
                        second_category_list=[],
                        third_category_list=[],
                    ),
                ],
                phone="phone_example",
                shop_type=1,
                sub_name="sub_name_example",
                door_image=[
                    "door_image_example",
                ],
                shop_phone=PlatSmartPhoneVo(
                    solution_id=1,
                    solution_type="solution_type_example",
                    solution_name="solution_name_example",
                    real_phone_num="real_phone_num_example",
                    real_phone_type=1,
                    phone_solution_type=1,
                    userid_in_base64="userid_in_base64_example",
                ),
                sync_phone_to_map=1,
                business_time="business_time_example",
                establish_time="establish_time_example",
                is_son_shop=1,
                watch_brands=[
                    "watch_brands_example",
                ],
                service_area_list=[
                    ServiceAreaRegionVo(
                        province_id=1,
                        province_name="province_name_example",
                        city_id=1,
                        city_name="city_name_example",
                        district_id=1,
                        district_name="district_name_example",
                    ),
                ],
                service_province_list=[
                    ServiceProvinceVo(
                        province_id=1,
                        province_name="province_name_example",
                        is_all=1,
                    ),
                ],
            ),
            company_vo=PlatCompanyVo(
                license_url="license_url_example",
                company_name="company_name_example",
                business_license="business_license_example",
                supplier_type=1,
                industry_id=1,
                industry_qualify_vo=ShopQualifyVo(
                    image="image_example",
                    start_valid_time="start_valid_time_example",
                    end_valid_time="end_valid_time_example",
                    category_id=1,
                ),
                license_start_time="license_start_time_example",
                license_end_time="license_end_time_example",
                auth_capital="auth_capital_example",
                business_province="business_province_example",
                business_city="business_city_example",
                business_detail_address="business_detail_address_example",
                business_scope="business_scope_example",
                account_qualify_same=1,
                guarantee_letter_url=[
                    "guarantee_letter_url_example",
                ],
                sub_shop_type=1,
                business_area="business_area_example",
            ),
            legal_person_vo=PlatLegalPersonVo(
                legal_person="legal_person_example",
                legal_person_type=1,
                legal_id="legal_id_example",
                legal_card_start_time="legal_card_start_time_example",
                legal_card_end_time="legal_card_end_time_example",
                id_card_front_url="id_card_front_url_example",
                id_card_back_url="id_card_back_url_example",
            ),
            sub_shop_id=1,
            shop_map_vo=PlatShopMapVo(
                latitude="latitude_example",
                longitude="longitude_example",
                province_name="province_name_example",
                province_id=1,
                city_name="city_name_example",
                city_id=1,
                district_name="district_name_example",
                district_id=1,
                address="address_example",
                is_map_skip=1,
                choose_point=1,
            ),
            tp_id="tp_id_example",
        ),
    ) # CreateSubShopRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.create_sub_shop(create_sub_shop_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SubShopOpenApiService->create_sub_shop: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_sub_shop_request_wrapper** | [**CreateSubShopRequestWrapper**](CreateSubShopRequestWrapper.md)|  |

### Return type

[**CreateSubShopResponseWrapper**](CreateSubShopResponseWrapper.md)

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

# **update_sub_shop**
> UpdateSubShopResponseWrapper update_sub_shop(update_sub_shop_request_wrapper)



### Example


```python
import time
import baiduads
from subshopopenapi.api import sub_shop_open_api_service
from baiduads.subshopopenapi.model.update_sub_shop_request_wrapper import UpdateSubShopRequestWrapper
from baiduads.subshopopenapi.model.update_sub_shop_response_wrapper import UpdateSubShopResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = sub_shop_open_api_service.SubShopOpenApiService(api_client)
    update_sub_shop_request_wrapper = UpdateSubShopRequestWrapper(
        header=ApiRequestHeader(),
        body=UpdateSubShopRequest(
            shop_id=1,
            save_flag=1,
            shop_vo=PlatShopBasicVo(
                name="name_example",
                name_qualify_list=[
                    ShopQualifyVo(
                        image="image_example",
                        start_valid_time="start_valid_time_example",
                        end_valid_time="end_valid_time_example",
                        category_id=1,
                    ),
                ],
                logo="logo_example",
                logo_qualify_list=[
                    ShopQualifyVo(
                        image="image_example",
                        start_valid_time="start_valid_time_example",
                        end_valid_time="end_valid_time_example",
                        category_id=1,
                    ),
                ],
                desc="desc_example",
                category_list=[
                    ShopCategoryVo(
                        id=1,
                        name="name_example",
                        qualify_list=[
                            ShopQualifyVo(
                                image="image_example",
                                start_valid_time="start_valid_time_example",
                                end_valid_time="end_valid_time_example",
                                category_id=1,
                            ),
                        ],
                        second_category_list=[],
                        third_category_list=[],
                    ),
                ],
                phone="phone_example",
                shop_type=1,
                sub_name="sub_name_example",
                door_image=[
                    "door_image_example",
                ],
                shop_phone=PlatSmartPhoneVo(
                    solution_id=1,
                    solution_type="solution_type_example",
                    solution_name="solution_name_example",
                    real_phone_num="real_phone_num_example",
                    real_phone_type=1,
                    phone_solution_type=1,
                    userid_in_base64="userid_in_base64_example",
                ),
                sync_phone_to_map=1,
                business_time="business_time_example",
                establish_time="establish_time_example",
                is_son_shop=1,
                watch_brands=[
                    "watch_brands_example",
                ],
                service_area_list=[
                    ServiceAreaRegionVo(
                        province_id=1,
                        province_name="province_name_example",
                        city_id=1,
                        city_name="city_name_example",
                        district_id=1,
                        district_name="district_name_example",
                    ),
                ],
                service_province_list=[
                    ServiceProvinceVo(
                        province_id=1,
                        province_name="province_name_example",
                        is_all=1,
                    ),
                ],
            ),
            company_vo=PlatCompanyVo(
                license_url="license_url_example",
                company_name="company_name_example",
                business_license="business_license_example",
                supplier_type=1,
                industry_id=1,
                industry_qualify_vo=ShopQualifyVo(
                    image="image_example",
                    start_valid_time="start_valid_time_example",
                    end_valid_time="end_valid_time_example",
                    category_id=1,
                ),
                license_start_time="license_start_time_example",
                license_end_time="license_end_time_example",
                auth_capital="auth_capital_example",
                business_province="business_province_example",
                business_city="business_city_example",
                business_detail_address="business_detail_address_example",
                business_scope="business_scope_example",
                account_qualify_same=1,
                guarantee_letter_url=[
                    "guarantee_letter_url_example",
                ],
                sub_shop_type=1,
                business_area="business_area_example",
            ),
            legal_person_vo=PlatLegalPersonVo(
                legal_person="legal_person_example",
                legal_person_type=1,
                legal_id="legal_id_example",
                legal_card_start_time="legal_card_start_time_example",
                legal_card_end_time="legal_card_end_time_example",
                id_card_front_url="id_card_front_url_example",
                id_card_back_url="id_card_back_url_example",
            ),
            sub_shop_id=1,
            shop_map_vo=PlatShopMapVo(
                latitude="latitude_example",
                longitude="longitude_example",
                province_name="province_name_example",
                province_id=1,
                city_name="city_name_example",
                city_id=1,
                district_name="district_name_example",
                district_id=1,
                address="address_example",
                is_map_skip=1,
                choose_point=1,
            ),
            tp_id="tp_id_example",
        ),
    ) # UpdateSubShopRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.update_sub_shop(update_sub_shop_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling SubShopOpenApiService->update_sub_shop: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_sub_shop_request_wrapper** | [**UpdateSubShopRequestWrapper**](UpdateSubShopRequestWrapper.md)|  |

### Return type

[**UpdateSubShopResponseWrapper**](UpdateSubShopResponseWrapper.md)

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

