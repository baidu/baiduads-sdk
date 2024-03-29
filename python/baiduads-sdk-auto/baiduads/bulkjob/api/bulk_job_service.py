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
from baiduads.bulkjob.model.cancel_download_request_wrapper import CancelDownloadRequestWrapper
from baiduads.bulkjob.model.cancel_download_response_wrapper import CancelDownloadResponseWrapper
from baiduads.bulkjob.model.get_all_changed_objects_request_wrapper import GetAllChangedObjectsRequestWrapper
from baiduads.bulkjob.model.get_all_changed_objects_response_wrapper import GetAllChangedObjectsResponseWrapper
from baiduads.bulkjob.model.get_all_objects_request_wrapper import GetAllObjectsRequestWrapper
from baiduads.bulkjob.model.get_all_objects_response_wrapper import GetAllObjectsResponseWrapper
from baiduads.bulkjob.model.get_changed_item_id_request_wrapper import GetChangedItemIdRequestWrapper
from baiduads.bulkjob.model.get_changed_item_id_response_wrapper import GetChangedItemIdResponseWrapper
from baiduads.bulkjob.model.get_changed_scale_request_wrapper import GetChangedScaleRequestWrapper
from baiduads.bulkjob.model.get_changed_scale_response_wrapper import GetChangedScaleResponseWrapper
from baiduads.bulkjob.model.get_file_path_request_wrapper import GetFilePathRequestWrapper
from baiduads.bulkjob.model.get_file_path_response_wrapper import GetFilePathResponseWrapper
from baiduads.bulkjob.model.get_file_status_request_wrapper import GetFileStatusRequestWrapper
from baiduads.bulkjob.model.get_file_status_response_wrapper import GetFileStatusResponseWrapper


class BulkJobService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.cancel_download_endpoint = _Endpoint(
            settings={
                'response_type': (CancelDownloadResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/BulkJobService/cancelDownload',
                'operation_id': 'cancel_download',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'cancel_download_request_wrapper',
                ],
                'required': [
                    'cancel_download_request_wrapper',
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
                    'cancel_download_request_wrapper':
                        (CancelDownloadRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'cancel_download_request_wrapper': 'body',
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
        self.get_all_changed_objects_endpoint = _Endpoint(
            settings={
                'response_type': (GetAllChangedObjectsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/BulkJobService/getAllChangedObjects',
                'operation_id': 'get_all_changed_objects',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_all_changed_objects_request_wrapper',
                ],
                'required': [
                    'get_all_changed_objects_request_wrapper',
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
                    'get_all_changed_objects_request_wrapper':
                        (GetAllChangedObjectsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_all_changed_objects_request_wrapper': 'body',
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
        self.get_all_objects_endpoint = _Endpoint(
            settings={
                'response_type': (GetAllObjectsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/BulkJobService/getAllObjects',
                'operation_id': 'get_all_objects',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_all_objects_request_wrapper',
                ],
                'required': [
                    'get_all_objects_request_wrapper',
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
                    'get_all_objects_request_wrapper':
                        (GetAllObjectsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_all_objects_request_wrapper': 'body',
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
        self.get_changed_item_id_endpoint = _Endpoint(
            settings={
                'response_type': (GetChangedItemIdResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/BulkJobService/getChangedItemId',
                'operation_id': 'get_changed_item_id',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_changed_item_id_request_wrapper',
                ],
                'required': [
                    'get_changed_item_id_request_wrapper',
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
                    'get_changed_item_id_request_wrapper':
                        (GetChangedItemIdRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_changed_item_id_request_wrapper': 'body',
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
        self.get_changed_scale_endpoint = _Endpoint(
            settings={
                'response_type': (GetChangedScaleResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/BulkJobService/getChangedScale',
                'operation_id': 'get_changed_scale',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_changed_scale_request_wrapper',
                ],
                'required': [
                    'get_changed_scale_request_wrapper',
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
                    'get_changed_scale_request_wrapper':
                        (GetChangedScaleRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_changed_scale_request_wrapper': 'body',
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
        self.get_file_path_endpoint = _Endpoint(
            settings={
                'response_type': (GetFilePathResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/BulkJobService/getFilePath',
                'operation_id': 'get_file_path',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_file_path_request_wrapper',
                ],
                'required': [
                    'get_file_path_request_wrapper',
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
                    'get_file_path_request_wrapper':
                        (GetFilePathRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_file_path_request_wrapper': 'body',
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
        self.get_file_status_endpoint = _Endpoint(
            settings={
                'response_type': (GetFileStatusResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/BulkJobService/getFileStatus',
                'operation_id': 'get_file_status',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_file_status_request_wrapper',
                ],
                'required': [
                    'get_file_status_request_wrapper',
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
                    'get_file_status_request_wrapper':
                        (GetFileStatusRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_file_status_request_wrapper': 'body',
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

    def cancel_download(
        self,
        cancel_download_request_wrapper,
        **kwargs
    ):
        """cancel_download  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.cancel_download(cancel_download_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            cancel_download_request_wrapper (CancelDownloadRequestWrapper):

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
            CancelDownloadResponseWrapper
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
        kwargs['cancel_download_request_wrapper'] = \
            cancel_download_request_wrapper
        return self.cancel_download_endpoint.call_with_http_info(**kwargs)

    def get_all_changed_objects(
        self,
        get_all_changed_objects_request_wrapper,
        **kwargs
    ):
        """get_all_changed_objects  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_all_changed_objects(get_all_changed_objects_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_all_changed_objects_request_wrapper (GetAllChangedObjectsRequestWrapper):

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
            GetAllChangedObjectsResponseWrapper
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
        kwargs['get_all_changed_objects_request_wrapper'] = \
            get_all_changed_objects_request_wrapper
        return self.get_all_changed_objects_endpoint.call_with_http_info(**kwargs)

    def get_all_objects(
        self,
        get_all_objects_request_wrapper,
        **kwargs
    ):
        """get_all_objects  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_all_objects(get_all_objects_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_all_objects_request_wrapper (GetAllObjectsRequestWrapper):

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
            GetAllObjectsResponseWrapper
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
        kwargs['get_all_objects_request_wrapper'] = \
            get_all_objects_request_wrapper
        return self.get_all_objects_endpoint.call_with_http_info(**kwargs)

    def get_changed_item_id(
        self,
        get_changed_item_id_request_wrapper,
        **kwargs
    ):
        """get_changed_item_id  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_changed_item_id(get_changed_item_id_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_changed_item_id_request_wrapper (GetChangedItemIdRequestWrapper):

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
            GetChangedItemIdResponseWrapper
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
        kwargs['get_changed_item_id_request_wrapper'] = \
            get_changed_item_id_request_wrapper
        return self.get_changed_item_id_endpoint.call_with_http_info(**kwargs)

    def get_changed_scale(
        self,
        get_changed_scale_request_wrapper,
        **kwargs
    ):
        """get_changed_scale  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_changed_scale(get_changed_scale_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_changed_scale_request_wrapper (GetChangedScaleRequestWrapper):

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
            GetChangedScaleResponseWrapper
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
        kwargs['get_changed_scale_request_wrapper'] = \
            get_changed_scale_request_wrapper
        return self.get_changed_scale_endpoint.call_with_http_info(**kwargs)

    def get_file_path(
        self,
        get_file_path_request_wrapper,
        **kwargs
    ):
        """get_file_path  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_file_path(get_file_path_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_file_path_request_wrapper (GetFilePathRequestWrapper):

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
            GetFilePathResponseWrapper
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
        kwargs['get_file_path_request_wrapper'] = \
            get_file_path_request_wrapper
        return self.get_file_path_endpoint.call_with_http_info(**kwargs)

    def get_file_status(
        self,
        get_file_status_request_wrapper,
        **kwargs
    ):
        """get_file_status  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_file_status(get_file_status_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_file_status_request_wrapper (GetFileStatusRequestWrapper):

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
            GetFileStatusResponseWrapper
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
        kwargs['get_file_status_request_wrapper'] = \
            get_file_status_request_wrapper
        return self.get_file_status_endpoint.call_with_http_info(**kwargs)

