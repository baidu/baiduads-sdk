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
from baiduads.materialbindmod.model.add_material_bind_request_wrapper import AddMaterialBindRequestWrapper
from baiduads.materialbindmod.model.add_material_bind_response_wrapper import AddMaterialBindResponseWrapper
from baiduads.materialbindmod.model.delete_material_bind_request_wrapper import DeleteMaterialBindRequestWrapper
from baiduads.materialbindmod.model.delete_material_bind_response_wrapper import DeleteMaterialBindResponseWrapper
from baiduads.materialbindmod.model.update_material_bind_request_wrapper import UpdateMaterialBindRequestWrapper
from baiduads.materialbindmod.model.update_material_bind_response_wrapper import UpdateMaterialBindResponseWrapper


class MaterialBindModService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_material_bind_endpoint = _Endpoint(
            settings={
                'response_type': (AddMaterialBindResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialBindModService/addMaterialBind',
                'operation_id': 'add_material_bind',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_material_bind_request_wrapper',
                ],
                'required': [
                    'add_material_bind_request_wrapper',
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
                    'add_material_bind_request_wrapper':
                        (AddMaterialBindRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_material_bind_request_wrapper': 'body',
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
        self.delete_material_bind_endpoint = _Endpoint(
            settings={
                'response_type': (DeleteMaterialBindResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialBindModService/deleteMaterialBind',
                'operation_id': 'delete_material_bind',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'delete_material_bind_request_wrapper',
                ],
                'required': [
                    'delete_material_bind_request_wrapper',
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
                    'delete_material_bind_request_wrapper':
                        (DeleteMaterialBindRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'delete_material_bind_request_wrapper': 'body',
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
        self.update_material_bind_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateMaterialBindResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialBindModService/updateMaterialBind',
                'operation_id': 'update_material_bind',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_material_bind_request_wrapper',
                ],
                'required': [
                    'update_material_bind_request_wrapper',
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
                    'update_material_bind_request_wrapper':
                        (UpdateMaterialBindRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_material_bind_request_wrapper': 'body',
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

    def add_material_bind(
        self,
        add_material_bind_request_wrapper,
        **kwargs
    ):
        """add_material_bind  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_material_bind(add_material_bind_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_material_bind_request_wrapper (AddMaterialBindRequestWrapper):

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
            AddMaterialBindResponseWrapper
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
        kwargs['add_material_bind_request_wrapper'] = \
            add_material_bind_request_wrapper
        return self.add_material_bind_endpoint.call_with_http_info(**kwargs)

    def delete_material_bind(
        self,
        delete_material_bind_request_wrapper,
        **kwargs
    ):
        """delete_material_bind  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_material_bind(delete_material_bind_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            delete_material_bind_request_wrapper (DeleteMaterialBindRequestWrapper):

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
            DeleteMaterialBindResponseWrapper
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
        kwargs['delete_material_bind_request_wrapper'] = \
            delete_material_bind_request_wrapper
        return self.delete_material_bind_endpoint.call_with_http_info(**kwargs)

    def update_material_bind(
        self,
        update_material_bind_request_wrapper,
        **kwargs
    ):
        """update_material_bind  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_material_bind(update_material_bind_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_material_bind_request_wrapper (UpdateMaterialBindRequestWrapper):

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
            UpdateMaterialBindResponseWrapper
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
        kwargs['update_material_bind_request_wrapper'] = \
            update_material_bind_request_wrapper
        return self.update_material_bind_endpoint.call_with_http_info(**kwargs)

