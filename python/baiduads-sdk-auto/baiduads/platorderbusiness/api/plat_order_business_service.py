"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.api_client import ApiClient, Endpoint as _Endpoint
from baiduads.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from baiduads.platorderbusiness.model.confirm_or_cancel_order_request_wrapper import ConfirmOrCancelOrderRequestWrapper
from baiduads.platorderbusiness.model.confirm_or_cancel_order_response_wrapper import ConfirmOrCancelOrderResponseWrapper
from baiduads.platorderbusiness.model.deliver_order_request_wrapper import DeliverOrderRequestWrapper
from baiduads.platorderbusiness.model.deliver_order_response_wrapper import DeliverOrderResponseWrapper
from baiduads.platorderbusiness.model.reject_order_request_wrapper import RejectOrderRequestWrapper
from baiduads.platorderbusiness.model.reject_order_response_wrapper import RejectOrderResponseWrapper
from baiduads.platorderbusiness.model.take_order_request_wrapper import TakeOrderRequestWrapper
from baiduads.platorderbusiness.model.take_order_response_wrapper import TakeOrderResponseWrapper
from baiduads.platorderbusiness.model.update_remark_request_wrapper import UpdateRemarkRequestWrapper
from baiduads.platorderbusiness.model.update_remark_response_wrapper import UpdateRemarkResponseWrapper


class PlatOrderBusinessService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.confirm_or_cancel_order_endpoint = _Endpoint(
            settings={
                'response_type': (ConfirmOrCancelOrderResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/PlatOrderBusinessService/confirmOrCancelOrder',
                'operation_id': 'confirm_or_cancel_order',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'confirm_or_cancel_order_request_wrapper',
                ],
                'required': [
                    'confirm_or_cancel_order_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'confirm_or_cancel_order_request_wrapper':
                        (ConfirmOrCancelOrderRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'confirm_or_cancel_order_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.deliver_order_endpoint = _Endpoint(
            settings={
                'response_type': (DeliverOrderResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/PlatOrderBusinessService/deliverOrder',
                'operation_id': 'deliver_order',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'deliver_order_request_wrapper',
                ],
                'required': [
                    'deliver_order_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'deliver_order_request_wrapper':
                        (DeliverOrderRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'deliver_order_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.reject_order_endpoint = _Endpoint(
            settings={
                'response_type': (RejectOrderResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/PlatOrderBusinessService/rejectOrder',
                'operation_id': 'reject_order',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'reject_order_request_wrapper',
                ],
                'required': [
                    'reject_order_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'reject_order_request_wrapper':
                        (RejectOrderRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'reject_order_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.take_order_endpoint = _Endpoint(
            settings={
                'response_type': (TakeOrderResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/PlatOrderBusinessService/takeOrder',
                'operation_id': 'take_order',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'take_order_request_wrapper',
                ],
                'required': [
                    'take_order_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'take_order_request_wrapper':
                        (TakeOrderRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'take_order_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.update_remark_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateRemarkResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/PlatOrderBusinessService/updateRemark',
                'operation_id': 'update_remark',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_remark_request_wrapper',
                ],
                'required': [
                    'update_remark_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'update_remark_request_wrapper':
                        (UpdateRemarkRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_remark_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )

    def confirm_or_cancel_order(
        self,
        confirm_or_cancel_order_request_wrapper,
        **kwargs
    ):
        """confirm_or_cancel_order  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.confirm_or_cancel_order(confirm_or_cancel_order_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            confirm_or_cancel_order_request_wrapper (ConfirmOrCancelOrderRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            ConfirmOrCancelOrderResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['confirm_or_cancel_order_request_wrapper'] = \
            confirm_or_cancel_order_request_wrapper
        return self.confirm_or_cancel_order_endpoint.call_with_http_info(**kwargs)

    def deliver_order(
        self,
        deliver_order_request_wrapper,
        **kwargs
    ):
        """deliver_order  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.deliver_order(deliver_order_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            deliver_order_request_wrapper (DeliverOrderRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            DeliverOrderResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['deliver_order_request_wrapper'] = \
            deliver_order_request_wrapper
        return self.deliver_order_endpoint.call_with_http_info(**kwargs)

    def reject_order(
        self,
        reject_order_request_wrapper,
        **kwargs
    ):
        """reject_order  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.reject_order(reject_order_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            reject_order_request_wrapper (RejectOrderRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            RejectOrderResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['reject_order_request_wrapper'] = \
            reject_order_request_wrapper
        return self.reject_order_endpoint.call_with_http_info(**kwargs)

    def take_order(
        self,
        take_order_request_wrapper,
        **kwargs
    ):
        """take_order  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.take_order(take_order_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            take_order_request_wrapper (TakeOrderRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            TakeOrderResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['take_order_request_wrapper'] = \
            take_order_request_wrapper
        return self.take_order_endpoint.call_with_http_info(**kwargs)

    def update_remark(
        self,
        update_remark_request_wrapper,
        **kwargs
    ):
        """update_remark  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_remark(update_remark_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_remark_request_wrapper (UpdateRemarkRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            UpdateRemarkResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['update_remark_request_wrapper'] = \
            update_remark_request_wrapper
        return self.update_remark_endpoint.call_with_http_info(**kwargs)

