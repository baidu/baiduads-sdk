"""
SDK指南 演示代码
"""
from baiduads import Configuration, ApiClient
from baiduads.account.api import AccountService
from baiduads.account.model import ApiAccountQueryRequest, GetAccountInfoRequestWrapper
from baiduads.common.model import ApiRequestHeader


def main():
    # init service
    account_service = AccountService()

    # init request header
    request_header = ApiRequestHeader(
        token="xxxxx",
        username="xxxxx",
        password="xxxxx",
        _spec_property_naming=True
    )

    # init request
    account_query_request = ApiAccountQueryRequest(
        accountFields=["pictureOptimizeSegmentStatus", "balance", "userLevel"],
        _spec_property_naming=True
    )

    # init request wrapper
    request_wrapper = GetAccountInfoRequestWrapper(
        header=request_header,
        body=account_query_request
    )
    response_wrapper = account_service.get_account_info(request_wrapper)
    print(response_wrapper)


if __name__ == '__main__':
    main()
