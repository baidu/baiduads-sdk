# baiduads-sdk

该项目为百度商业API SDK的Java实现。 包含两个模块：

* baiduads-sdk：手动开发的sdk部分
* baiduads-sdk-auto: 自动生成的sdk部分

## 快速开始

### 环境要求

1. Java 1.8+
2. Maven 3.5+

### 源码构建

```shell
mvn clean install
```

### maven使用

添加依赖：

```xml
<dependency>
  <groupId>com.baidu.dev2</groupId>
  <artifactId>baiduads-sdk</artifactId>
  <version>${version}</version>
</dependency>
```
最新版本![Maven](https://img.shields.io/maven-central/v/com.baidu.dev2/baiduads-sdk.svg)


## 使用方式

以api: `/json/sms/service/AccountService/getAccountInfo` 为例：

[AccountSerivce接口文档](https://dev2.baidu.com/content?sceneType=0&pageId=100256&nodeId=63&subhead=)
```java
/**
 * API tests for AccountService
 */
public class AccountServiceTest {

    private final AccountService api = new AccountService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountInfoTest() throws ApiException {
        // init header
        ApiRequestHeader requestHeader = new ApiRequestHeader();
        requestHeader.setUsername("********");
        requestHeader.setPassword("********");
        requestHeader.setToken("****************");

        // init request body
        ApiAccountQueryRequest request = new ApiAccountQueryRequest();
        List<String> accountFields = new ArrayList<>();
        accountFields.add("pictureOptimizeSegmentStatus");
        request.setAccountFields(accountFields);

        // init request wrapper
        GetAccountInfoRequestWrapper requestWrapper = new GetAccountInfoRequestWrapper();
        requestWrapper.setHeader(requestHeader);
        requestWrapper.setBody(request);


        GetAccountInfoResponseWrapper response = api.getAccountInfo(requestWrapper);

        Assert.assertTrue(response.getHeader().getStatus() == 0);

    }
}
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
