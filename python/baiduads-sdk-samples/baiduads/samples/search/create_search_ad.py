"""
创建搜索广告示例
"""
import logging

from baiduads.adgroup.api import AdgroupService
from baiduads.adgroup.model import AddAdgroupRequestWrapper, ApiAdgroupAddRequest, ApiAdgroupType
from baiduads.campaign.api import CampaignService
from baiduads.campaign.model import AddCampaignRequestWrapper, ApiCampaignAddRequest, ApiCampaignType, ApiScheduleType, \
    SchedulePriceFactor, RegionPriceFactor
from baiduads.common.model import ApiRequestHeader
from baiduads.creative.api import CreativeService
from baiduads.creative.model import AddCreativeRequestWrapper, ApiCreativeAddRequest, ApiCreativeType
from baiduads.keyword.api import KeywordService
from baiduads.keyword.model import AddWordRequestWrapper, ApiKeywordAddRequest, ApiKeywordType

logger = logging.getLogger("CreateSearchAd")
logger.setLevel(logging.INFO)
# set STDOUT
logger.addHandler(logging.StreamHandler())


class CreateSearchAd:
    header = ApiRequestHeader(
        token="xxxxx",
        username="xxxxx",
        password="xxxxx",
        _spec_property_naming=True
    )

    @classmethod
    def add_campaign(cls):
        campaign_service = CampaignService()
        # 构造参数
        schedule = ApiScheduleType(
            startHour=10,
            endHour=12,
            weekDay=6,
            _spec_property_naming=True
        )

        region_price_factor = RegionPriceFactor(
            regionId=1000,
            priceFactor=8.8,
            _spec_property_naming=True
        )

        schedule_price_factor = SchedulePriceFactor(
            timeId=123,
            priceFactor=6.6,
            _spec_property_naming=True
        )

        campaign_type = ApiCampaignType(
            campaignName="xx计划名称",
            budget=50.0,
            regionTarget=[1000, 4085],
            negativeWords=["短语否词1", "短语否词2"],
            exactNegativeWords=["精确否词1", "精确否词2"],
            schedule=[schedule],
            pause=True,
            priceRatio=2.0,
            bidPrefer=1,
            adType=0,
            businessPointId=123456789,
            regionPriceFactor=[region_price_factor],
            schedulePriceFactors=[schedule_price_factor],
            marketingTargetId=0,
            _spec_property_naming=True
        )
        api_campaign_add_request = ApiCampaignAddRequest(
            adType=0,
            campaignTypes=[campaign_type],
            _spec_property_naming=True
        )
        add_campaign_request_wrapper = AddCampaignRequestWrapper(
            header=cls.header,  # 设置请求header
            body=api_campaign_add_request,  # 设置请求body
            _spec_property_naming=True
        )
        # 调用API
        add_campaign_response_wrapper = campaign_service.add_campaign(add_campaign_request_wrapper)
        # 判断请求是否成功
        if add_campaign_response_wrapper.header.status != 0:
            logger.error("add_campaign fail. errors:%s", add_campaign_response_wrapper.header)
            raise RuntimeError("add_campaign fail.")
        return add_campaign_response_wrapper.body.data

    @classmethod
    def add_adgroup(cls, campaign_id):
        adgroup_service = AdgroupService()
        # 构造参数
        api_adgroup_type = ApiAdgroupType(
            campaignId=campaign_id,
            adgroupName="xx单元名称",
            maxPrice=6.8,
            pause=True,
            negativeWords=["短语否词1", "短语否词2"],
            exactNegativeWords=["精确否词1", "精确否词2"],
            priceRatio=5.0,
            segmentRecommendStatus=0,
            _spec_property_naming=True
        )

        api_adgroup_add_request = ApiAdgroupAddRequest(
            adgroupTypes=[api_adgroup_type],
            _spec_property_naming=True
        )
        add_adgroup_request_wrapper = AddAdgroupRequestWrapper(
            header=cls.header,
            body=api_adgroup_add_request,
            _spec_property_naming=True
        )
        add_adgroup_response_wrapper = adgroup_service.add_adgroup(add_adgroup_request_wrapper)
        if add_adgroup_response_wrapper.header.status != 0:
            logger.error("add_adgroup fail. error:%s", add_adgroup_response_wrapper.header)
            raise RuntimeError("add_adgroup fail.")
        return add_adgroup_response_wrapper.body.data

    @classmethod
    def add_creative(cls, campaign_id, adgroup_id):
        creative_service = CreativeService()
        # 构造参数
        api_creative_type = ApiCreativeType(
            campaignId=campaign_id,
            adgroupId=adgroup_id,
            title="xx创意标题",
            description1="针对数据不完整情况,我们有成熟的解决方案,让{数据}完整恢复",
            description2="恢复成功才收费{中毒}数据恢复值得信赖",
            mobileDestinationUrl="https://aisite.wejianzhan.com/site/abcd.com/46aa6sssd1b-d206-4dfc-999a-7b8b487aab5d",
            mobileDisplayUrl="abcd.com",
            pcDestinationUrl="https://aisite.wejianzhan.com/site/abcd.com/46aa6sssd1b-d206-4dfc-999a-7b8b487aab5d",
            pcDisplayUrl="abcd.com",
            tabs=[1]
        )

        api_creative_request = ApiCreativeAddRequest(
            creativeTypes=[api_creative_type],
            _spec_property_naming=True
        )
        add_creative_request_wrapper = AddCreativeRequestWrapper(
            header=cls.header,  # 设置请求header
            body=api_creative_request,  # 设置请求body
            _spec_property_naming=True
        )
        # 调用API
        add_creative_response_wrapper = creative_service.add_creative(add_creative_request_wrapper)
        # 判断请求是否成功
        if add_creative_response_wrapper.header.status != 0:
            logger.error("add_creative fail. errors:%s", add_creative_response_wrapper.header)
            raise RuntimeError("add_creative fail.")
        return add_creative_response_wrapper.body.data

    @classmethod
    def add_word(cls, adgroup_id):
        keyword_service = KeywordService()
        # 构造参数
        api_keyword_type = ApiKeywordType(
            adgroupId=adgroup_id,
            keyword="xx关键词名称",
            price=9.8,
            matchType=2,
            phraseType=3,
            pause=True,
            tabs=[1, 31],
            pcDestinationUrl="https://aisite.wejianzhan.com/site/abcd.com/46aasd1b-d206-4dfc-999a-7b8b487aab",
            mobileDestinationUrl="https://aisite.wejianzhan.com/site/abcd.com/46aasd1b-d206-4dfc-999a-7b8b487aab",
            _spec_property_naming=True
        )
        api_keyword_add_request = ApiKeywordAddRequest(
            keywordTypes=[api_keyword_type],
            _spec_property_naming=True
        )
        add_word_request_wrapper = AddWordRequestWrapper(
            header=cls.header,  # 设置请求header
            body=api_keyword_add_request,  # 设置请求body
            _spec_property_naming=True
        )
        # 调用API
        add_word_response_wrapper = keyword_service.add_word(add_word_request_wrapper)
        # 判断请求是否成功
        if add_word_response_wrapper.header.status != 0:
            logger.error("add_word fail. errors:%s", add_word_response_wrapper.header)
            raise RuntimeError("add_word fail.")
        return add_word_response_wrapper.body.data


def main():
    # 第一步：新建计划
    api_campaign_types = CreateSearchAd.add_campaign()
    logger.info("api_campaign_types:%s", api_campaign_types)
    # 获取campaignId
    campaign_id = api_campaign_types[0].campaign_id

    # 第二步：新建单元
    api_adgroup_types = CreateSearchAd.add_adgroup(campaign_id)
    logger.info("api_adgroup_types:%s", api_adgroup_types)
    # 获取adgroup_id
    adgroup_id = api_adgroup_types[0].adgroup_id

    # 第三步：在单元下添加创意
    api_creative_types = CreateSearchAd.add_creative(campaign_id, adgroup_id)
    logger.info("api_creative_types:%s", api_creative_types)

    # 第四步：在单元下添加关键词
    api_keyword_types = CreateSearchAd.add_word(adgroup_id)
    logger.info("api_keyword_types:%s", api_keyword_types)


if __name__ == '__main__':
    main()
