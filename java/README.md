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
sh build.sh
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
<font color=red>备注：请在Maven仓库上找最新的版本。</font>


## 使用方式

以api: `/json/sms/service/AccountService/getAccountInfo` 为例：

[AccountSerivce接口文档](https://dev2.baidu.com/content?sceneType=0&pageId=100256&nodeId=63&subhead=)
```java
/**
 * API tests for AccountService
 */
public class AccountServiceTest {
    
    private static String appId = "{appId}";
    
    private static Long userId = 0L; // {userId}
    
    private static String authCode = "{authCode}";
    
    private static String secretKey = "{secretKey}";

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountInfoTest() throws ApiException {
        // get accessToken
        OAuthService oAuthService = new OAuthService();
        GetAccessTokenRequest request = new GetAccessTokenRequest();
        request.setAppId(appId);
        request.setUserId(userId);
        request.setAuthCode(authCode);
        request.setSecretKey(secretKey);
        GetAccessTokenResponse response = oAuthService.getAccessToken(request);
        String accessToken = response.getData().getAccessToken();

        // init service
        AccountService accountService = new AccountService();
        // init request header
        ApiRequestHeader requestHeader = new ApiRequestHeader();
        // set oauth info
        requestHeader.setUserName("{userName}");
        requestHeader.setAccessToken(accessToken);

        // init request
        ApiAccountQueryRequest queryRequest = new ApiAccountQueryRequest();
        ArrayList<String> fields = new ArrayList<>();
        fields.add("pictureOptimizeSegmentStatus");
        fields.add("balance");
        fields.add("userLevel");
        queryRequest.setAccountFields(fields);

        // init requster wrapper
        GetAccountInfoRequestWrapper requestWrapper = new GetAccountInfoRequestWrapper();
        requestWrapper.setHeader(requestHeader);
        requestWrapper.setBody(queryRequest);

        GetAccountInfoResponseWrapper responseWrapper = accountService.getAccountInfo(requestWrapper);
        Assert.assertTrue(responseWrapper.getHeader().getStatus() == 0);

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
