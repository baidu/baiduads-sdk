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
from baiduads.segmentshield.model.add_segment_shield_request_wrapper import AddSegmentShieldRequestWrapper
from baiduads.segmentshield.model.add_segment_shield_response_wrapper import AddSegmentShieldResponseWrapper
from baiduads.segmentshield.model.get_segment_shield_page_request_wrapper import GetSegmentShieldPageRequestWrapper
from baiduads.segmentshield.model.get_segment_shield_page_response_wrapper import GetSegmentShieldPageResponseWrapper


class SegmentShieldService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_segment_shield_endpoint = _Endpoint(
            settings={
                'response_type': (AddSegmentShieldResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/SegmentShieldService/addSegmentShield',
                'operation_id': 'add_segment_shield',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_segment_shield_request_wrapper',
                ],
                'required': [
                    'add_segment_shield_request_wrapper',
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
                    'add_segment_shield_request_wrapper':
                        (AddSegmentShieldRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_segment_shield_request_wrapper': 'body',
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
        self.get_segment_shield_page_endpoint = _Endpoint(
            settings={
                'response_type': (GetSegmentShieldPageResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/SegmentShieldService/getSegmentShieldPage',
                'operation_id': 'get_segment_shield_page',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_segment_shield_page_request_wrapper',
                ],
                'required': [
                    'get_segment_shield_page_request_wrapper',
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
                    'get_segment_shield_page_request_wrapper':
                        (GetSegmentShieldPageRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_segment_shield_page_request_wrapper': 'body',
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

    def add_segment_shield(
        self,
        add_segment_shield_request_wrapper,
        **kwargs
    ):
        """add_segment_shield  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_segment_shield(add_segment_shield_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_segment_shield_request_wrapper (AddSegmentShieldRequestWrapper):

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
            AddSegmentShieldResponseWrapper
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
        kwargs['add_segment_shield_request_wrapper'] = \
            add_segment_shield_request_wrapper
        return self.add_segment_shield_endpoint.call_with_http_info(**kwargs)

    def get_segment_shield_page(
        self,
        get_segment_shield_page_request_wrapper,
        **kwargs
    ):
        """get_segment_shield_page  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_segment_shield_page(get_segment_shield_page_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_segment_shield_page_request_wrapper (GetSegmentShieldPageRequestWrapper):

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
            GetSegmentShieldPageResponseWrapper
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
        kwargs['get_segment_shield_page_request_wrapper'] = \
            get_segment_shield_page_request_wrapper
        return self.get_segment_shield_page_endpoint.call_with_http_info(**kwargs)

