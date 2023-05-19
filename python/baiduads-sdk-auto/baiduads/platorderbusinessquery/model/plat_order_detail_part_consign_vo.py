"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from baiduads.exceptions import ApiAttributeError



class PlatOrderDetailPartConsignVo(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        return {
            'package_id': (int,),  # noqa: E501
            'sub_tracking_number': (str,),  # noqa: E501
            'sub_express_name': (str,),  # noqa: E501
            'sub_consign_time': (str,),  # noqa: E501
            'sub_express_status': (int,),  # noqa: E501
            'sub_express_status_text': (str,),  # noqa: E501
            'freight_amount_str': (str,),  # noqa: E501
            'plat_coupon_discount_amount': (str,),  # noqa: E501
            'biz_coupon_discount_amount': (str,),  # noqa: E501
            'plat_promotion_discount_amount': (str,),  # noqa: E501
            'biz_promotion_discount_amount': (str,),  # noqa: E501
            'payment_amount': (str,),  # noqa: E501
            'plat_red_packet_discount_amount': (str,),  # noqa: E501
            'sku_id': (int,),  # noqa: E501
            'adjust_price_amount': (str,),  # noqa: E501
            'commodity_desc': (str,),  # noqa: E501
            'commodity_image': (str,),  # noqa: E501
            'page_online_url': (str,),  # noqa: E501
            'spec_num_list': ([str],),  # noqa: E501
            'buy_num': (int,),  # noqa: E501
            'total_amount': (str,),  # noqa: E501
            'plan_name': (str,),  # noqa: E501
            'unit_name': (str,),  # noqa: E501
            'discount_amount': (str,),  # noqa: E501
            'commission': (str,),  # noqa: E501
            'commission_rate': (int,),  # noqa: E501
            'refund_status': (int,),  # noqa: E501
            'refund_status_text': (str,),  # noqa: E501
            'uc_name': (str,),  # noqa: E501
            'click_type': (int,),  # noqa: E501
            'click_type_text': (str,),  # noqa: E501
            'sku_code': (str,),  # noqa: E501
            'author_id': (str,),  # noqa: E501
            'author_name': (str,),  # noqa: E501
            'pay_order_id': (int,),  # noqa: E501
            'sub_order_id': (int,),  # noqa: E501
            'deliver_tag': (int,),  # noqa: E501
            'product_name': (str,),  # noqa: E501
            'package_desc': (str,),  # noqa: E501
            'sku_desc': (str,),  # noqa: E501
            'freight_amount': (int,),  # noqa: E501
            'sell_price': (str,),  # noqa: E501
            'product_id': (int,),  # noqa: E501
            'due_price': (str,),  # noqa: E501
            'idea_id': (int,),  # noqa: E501
            'idea_text': (str,),  # noqa: E501
            'plan_id': (str,),  # noqa: E501
            'unit_id': (int,),  # noqa: E501
            'deliver_timeout_date': (str,),  # noqa: E501
            'refund_id': (int,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'package_id': 'packageId',  # noqa: E501
        'sub_tracking_number': 'subTrackingNumber',  # noqa: E501
        'sub_express_name': 'subExpressName',  # noqa: E501
        'sub_consign_time': 'subConsignTime',  # noqa: E501
        'sub_express_status': 'subExpressStatus',  # noqa: E501
        'sub_express_status_text': 'subExpressStatusText',  # noqa: E501
        'freight_amount_str': 'freightAmountStr',  # noqa: E501
        'plat_coupon_discount_amount': 'platCouponDiscountAmount',  # noqa: E501
        'biz_coupon_discount_amount': 'bizCouponDiscountAmount',  # noqa: E501
        'plat_promotion_discount_amount': 'platPromotionDiscountAmount',  # noqa: E501
        'biz_promotion_discount_amount': 'bizPromotionDiscountAmount',  # noqa: E501
        'payment_amount': 'paymentAmount',  # noqa: E501
        'plat_red_packet_discount_amount': 'platRedPacketDiscountAmount',  # noqa: E501
        'sku_id': 'skuId',  # noqa: E501
        'adjust_price_amount': 'adjustPriceAmount',  # noqa: E501
        'commodity_desc': 'commodityDesc',  # noqa: E501
        'commodity_image': 'commodityImage',  # noqa: E501
        'page_online_url': 'pageOnlineUrl',  # noqa: E501
        'spec_num_list': 'specNumList',  # noqa: E501
        'buy_num': 'buyNum',  # noqa: E501
        'total_amount': 'totalAmount',  # noqa: E501
        'plan_name': 'planName',  # noqa: E501
        'unit_name': 'unitName',  # noqa: E501
        'discount_amount': 'discountAmount',  # noqa: E501
        'commission': 'commission',  # noqa: E501
        'commission_rate': 'commissionRate',  # noqa: E501
        'refund_status': 'refundStatus',  # noqa: E501
        'refund_status_text': 'refundStatusText',  # noqa: E501
        'uc_name': 'ucName',  # noqa: E501
        'click_type': 'clickType',  # noqa: E501
        'click_type_text': 'clickTypeText',  # noqa: E501
        'sku_code': 'skuCode',  # noqa: E501
        'author_id': 'authorId',  # noqa: E501
        'author_name': 'authorName',  # noqa: E501
        'pay_order_id': 'payOrderId',  # noqa: E501
        'sub_order_id': 'subOrderId',  # noqa: E501
        'deliver_tag': 'deliverTag',  # noqa: E501
        'product_name': 'productName',  # noqa: E501
        'package_desc': 'packageDesc',  # noqa: E501
        'sku_desc': 'skuDesc',  # noqa: E501
        'freight_amount': 'freightAmount',  # noqa: E501
        'sell_price': 'sellPrice',  # noqa: E501
        'product_id': 'productId',  # noqa: E501
        'due_price': 'duePrice',  # noqa: E501
        'idea_id': 'ideaId',  # noqa: E501
        'idea_text': 'ideaText',  # noqa: E501
        'plan_id': 'planId',  # noqa: E501
        'unit_id': 'unitId',  # noqa: E501
        'deliver_timeout_date': 'deliverTimeoutDate',  # noqa: E501
        'refund_id': 'refundId',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """PlatOrderDetailPartConsignVo - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            package_id (int): [optional]  # noqa: E501
            sub_tracking_number (str): [optional]  # noqa: E501
            sub_express_name (str): [optional]  # noqa: E501
            sub_consign_time (str): [optional]  # noqa: E501
            sub_express_status (int): [optional]  # noqa: E501
            sub_express_status_text (str): [optional]  # noqa: E501
            freight_amount_str (str): [optional]  # noqa: E501
            plat_coupon_discount_amount (str): [optional]  # noqa: E501
            biz_coupon_discount_amount (str): [optional]  # noqa: E501
            plat_promotion_discount_amount (str): [optional]  # noqa: E501
            biz_promotion_discount_amount (str): [optional]  # noqa: E501
            payment_amount (str): [optional]  # noqa: E501
            plat_red_packet_discount_amount (str): [optional]  # noqa: E501
            sku_id (int): [optional]  # noqa: E501
            adjust_price_amount (str): [optional]  # noqa: E501
            commodity_desc (str): [optional]  # noqa: E501
            commodity_image (str): [optional]  # noqa: E501
            page_online_url (str): [optional]  # noqa: E501
            spec_num_list ([str]): [optional]  # noqa: E501
            buy_num (int): [optional]  # noqa: E501
            total_amount (str): [optional]  # noqa: E501
            plan_name (str): [optional]  # noqa: E501
            unit_name (str): [optional]  # noqa: E501
            discount_amount (str): [optional]  # noqa: E501
            commission (str): [optional]  # noqa: E501
            commission_rate (int): [optional]  # noqa: E501
            refund_status (int): [optional]  # noqa: E501
            refund_status_text (str): [optional]  # noqa: E501
            uc_name (str): [optional]  # noqa: E501
            click_type (int): [optional]  # noqa: E501
            click_type_text (str): [optional]  # noqa: E501
            sku_code (str): [optional]  # noqa: E501
            author_id (str): [optional]  # noqa: E501
            author_name (str): [optional]  # noqa: E501
            pay_order_id (int): [optional]  # noqa: E501
            sub_order_id (int): [optional]  # noqa: E501
            deliver_tag (int): [optional]  # noqa: E501
            product_name (str): [optional]  # noqa: E501
            package_desc (str): [optional]  # noqa: E501
            sku_desc (str): [optional]  # noqa: E501
            freight_amount (int): [optional]  # noqa: E501
            sell_price (str): [optional]  # noqa: E501
            product_id (int): [optional]  # noqa: E501
            due_price (str): [optional]  # noqa: E501
            idea_id (int): [optional]  # noqa: E501
            idea_text (str): [optional]  # noqa: E501
            plan_id (str): [optional]  # noqa: E501
            unit_id (int): [optional]  # noqa: E501
            deliver_timeout_date (str): [optional]  # noqa: E501
            refund_id (int): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """PlatOrderDetailPartConsignVo - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            package_id (int): [optional]  # noqa: E501
            sub_tracking_number (str): [optional]  # noqa: E501
            sub_express_name (str): [optional]  # noqa: E501
            sub_consign_time (str): [optional]  # noqa: E501
            sub_express_status (int): [optional]  # noqa: E501
            sub_express_status_text (str): [optional]  # noqa: E501
            freight_amount_str (str): [optional]  # noqa: E501
            plat_coupon_discount_amount (str): [optional]  # noqa: E501
            biz_coupon_discount_amount (str): [optional]  # noqa: E501
            plat_promotion_discount_amount (str): [optional]  # noqa: E501
            biz_promotion_discount_amount (str): [optional]  # noqa: E501
            payment_amount (str): [optional]  # noqa: E501
            plat_red_packet_discount_amount (str): [optional]  # noqa: E501
            sku_id (int): [optional]  # noqa: E501
            adjust_price_amount (str): [optional]  # noqa: E501
            commodity_desc (str): [optional]  # noqa: E501
            commodity_image (str): [optional]  # noqa: E501
            page_online_url (str): [optional]  # noqa: E501
            spec_num_list ([str]): [optional]  # noqa: E501
            buy_num (int): [optional]  # noqa: E501
            total_amount (str): [optional]  # noqa: E501
            plan_name (str): [optional]  # noqa: E501
            unit_name (str): [optional]  # noqa: E501
            discount_amount (str): [optional]  # noqa: E501
            commission (str): [optional]  # noqa: E501
            commission_rate (int): [optional]  # noqa: E501
            refund_status (int): [optional]  # noqa: E501
            refund_status_text (str): [optional]  # noqa: E501
            uc_name (str): [optional]  # noqa: E501
            click_type (int): [optional]  # noqa: E501
            click_type_text (str): [optional]  # noqa: E501
            sku_code (str): [optional]  # noqa: E501
            author_id (str): [optional]  # noqa: E501
            author_name (str): [optional]  # noqa: E501
            pay_order_id (int): [optional]  # noqa: E501
            sub_order_id (int): [optional]  # noqa: E501
            deliver_tag (int): [optional]  # noqa: E501
            product_name (str): [optional]  # noqa: E501
            package_desc (str): [optional]  # noqa: E501
            sku_desc (str): [optional]  # noqa: E501
            freight_amount (int): [optional]  # noqa: E501
            sell_price (str): [optional]  # noqa: E501
            product_id (int): [optional]  # noqa: E501
            due_price (str): [optional]  # noqa: E501
            idea_id (int): [optional]  # noqa: E501
            idea_text (str): [optional]  # noqa: E501
            plan_id (str): [optional]  # noqa: E501
            unit_id (int): [optional]  # noqa: E501
            deliver_timeout_date (str): [optional]  # noqa: E501
            refund_id (int): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
