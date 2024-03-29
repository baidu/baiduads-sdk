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
from baiduads.sharerepertory.model.add_share_repertory_request_wrapper import AddShareRepertoryRequestWrapper
from baiduads.sharerepertory.model.add_share_repertory_response_wrapper import AddShareRepertoryResponseWrapper
from baiduads.sharerepertory.model.delete_share_repertory_request_wrapper import DeleteShareRepertoryRequestWrapper
from baiduads.sharerepertory.model.delete_share_repertory_response_wrapper import DeleteShareRepertoryResponseWrapper
from baiduads.sharerepertory.model.get_share_repertory_request_wrapper import GetShareRepertoryRequestWrapper
from baiduads.sharerepertory.model.get_share_repertory_response_wrapper import GetShareRepertoryResponseWrapper
from baiduads.sharerepertory.model.update_share_repertory_request_wrapper import UpdateShareRepertoryRequestWrapper
from baiduads.sharerepertory.model.update_share_repertory_response_wrapper import UpdateShareRepertoryResponseWrapper


class ShareRepertoryService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_share_repertory_endpoint = _Endpoint(
            settings={
                'response_type': (AddShareRepertoryResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ShareRepertoryService/addShareRepertory',
                'operation_id': 'add_share_repertory',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_share_repertory_request_wrapper',
                ],
                'required': [
                    'add_share_repertory_request_wrapper',
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
                    'add_share_repertory_request_wrapper':
                        (AddShareRepertoryRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_share_repertory_request_wrapper': 'body',
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
        self.delete_share_repertory_endpoint = _Endpoint(
            settings={
                'response_type': (DeleteShareRepertoryResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ShareRepertoryService/deleteShareRepertory',
                'operation_id': 'delete_share_repertory',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'delete_share_repertory_request_wrapper',
                ],
                'required': [
                    'delete_share_repertory_request_wrapper',
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
                    'delete_share_repertory_request_wrapper':
                        (DeleteShareRepertoryRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'delete_share_repertory_request_wrapper': 'body',
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
        self.get_share_repertory_endpoint = _Endpoint(
            settings={
                'response_type': (GetShareRepertoryResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ShareRepertoryService/getShareRepertory',
                'operation_id': 'get_share_repertory',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_share_repertory_request_wrapper',
                ],
                'required': [
                    'get_share_repertory_request_wrapper',
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
                    'get_share_repertory_request_wrapper':
                        (GetShareRepertoryRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_share_repertory_request_wrapper': 'body',
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
        self.update_share_repertory_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateShareRepertoryResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ShareRepertoryService/updateShareRepertory',
                'operation_id': 'update_share_repertory',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_share_repertory_request_wrapper',
                ],
                'required': [
                    'update_share_repertory_request_wrapper',
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
                    'update_share_repertory_request_wrapper':
                        (UpdateShareRepertoryRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_share_repertory_request_wrapper': 'body',
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

    def add_share_repertory(
        self,
        add_share_repertory_request_wrapper,
        **kwargs
    ):
        """add_share_repertory  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_share_repertory(add_share_repertory_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_share_repertory_request_wrapper (AddShareRepertoryRequestWrapper):

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
            AddShareRepertoryResponseWrapper
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
        kwargs['add_share_repertory_request_wrapper'] = \
            add_share_repertory_request_wrapper
        return self.add_share_repertory_endpoint.call_with_http_info(**kwargs)

    def delete_share_repertory(
        self,
        delete_share_repertory_request_wrapper,
        **kwargs
    ):
        """delete_share_repertory  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_share_repertory(delete_share_repertory_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            delete_share_repertory_request_wrapper (DeleteShareRepertoryRequestWrapper):

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
            DeleteShareRepertoryResponseWrapper
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
        kwargs['delete_share_repertory_request_wrapper'] = \
            delete_share_repertory_request_wrapper
        return self.delete_share_repertory_endpoint.call_with_http_info(**kwargs)

    def get_share_repertory(
        self,
        get_share_repertory_request_wrapper,
        **kwargs
    ):
        """get_share_repertory  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_share_repertory(get_share_repertory_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_share_repertory_request_wrapper (GetShareRepertoryRequestWrapper):

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
            GetShareRepertoryResponseWrapper
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
        kwargs['get_share_repertory_request_wrapper'] = \
            get_share_repertory_request_wrapper
        return self.get_share_repertory_endpoint.call_with_http_info(**kwargs)

    def update_share_repertory(
        self,
        update_share_repertory_request_wrapper,
        **kwargs
    ):
        """update_share_repertory  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_share_repertory(update_share_repertory_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_share_repertory_request_wrapper (UpdateShareRepertoryRequestWrapper):

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
            UpdateShareRepertoryResponseWrapper
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
        kwargs['update_share_repertory_request_wrapper'] = \
            update_share_repertory_request_wrapper
        return self.update_share_repertory_endpoint.call_with_http_info(**kwargs)

