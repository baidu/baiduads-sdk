"""
创建信息流广告示例
"""
from baiduads.adgroupfeed.api import AdgroupFeedService
from baiduads.adgroupfeed.model import AddAdgroupFeedRequestWrapper, AdgroupFeedType, AddAdgroupFeedRequestWrapperBody
from baiduads.campaignfeed.api import CampaignFeedService
from baiduads.campaignfeed.model import AddCampaignFeedRequestWrapper, CampaignFeedType, \
    AddCampaignFeedRequestWrapperBody
from baiduads.common.model import ApiRequestHeader
import logging

from baiduads.creativefeed.api import CreativeFeedService
from baiduads.creativefeed.model import AddCreativeFeedRequestWrapper, AddCreativeFeedRequestWrapperBody, \
    CreativeFeedType

logger = logging.getLogger("CreateFeedAd")
logger.setLevel(logging.INFO)
# set STDOUT
logger.addHandler(logging.StreamHandler())


class CreateFeedAd:
    header = ApiRequestHeader(
        token="xxxxx",
        username="xxxxx",
        password="xxxxx",
        _spec_property_naming=True
    )

    @classmethod
    def add_campaign_feed(cls):
        campaign_feed_service = CampaignFeedService()
        # 构造参数
        campaign_feed_type = CampaignFeedType(
            campaignFeedName="推广计划XX",
            subject=1,
            campaignType=1,
            bgtctltype=0,
            pause=False,
            bstype=1,
            eshopType="1",
            _spec_property_naming=True
        )
        body = AddCampaignFeedRequestWrapperBody(
            campaignFeedTypes=[campaign_feed_type],
            _spec_property_naming=True
        )
        add_campaign_feed_request_wrapper = AddCampaignFeedRequestWrapper(
            header=cls.header,  # 设置请求header
            body=body,  # 设置请求body
            _spec_property_naming=True
        )
        # 调用API
        add_campaign_feed_response_wrapper = campaign_feed_service.add_campaign_feed(add_campaign_feed_request_wrapper)
        # 判断请求是否成功
        if add_campaign_feed_response_wrapper.header.status != 0:
            logger.error("add_campaign_feed fail. errors:%s", add_campaign_feed_response_wrapper.header)
            raise RuntimeError("add_campaign_feed fail.")
        return add_campaign_feed_response_wrapper.body.data

    @classmethod
    def add_adgroup_feed(cls, campaign_feed_id):
        adgroup_feed_service = AdgroupFeedService()
        # 构造参数
        adgroup_feed_type = AdgroupFeedType(
            campaignFeedId=campaign_feed_id,
            adgroupFeedName="推广单元XX",
            pause=False,
            bid=1.100000023841858,
            producttypes=[1],
            ftypes=[1],
            bidtype=1,
            _spec_property_naming=True
        )
        body = AddAdgroupFeedRequestWrapperBody(
            adgroupFeedTypes=[adgroup_feed_type],
            _spec_property_naming=True
        )
        add_adgroup_feed_request_wrapper = AddAdgroupFeedRequestWrapper(
            header=cls.header,  # 设置请求header
            body=body,  # 设置请求body
            _spec_property_naming=True
        )
        # 调用API
        add_adgroup_feed_response_wrapper = adgroup_feed_service.add_adgroup_feed(add_adgroup_feed_request_wrapper)
        # 判断请求是否成功
        if add_adgroup_feed_response_wrapper.header.status != 0:
            logger.error("add_adgroup_feed fail. errors:%s", add_adgroup_feed_response_wrapper.header)
            raise RuntimeError("add_adgroup_feed fail.")
        return add_adgroup_feed_response_wrapper.body.data

    @classmethod
    def add_creative_feed(cls, adgroup_feed_id):
        creative_feed_service = CreativeFeedService()
        # 构造参数
        creative_feed_type = CreativeFeedType(
            adgroupFeedId=adgroup_feed_id,
            materialstyle=101,
            creativeFeedName="创意XX",
            pause=True,
            material="{\"title\":\"测试\",\"brand\":\"11个字符111\",\"us"
                     "erPortrait\":\"https://fc-feed.cdn.bcebos.com/0/p"
                     "ic/b70038ce4be0de17b4f051fda732da8b.jpg\",\"pcUrl"
                     "\":\"http://www.baidu.com\",\"url\":\"http://www"
                     ".baidu.com\",\"pictures\":[{\"image\":\"https://"
                     "aod-image.baidu.com/5/pic/d404a1e0252d81958378253"
                     "ae54d45a1.jpg@s_2,w_370,h_245\"}],\"pictureWidth\""
                     ":\"370\",\"pictureHeight\":\"245\",\"subtitle\""
                     ":\"使用信息流推\",\"monitorUrl\":\"http://www.baid"
                     "u.com/{{CALLBACK_URL}}\",\"exposureUrl\":\"http:/"
                     "/www.baidu.com\",\"naUrl\":\"topen://www.baidu.co"
                     "m&{{DEEPLINK_BACKURL}}\",\"ulkUrl\":\"https://ww"
                     "w.baidu.com\",\"ulkScheme\":\"sing://fdfdfdfxxxx\"}",
            ideaType=0,
            _spec_property_naming=True
        )
        body = AddCreativeFeedRequestWrapperBody(
            creativeFeedTypes=[creative_feed_type],
            _spec_property_naming=True
        )

        add_creative_feed_request_wrapper = AddCreativeFeedRequestWrapper(
            header=cls.header,  # 设置请求header
            body=body,  # 设置请求body
            _spec_property_naming=True
        )
        # 调用API
        add_creative_feed_response_wrapper = creative_feed_service.add_creative_feed(add_creative_feed_request_wrapper)
        # 判断请求是否成功
        if add_creative_feed_response_wrapper.header.status != 0:
            logger.error("add_creative_feed fail. errors:%s", add_creative_feed_response_wrapper.header)
            raise RuntimeError("add_creative_feed fail.")
        return add_creative_feed_response_wrapper.body.data


def main():
    # 第一步：创建计划
    campaign_feed_types = CreateFeedAd.add_campaign_feed()
    logger.info("campaign_feed_types:%s", campaign_feed_types)
    # 获取 campaign_feed_id
    campaign_feed_id = campaign_feed_types[0].campaign_feed_id

    # 第二步：在新建计划下新建单元
    adgroup_feed_types = CreateFeedAd.add_adgroup_feed(campaign_feed_id)
    logger.info("adgroup_feed_types:%s", adgroup_feed_types)
    # 获取 adgroup_feed_id
    adgroup_feed_id = adgroup_feed_types[0].adgroup_feed_id

    # 第三步：在新建单元下新建创意
    creative_feed_types = CreateFeedAd.add_creative_feed(adgroup_feed_id)
    logger.info("creative_feed_types:%s", creative_feed_types)


if __name__ == '__main__':
    main()
