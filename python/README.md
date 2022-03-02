# baiduads-sdk

该模块为百度商业API SDK的Python实现。 包含两个模块：

* baiduads-sdk：手动开发的sdk部分
* baiduads-sdk-auto: 自动生成的sdk部分

## 快速开始

### 环境要求

Python >= 3.6

### 源码构建

```shell
python setup.py install 
```

### PIPY使用

```shell
pip install baiduads-sdk
```


## 使用方式

以api: `/json/sms/service/AccountService/getAccountInfo` 为例：

[AccountSerivce接口文档](https://dev2.baidu.com/content?sceneType=0&pageId=100256&nodeId=63&subhead=)

```python

class TestAccountService(unittest.TestCase):
    """AccountService unit test stubs"""

    def setUp(self):
        self.api = AccountService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_account_info(self):
        # init header
        api_header = ApiRequestHeader(username="********",
                                      password="********",
                                      token="****************",
                                      _spec_property_naming=True)
        # init request
        get_account_req = ApiAccountQueryRequest(accountFields=["pictureOptimizeSegmentStatus"],
                                                 _spec_property_naming=True)

        # init request wrapper
        req_wrapper = GetAccountInfoRequestWrapper(header=api_header,
                                                   body=get_account_req,
                                                   _spec_property_naming=True)
        resp_wrapper = self.api.get_account_info(req_wrapper)
        assert resp_wrapper.header.status == 0


```

### 认证

[申请权限](https://dev2.baidu.com/content?sceneType=0&pageId=100369&nodeId=16&subhead=%E7%AC%AC%201%20%E6%AD%A5%EF%BC%9A%E9%80%89%E6%8B%A9%E5%90%88%E9%80%82%E7%9A%84API%E6%9D%83%E9%99%90)

[权限认证](https://dev2.baidu.com/content?sceneType=0&pageId=100141&nodeId=254&subhead=%E8%AF%B7%E6%B1%82%E6%A0%BC%E5%BC%8F)

### API 示例

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampaignFeedService* | [**addCampaignFeed**](docs/CampaignFeedService.md#addCampaignFeed) | **POST** /json/feed/v1/CampaignFeedService/addCampaignFeed | 
*CampaignFeedService* | [**deleteCampaignFeed**](docs/CampaignFeedService.md#deleteCampaignFeed) | **POST** /json/feed/v1/CampaignFeedService/deleteCampaignFeed | 
*CampaignFeedService* | [**getCampaignFeed**](docs/CampaignFeedService.md#getCampaignFeed) | **POST** /json/feed/v1/CampaignFeedService/getCampaignFeed | 
*CampaignFeedService* | [**updateCampaignFeed**](docs/CampaignFeedService.md#updateCampaignFeed) | **POST** /json/feed/v1/CampaignFeedService/updateCampaignFeed | 


## 讨论

百度如流讨论群：5995216