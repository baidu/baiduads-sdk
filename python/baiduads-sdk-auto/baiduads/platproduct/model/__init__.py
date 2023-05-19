# coding: utf-8

# flake8: noqa
"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

# import models into model package
from baiduads.platproduct.model.apply_shop_info import ApplyShopInfo
from baiduads.platproduct.model.commodity_qualification_vo import CommodityQualificationVo
from baiduads.platproduct.model.delete_product_request_wrapper import DeleteProductRequestWrapper
from baiduads.platproduct.model.delete_product_response_wrapper import DeleteProductResponseWrapper
from baiduads.platproduct.model.delete_product_response_wrapper_body import DeleteProductResponseWrapperBody
from baiduads.platproduct.model.get_product_detail_request_wrapper import GetProductDetailRequestWrapper
from baiduads.platproduct.model.get_product_detail_response_wrapper import GetProductDetailResponseWrapper
from baiduads.platproduct.model.get_product_detail_response_wrapper_body import GetProductDetailResponseWrapperBody
from baiduads.platproduct.model.get_product_list_request_wrapper import GetProductListRequestWrapper
from baiduads.platproduct.model.get_product_list_response_wrapper import GetProductListResponseWrapper
from baiduads.platproduct.model.get_product_list_response_wrapper_body import GetProductListResponseWrapperBody
from baiduads.platproduct.model.get_product_skus_request_wrapper import GetProductSkusRequestWrapper
from baiduads.platproduct.model.get_product_skus_response_wrapper import GetProductSkusResponseWrapper
from baiduads.platproduct.model.get_product_skus_response_wrapper_body import GetProductSkusResponseWrapperBody
from baiduads.platproduct.model.mod_online_status_request_wrapper import ModOnlineStatusRequestWrapper
from baiduads.platproduct.model.mod_online_status_response_wrapper import ModOnlineStatusResponseWrapper
from baiduads.platproduct.model.mod_online_status_response_wrapper_body import ModOnlineStatusResponseWrapperBody
from baiduads.platproduct.model.plat_audit_reason_detail_vo import PlatAuditReasonDetailVo
from baiduads.platproduct.model.plat_audit_reason_vo import PlatAuditReasonVo
from baiduads.platproduct.model.plat_product_delete_request import PlatProductDeleteRequest
from baiduads.platproduct.model.plat_product_delivery_config_vo import PlatProductDeliveryConfigVo
from baiduads.platproduct.model.plat_product_detail_vo import PlatProductDetailVo
from baiduads.platproduct.model.plat_product_get_detail_request import PlatProductGetDetailRequest
from baiduads.platproduct.model.plat_product_get_list_request import PlatProductGetListRequest
from baiduads.platproduct.model.plat_product_list_vo import PlatProductListVo
from baiduads.platproduct.model.plat_product_list_vo_paging_response import PlatProductListVoPagingResponse
from baiduads.platproduct.model.plat_product_mod_online_request import PlatProductModOnlineRequest
from baiduads.platproduct.model.plat_product_package_vo import PlatProductPackageVo
from baiduads.platproduct.model.plat_product_save_request import PlatProductSaveRequest
from baiduads.platproduct.model.plat_product_sku_composite_vo import PlatProductSkuCompositeVo
from baiduads.platproduct.model.plat_product_sku_package_vo import PlatProductSkuPackageVo
from baiduads.platproduct.model.plat_product_sku_spec_vo import PlatProductSkuSpecVo
from baiduads.platproduct.model.plat_product_sku_vo import PlatProductSkuVo
from baiduads.platproduct.model.plat_product_spu_spec_vo import PlatProductSpuSpecVo
from baiduads.platproduct.model.plat_product_update_stock_request import PlatProductUpdateStockRequest
from baiduads.platproduct.model.plat_sku_get_request_vo import PlatSkuGetRequestVo
from baiduads.platproduct.model.product_book_price_vo import ProductBookPriceVo
from baiduads.platproduct.model.product_category_vo import ProductCategoryVo
from baiduads.platproduct.model.product_exchange_code_vo import ProductExchangeCodeVo
from baiduads.platproduct.model.product_image_vo import ProductImageVo
from baiduads.platproduct.model.product_personalized_label_vo import ProductPersonalizedLabelVo
from baiduads.platproduct.model.product_save_response import ProductSaveResponse
from baiduads.platproduct.model.product_sku_specification_vo import ProductSkuSpecificationVo
from baiduads.platproduct.model.product_skus_vo import ProductSkusVo
from baiduads.platproduct.model.product_spu_attribute_vo import ProductSpuAttributeVo
from baiduads.platproduct.model.product_spu_specification_vo import ProductSpuSpecificationVo
from baiduads.platproduct.model.save_or_update_product_request_wrapper import SaveOrUpdateProductRequestWrapper
from baiduads.platproduct.model.save_or_update_product_response_wrapper import SaveOrUpdateProductResponseWrapper
from baiduads.platproduct.model.save_or_update_product_response_wrapper_body import SaveOrUpdateProductResponseWrapperBody
from baiduads.platproduct.model.service_item import ServiceItem
from baiduads.platproduct.model.service_item_value import ServiceItemValue
from baiduads.platproduct.model.update_stock_request_wrapper import UpdateStockRequestWrapper
from baiduads.platproduct.model.update_stock_response_wrapper import UpdateStockResponseWrapper
from baiduads.platproduct.model.update_stock_response_wrapper_body import UpdateStockResponseWrapperBody
