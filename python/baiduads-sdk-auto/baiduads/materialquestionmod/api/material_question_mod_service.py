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
from baiduads.materialquestionmod.model.add_question_request_wrapper import AddQuestionRequestWrapper
from baiduads.materialquestionmod.model.add_question_response_wrapper import AddQuestionResponseWrapper
from baiduads.materialquestionmod.model.delete_question_request_wrapper import DeleteQuestionRequestWrapper
from baiduads.materialquestionmod.model.delete_question_response_wrapper import DeleteQuestionResponseWrapper
from baiduads.materialquestionmod.model.update_category_request_wrapper import UpdateCategoryRequestWrapper
from baiduads.materialquestionmod.model.update_category_response_wrapper import UpdateCategoryResponseWrapper
from baiduads.materialquestionmod.model.update_putaway_request_wrapper import UpdatePutawayRequestWrapper
from baiduads.materialquestionmod.model.update_putaway_response_wrapper import UpdatePutawayResponseWrapper
from baiduads.materialquestionmod.model.update_question_request_wrapper import UpdateQuestionRequestWrapper
from baiduads.materialquestionmod.model.update_question_response_wrapper import UpdateQuestionResponseWrapper
from baiduads.materialquestionmod.model.update_rank_request_wrapper import UpdateRankRequestWrapper
from baiduads.materialquestionmod.model.update_rank_response_wrapper import UpdateRankResponseWrapper


class MaterialQuestionModService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_question_endpoint = _Endpoint(
            settings={
                'response_type': (AddQuestionResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialQuestionModService/addQuestion',
                'operation_id': 'add_question',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_question_request_wrapper',
                ],
                'required': [
                    'add_question_request_wrapper',
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
                    'add_question_request_wrapper':
                        (AddQuestionRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_question_request_wrapper': 'body',
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
        self.delete_question_endpoint = _Endpoint(
            settings={
                'response_type': (DeleteQuestionResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialQuestionModService/deleteQuestion',
                'operation_id': 'delete_question',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'delete_question_request_wrapper',
                ],
                'required': [
                    'delete_question_request_wrapper',
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
                    'delete_question_request_wrapper':
                        (DeleteQuestionRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'delete_question_request_wrapper': 'body',
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
        self.update_category_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateCategoryResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialQuestionModService/updateCategory',
                'operation_id': 'update_category',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_category_request_wrapper',
                ],
                'required': [
                    'update_category_request_wrapper',
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
                    'update_category_request_wrapper':
                        (UpdateCategoryRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_category_request_wrapper': 'body',
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
        self.update_putaway_endpoint = _Endpoint(
            settings={
                'response_type': (UpdatePutawayResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialQuestionModService/updatePutaway',
                'operation_id': 'update_putaway',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_putaway_request_wrapper',
                ],
                'required': [
                    'update_putaway_request_wrapper',
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
                    'update_putaway_request_wrapper':
                        (UpdatePutawayRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_putaway_request_wrapper': 'body',
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
        self.update_question_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateQuestionResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialQuestionModService/updateQuestion',
                'operation_id': 'update_question',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_question_request_wrapper',
                ],
                'required': [
                    'update_question_request_wrapper',
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
                    'update_question_request_wrapper':
                        (UpdateQuestionRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_question_request_wrapper': 'body',
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
        self.update_rank_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateRankResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/MaterialQuestionModService/updateRank',
                'operation_id': 'update_rank',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_rank_request_wrapper',
                ],
                'required': [
                    'update_rank_request_wrapper',
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
                    'update_rank_request_wrapper':
                        (UpdateRankRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_rank_request_wrapper': 'body',
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

    def add_question(
        self,
        add_question_request_wrapper,
        **kwargs
    ):
        """add_question  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_question(add_question_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_question_request_wrapper (AddQuestionRequestWrapper):

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
            AddQuestionResponseWrapper
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
        kwargs['add_question_request_wrapper'] = \
            add_question_request_wrapper
        return self.add_question_endpoint.call_with_http_info(**kwargs)

    def delete_question(
        self,
        delete_question_request_wrapper,
        **kwargs
    ):
        """delete_question  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_question(delete_question_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            delete_question_request_wrapper (DeleteQuestionRequestWrapper):

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
            DeleteQuestionResponseWrapper
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
        kwargs['delete_question_request_wrapper'] = \
            delete_question_request_wrapper
        return self.delete_question_endpoint.call_with_http_info(**kwargs)

    def update_category(
        self,
        update_category_request_wrapper,
        **kwargs
    ):
        """update_category  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_category(update_category_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_category_request_wrapper (UpdateCategoryRequestWrapper):

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
            UpdateCategoryResponseWrapper
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
        kwargs['update_category_request_wrapper'] = \
            update_category_request_wrapper
        return self.update_category_endpoint.call_with_http_info(**kwargs)

    def update_putaway(
        self,
        update_putaway_request_wrapper,
        **kwargs
    ):
        """update_putaway  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_putaway(update_putaway_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_putaway_request_wrapper (UpdatePutawayRequestWrapper):

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
            UpdatePutawayResponseWrapper
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
        kwargs['update_putaway_request_wrapper'] = \
            update_putaway_request_wrapper
        return self.update_putaway_endpoint.call_with_http_info(**kwargs)

    def update_question(
        self,
        update_question_request_wrapper,
        **kwargs
    ):
        """update_question  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_question(update_question_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_question_request_wrapper (UpdateQuestionRequestWrapper):

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
            UpdateQuestionResponseWrapper
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
        kwargs['update_question_request_wrapper'] = \
            update_question_request_wrapper
        return self.update_question_endpoint.call_with_http_info(**kwargs)

    def update_rank(
        self,
        update_rank_request_wrapper,
        **kwargs
    ):
        """update_rank  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_rank(update_rank_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_rank_request_wrapper (UpdateRankRequestWrapper):

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
            UpdateRankResponseWrapper
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
        kwargs['update_rank_request_wrapper'] = \
            update_rank_request_wrapper
        return self.update_rank_endpoint.call_with_http_info(**kwargs)
