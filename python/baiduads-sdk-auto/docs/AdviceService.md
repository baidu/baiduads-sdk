# baiduads.AdviceService

All URIs are relative to *https://api.baidu.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accept_advice**](AdviceService.md#accept_advice) | **POST** /json/sms/service/AdviceService/acceptAdvice | 
[**accept_feed_advice**](AdviceService.md#accept_feed_advice) | **POST** /json/sms/service/AdviceService/acceptFeedAdvice | 
[**download_advice**](AdviceService.md#download_advice) | **POST** /json/sms/service/AdviceService/downloadAdvice | 
[**query_detail**](AdviceService.md#query_detail) | **POST** /json/sms/service/AdviceService/queryDetail | 
[**query_feed_detail**](AdviceService.md#query_feed_detail) | **POST** /json/sms/service/AdviceService/queryFeedDetail | 
[**query_feed_outline**](AdviceService.md#query_feed_outline) | **POST** /json/sms/service/AdviceService/queryFeedOutline | 


# **accept_advice**
> AcceptAdviceResponseWrapper accept_advice(accept_advice_request_wrapper)



### Example


```python
import time
import baiduads
from advice.api import advice_service
from baiduads.advice.model.accept_advice_response_wrapper import AcceptAdviceResponseWrapper
from baiduads.advice.model.accept_advice_request_wrapper import AcceptAdviceRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_service.AdviceService(api_client)
    accept_advice_request_wrapper = AcceptAdviceRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceModRequest(
            operation_type=1,
            operation_param=AdviceAcceptParam(
                key_word=KeywordAcceptInfo(
                    items=[
                        KeyWordType(
                            keyword_id=1,
                            keyword="keyword_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            match_type=1,
                            min_bid=3.14,
                            guide_price=3.14,
                            match_price_status=True,
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            es_impression=1,
                            pc_destination_url="pc_destination_url_example",
                            multi_price="multi_price_example",
                            basis_type_name="basis_type_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                            price_strategy_id=1,
                            pause=True,
                            shop_type=1,
                            es_click=1,
                            suggest_reason_code=1,
                            top_page_views=1,
                            top_p_clicks=1,
                            campaign_bid_type=1,
                            es_conversion=3.14,
                            top_pay=3.14,
                        ),
                    ],
                    key_word_count=1,
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    wmatchprefer=1,
                    match_type=1,
                    phrase_type=1,
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    reason_code="reason_code_example",
                    reason_text="reason_text_example",
                    pc_destination_url="pc_destination_url_example",
                    mobile_destination_url="mobile_destination_url_example",
                    price_strategy_id=1,
                ),
                ngt_word=NgtWordAcceptInfo(
                    campaign_id=1,
                    total_count=1,
                    items=[
                        NgtWordType(
                            campaign_id=1,
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            negative_word="negative_word_example",
                            negative_word_type=1,
                            keyword="keyword_example",
                            mix_match_type=1,
                            conflict_type=1,
                            campaign_name="campaign_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            conversion=1,
                            conversion_rate=3.14,
                            compare_conversion_rate=3.14,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    part_type=1,
                    reason_code="reason_code_example",
                    reason_text="reason_text_example",
                ),
                industry_url=IndustryUrlAcceptInfo(
                    industry_url_count=1,
                    items=[
                        IndustryUrlType(
                            url_id=1,
                            url="url_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            price=3.14,
                            impression=1,
                            click=1,
                            search_word="search_word_example",
                            title="title_example",
                            target_url="target_url_example",
                            mobile_target_url="mobile_target_url_example",
                            url_info_id=1,
                            url_status=1,
                            reason_text="reason_text_example",
                            multi_price="multi_price_example",
                            strategy_price=3.14,
                            strategy_adgroup_id=1,
                            adgroup_price=3.14,
                        ),
                    ],
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                campaign_budegt=CampaignRecBudgetAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignBudgetType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            budget=3.14,
                            last_budget_offline_time="last_budget_offline_time_example",
                            budget_cumulate_status=True,
                            re_online_reasons=[
                                BudgetAdjustTimeType(
                                    time="time_example",
                                    flag=1,
                                    on_or_off_type=1,
                                ),
                            ],
                            offline_time_ratio=3.14,
                            recommend_budget=3.14,
                            impression=1,
                            click=1,
                            cost=3.14,
                            old_budget=3.14,
                        ),
                    ],
                    budget=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                landing_page_quality=LandingPageInfo(
                    items=[
                        LandPageQualityApiType(
                            id=1,
                            keyword_id=1,
                            creative_id=1,
                            issue_type_descs=[
                                "issue_type_descs_example",
                            ],
                            suggestion=IssueSuggestion(
                                title="title_example",
                                contents=[
                                    "contents_example",
                                ],
                            ),
                            product=1,
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            impression_inc_min=1,
                            impression_inc_max=1,
                            impression=3.14,
                            click=3.14,
                            cost=3.14,
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            mod_time="mod_time_example",
                            status=1,
                            issue_types=[
                                "issue_types_example",
                            ],
                            land_page_url="land_page_url_example",
                            keyword="keyword_example",
                            keyword_count=1,
                            campaign_count=1,
                            adgroup_count=1,
                            creative_title="creative_title_example",
                            creative_count=1,
                            content_sign="content_sign_example",
                            description1="description1_example",
                            description2="description2_example",
                            pc_destination_url="pc_destination_url_example",
                            pc_display_url="pc_display_url_example",
                            mobile_display_url="mobile_display_url_example",
                            mobile_destination_url="mobile_destination_url_example",
                        ),
                    ],
                    part_type=1,
                ),
                creative_recommend=CreativeRecommendAcceptInfo(
                    total_count=1,
                    items=[
                        CreativeRecommendType(
                            creative_id=1,
                            title="title_example",
                            old_title="old_title_example",
                            description1="description1_example",
                            description2="description2_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            pc_display_url="pc_display_url_example",
                            pc_destination_url="pc_destination_url_example",
                            mobile_display_url="mobile_display_url_example",
                            mobile_destination_url="mobile_destination_url_example",
                            creative_preference=1,
                            crowd_attention_sell_point="crowd_attention_sell_point_example",
                            creative_md5="creative_md5_example",
                            click=1,
                            ctr=3.14,
                            mc_id=1,
                            origin_creative_title="origin_creative_title_example",
                            conversion=1,
                            impression=1,
                            top_impression=1,
                            top_click=1,
                            historical_impression=1,
                            historical_click=1,
                            historical_conversion=1,
                            recommend_reasons=[
                                1,
                            ],
                            recommend_reasons_name="recommend_reasons_name_example",
                            dynamic_creative=1,
                            dynamic_creative_name="dynamic_creative_name_example",
                            campaign_bid_type=1,
                            mobile_final_url="mobile_final_url_example",
                            mobile_track_param="mobile_track_param_example",
                            mobile_track_template="mobile_track_template_example",
                            pc_final_url="pc_final_url_example",
                            pc_track_param="pc_track_param_example",
                            pc_track_template="pc_track_template_example",
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    pc_destination_url="pc_destination_url_example",
                    mobile_destination_url="mobile_destination_url_example",
                    mobile_final_url="mobile_final_url_example",
                    mobile_track_param="mobile_track_param_example",
                    mobile_track_template="mobile_track_template_example",
                    pc_final_url="pc_final_url_example",
                    pc_track_param="pc_track_param_example",
                    pc_track_template="pc_track_template_example",
                ),
                ocpc_price_info=OcpcPriceInfo(
                    items=[
                        OcpcPriceType(
                            ocpc_bid=3.14,
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            equipment_type=1,
                            cv_source=[
                                1,
                            ],
                            trans_type=[
                                1,
                            ],
                            advice_effect=[
                                OcpcBidAdviceEffect(
                                    level=1,
                                    level_value=3.14,
                                    advice_ocpc_bid=3.14,
                                    conversion_max=1,
                                    conversion_min=1,
                                    pay_max=1,
                                    pay_min=1,
                                ),
                            ],
                            ecpc_max_bid_ratio=3.14,
                            cost=1,
                            click=1,
                            impression=1,
                            conversion=1,
                            suggestions=[
                                PriceRatioEffectInfo(
                                    opt_suggestion=1,
                                    recommend_max_bid_ratio=3.14,
                                    improve_cost=3.14,
                                    improve_click=3.14,
                                    improve_impression=3.14,
                                    improve_conversion=3.14,
                                ),
                            ],
                            recommend_max_bid_ratio=3.14,
                            improve_cost=1,
                            improve_click=1,
                            improve_impression=1,
                            improve_conversion=1,
                            campaign_ids=[
                                1,
                            ],
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    ecpc_max_bid_ratio=3.14,
                ),
                business_label=BusinessLabelAcceptInfo(
                    items=[
                        BusinessLabelType(
                            business_label_id=1,
                            business_name="business_name_example",
                            business_name_id=1,
                            business_point_id=1,
                            strategy_price=3.14,
                            strategy_adgroup_id=1,
                            campaign_id=1,
                            adgroup_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_name="adgroup_name_example",
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            price=3.14,
                            multi_price="multi_price_example",
                            adgroup_price=3.14,
                            impression=1,
                            click=1,
                            log_id="log_id_example",
                        ),
                    ],
                    total_count=1,
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                feed_creative_info=FeedCreativeAcceptInfo(
                    items=[
                        FeedCreativeDetailType(
                            advice_creative_feed_id=1,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                            original_adgroup_feed_id=1,
                            original_creative_feed_id=1,
                            title="title_example",
                            subtitle="subtitle_example",
                            brand="brand_example",
                            pictures=[
                                PictureType(
                                    image="image_example",
                                    url="url_example",
                                    desc1="desc1_example",
                                    desc2="desc2_example",
                                    width=1,
                                    height=1,
                                    target_url=1,
                                ),
                            ],
                            elements=ProgramElementsType(
                                titles=[
                                    "titles_example",
                                ],
                                single_pic=[
                                    "single_pic_example",
                                ],
                                large_pic=[
                                    "large_pic_example",
                                ],
                                package3_pic=[
                                    "package3_pic_example",
                                ],
                                horizontal_videos=[
                                    "horizontal_videos_example",
                                ],
                                vertical_videos=[
                                    "vertical_videos_example",
                                ],
                                picture_single=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                picture_large=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                picture3_fixed=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                video_horizontal=[
                                    VideoType(
                                        video_id=1,
                                        video_url="video_url_example",
                                        width=1,
                                        height=1,
                                        poster=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        horizontal_cover=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        duration=1,
                                    ),
                                ],
                                video_vertical=[
                                    VideoType(
                                        video_id=1,
                                        video_url="video_url_example",
                                        width=1,
                                        height=1,
                                        poster=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        horizontal_cover=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        duration=1,
                                    ),
                                ],
                            ),
                            predict_click=1,
                            predict_conversion=1,
                            status=1,
                            creative_type=1,
                            material_style=1,
                            ftypes=[
                                1,
                            ],
                            bid_type=1,
                            bs_type=1,
                            creative_feed_name="creative_feed_name_example",
                            material="material_example",
                            template=PaIdeaTemplateType(
                                title="title_example",
                                sub_title="sub_title_example",
                                brand="brand_example",
                                user_portrait="user_portrait_example",
                                img_url="img_url_example",
                                target_url="target_url_example",
                                img_target_url="img_target_url_example",
                                na_url="na_url_example",
                                img_na_url="img_na_url_example",
                                monitor_url="monitor_url_example",
                                img_text="img_text_example",
                                img_text2="img_text2_example",
                                video_url="video_url_example",
                                poster="poster_example",
                                duration="duration_example",
                                video_id=1,
                                mini_program_schema="mini_program_schema_example",
                                exposure_url="exposure_url_example",
                                horizontal_cover="horizontal_cover_example",
                                video_text1="video_text1_example",
                                video_text2="video_text2_example",
                                ulk_scheme="ulk_scheme_example",
                                ulk_url="ulk_url_example",
                            ),
                            pa_idea_json="pa_idea_json_example",
                            new_creative_feed_id=1,
                        ),
                    ],
                    adgroup_feed_id=1,
                ),
                feed_campaign_budget=FeedCampaignBudgetAcceptInfo(
                    items=[
                        FeedBudgetBaseType(
                            budget=3.14,
                            recommend_budget=3.14,
                            avg_ocpc_bid=3.14,
                            conversion=3.14,
                            cost=3.14,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                    budget=3.14,
                ),
                feed_account_budget=FeedAccountBudgetAcceptInfo(
                    items=[
                        FeedBudgetBaseType(
                            budget=3.14,
                            recommend_budget=3.14,
                            avg_ocpc_bid=3.14,
                            conversion=3.14,
                            cost=3.14,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                landing_page_correlation=LandingPageCorrelationInfo(
                    items=[
                        LandingPageType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            url_count=1,
                            top_impression_inc_max=1,
                            top_impression_current=1,
                            top_impression_increase=3.14,
                            top_pay=3.14,
                            top_p_clicks=3.14,
                            top_page_views=3.14,
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            id=1,
                            keyword_count=1,
                            keyword="keyword_example",
                            keyword_mobile_destination_url="keyword_mobile_destination_url_example",
                            keyword_mobile_destination_url_count=1,
                            creative_mobile_destination_url="creative_mobile_destination_url_example",
                            creative_mobile_destination_url_count=1,
                            quality=1,
                            add_time="add_time_example",
                            status=1,
                            keyword_id=1,
                            mod_time="mod_time_example",
                            creative_id=1,
                            content_sign=1,
                        ),
                    ],
                ),
                feed_campaign_auto_bid_info=FeedCampaignAutoBidAcceptInfo(
                    items=[
                        FeedCampaignAutoBidType(
                            budget=3.14,
                            adgroup_count=1,
                            delivery_scene="delivery_scene_example",
                            estimated_conversion=3.14,
                            estimated_cost=3.14,
                            adgroup_list=[
                                AutoOrientationType(
                                    status=1,
                                    keywords="keywords_example",
                                    bid_type=1,
                                    bid=3.14,
                                    guide_price=3.14,
                                    ocpc_info=FeedOcpcType(
                                        app_trans_id=1,
                                        trans_from=1,
                                        ocpc_bid=3.14,
                                        lp_url="lp_url_example",
                                        trans_type=1,
                                        ocpc_level=1,
                                        na_url="na_url_example",
                                        is_skip_stage_one=True,
                                        is_open_ocpc_lab=True,
                                        monitor_url="monitor_url_example",
                                        pay_mode=1,
                                        optimize_deep_trans=True,
                                        deep_ocpc_bid=3.14,
                                        deep_trans_type=1,
                                        url_type=1,
                                        use_roi=True,
                                        roi_ratio=3.14,
                                    ),
                                    estimated_conversion_rate=3.14,
                                    estimated_cost_rate=3.14,
                                    estimated_conversion=3.14,
                                    estimated_cost=3.14,
                                    auto_bid=FeedAutoBidType(
                                        auto_bid_lower=3.14,
                                        auto_bid_upper=3.14,
                                        auto_bid_deep_lower=3.14,
                                        auto_bid_deep_upper=3.14,
                                    ),
                                    campaign_feed_id=1,
                                    campaign_feed_name="campaign_feed_name_example",
                                    adgroup_feed_id=1,
                                    adgroup_feed_name="adgroup_feed_name_example",
                                ),
                            ],
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                feed_plugin_info=FeedPluginInfo(
                    items=[
                        FeedPluginType(
                            plugin_id=1,
                            recommend_plugin_name="recommend_plugin_name_example",
                            plugin_name="plugin_name_example",
                            plugin_form_title="plugin_form_title_example",
                            plugin_button_name="plugin_button_name_example",
                            plugin_source=1,
                            plugin_source_id=1,
                            plugin_type=1,
                            solution_id=1,
                            recommend_solution_name="recommend_solution_name_example",
                            solution_name="solution_name_example",
                            solution_properties="solution_properties_example",
                            solution_type=1,
                            improve_conversion=3.14,
                            improve_cost=3.14,
                            status=1,
                            plugin_type_desc="plugin_type_desc_example",
                            show_plugin_name="show_plugin_name_example",
                            show_solution_name="show_solution_name_example",
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                keyword_uncorrelated=KeywordUncorrelatedAcceptInfo(
                    items=[
                        KeyWordType(
                            keyword_id=1,
                            keyword="keyword_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            match_type=1,
                            min_bid=3.14,
                            guide_price=3.14,
                            match_price_status=True,
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            es_impression=1,
                            pc_destination_url="pc_destination_url_example",
                            multi_price="multi_price_example",
                            basis_type_name="basis_type_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                            price_strategy_id=1,
                            pause=True,
                            shop_type=1,
                            es_click=1,
                            suggest_reason_code=1,
                            top_page_views=1,
                            top_p_clicks=1,
                            campaign_bid_type=1,
                            es_conversion=3.14,
                            top_pay=3.14,
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                fc_adgroup_auto_targeting=AdgroupAutoTargetingInfo(
                    items=[
                        AdgroupAutoTargetingType(
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            conversion=1,
                            click=1,
                            cost=3.14,
                            strategy_ids=[
                                1,
                            ],
                            adgroup_auto_targeting_status=True,
                            adgroup_auto_targeting_status_name="adgroup_auto_targeting_status_name_example",
                            suggest="suggest_example",
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    improve_click_rate=3.14,
                    improve_conversion_rate=3.14,
                ),
                product_segment_info=ProductSegmentInfo(
                    items=[
                        ProductSegmentType(
                            user_id=1,
                            sign="sign_example",
                            mt_id=1,
                            mt_name="mt_name_example",
                            marketing_target_id=1,
                            bind_level=1,
                            bind_count=1,
                            creative_group_id=1,
                            adgroup_name="adgroup_name_example",
                            adgroup_id=1,
                            campaign_name="campaign_name_example",
                            campaign_id=1,
                            creative_id=1,
                            gen_rate=3.14,
                            product_set_name="product_set_name_example",
                            catalog_name="catalog_name_example",
                            device=1,
                            click=1,
                            conversion=1,
                            status=1,
                            preview_result=CreativePreviewType(
                                status="status_example",
                                mt=1,
                                json="json_example",
                                preview_type=1,
                                demo_url="demo_url_example",
                            ),
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    improve_click_rate=3.14,
                    improve_conversion_rate=3.14,
                ),
                ecpc_campaign_effect=TargetPackageAcceptCampaign(
                    items=[
                        EcpcCampaignType(
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            package_type=1,
                            uniq_target_package_key="uniq_target_package_key_example",
                            add_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            effect_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            child_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            campaign_ids=[
                                1,
                            ],
                            cv_sources=[
                                1,
                            ],
                            trans_types=[
                                1,
                            ],
                            campaign_bid_type=1,
                            campaign_ocpc_bid_type=1,
                            weekly_show=1,
                            weekly_click=1,
                            weekly_pay=3.14,
                            weekly_cv=1,
                            weekly_avg_cv=1,
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                ocpc_trans_type_info=OcpcTransTypeAcceptInfo(
                    items=[
                        OcpcTransTypeInfo(
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            ocpc_bid=3.14,
                            data_flow_data=[
                                TargetPackageDataflowInfo(
                                    data_flow=1,
                                    trans_type=[
                                        1,
                                    ],
                                ),
                            ],
                            ocpc_bid_type=1,
                            cost=3.14,
                            click=1,
                            impression=1,
                            conversion=1,
                            trans_price=3.14,
                            improve_cost=1,
                            improve_conversion=1,
                            campaign_ids=[
                                1,
                            ],
                            recommend_data_flow_data=[
                                TargetPackageDataflowInfo(
                                    data_flow=1,
                                    trans_type=[
                                        1,
                                    ],
                                ),
                            ],
                            recommend_ocpc_bid=3.14,
                            recommend_reasons=[
                                RecommendReasonType(
                                    reason_type=1,
                                    improve_ratio=3.14,
                                ),
                            ],
                        ),
                    ],
                    total_count=1,
                    ocpc_bid=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                campaign_est_budget=CampaignEstBudgetAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignEstBudgetType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            budget=3.14,
                            campaign_ocpc_bid_type=1,
                            campaign_trans_types=[
                                1,
                            ],
                            budget_offline_count=1,
                            recommend_budget=1,
                            conversion=1,
                            trans_price=1,
                            cost=3.14,
                            improve_conversion_max=1,
                            improve_conversion_min=1,
                            improve_cost_max=1,
                            improve_cost_min=1,
                            improve_trans_price_t_max=1,
                            improve_trans_price_t_min=1,
                            old_budget=3.14,
                            conversion_max=1,
                            conversion_min=1,
                            cost_max=1,
                            cost_min=1,
                        ),
                    ],
                ),
                campaign_equipment=CampaignEquipmentAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignEquipmentType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            current_equipment_type=1,
                            recommend_equipment_type=1,
                            equipment_type=1,
                            campaign_trans_types=[
                                1,
                            ],
                            campaign_ocpc_bid_type=1,
                            target_package_price_mode="target_package_price_mode_example",
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            target_package_bid_type=1,
                            cpc_strategy_type=1,
                            cpc_strategy_id=1,
                            cpc_strategy_name="cpc_strategy_name_example",
                            cpc_strategy_status=1,
                            conversion=1,
                            cost=3.14,
                            improve_conversion=1,
                            improve_cost=3.14,
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
            ),
            source=1,
            batch_id=1,
            process_stage="process_stage_example",
            advice_key="advice_key_example",
        ),
    ) # AcceptAdviceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.accept_advice(accept_advice_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceService->accept_advice: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept_advice_request_wrapper** | [**AcceptAdviceRequestWrapper**](AcceptAdviceRequestWrapper.md)|  |

### Return type

[**AcceptAdviceResponseWrapper**](AcceptAdviceResponseWrapper.md)

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

# **accept_feed_advice**
> AcceptFeedAdviceResponseWrapper accept_feed_advice(accept_feed_advice_request_wrapper)



### Example


```python
import time
import baiduads
from advice.api import advice_service
from baiduads.advice.model.accept_feed_advice_request_wrapper import AcceptFeedAdviceRequestWrapper
from baiduads.advice.model.accept_feed_advice_response_wrapper import AcceptFeedAdviceResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_service.AdviceService(api_client)
    accept_feed_advice_request_wrapper = AcceptFeedAdviceRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceModRequest(
            operation_type=1,
            operation_param=AdviceAcceptParam(
                key_word=KeywordAcceptInfo(
                    items=[
                        KeyWordType(
                            keyword_id=1,
                            keyword="keyword_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            match_type=1,
                            min_bid=3.14,
                            guide_price=3.14,
                            match_price_status=True,
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            es_impression=1,
                            pc_destination_url="pc_destination_url_example",
                            multi_price="multi_price_example",
                            basis_type_name="basis_type_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                            price_strategy_id=1,
                            pause=True,
                            shop_type=1,
                            es_click=1,
                            suggest_reason_code=1,
                            top_page_views=1,
                            top_p_clicks=1,
                            campaign_bid_type=1,
                            es_conversion=3.14,
                            top_pay=3.14,
                        ),
                    ],
                    key_word_count=1,
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    wmatchprefer=1,
                    match_type=1,
                    phrase_type=1,
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    reason_code="reason_code_example",
                    reason_text="reason_text_example",
                    pc_destination_url="pc_destination_url_example",
                    mobile_destination_url="mobile_destination_url_example",
                    price_strategy_id=1,
                ),
                ngt_word=NgtWordAcceptInfo(
                    campaign_id=1,
                    total_count=1,
                    items=[
                        NgtWordType(
                            campaign_id=1,
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            negative_word="negative_word_example",
                            negative_word_type=1,
                            keyword="keyword_example",
                            mix_match_type=1,
                            conflict_type=1,
                            campaign_name="campaign_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            conversion=1,
                            conversion_rate=3.14,
                            compare_conversion_rate=3.14,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    part_type=1,
                    reason_code="reason_code_example",
                    reason_text="reason_text_example",
                ),
                industry_url=IndustryUrlAcceptInfo(
                    industry_url_count=1,
                    items=[
                        IndustryUrlType(
                            url_id=1,
                            url="url_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            price=3.14,
                            impression=1,
                            click=1,
                            search_word="search_word_example",
                            title="title_example",
                            target_url="target_url_example",
                            mobile_target_url="mobile_target_url_example",
                            url_info_id=1,
                            url_status=1,
                            reason_text="reason_text_example",
                            multi_price="multi_price_example",
                            strategy_price=3.14,
                            strategy_adgroup_id=1,
                            adgroup_price=3.14,
                        ),
                    ],
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                campaign_budegt=CampaignRecBudgetAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignBudgetType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            budget=3.14,
                            last_budget_offline_time="last_budget_offline_time_example",
                            budget_cumulate_status=True,
                            re_online_reasons=[
                                BudgetAdjustTimeType(
                                    time="time_example",
                                    flag=1,
                                    on_or_off_type=1,
                                ),
                            ],
                            offline_time_ratio=3.14,
                            recommend_budget=3.14,
                            impression=1,
                            click=1,
                            cost=3.14,
                            old_budget=3.14,
                        ),
                    ],
                    budget=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                landing_page_quality=LandingPageInfo(
                    items=[
                        LandPageQualityApiType(
                            id=1,
                            keyword_id=1,
                            creative_id=1,
                            issue_type_descs=[
                                "issue_type_descs_example",
                            ],
                            suggestion=IssueSuggestion(
                                title="title_example",
                                contents=[
                                    "contents_example",
                                ],
                            ),
                            product=1,
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            impression_inc_min=1,
                            impression_inc_max=1,
                            impression=3.14,
                            click=3.14,
                            cost=3.14,
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            mod_time="mod_time_example",
                            status=1,
                            issue_types=[
                                "issue_types_example",
                            ],
                            land_page_url="land_page_url_example",
                            keyword="keyword_example",
                            keyword_count=1,
                            campaign_count=1,
                            adgroup_count=1,
                            creative_title="creative_title_example",
                            creative_count=1,
                            content_sign="content_sign_example",
                            description1="description1_example",
                            description2="description2_example",
                            pc_destination_url="pc_destination_url_example",
                            pc_display_url="pc_display_url_example",
                            mobile_display_url="mobile_display_url_example",
                            mobile_destination_url="mobile_destination_url_example",
                        ),
                    ],
                    part_type=1,
                ),
                creative_recommend=CreativeRecommendAcceptInfo(
                    total_count=1,
                    items=[
                        CreativeRecommendType(
                            creative_id=1,
                            title="title_example",
                            old_title="old_title_example",
                            description1="description1_example",
                            description2="description2_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            pc_display_url="pc_display_url_example",
                            pc_destination_url="pc_destination_url_example",
                            mobile_display_url="mobile_display_url_example",
                            mobile_destination_url="mobile_destination_url_example",
                            creative_preference=1,
                            crowd_attention_sell_point="crowd_attention_sell_point_example",
                            creative_md5="creative_md5_example",
                            click=1,
                            ctr=3.14,
                            mc_id=1,
                            origin_creative_title="origin_creative_title_example",
                            conversion=1,
                            impression=1,
                            top_impression=1,
                            top_click=1,
                            historical_impression=1,
                            historical_click=1,
                            historical_conversion=1,
                            recommend_reasons=[
                                1,
                            ],
                            recommend_reasons_name="recommend_reasons_name_example",
                            dynamic_creative=1,
                            dynamic_creative_name="dynamic_creative_name_example",
                            campaign_bid_type=1,
                            mobile_final_url="mobile_final_url_example",
                            mobile_track_param="mobile_track_param_example",
                            mobile_track_template="mobile_track_template_example",
                            pc_final_url="pc_final_url_example",
                            pc_track_param="pc_track_param_example",
                            pc_track_template="pc_track_template_example",
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    pc_destination_url="pc_destination_url_example",
                    mobile_destination_url="mobile_destination_url_example",
                    mobile_final_url="mobile_final_url_example",
                    mobile_track_param="mobile_track_param_example",
                    mobile_track_template="mobile_track_template_example",
                    pc_final_url="pc_final_url_example",
                    pc_track_param="pc_track_param_example",
                    pc_track_template="pc_track_template_example",
                ),
                ocpc_price_info=OcpcPriceInfo(
                    items=[
                        OcpcPriceType(
                            ocpc_bid=3.14,
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            equipment_type=1,
                            cv_source=[
                                1,
                            ],
                            trans_type=[
                                1,
                            ],
                            advice_effect=[
                                OcpcBidAdviceEffect(
                                    level=1,
                                    level_value=3.14,
                                    advice_ocpc_bid=3.14,
                                    conversion_max=1,
                                    conversion_min=1,
                                    pay_max=1,
                                    pay_min=1,
                                ),
                            ],
                            ecpc_max_bid_ratio=3.14,
                            cost=1,
                            click=1,
                            impression=1,
                            conversion=1,
                            suggestions=[
                                PriceRatioEffectInfo(
                                    opt_suggestion=1,
                                    recommend_max_bid_ratio=3.14,
                                    improve_cost=3.14,
                                    improve_click=3.14,
                                    improve_impression=3.14,
                                    improve_conversion=3.14,
                                ),
                            ],
                            recommend_max_bid_ratio=3.14,
                            improve_cost=1,
                            improve_click=1,
                            improve_impression=1,
                            improve_conversion=1,
                            campaign_ids=[
                                1,
                            ],
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    ecpc_max_bid_ratio=3.14,
                ),
                business_label=BusinessLabelAcceptInfo(
                    items=[
                        BusinessLabelType(
                            business_label_id=1,
                            business_name="business_name_example",
                            business_name_id=1,
                            business_point_id=1,
                            strategy_price=3.14,
                            strategy_adgroup_id=1,
                            campaign_id=1,
                            adgroup_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_name="adgroup_name_example",
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            price=3.14,
                            multi_price="multi_price_example",
                            adgroup_price=3.14,
                            impression=1,
                            click=1,
                            log_id="log_id_example",
                        ),
                    ],
                    total_count=1,
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                feed_creative_info=FeedCreativeAcceptInfo(
                    items=[
                        FeedCreativeDetailType(
                            advice_creative_feed_id=1,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                            original_adgroup_feed_id=1,
                            original_creative_feed_id=1,
                            title="title_example",
                            subtitle="subtitle_example",
                            brand="brand_example",
                            pictures=[
                                PictureType(
                                    image="image_example",
                                    url="url_example",
                                    desc1="desc1_example",
                                    desc2="desc2_example",
                                    width=1,
                                    height=1,
                                    target_url=1,
                                ),
                            ],
                            elements=ProgramElementsType(
                                titles=[
                                    "titles_example",
                                ],
                                single_pic=[
                                    "single_pic_example",
                                ],
                                large_pic=[
                                    "large_pic_example",
                                ],
                                package3_pic=[
                                    "package3_pic_example",
                                ],
                                horizontal_videos=[
                                    "horizontal_videos_example",
                                ],
                                vertical_videos=[
                                    "vertical_videos_example",
                                ],
                                picture_single=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                picture_large=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                picture3_fixed=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                video_horizontal=[
                                    VideoType(
                                        video_id=1,
                                        video_url="video_url_example",
                                        width=1,
                                        height=1,
                                        poster=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        horizontal_cover=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        duration=1,
                                    ),
                                ],
                                video_vertical=[
                                    VideoType(
                                        video_id=1,
                                        video_url="video_url_example",
                                        width=1,
                                        height=1,
                                        poster=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        horizontal_cover=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        duration=1,
                                    ),
                                ],
                            ),
                            predict_click=1,
                            predict_conversion=1,
                            status=1,
                            creative_type=1,
                            material_style=1,
                            ftypes=[
                                1,
                            ],
                            bid_type=1,
                            bs_type=1,
                            creative_feed_name="creative_feed_name_example",
                            material="material_example",
                            template=PaIdeaTemplateType(
                                title="title_example",
                                sub_title="sub_title_example",
                                brand="brand_example",
                                user_portrait="user_portrait_example",
                                img_url="img_url_example",
                                target_url="target_url_example",
                                img_target_url="img_target_url_example",
                                na_url="na_url_example",
                                img_na_url="img_na_url_example",
                                monitor_url="monitor_url_example",
                                img_text="img_text_example",
                                img_text2="img_text2_example",
                                video_url="video_url_example",
                                poster="poster_example",
                                duration="duration_example",
                                video_id=1,
                                mini_program_schema="mini_program_schema_example",
                                exposure_url="exposure_url_example",
                                horizontal_cover="horizontal_cover_example",
                                video_text1="video_text1_example",
                                video_text2="video_text2_example",
                                ulk_scheme="ulk_scheme_example",
                                ulk_url="ulk_url_example",
                            ),
                            pa_idea_json="pa_idea_json_example",
                            new_creative_feed_id=1,
                        ),
                    ],
                    adgroup_feed_id=1,
                ),
                feed_campaign_budget=FeedCampaignBudgetAcceptInfo(
                    items=[
                        FeedBudgetBaseType(
                            budget=3.14,
                            recommend_budget=3.14,
                            avg_ocpc_bid=3.14,
                            conversion=3.14,
                            cost=3.14,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                    budget=3.14,
                ),
                feed_account_budget=FeedAccountBudgetAcceptInfo(
                    items=[
                        FeedBudgetBaseType(
                            budget=3.14,
                            recommend_budget=3.14,
                            avg_ocpc_bid=3.14,
                            conversion=3.14,
                            cost=3.14,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                landing_page_correlation=LandingPageCorrelationInfo(
                    items=[
                        LandingPageType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            url_count=1,
                            top_impression_inc_max=1,
                            top_impression_current=1,
                            top_impression_increase=3.14,
                            top_pay=3.14,
                            top_p_clicks=3.14,
                            top_page_views=3.14,
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            id=1,
                            keyword_count=1,
                            keyword="keyword_example",
                            keyword_mobile_destination_url="keyword_mobile_destination_url_example",
                            keyword_mobile_destination_url_count=1,
                            creative_mobile_destination_url="creative_mobile_destination_url_example",
                            creative_mobile_destination_url_count=1,
                            quality=1,
                            add_time="add_time_example",
                            status=1,
                            keyword_id=1,
                            mod_time="mod_time_example",
                            creative_id=1,
                            content_sign=1,
                        ),
                    ],
                ),
                feed_campaign_auto_bid_info=FeedCampaignAutoBidAcceptInfo(
                    items=[
                        FeedCampaignAutoBidType(
                            budget=3.14,
                            adgroup_count=1,
                            delivery_scene="delivery_scene_example",
                            estimated_conversion=3.14,
                            estimated_cost=3.14,
                            adgroup_list=[
                                AutoOrientationType(
                                    status=1,
                                    keywords="keywords_example",
                                    bid_type=1,
                                    bid=3.14,
                                    guide_price=3.14,
                                    ocpc_info=FeedOcpcType(
                                        app_trans_id=1,
                                        trans_from=1,
                                        ocpc_bid=3.14,
                                        lp_url="lp_url_example",
                                        trans_type=1,
                                        ocpc_level=1,
                                        na_url="na_url_example",
                                        is_skip_stage_one=True,
                                        is_open_ocpc_lab=True,
                                        monitor_url="monitor_url_example",
                                        pay_mode=1,
                                        optimize_deep_trans=True,
                                        deep_ocpc_bid=3.14,
                                        deep_trans_type=1,
                                        url_type=1,
                                        use_roi=True,
                                        roi_ratio=3.14,
                                    ),
                                    estimated_conversion_rate=3.14,
                                    estimated_cost_rate=3.14,
                                    estimated_conversion=3.14,
                                    estimated_cost=3.14,
                                    auto_bid=FeedAutoBidType(
                                        auto_bid_lower=3.14,
                                        auto_bid_upper=3.14,
                                        auto_bid_deep_lower=3.14,
                                        auto_bid_deep_upper=3.14,
                                    ),
                                    campaign_feed_id=1,
                                    campaign_feed_name="campaign_feed_name_example",
                                    adgroup_feed_id=1,
                                    adgroup_feed_name="adgroup_feed_name_example",
                                ),
                            ],
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                feed_plugin_info=FeedPluginInfo(
                    items=[
                        FeedPluginType(
                            plugin_id=1,
                            recommend_plugin_name="recommend_plugin_name_example",
                            plugin_name="plugin_name_example",
                            plugin_form_title="plugin_form_title_example",
                            plugin_button_name="plugin_button_name_example",
                            plugin_source=1,
                            plugin_source_id=1,
                            plugin_type=1,
                            solution_id=1,
                            recommend_solution_name="recommend_solution_name_example",
                            solution_name="solution_name_example",
                            solution_properties="solution_properties_example",
                            solution_type=1,
                            improve_conversion=3.14,
                            improve_cost=3.14,
                            status=1,
                            plugin_type_desc="plugin_type_desc_example",
                            show_plugin_name="show_plugin_name_example",
                            show_solution_name="show_solution_name_example",
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                keyword_uncorrelated=KeywordUncorrelatedAcceptInfo(
                    items=[
                        KeyWordType(
                            keyword_id=1,
                            keyword="keyword_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            match_type=1,
                            min_bid=3.14,
                            guide_price=3.14,
                            match_price_status=True,
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            es_impression=1,
                            pc_destination_url="pc_destination_url_example",
                            multi_price="multi_price_example",
                            basis_type_name="basis_type_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                            price_strategy_id=1,
                            pause=True,
                            shop_type=1,
                            es_click=1,
                            suggest_reason_code=1,
                            top_page_views=1,
                            top_p_clicks=1,
                            campaign_bid_type=1,
                            es_conversion=3.14,
                            top_pay=3.14,
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                fc_adgroup_auto_targeting=AdgroupAutoTargetingInfo(
                    items=[
                        AdgroupAutoTargetingType(
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            conversion=1,
                            click=1,
                            cost=3.14,
                            strategy_ids=[
                                1,
                            ],
                            adgroup_auto_targeting_status=True,
                            adgroup_auto_targeting_status_name="adgroup_auto_targeting_status_name_example",
                            suggest="suggest_example",
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    improve_click_rate=3.14,
                    improve_conversion_rate=3.14,
                ),
                product_segment_info=ProductSegmentInfo(
                    items=[
                        ProductSegmentType(
                            user_id=1,
                            sign="sign_example",
                            mt_id=1,
                            mt_name="mt_name_example",
                            marketing_target_id=1,
                            bind_level=1,
                            bind_count=1,
                            creative_group_id=1,
                            adgroup_name="adgroup_name_example",
                            adgroup_id=1,
                            campaign_name="campaign_name_example",
                            campaign_id=1,
                            creative_id=1,
                            gen_rate=3.14,
                            product_set_name="product_set_name_example",
                            catalog_name="catalog_name_example",
                            device=1,
                            click=1,
                            conversion=1,
                            status=1,
                            preview_result=CreativePreviewType(
                                status="status_example",
                                mt=1,
                                json="json_example",
                                preview_type=1,
                                demo_url="demo_url_example",
                            ),
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    improve_click_rate=3.14,
                    improve_conversion_rate=3.14,
                ),
                ecpc_campaign_effect=TargetPackageAcceptCampaign(
                    items=[
                        EcpcCampaignType(
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            package_type=1,
                            uniq_target_package_key="uniq_target_package_key_example",
                            add_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            effect_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            child_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            campaign_ids=[
                                1,
                            ],
                            cv_sources=[
                                1,
                            ],
                            trans_types=[
                                1,
                            ],
                            campaign_bid_type=1,
                            campaign_ocpc_bid_type=1,
                            weekly_show=1,
                            weekly_click=1,
                            weekly_pay=3.14,
                            weekly_cv=1,
                            weekly_avg_cv=1,
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                ocpc_trans_type_info=OcpcTransTypeAcceptInfo(
                    items=[
                        OcpcTransTypeInfo(
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            ocpc_bid=3.14,
                            data_flow_data=[
                                TargetPackageDataflowInfo(
                                    data_flow=1,
                                    trans_type=[
                                        1,
                                    ],
                                ),
                            ],
                            ocpc_bid_type=1,
                            cost=3.14,
                            click=1,
                            impression=1,
                            conversion=1,
                            trans_price=3.14,
                            improve_cost=1,
                            improve_conversion=1,
                            campaign_ids=[
                                1,
                            ],
                            recommend_data_flow_data=[
                                TargetPackageDataflowInfo(
                                    data_flow=1,
                                    trans_type=[
                                        1,
                                    ],
                                ),
                            ],
                            recommend_ocpc_bid=3.14,
                            recommend_reasons=[
                                RecommendReasonType(
                                    reason_type=1,
                                    improve_ratio=3.14,
                                ),
                            ],
                        ),
                    ],
                    total_count=1,
                    ocpc_bid=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                campaign_est_budget=CampaignEstBudgetAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignEstBudgetType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            budget=3.14,
                            campaign_ocpc_bid_type=1,
                            campaign_trans_types=[
                                1,
                            ],
                            budget_offline_count=1,
                            recommend_budget=1,
                            conversion=1,
                            trans_price=1,
                            cost=3.14,
                            improve_conversion_max=1,
                            improve_conversion_min=1,
                            improve_cost_max=1,
                            improve_cost_min=1,
                            improve_trans_price_t_max=1,
                            improve_trans_price_t_min=1,
                            old_budget=3.14,
                            conversion_max=1,
                            conversion_min=1,
                            cost_max=1,
                            cost_min=1,
                        ),
                    ],
                ),
                campaign_equipment=CampaignEquipmentAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignEquipmentType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            current_equipment_type=1,
                            recommend_equipment_type=1,
                            equipment_type=1,
                            campaign_trans_types=[
                                1,
                            ],
                            campaign_ocpc_bid_type=1,
                            target_package_price_mode="target_package_price_mode_example",
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            target_package_bid_type=1,
                            cpc_strategy_type=1,
                            cpc_strategy_id=1,
                            cpc_strategy_name="cpc_strategy_name_example",
                            cpc_strategy_status=1,
                            conversion=1,
                            cost=3.14,
                            improve_conversion=1,
                            improve_cost=3.14,
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
            ),
            source=1,
            batch_id=1,
            process_stage="process_stage_example",
            advice_key="advice_key_example",
        ),
    ) # AcceptFeedAdviceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.accept_feed_advice(accept_feed_advice_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceService->accept_feed_advice: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept_feed_advice_request_wrapper** | [**AcceptFeedAdviceRequestWrapper**](AcceptFeedAdviceRequestWrapper.md)|  |

### Return type

[**AcceptFeedAdviceResponseWrapper**](AcceptFeedAdviceResponseWrapper.md)

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

# **download_advice**
> DownloadAdviceResponseWrapper download_advice(download_advice_request_wrapper)



### Example


```python
import time
import baiduads
from advice.api import advice_service
from baiduads.advice.model.download_advice_response_wrapper import DownloadAdviceResponseWrapper
from baiduads.advice.model.download_advice_request_wrapper import DownloadAdviceRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_service.AdviceService(api_client)
    download_advice_request_wrapper = DownloadAdviceRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceModRequest(
            operation_type=1,
            operation_param=AdviceAcceptParam(
                key_word=KeywordAcceptInfo(
                    items=[
                        KeyWordType(
                            keyword_id=1,
                            keyword="keyword_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            match_type=1,
                            min_bid=3.14,
                            guide_price=3.14,
                            match_price_status=True,
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            es_impression=1,
                            pc_destination_url="pc_destination_url_example",
                            multi_price="multi_price_example",
                            basis_type_name="basis_type_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                            price_strategy_id=1,
                            pause=True,
                            shop_type=1,
                            es_click=1,
                            suggest_reason_code=1,
                            top_page_views=1,
                            top_p_clicks=1,
                            campaign_bid_type=1,
                            es_conversion=3.14,
                            top_pay=3.14,
                        ),
                    ],
                    key_word_count=1,
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    wmatchprefer=1,
                    match_type=1,
                    phrase_type=1,
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    reason_code="reason_code_example",
                    reason_text="reason_text_example",
                    pc_destination_url="pc_destination_url_example",
                    mobile_destination_url="mobile_destination_url_example",
                    price_strategy_id=1,
                ),
                ngt_word=NgtWordAcceptInfo(
                    campaign_id=1,
                    total_count=1,
                    items=[
                        NgtWordType(
                            campaign_id=1,
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            negative_word="negative_word_example",
                            negative_word_type=1,
                            keyword="keyword_example",
                            mix_match_type=1,
                            conflict_type=1,
                            campaign_name="campaign_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            conversion=1,
                            conversion_rate=3.14,
                            compare_conversion_rate=3.14,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    part_type=1,
                    reason_code="reason_code_example",
                    reason_text="reason_text_example",
                ),
                industry_url=IndustryUrlAcceptInfo(
                    industry_url_count=1,
                    items=[
                        IndustryUrlType(
                            url_id=1,
                            url="url_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            price=3.14,
                            impression=1,
                            click=1,
                            search_word="search_word_example",
                            title="title_example",
                            target_url="target_url_example",
                            mobile_target_url="mobile_target_url_example",
                            url_info_id=1,
                            url_status=1,
                            reason_text="reason_text_example",
                            multi_price="multi_price_example",
                            strategy_price=3.14,
                            strategy_adgroup_id=1,
                            adgroup_price=3.14,
                        ),
                    ],
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                campaign_budegt=CampaignRecBudgetAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignBudgetType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            budget=3.14,
                            last_budget_offline_time="last_budget_offline_time_example",
                            budget_cumulate_status=True,
                            re_online_reasons=[
                                BudgetAdjustTimeType(
                                    time="time_example",
                                    flag=1,
                                    on_or_off_type=1,
                                ),
                            ],
                            offline_time_ratio=3.14,
                            recommend_budget=3.14,
                            impression=1,
                            click=1,
                            cost=3.14,
                            old_budget=3.14,
                        ),
                    ],
                    budget=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                landing_page_quality=LandingPageInfo(
                    items=[
                        LandPageQualityApiType(
                            id=1,
                            keyword_id=1,
                            creative_id=1,
                            issue_type_descs=[
                                "issue_type_descs_example",
                            ],
                            suggestion=IssueSuggestion(
                                title="title_example",
                                contents=[
                                    "contents_example",
                                ],
                            ),
                            product=1,
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            impression_inc_min=1,
                            impression_inc_max=1,
                            impression=3.14,
                            click=3.14,
                            cost=3.14,
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            mod_time="mod_time_example",
                            status=1,
                            issue_types=[
                                "issue_types_example",
                            ],
                            land_page_url="land_page_url_example",
                            keyword="keyword_example",
                            keyword_count=1,
                            campaign_count=1,
                            adgroup_count=1,
                            creative_title="creative_title_example",
                            creative_count=1,
                            content_sign="content_sign_example",
                            description1="description1_example",
                            description2="description2_example",
                            pc_destination_url="pc_destination_url_example",
                            pc_display_url="pc_display_url_example",
                            mobile_display_url="mobile_display_url_example",
                            mobile_destination_url="mobile_destination_url_example",
                        ),
                    ],
                    part_type=1,
                ),
                creative_recommend=CreativeRecommendAcceptInfo(
                    total_count=1,
                    items=[
                        CreativeRecommendType(
                            creative_id=1,
                            title="title_example",
                            old_title="old_title_example",
                            description1="description1_example",
                            description2="description2_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            pc_display_url="pc_display_url_example",
                            pc_destination_url="pc_destination_url_example",
                            mobile_display_url="mobile_display_url_example",
                            mobile_destination_url="mobile_destination_url_example",
                            creative_preference=1,
                            crowd_attention_sell_point="crowd_attention_sell_point_example",
                            creative_md5="creative_md5_example",
                            click=1,
                            ctr=3.14,
                            mc_id=1,
                            origin_creative_title="origin_creative_title_example",
                            conversion=1,
                            impression=1,
                            top_impression=1,
                            top_click=1,
                            historical_impression=1,
                            historical_click=1,
                            historical_conversion=1,
                            recommend_reasons=[
                                1,
                            ],
                            recommend_reasons_name="recommend_reasons_name_example",
                            dynamic_creative=1,
                            dynamic_creative_name="dynamic_creative_name_example",
                            campaign_bid_type=1,
                            mobile_final_url="mobile_final_url_example",
                            mobile_track_param="mobile_track_param_example",
                            mobile_track_template="mobile_track_template_example",
                            pc_final_url="pc_final_url_example",
                            pc_track_param="pc_track_param_example",
                            pc_track_template="pc_track_template_example",
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    pc_destination_url="pc_destination_url_example",
                    mobile_destination_url="mobile_destination_url_example",
                    mobile_final_url="mobile_final_url_example",
                    mobile_track_param="mobile_track_param_example",
                    mobile_track_template="mobile_track_template_example",
                    pc_final_url="pc_final_url_example",
                    pc_track_param="pc_track_param_example",
                    pc_track_template="pc_track_template_example",
                ),
                ocpc_price_info=OcpcPriceInfo(
                    items=[
                        OcpcPriceType(
                            ocpc_bid=3.14,
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            equipment_type=1,
                            cv_source=[
                                1,
                            ],
                            trans_type=[
                                1,
                            ],
                            advice_effect=[
                                OcpcBidAdviceEffect(
                                    level=1,
                                    level_value=3.14,
                                    advice_ocpc_bid=3.14,
                                    conversion_max=1,
                                    conversion_min=1,
                                    pay_max=1,
                                    pay_min=1,
                                ),
                            ],
                            ecpc_max_bid_ratio=3.14,
                            cost=1,
                            click=1,
                            impression=1,
                            conversion=1,
                            suggestions=[
                                PriceRatioEffectInfo(
                                    opt_suggestion=1,
                                    recommend_max_bid_ratio=3.14,
                                    improve_cost=3.14,
                                    improve_click=3.14,
                                    improve_impression=3.14,
                                    improve_conversion=3.14,
                                ),
                            ],
                            recommend_max_bid_ratio=3.14,
                            improve_cost=1,
                            improve_click=1,
                            improve_impression=1,
                            improve_conversion=1,
                            campaign_ids=[
                                1,
                            ],
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    ecpc_max_bid_ratio=3.14,
                ),
                business_label=BusinessLabelAcceptInfo(
                    items=[
                        BusinessLabelType(
                            business_label_id=1,
                            business_name="business_name_example",
                            business_name_id=1,
                            business_point_id=1,
                            strategy_price=3.14,
                            strategy_adgroup_id=1,
                            campaign_id=1,
                            adgroup_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_name="adgroup_name_example",
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            price=3.14,
                            multi_price="multi_price_example",
                            adgroup_price=3.14,
                            impression=1,
                            click=1,
                            log_id="log_id_example",
                        ),
                    ],
                    total_count=1,
                    campaign_id=1,
                    campaign_name="campaign_name_example",
                    adgroup_id=1,
                    adgroup_name="adgroup_name_example",
                    multi_price="multi_price_example",
                    price=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                feed_creative_info=FeedCreativeAcceptInfo(
                    items=[
                        FeedCreativeDetailType(
                            advice_creative_feed_id=1,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                            original_adgroup_feed_id=1,
                            original_creative_feed_id=1,
                            title="title_example",
                            subtitle="subtitle_example",
                            brand="brand_example",
                            pictures=[
                                PictureType(
                                    image="image_example",
                                    url="url_example",
                                    desc1="desc1_example",
                                    desc2="desc2_example",
                                    width=1,
                                    height=1,
                                    target_url=1,
                                ),
                            ],
                            elements=ProgramElementsType(
                                titles=[
                                    "titles_example",
                                ],
                                single_pic=[
                                    "single_pic_example",
                                ],
                                large_pic=[
                                    "large_pic_example",
                                ],
                                package3_pic=[
                                    "package3_pic_example",
                                ],
                                horizontal_videos=[
                                    "horizontal_videos_example",
                                ],
                                vertical_videos=[
                                    "vertical_videos_example",
                                ],
                                picture_single=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                picture_large=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                picture3_fixed=[
                                    PictureType(
                                        image="image_example",
                                        url="url_example",
                                        desc1="desc1_example",
                                        desc2="desc2_example",
                                        width=1,
                                        height=1,
                                        target_url=1,
                                    ),
                                ],
                                video_horizontal=[
                                    VideoType(
                                        video_id=1,
                                        video_url="video_url_example",
                                        width=1,
                                        height=1,
                                        poster=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        horizontal_cover=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        duration=1,
                                    ),
                                ],
                                video_vertical=[
                                    VideoType(
                                        video_id=1,
                                        video_url="video_url_example",
                                        width=1,
                                        height=1,
                                        poster=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        horizontal_cover=[
                                            PictureType(
                                                image="image_example",
                                                url="url_example",
                                                desc1="desc1_example",
                                                desc2="desc2_example",
                                                width=1,
                                                height=1,
                                                target_url=1,
                                            ),
                                        ],
                                        duration=1,
                                    ),
                                ],
                            ),
                            predict_click=1,
                            predict_conversion=1,
                            status=1,
                            creative_type=1,
                            material_style=1,
                            ftypes=[
                                1,
                            ],
                            bid_type=1,
                            bs_type=1,
                            creative_feed_name="creative_feed_name_example",
                            material="material_example",
                            template=PaIdeaTemplateType(
                                title="title_example",
                                sub_title="sub_title_example",
                                brand="brand_example",
                                user_portrait="user_portrait_example",
                                img_url="img_url_example",
                                target_url="target_url_example",
                                img_target_url="img_target_url_example",
                                na_url="na_url_example",
                                img_na_url="img_na_url_example",
                                monitor_url="monitor_url_example",
                                img_text="img_text_example",
                                img_text2="img_text2_example",
                                video_url="video_url_example",
                                poster="poster_example",
                                duration="duration_example",
                                video_id=1,
                                mini_program_schema="mini_program_schema_example",
                                exposure_url="exposure_url_example",
                                horizontal_cover="horizontal_cover_example",
                                video_text1="video_text1_example",
                                video_text2="video_text2_example",
                                ulk_scheme="ulk_scheme_example",
                                ulk_url="ulk_url_example",
                            ),
                            pa_idea_json="pa_idea_json_example",
                            new_creative_feed_id=1,
                        ),
                    ],
                    adgroup_feed_id=1,
                ),
                feed_campaign_budget=FeedCampaignBudgetAcceptInfo(
                    items=[
                        FeedBudgetBaseType(
                            budget=3.14,
                            recommend_budget=3.14,
                            avg_ocpc_bid=3.14,
                            conversion=3.14,
                            cost=3.14,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                    budget=3.14,
                ),
                feed_account_budget=FeedAccountBudgetAcceptInfo(
                    items=[
                        FeedBudgetBaseType(
                            budget=3.14,
                            recommend_budget=3.14,
                            avg_ocpc_bid=3.14,
                            conversion=3.14,
                            cost=3.14,
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                landing_page_correlation=LandingPageCorrelationInfo(
                    items=[
                        LandingPageType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            url_count=1,
                            top_impression_inc_max=1,
                            top_impression_current=1,
                            top_impression_increase=3.14,
                            top_pay=3.14,
                            top_p_clicks=3.14,
                            top_page_views=3.14,
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            id=1,
                            keyword_count=1,
                            keyword="keyword_example",
                            keyword_mobile_destination_url="keyword_mobile_destination_url_example",
                            keyword_mobile_destination_url_count=1,
                            creative_mobile_destination_url="creative_mobile_destination_url_example",
                            creative_mobile_destination_url_count=1,
                            quality=1,
                            add_time="add_time_example",
                            status=1,
                            keyword_id=1,
                            mod_time="mod_time_example",
                            creative_id=1,
                            content_sign=1,
                        ),
                    ],
                ),
                feed_campaign_auto_bid_info=FeedCampaignAutoBidAcceptInfo(
                    items=[
                        FeedCampaignAutoBidType(
                            budget=3.14,
                            adgroup_count=1,
                            delivery_scene="delivery_scene_example",
                            estimated_conversion=3.14,
                            estimated_cost=3.14,
                            adgroup_list=[
                                AutoOrientationType(
                                    status=1,
                                    keywords="keywords_example",
                                    bid_type=1,
                                    bid=3.14,
                                    guide_price=3.14,
                                    ocpc_info=FeedOcpcType(
                                        app_trans_id=1,
                                        trans_from=1,
                                        ocpc_bid=3.14,
                                        lp_url="lp_url_example",
                                        trans_type=1,
                                        ocpc_level=1,
                                        na_url="na_url_example",
                                        is_skip_stage_one=True,
                                        is_open_ocpc_lab=True,
                                        monitor_url="monitor_url_example",
                                        pay_mode=1,
                                        optimize_deep_trans=True,
                                        deep_ocpc_bid=3.14,
                                        deep_trans_type=1,
                                        url_type=1,
                                        use_roi=True,
                                        roi_ratio=3.14,
                                    ),
                                    estimated_conversion_rate=3.14,
                                    estimated_cost_rate=3.14,
                                    estimated_conversion=3.14,
                                    estimated_cost=3.14,
                                    auto_bid=FeedAutoBidType(
                                        auto_bid_lower=3.14,
                                        auto_bid_upper=3.14,
                                        auto_bid_deep_lower=3.14,
                                        auto_bid_deep_upper=3.14,
                                    ),
                                    campaign_feed_id=1,
                                    campaign_feed_name="campaign_feed_name_example",
                                    adgroup_feed_id=1,
                                    adgroup_feed_name="adgroup_feed_name_example",
                                ),
                            ],
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                feed_plugin_info=FeedPluginInfo(
                    items=[
                        FeedPluginType(
                            plugin_id=1,
                            recommend_plugin_name="recommend_plugin_name_example",
                            plugin_name="plugin_name_example",
                            plugin_form_title="plugin_form_title_example",
                            plugin_button_name="plugin_button_name_example",
                            plugin_source=1,
                            plugin_source_id=1,
                            plugin_type=1,
                            solution_id=1,
                            recommend_solution_name="recommend_solution_name_example",
                            solution_name="solution_name_example",
                            solution_properties="solution_properties_example",
                            solution_type=1,
                            improve_conversion=3.14,
                            improve_cost=3.14,
                            status=1,
                            plugin_type_desc="plugin_type_desc_example",
                            show_plugin_name="show_plugin_name_example",
                            show_solution_name="show_solution_name_example",
                            campaign_feed_id=1,
                            campaign_feed_name="campaign_feed_name_example",
                            adgroup_feed_id=1,
                            adgroup_feed_name="adgroup_feed_name_example",
                        ),
                    ],
                ),
                keyword_uncorrelated=KeywordUncorrelatedAcceptInfo(
                    items=[
                        KeyWordType(
                            keyword_id=1,
                            keyword="keyword_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            match_type=1,
                            min_bid=3.14,
                            guide_price=3.14,
                            match_price_status=True,
                            adgroup_status=1,
                            adgroup_status_name="adgroup_status_name_example",
                            es_impression=1,
                            pc_destination_url="pc_destination_url_example",
                            multi_price="multi_price_example",
                            basis_type_name="basis_type_name_example",
                            business_point_id=1,
                            ad_type=1,
                            marketing_target_id=1,
                            reason_code="reason_code_example",
                            reason_text="reason_text_example",
                            price_strategy_id=1,
                            pause=True,
                            shop_type=1,
                            es_click=1,
                            suggest_reason_code=1,
                            top_page_views=1,
                            top_p_clicks=1,
                            campaign_bid_type=1,
                            es_conversion=3.14,
                            top_pay=3.14,
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                fc_adgroup_auto_targeting=AdgroupAutoTargetingInfo(
                    items=[
                        AdgroupAutoTargetingType(
                            adgroup_id=1,
                            adgroup_name="adgroup_name_example",
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            conversion=1,
                            click=1,
                            cost=3.14,
                            strategy_ids=[
                                1,
                            ],
                            adgroup_auto_targeting_status=True,
                            adgroup_auto_targeting_status_name="adgroup_auto_targeting_status_name_example",
                            suggest="suggest_example",
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    improve_click_rate=3.14,
                    improve_conversion_rate=3.14,
                ),
                product_segment_info=ProductSegmentInfo(
                    items=[
                        ProductSegmentType(
                            user_id=1,
                            sign="sign_example",
                            mt_id=1,
                            mt_name="mt_name_example",
                            marketing_target_id=1,
                            bind_level=1,
                            bind_count=1,
                            creative_group_id=1,
                            adgroup_name="adgroup_name_example",
                            adgroup_id=1,
                            campaign_name="campaign_name_example",
                            campaign_id=1,
                            creative_id=1,
                            gen_rate=3.14,
                            product_set_name="product_set_name_example",
                            catalog_name="catalog_name_example",
                            device=1,
                            click=1,
                            conversion=1,
                            status=1,
                            preview_result=CreativePreviewType(
                                status="status_example",
                                mt=1,
                                json="json_example",
                                preview_type=1,
                                demo_url="demo_url_example",
                            ),
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                    improve_click_rate=3.14,
                    improve_conversion_rate=3.14,
                ),
                ecpc_campaign_effect=TargetPackageAcceptCampaign(
                    items=[
                        EcpcCampaignType(
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            package_type=1,
                            uniq_target_package_key="uniq_target_package_key_example",
                            add_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            effect_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            child_campaigns=[
                                CampaignInfo(
                                    campaign_id=1,
                                    campaign_name="campaign_name_example",
                                    bussiness_name="bussiness_name_example",
                                    cv_sources=[
                                        1,
                                    ],
                                    trans_types=[
                                        1,
                                    ],
                                    campaign_bid_type=1,
                                    campaign_ocpc_bid_type=1,
                                    target_package_name="target_package_name_example",
                                    weekly_show=1,
                                    weekly_click=1,
                                    weekly_pay=3.14,
                                    weekly_cv=1,
                                    weekly_avg_cv=1,
                                ),
                            ],
                            campaign_ids=[
                                1,
                            ],
                            cv_sources=[
                                1,
                            ],
                            trans_types=[
                                1,
                            ],
                            campaign_bid_type=1,
                            campaign_ocpc_bid_type=1,
                            weekly_show=1,
                            weekly_click=1,
                            weekly_pay=3.14,
                            weekly_cv=1,
                            weekly_avg_cv=1,
                        ),
                    ],
                    total_count=1,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                ocpc_trans_type_info=OcpcTransTypeAcceptInfo(
                    items=[
                        OcpcTransTypeInfo(
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            ocpc_bid=3.14,
                            data_flow_data=[
                                TargetPackageDataflowInfo(
                                    data_flow=1,
                                    trans_type=[
                                        1,
                                    ],
                                ),
                            ],
                            ocpc_bid_type=1,
                            cost=3.14,
                            click=1,
                            impression=1,
                            conversion=1,
                            trans_price=3.14,
                            improve_cost=1,
                            improve_conversion=1,
                            campaign_ids=[
                                1,
                            ],
                            recommend_data_flow_data=[
                                TargetPackageDataflowInfo(
                                    data_flow=1,
                                    trans_type=[
                                        1,
                                    ],
                                ),
                            ],
                            recommend_ocpc_bid=3.14,
                            recommend_reasons=[
                                RecommendReasonType(
                                    reason_type=1,
                                    improve_ratio=3.14,
                                ),
                            ],
                        ),
                    ],
                    total_count=1,
                    ocpc_bid=3.14,
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
                campaign_est_budget=CampaignEstBudgetAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignEstBudgetType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            budget=3.14,
                            campaign_ocpc_bid_type=1,
                            campaign_trans_types=[
                                1,
                            ],
                            budget_offline_count=1,
                            recommend_budget=1,
                            conversion=1,
                            trans_price=1,
                            cost=3.14,
                            improve_conversion_max=1,
                            improve_conversion_min=1,
                            improve_cost_max=1,
                            improve_cost_min=1,
                            improve_trans_price_t_max=1,
                            improve_trans_price_t_min=1,
                            old_budget=3.14,
                            conversion_max=1,
                            conversion_min=1,
                            cost_max=1,
                            cost_min=1,
                        ),
                    ],
                ),
                campaign_equipment=CampaignEquipmentAcceptInfo(
                    total_count=1,
                    items=[
                        CampaignEquipmentType(
                            campaign_id=1,
                            campaign_name="campaign_name_example",
                            current_equipment_type=1,
                            recommend_equipment_type=1,
                            equipment_type=1,
                            campaign_trans_types=[
                                1,
                            ],
                            campaign_ocpc_bid_type=1,
                            target_package_price_mode="target_package_price_mode_example",
                            target_package_id=1,
                            target_package_name="target_package_name_example",
                            target_package_bid_type=1,
                            cpc_strategy_type=1,
                            cpc_strategy_id=1,
                            cpc_strategy_name="cpc_strategy_name_example",
                            cpc_strategy_status=1,
                            conversion=1,
                            cost=3.14,
                            improve_conversion=1,
                            improve_cost=3.14,
                        ),
                    ],
                    filters=[
                        FieldFilter(
                            field="field_example",
                            op="op_example",
                            values=[
                                "values_example",
                            ],
                        ),
                    ],
                ),
            ),
            source=1,
            batch_id=1,
            process_stage="process_stage_example",
            advice_key="advice_key_example",
        ),
    ) # DownloadAdviceRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.download_advice(download_advice_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceService->download_advice: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **download_advice_request_wrapper** | [**DownloadAdviceRequestWrapper**](DownloadAdviceRequestWrapper.md)|  |

### Return type

[**DownloadAdviceResponseWrapper**](DownloadAdviceResponseWrapper.md)

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

# **query_detail**
> QueryDetailResponseWrapper query_detail(query_detail_request_wrapper)



### Example


```python
import time
import baiduads
from advice.api import advice_service
from baiduads.advice.model.query_detail_response_wrapper import QueryDetailResponseWrapper
from baiduads.advice.model.query_detail_request_wrapper import QueryDetailRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_service.AdviceService(api_client)
    query_detail_request_wrapper = QueryDetailRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceDetailQueryRequest(
            condition=DetailQueryCondition(
                limit=[
                    1,
                ],
                sort_field="sort_field_example",
                desc=True,
                filters=[
                    FieldFilter(
                        field="field_example",
                        op="op_example",
                        values=[
                            "values_example",
                        ],
                    ),
                ],
            ),
            advice_key="advice_key_example",
        ),
    ) # QueryDetailRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_detail(query_detail_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceService->query_detail: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_detail_request_wrapper** | [**QueryDetailRequestWrapper**](QueryDetailRequestWrapper.md)|  |

### Return type

[**QueryDetailResponseWrapper**](QueryDetailResponseWrapper.md)

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

# **query_feed_detail**
> QueryFeedDetailResponseWrapper query_feed_detail(query_feed_detail_request_wrapper)



### Example


```python
import time
import baiduads
from advice.api import advice_service
from baiduads.advice.model.query_feed_detail_response_wrapper import QueryFeedDetailResponseWrapper
from baiduads.advice.model.query_feed_detail_request_wrapper import QueryFeedDetailRequestWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_service.AdviceService(api_client)
    query_feed_detail_request_wrapper = QueryFeedDetailRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceDetailQueryRequest(
            condition=DetailQueryCondition(
                limit=[
                    1,
                ],
                sort_field="sort_field_example",
                desc=True,
                filters=[
                    FieldFilter(
                        field="field_example",
                        op="op_example",
                        values=[
                            "values_example",
                        ],
                    ),
                ],
            ),
            advice_key="advice_key_example",
        ),
    ) # QueryFeedDetailRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_feed_detail(query_feed_detail_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceService->query_feed_detail: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_feed_detail_request_wrapper** | [**QueryFeedDetailRequestWrapper**](QueryFeedDetailRequestWrapper.md)|  |

### Return type

[**QueryFeedDetailResponseWrapper**](QueryFeedDetailResponseWrapper.md)

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

# **query_feed_outline**
> QueryFeedOutlineResponseWrapper query_feed_outline(query_feed_outline_request_wrapper)



### Example


```python
import time
import baiduads
from advice.api import advice_service
from baiduads.advice.model.query_feed_outline_request_wrapper import QueryFeedOutlineRequestWrapper
from baiduads.advice.model.query_feed_outline_response_wrapper import QueryFeedOutlineResponseWrapper
from pprint import pprint
# Defining the host is optional and defaults to https://api.baidu.com
# See configuration.py for a list of all supported configuration parameters.
configuration = baiduads.Configuration(
    host = "https://api.baidu.com"
)


# Enter a context with an instance of the API client
with baiduads.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = advice_service.AdviceService(api_client)
    query_feed_outline_request_wrapper = QueryFeedOutlineRequestWrapper(
        header=ApiRequestHeader(),
        body=AdviceQueryRequest(
            advice_keys=[
                "advice_keys_example",
            ],
        ),
    ) # QueryFeedOutlineRequestWrapper | 

    # example passing only required values which don't have defaults set
    try:
        api_response = api_instance.query_feed_outline(query_feed_outline_request_wrapper)
        pprint(api_response)
    except baiduads.ApiException as e:
        print("Exception when calling AdviceService->query_feed_outline: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query_feed_outline_request_wrapper** | [**QueryFeedOutlineRequestWrapper**](QueryFeedOutlineRequestWrapper.md)|  |

### Return type

[**QueryFeedOutlineResponseWrapper**](QueryFeedOutlineResponseWrapper.md)

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

