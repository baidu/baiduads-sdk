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
from baiduads.negativeword.model.get_duplicate_negative_words_request_wrapper import GetDuplicateNegativeWordsRequestWrapper
from baiduads.negativeword.model.get_duplicate_negative_words_response_wrapper import GetDuplicateNegativeWordsResponseWrapper
from baiduads.negativeword.model.update_adgroup_negative_words_request_wrapper import UpdateAdgroupNegativeWordsRequestWrapper
from baiduads.negativeword.model.update_adgroup_negative_words_response_wrapper import UpdateAdgroupNegativeWordsResponseWrapper
from baiduads.negativeword.model.update_adgroup_negative_words_sync_request_wrapper import UpdateAdgroupNegativeWordsSyncRequestWrapper
from baiduads.negativeword.model.update_adgroup_negative_words_sync_response_wrapper import UpdateAdgroupNegativeWordsSyncResponseWrapper
from baiduads.negativeword.model.update_campaign_negative_words_sync_request_wrapper import UpdateCampaignNegativeWordsSyncRequestWrapper
from baiduads.negativeword.model.update_campaign_negative_words_sync_response_wrapper import UpdateCampaignNegativeWordsSyncResponseWrapper


class NegativeWordService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_duplicate_negative_words_endpoint = _Endpoint(
            settings={
                'response_type': (GetDuplicateNegativeWordsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/NegativeWordService/getDuplicateNegativeWords',
                'operation_id': 'get_duplicate_negative_words',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_duplicate_negative_words_request_wrapper',
                ],
                'required': [
                    'get_duplicate_negative_words_request_wrapper',
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
                    'get_duplicate_negative_words_request_wrapper':
                        (GetDuplicateNegativeWordsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_duplicate_negative_words_request_wrapper': 'body',
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
        self.update_adgroup_negative_words_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateAdgroupNegativeWordsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/NegativeWordService/updateAdgroupNegativeWords',
                'operation_id': 'update_adgroup_negative_words',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_adgroup_negative_words_request_wrapper',
                ],
                'required': [
                    'update_adgroup_negative_words_request_wrapper',
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
                    'update_adgroup_negative_words_request_wrapper':
                        (UpdateAdgroupNegativeWordsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_adgroup_negative_words_request_wrapper': 'body',
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
        self.update_adgroup_negative_words_sync_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateAdgroupNegativeWordsSyncResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/NegativeWordService/updateAdgroupNegativeWordsSync',
                'operation_id': 'update_adgroup_negative_words_sync',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_adgroup_negative_words_sync_request_wrapper',
                ],
                'required': [
                    'update_adgroup_negative_words_sync_request_wrapper',
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
                    'update_adgroup_negative_words_sync_request_wrapper':
                        (UpdateAdgroupNegativeWordsSyncRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_adgroup_negative_words_sync_request_wrapper': 'body',
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
        self.update_campaign_negative_words_sync_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateCampaignNegativeWordsSyncResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/NegativeWordService/updateCampaignNegativeWordsSync',
                'operation_id': 'update_campaign_negative_words_sync',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_campaign_negative_words_sync_request_wrapper',
                ],
                'required': [
                    'update_campaign_negative_words_sync_request_wrapper',
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
                    'update_campaign_negative_words_sync_request_wrapper':
                        (UpdateCampaignNegativeWordsSyncRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_campaign_negative_words_sync_request_wrapper': 'body',
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

    def get_duplicate_negative_words(
        self,
        get_duplicate_negative_words_request_wrapper,
        **kwargs
    ):
        """get_duplicate_negative_words  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_duplicate_negative_words(get_duplicate_negative_words_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_duplicate_negative_words_request_wrapper (GetDuplicateNegativeWordsRequestWrapper):

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
            GetDuplicateNegativeWordsResponseWrapper
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
        kwargs['get_duplicate_negative_words_request_wrapper'] = \
            get_duplicate_negative_words_request_wrapper
        return self.get_duplicate_negative_words_endpoint.call_with_http_info(**kwargs)

    def update_adgroup_negative_words(
        self,
        update_adgroup_negative_words_request_wrapper,
        **kwargs
    ):
        """update_adgroup_negative_words  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_adgroup_negative_words(update_adgroup_negative_words_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_adgroup_negative_words_request_wrapper (UpdateAdgroupNegativeWordsRequestWrapper):

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
            UpdateAdgroupNegativeWordsResponseWrapper
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
        kwargs['update_adgroup_negative_words_request_wrapper'] = \
            update_adgroup_negative_words_request_wrapper
        return self.update_adgroup_negative_words_endpoint.call_with_http_info(**kwargs)

    def update_adgroup_negative_words_sync(
        self,
        update_adgroup_negative_words_sync_request_wrapper,
        **kwargs
    ):
        """update_adgroup_negative_words_sync  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_adgroup_negative_words_sync(update_adgroup_negative_words_sync_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_adgroup_negative_words_sync_request_wrapper (UpdateAdgroupNegativeWordsSyncRequestWrapper):

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
            UpdateAdgroupNegativeWordsSyncResponseWrapper
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
        kwargs['update_adgroup_negative_words_sync_request_wrapper'] = \
            update_adgroup_negative_words_sync_request_wrapper
        return self.update_adgroup_negative_words_sync_endpoint.call_with_http_info(**kwargs)

    def update_campaign_negative_words_sync(
        self,
        update_campaign_negative_words_sync_request_wrapper,
        **kwargs
    ):
        """update_campaign_negative_words_sync  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_campaign_negative_words_sync(update_campaign_negative_words_sync_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_campaign_negative_words_sync_request_wrapper (UpdateCampaignNegativeWordsSyncRequestWrapper):

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
            UpdateCampaignNegativeWordsSyncResponseWrapper
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
        kwargs['update_campaign_negative_words_sync_request_wrapper'] = \
            update_campaign_negative_words_sync_request_wrapper
        return self.update_campaign_negative_words_sync_endpoint.call_with_http_info(**kwargs)
