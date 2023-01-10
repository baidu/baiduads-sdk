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
from baiduads.crowdfeed.model.get_bind_adgroup_request_wrapper import GetBindAdgroupRequestWrapper
from baiduads.crowdfeed.model.get_bind_adgroup_response_wrapper import GetBindAdgroupResponseWrapper
from baiduads.crowdfeed.model.get_eshop_elds_crowds_request_wrapper import GetEshopEldsCrowdsRequestWrapper
from baiduads.crowdfeed.model.get_eshop_elds_crowds_response_wrapper import GetEshopEldsCrowdsResponseWrapper
from baiduads.crowdfeed.model.get_eshop_trade_crowds_request_wrapper import GetEshopTradeCrowdsRequestWrapper
from baiduads.crowdfeed.model.get_eshop_trade_crowds_response_wrapper import GetEshopTradeCrowdsResponseWrapper


class CrowdFeedService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_bind_adgroup_endpoint = _Endpoint(
            settings={
                'response_type': (GetBindAdgroupResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CrowdFeedService/getBindAdgroup',
                'operation_id': 'get_bind_adgroup',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_bind_adgroup_request_wrapper',
                ],
                'required': [
                    'get_bind_adgroup_request_wrapper',
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
                    'get_bind_adgroup_request_wrapper':
                        (GetBindAdgroupRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_bind_adgroup_request_wrapper': 'body',
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
        self.get_eshop_elds_crowds_endpoint = _Endpoint(
            settings={
                'response_type': (GetEshopEldsCrowdsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CrowdFeedService/getEshopEldsCrowds',
                'operation_id': 'get_eshop_elds_crowds',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_eshop_elds_crowds_request_wrapper',
                ],
                'required': [
                    'get_eshop_elds_crowds_request_wrapper',
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
                    'get_eshop_elds_crowds_request_wrapper':
                        (GetEshopEldsCrowdsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_eshop_elds_crowds_request_wrapper': 'body',
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
        self.get_eshop_trade_crowds_endpoint = _Endpoint(
            settings={
                'response_type': (GetEshopTradeCrowdsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CrowdFeedService/getEshopTradeCrowds',
                'operation_id': 'get_eshop_trade_crowds',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_eshop_trade_crowds_request_wrapper',
                ],
                'required': [
                    'get_eshop_trade_crowds_request_wrapper',
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
                    'get_eshop_trade_crowds_request_wrapper':
                        (GetEshopTradeCrowdsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_eshop_trade_crowds_request_wrapper': 'body',
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

    def get_bind_adgroup(
        self,
        get_bind_adgroup_request_wrapper,
        **kwargs
    ):
        """get_bind_adgroup  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_bind_adgroup(get_bind_adgroup_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_bind_adgroup_request_wrapper (GetBindAdgroupRequestWrapper):

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
            GetBindAdgroupResponseWrapper
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
        kwargs['get_bind_adgroup_request_wrapper'] = \
            get_bind_adgroup_request_wrapper
        return self.get_bind_adgroup_endpoint.call_with_http_info(**kwargs)

    def get_eshop_elds_crowds(
        self,
        get_eshop_elds_crowds_request_wrapper,
        **kwargs
    ):
        """get_eshop_elds_crowds  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_eshop_elds_crowds(get_eshop_elds_crowds_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_eshop_elds_crowds_request_wrapper (GetEshopEldsCrowdsRequestWrapper):

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
            GetEshopEldsCrowdsResponseWrapper
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
        kwargs['get_eshop_elds_crowds_request_wrapper'] = \
            get_eshop_elds_crowds_request_wrapper
        return self.get_eshop_elds_crowds_endpoint.call_with_http_info(**kwargs)

    def get_eshop_trade_crowds(
        self,
        get_eshop_trade_crowds_request_wrapper,
        **kwargs
    ):
        """get_eshop_trade_crowds  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_eshop_trade_crowds(get_eshop_trade_crowds_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_eshop_trade_crowds_request_wrapper (GetEshopTradeCrowdsRequestWrapper):

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
            GetEshopTradeCrowdsResponseWrapper
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
        kwargs['get_eshop_trade_crowds_request_wrapper'] = \
            get_eshop_trade_crowds_request_wrapper
        return self.get_eshop_trade_crowds_endpoint.call_with_http_info(**kwargs)

