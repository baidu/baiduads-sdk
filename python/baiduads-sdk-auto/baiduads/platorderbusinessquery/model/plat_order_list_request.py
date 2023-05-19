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



class PlatOrderListRequest(ModelNormal):
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
            'order_id': (int,),  # noqa: E501
            'product_name': (str,),  # noqa: E501
            'receiver': (str,),  # noqa: E501
            'receiver_mobile': (str,),  # noqa: E501
            'order_status': ([int],),  # noqa: E501
            'refund_status': ([int],),  # noqa: E501
            'order_type': ([int],),  # noqa: E501
            'fields': ([str],),  # noqa: E501
            'start_create_time': (str,),  # noqa: E501
            'end_create_time': (str,),  # noqa: E501
            'desc': (bool,),  # noqa: E501
            'sort_field': (str,),  # noqa: E501
            'anti_user_id': (int,),  # noqa: E501
            'express_status': (int,),  # noqa: E501
            'ucid': (int,),  # noqa: E501
            'shop_id': (int,),  # noqa: E501
            'app_id': (int,),  # noqa: E501
            'order_ids': ([int],),  # noqa: E501
            'click_type': ([int],),  # noqa: E501
            'complete_start_time': (str,),  # noqa: E501
            'complete_end_time': (str,),  # noqa: E501
            'product_id': (int,),  # noqa: E501
            'tracking_number': (str,),  # noqa: E501
            'normal_order_type': (int,),  # noqa: E501
            'abnormal_order_type': (int,),  # noqa: E501
            'operate_tag': (bool,),  # noqa: E501
            'bring_goods_type': (int,),  # noqa: E501
            'passport_id': (int,),  # noqa: E501
            'cuid': (str,),  # noqa: E501
            'click_ucid': (str,),  # noqa: E501
            'download_options': (int,),  # noqa: E501
            'pay_order_id': (int,),  # noqa: E501
            'start_update_time': (str,),  # noqa: E501
            'end_update_time': (str,),  # noqa: E501
            'page_size': (int,),  # noqa: E501
            'page_num': (int,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'order_id': 'orderId',  # noqa: E501
        'product_name': 'productName',  # noqa: E501
        'receiver': 'receiver',  # noqa: E501
        'receiver_mobile': 'receiverMobile',  # noqa: E501
        'order_status': 'orderStatus',  # noqa: E501
        'refund_status': 'refundStatus',  # noqa: E501
        'order_type': 'orderType',  # noqa: E501
        'fields': 'fields',  # noqa: E501
        'start_create_time': 'startCreateTime',  # noqa: E501
        'end_create_time': 'endCreateTime',  # noqa: E501
        'desc': 'desc',  # noqa: E501
        'sort_field': 'sortField',  # noqa: E501
        'anti_user_id': 'antiUserId',  # noqa: E501
        'express_status': 'expressStatus',  # noqa: E501
        'ucid': 'ucid',  # noqa: E501
        'shop_id': 'shopId',  # noqa: E501
        'app_id': 'appId',  # noqa: E501
        'order_ids': 'orderIds',  # noqa: E501
        'click_type': 'clickType',  # noqa: E501
        'complete_start_time': 'completeStartTime',  # noqa: E501
        'complete_end_time': 'completeEndTime',  # noqa: E501
        'product_id': 'productId',  # noqa: E501
        'tracking_number': 'trackingNumber',  # noqa: E501
        'normal_order_type': 'normalOrderType',  # noqa: E501
        'abnormal_order_type': 'abnormalOrderType',  # noqa: E501
        'operate_tag': 'operateTag',  # noqa: E501
        'bring_goods_type': 'bringGoodsType',  # noqa: E501
        'passport_id': 'passportId',  # noqa: E501
        'cuid': 'cuid',  # noqa: E501
        'click_ucid': 'clickUcid',  # noqa: E501
        'download_options': 'downloadOptions',  # noqa: E501
        'pay_order_id': 'payOrderId',  # noqa: E501
        'start_update_time': 'startUpdateTime',  # noqa: E501
        'end_update_time': 'endUpdateTime',  # noqa: E501
        'page_size': 'pageSize',  # noqa: E501
        'page_num': 'pageNum',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """PlatOrderListRequest - a model defined in OpenAPI

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
            order_id (int): [optional]  # noqa: E501
            product_name (str): [optional]  # noqa: E501
            receiver (str): [optional]  # noqa: E501
            receiver_mobile (str): [optional]  # noqa: E501
            order_status ([int]): [optional]  # noqa: E501
            refund_status ([int]): [optional]  # noqa: E501
            order_type ([int]): [optional]  # noqa: E501
            fields ([str]): [optional]  # noqa: E501
            start_create_time (str): [optional]  # noqa: E501
            end_create_time (str): [optional]  # noqa: E501
            desc (bool): [optional]  # noqa: E501
            sort_field (str): [optional]  # noqa: E501
            anti_user_id (int): [optional]  # noqa: E501
            express_status (int): [optional]  # noqa: E501
            ucid (int): [optional]  # noqa: E501
            shop_id (int): [optional]  # noqa: E501
            app_id (int): [optional]  # noqa: E501
            order_ids ([int]): [optional]  # noqa: E501
            click_type ([int]): [optional]  # noqa: E501
            complete_start_time (str): [optional]  # noqa: E501
            complete_end_time (str): [optional]  # noqa: E501
            product_id (int): [optional]  # noqa: E501
            tracking_number (str): [optional]  # noqa: E501
            normal_order_type (int): [optional]  # noqa: E501
            abnormal_order_type (int): [optional]  # noqa: E501
            operate_tag (bool): [optional]  # noqa: E501
            bring_goods_type (int): [optional]  # noqa: E501
            passport_id (int): [optional]  # noqa: E501
            cuid (str): [optional]  # noqa: E501
            click_ucid (str): [optional]  # noqa: E501
            download_options (int): [optional]  # noqa: E501
            pay_order_id (int): [optional]  # noqa: E501
            start_update_time (str): [optional]  # noqa: E501
            end_update_time (str): [optional]  # noqa: E501
            page_size (int): [optional]  # noqa: E501
            page_num (int): [optional]  # noqa: E501
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
        """PlatOrderListRequest - a model defined in OpenAPI

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
            order_id (int): [optional]  # noqa: E501
            product_name (str): [optional]  # noqa: E501
            receiver (str): [optional]  # noqa: E501
            receiver_mobile (str): [optional]  # noqa: E501
            order_status ([int]): [optional]  # noqa: E501
            refund_status ([int]): [optional]  # noqa: E501
            order_type ([int]): [optional]  # noqa: E501
            fields ([str]): [optional]  # noqa: E501
            start_create_time (str): [optional]  # noqa: E501
            end_create_time (str): [optional]  # noqa: E501
            desc (bool): [optional]  # noqa: E501
            sort_field (str): [optional]  # noqa: E501
            anti_user_id (int): [optional]  # noqa: E501
            express_status (int): [optional]  # noqa: E501
            ucid (int): [optional]  # noqa: E501
            shop_id (int): [optional]  # noqa: E501
            app_id (int): [optional]  # noqa: E501
            order_ids ([int]): [optional]  # noqa: E501
            click_type ([int]): [optional]  # noqa: E501
            complete_start_time (str): [optional]  # noqa: E501
            complete_end_time (str): [optional]  # noqa: E501
            product_id (int): [optional]  # noqa: E501
            tracking_number (str): [optional]  # noqa: E501
            normal_order_type (int): [optional]  # noqa: E501
            abnormal_order_type (int): [optional]  # noqa: E501
            operate_tag (bool): [optional]  # noqa: E501
            bring_goods_type (int): [optional]  # noqa: E501
            passport_id (int): [optional]  # noqa: E501
            cuid (str): [optional]  # noqa: E501
            click_ucid (str): [optional]  # noqa: E501
            download_options (int): [optional]  # noqa: E501
            pay_order_id (int): [optional]  # noqa: E501
            start_update_time (str): [optional]  # noqa: E501
            end_update_time (str): [optional]  # noqa: E501
            page_size (int): [optional]  # noqa: E501
            page_num (int): [optional]  # noqa: E501
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
