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
from baiduads.imagemanage.model.del_image_request_wrapper import DelImageRequestWrapper
from baiduads.imagemanage.model.del_image_response_wrapper import DelImageResponseWrapper
from baiduads.imagemanage.model.get_image_list_request_wrapper import GetImageListRequestWrapper
from baiduads.imagemanage.model.get_image_list_response_wrapper import GetImageListResponseWrapper
from baiduads.imagemanage.model.mod_image_request_wrapper import ModImageRequestWrapper
from baiduads.imagemanage.model.mod_image_response_wrapper import ModImageResponseWrapper
from baiduads.imagemanage.model.upload_image_request_wrapper import UploadImageRequestWrapper
from baiduads.imagemanage.model.upload_image_response_wrapper import UploadImageResponseWrapper


class ImageManageService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.del_image_endpoint = _Endpoint(
            settings={
                'response_type': (DelImageResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ImageManageService/delImage',
                'operation_id': 'del_image',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'del_image_request_wrapper',
                ],
                'required': [
                    'del_image_request_wrapper',
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
                    'del_image_request_wrapper':
                        (DelImageRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'del_image_request_wrapper': 'body',
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
        self.get_image_list_endpoint = _Endpoint(
            settings={
                'response_type': (GetImageListResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ImageManageService/getImageList',
                'operation_id': 'get_image_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_image_list_request_wrapper',
                ],
                'required': [
                    'get_image_list_request_wrapper',
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
                    'get_image_list_request_wrapper':
                        (GetImageListRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_image_list_request_wrapper': 'body',
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
        self.mod_image_endpoint = _Endpoint(
            settings={
                'response_type': (ModImageResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ImageManageService/modImage',
                'operation_id': 'mod_image',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'mod_image_request_wrapper',
                ],
                'required': [
                    'mod_image_request_wrapper',
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
                    'mod_image_request_wrapper':
                        (ModImageRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'mod_image_request_wrapper': 'body',
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
        self.upload_image_endpoint = _Endpoint(
            settings={
                'response_type': (UploadImageResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/ImageManageService/uploadImage',
                'operation_id': 'upload_image',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'upload_image_request_wrapper',
                ],
                'required': [
                    'upload_image_request_wrapper',
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
                    'upload_image_request_wrapper':
                        (UploadImageRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'upload_image_request_wrapper': 'body',
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

    def del_image(
        self,
        del_image_request_wrapper,
        **kwargs
    ):
        """del_image  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.del_image(del_image_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            del_image_request_wrapper (DelImageRequestWrapper):

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
            DelImageResponseWrapper
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
        kwargs['del_image_request_wrapper'] = \
            del_image_request_wrapper
        return self.del_image_endpoint.call_with_http_info(**kwargs)

    def get_image_list(
        self,
        get_image_list_request_wrapper,
        **kwargs
    ):
        """get_image_list  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_image_list(get_image_list_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_image_list_request_wrapper (GetImageListRequestWrapper):

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
            GetImageListResponseWrapper
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
        kwargs['get_image_list_request_wrapper'] = \
            get_image_list_request_wrapper
        return self.get_image_list_endpoint.call_with_http_info(**kwargs)

    def mod_image(
        self,
        mod_image_request_wrapper,
        **kwargs
    ):
        """mod_image  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.mod_image(mod_image_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            mod_image_request_wrapper (ModImageRequestWrapper):

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
            ModImageResponseWrapper
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
        kwargs['mod_image_request_wrapper'] = \
            mod_image_request_wrapper
        return self.mod_image_endpoint.call_with_http_info(**kwargs)

    def upload_image(
        self,
        upload_image_request_wrapper,
        **kwargs
    ):
        """upload_image  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.upload_image(upload_image_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            upload_image_request_wrapper (UploadImageRequestWrapper):

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
            UploadImageResponseWrapper
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
        kwargs['upload_image_request_wrapper'] = \
            upload_image_request_wrapper
        return self.upload_image_endpoint.call_with_http_info(**kwargs)
