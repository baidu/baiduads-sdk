package com.baidu.dev2.api.samples.search;

import com.baidu.dev2.api.sdk.adgroup.api.AdgroupService;
import com.baidu.dev2.api.sdk.adgroup.model.AddAdgroupRequestWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.AddAdgroupResponseWrapper;
import com.baidu.dev2.api.sdk.adgroup.model.ApiAdgroupAddRequest;
import com.baidu.dev2.api.sdk.adgroup.model.ApiAdgroupType;
import com.baidu.dev2.api.sdk.campaign.api.CampaignService;
import com.baidu.dev2.api.sdk.campaign.model.AddCampaignRequestWrapper;
import com.baidu.dev2.api.sdk.campaign.model.AddCampaignResponseWrapper;
import com.baidu.dev2.api.sdk.campaign.model.ApiCampaignAddRequest;
import com.baidu.dev2.api.sdk.campaign.model.ApiCampaignType;
import com.baidu.dev2.api.sdk.campaign.model.ApiScheduleType;
import com.baidu.dev2.api.sdk.campaign.model.RegionPriceFactor;
import com.baidu.dev2.api.sdk.campaign.model.SchedulePriceFactor;
import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.creative.api.CreativeService;
import com.baidu.dev2.api.sdk.creative.model.AddCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.creative.model.AddCreativeResponseWrapper;
import com.baidu.dev2.api.sdk.creative.model.ApiCreativeAddRequest;
import com.baidu.dev2.api.sdk.creative.model.ApiCreativeType;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.keyword.api.KeywordService;
import com.baidu.dev2.api.sdk.keyword.model.AddWordRequestWrapper;
import com.baidu.dev2.api.sdk.keyword.model.AddWordResponseWrapper;
import com.baidu.dev2.api.sdk.keyword.model.ApiKeywordAddRequest;
import com.baidu.dev2.api.sdk.keyword.model.ApiKeywordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建搜索广告示例
 */
public class CreateSearchAd {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateSearchAd.class);

    private static ApiRequestHeader header;

    static {
        header = new ApiRequestHeader();
        header.setPassword("xxxxx");
        header.setUsername("xxxxx");
        header.setToken("xxxxx");
    }

    /**
     * 新建计划
     *
     * @return
     * @throws ApiException
     */
    private static List<ApiCampaignType> addCampaign() throws ApiException {
        CampaignService campaignService = new CampaignService();
        AddCampaignRequestWrapper addCampaignRequestWrapper = new AddCampaignRequestWrapper();
        // 设置请求header
        addCampaignRequestWrapper.setHeader(header);
        //  构造请求参数
        ApiCampaignAddRequest apiCampaignAddRequest = new ApiCampaignAddRequest();
        apiCampaignAddRequest.setAdType(0);
        List<ApiCampaignType> campaignTypes = new ArrayList<>();
        ApiCampaignType apiCampaignType = new ApiCampaignType();
        apiCampaignType.setCampaignName("xx计划名称");
        apiCampaignType.budget(50.0);
        // 设置计划推广地域
        List<Integer> regionTarget = new ArrayList<>();
        regionTarget.add(1000);
        regionTarget.add(4085);
        apiCampaignType.regionTarget(regionTarget);
        List<String> negativeWords = new ArrayList<>();
        negativeWords.add("短语否词1");
        negativeWords.add("短语否词2");
        apiCampaignType.setNegativeWords(negativeWords);
        List<String> exactNegativeWords = new ArrayList<>();
        exactNegativeWords.add("精确否词1");
        exactNegativeWords.add("精确否词2");
        apiCampaignType.setExactNegativeWords(exactNegativeWords);
        // 设置计划推广暂停时段
        List<ApiScheduleType> schedule = new ArrayList<>();
        ApiScheduleType apiScheduleType = new ApiScheduleType();
        apiScheduleType.setStartHour(10L);
        apiScheduleType.setEndHour(12L);
        apiScheduleType.setWeekDay(6L);
        schedule.add(apiScheduleType);
        apiCampaignType.setSchedule(schedule);

        apiCampaignType.setPause(true);
        apiCampaignType.setPriceRatio(2.0);
        apiCampaignType.bidPrefer(1);
        apiCampaignType.setAdType(0);
        apiCampaignType.setBusinessPointId(123456789L);
        // 分地域出价系数
        List<RegionPriceFactor> regionPriceFactors = new ArrayList<>();
        RegionPriceFactor regionPriceFactor = new RegionPriceFactor();
        regionPriceFactor.setRegionId(1000);
        regionPriceFactor.setPriceFactor(8.8);
        regionPriceFactors.add(regionPriceFactor);
        apiCampaignType.setRegionPriceFactor(regionPriceFactors);
        // 分时段出价系数
        List<SchedulePriceFactor> schedulePriceFactors = new ArrayList<>();
        SchedulePriceFactor schedulePriceFactor = new SchedulePriceFactor();
        schedulePriceFactor.setTimeId(123);
        schedulePriceFactor.setPriceFactor(6.6);
        schedulePriceFactors.add(schedulePriceFactor);
        apiCampaignType.setSchedulePriceFactors(schedulePriceFactors);

        apiCampaignType.setMarketingTargetId(0);
        campaignTypes.add(apiCampaignType);
        apiCampaignAddRequest.setCampaignTypes(campaignTypes);
        // 设置请求body
        addCampaignRequestWrapper.setBody(apiCampaignAddRequest);
        // 调用API
        AddCampaignResponseWrapper addCampaignResponseWrapper =
                campaignService.addCampaign(addCampaignRequestWrapper);
        // 判断请求是否成功
        if (addCampaignResponseWrapper.getHeader().getStatus() != 0) {
            LOGGER.error("addCampaign fail. errors:" + addCampaignResponseWrapper.getHeader());
            throw new RuntimeException("addCampaign fail.");
        }
        return addCampaignResponseWrapper.getBody().getData();
    }

    /**
     * 在新建计划下新建单元
     *
     * @param campaignId
     * @return
     * @throws ApiException
     */
    public static List<ApiAdgroupType> addAdgroup(Long campaignId) throws ApiException {
        AdgroupService adgroupService = new AdgroupService();
        AddAdgroupRequestWrapper addAdgroupRequestWrapper = new AddAdgroupRequestWrapper();
        // 设置请求header
        addAdgroupRequestWrapper.setHeader(header);
        //  构造请求参数
        ApiAdgroupAddRequest apiAdgroupAddRequest = new ApiAdgroupAddRequest();
        List<ApiAdgroupType> adgroupTypes = new ArrayList<>();
        ApiAdgroupType apiAdgroupType = new ApiAdgroupType();
        apiAdgroupType.setCampaignId(campaignId);
        apiAdgroupType.setAdgroupName("xx单元名称");
        apiAdgroupType.setMaxPrice(6.8);
        apiAdgroupType.setPause(true);
        List<String> negativeWords = new ArrayList<>();
        negativeWords.add("短语否词1");
        negativeWords.add("短语否词2");
        apiAdgroupType.setNegativeWords(negativeWords);
        List<String> exactNegativeWords = new ArrayList<>();
        exactNegativeWords.add("精确否词1");
        exactNegativeWords.add("精确否词2");
        apiAdgroupType.setExactNegativeWords(exactNegativeWords);
        apiAdgroupType.setPriceRatio(5.0);
        apiAdgroupType.setSegmentRecommendStatus(0);
        adgroupTypes.add(apiAdgroupType);
        apiAdgroupAddRequest.setAdgroupTypes(adgroupTypes);
        // 设置请求body
        addAdgroupRequestWrapper.setBody(apiAdgroupAddRequest);
        // 调用API
        AddAdgroupResponseWrapper addAdgroupResponseWrapper = adgroupService.addAdgroup(addAdgroupRequestWrapper);

        // 判断请求是否成功
        if (addAdgroupResponseWrapper.getHeader().getStatus() != 0) {
            LOGGER.error("addAdgroup fail. errors:" + addAdgroupResponseWrapper.getHeader());
            throw new RuntimeException("addAdgroup fail.");
        }
        return addAdgroupResponseWrapper.getBody().getData();
    }

    /**
     * 在单元下添加创意
     *
     * @param campaignId
     * @param adgroupId
     * @return
     * @throws ApiException
     */
    public static List<ApiCreativeType> addCreative(Long campaignId, Long adgroupId) throws ApiException {
        CreativeService creativeService = new CreativeService();
        AddCreativeRequestWrapper addCreativeRequestWrapper = new AddCreativeRequestWrapper();
        // 设置请求header
        addCreativeRequestWrapper.setHeader(header);
        // 构造请求参数
        ApiCreativeAddRequest apiCreativeAddRequest = new ApiCreativeAddRequest();
        List<ApiCreativeType> creativeTypes = new ArrayList<>();
        ApiCreativeType apiCreativeType = new ApiCreativeType();
        apiCreativeType.setCampaignId(campaignId);
        apiCreativeType.setAdgroupId(adgroupId);
        apiCreativeType.setTitle("xx创意标题");
        apiCreativeType.setDescription1("针对数据不完整情况,我们有成熟的解决方案,让{数据}完整恢复");
        apiCreativeType.setDescription2("恢复成功才收费{中毒}数据恢复值得信赖");
        String moDestinationUrl = "https://aisite.wejianzhan.com/site/abcd.com/46aa6sssd1b-d206-4dfc-999a-7b8b487aab5d";
        apiCreativeType.setMobileDestinationUrl(moDestinationUrl);
        apiCreativeType.setMobileDisplayUrl("abcd.com");
        String pcDestinationUrl = "https://aisite.wejianzhan.com/site/abcd.com/46aa6sssd1b-d206-4dfc-999a-7b8b487aab5d";
        apiCreativeType.setPcDestinationUrl(pcDestinationUrl);
        apiCreativeType.setPcDisplayUrl("abcd.com");
        List<Integer> tabs = new ArrayList<>();
        tabs.add(1);
        apiCreativeType.setTabs(tabs);
        creativeTypes.add(apiCreativeType);
        apiCreativeAddRequest.setCreativeTypes(creativeTypes);
        // 设置请求body
        addCreativeRequestWrapper.setBody(apiCreativeAddRequest);
        // 调用API
        AddCreativeResponseWrapper addCreativeResponseWrapper =
                creativeService.addCreative(addCreativeRequestWrapper);

        // 判断请求是否成功
        if (addCreativeResponseWrapper.getHeader().getStatus() != 0) {
            LOGGER.error("addCreative fail. errors:" + addCreativeResponseWrapper.getHeader());
            throw new RuntimeException("addCreative fail.");
        }
        return addCreativeResponseWrapper.getBody().getData();
    }

    /**
     * 在单元下添加关键词
     *
     * @param adgroupId
     * @return
     * @throws ApiException
     */
    public static List<ApiKeywordType> addWord(Long adgroupId) throws ApiException {
        KeywordService keywordService = new KeywordService();
        AddWordRequestWrapper addWordRequestWrapper = new AddWordRequestWrapper();
        // 设置请求header
        addWordRequestWrapper.setHeader(header);
        // 构造请求参数
        ApiKeywordAddRequest apiKeywordAddRequest = new ApiKeywordAddRequest();
        List<ApiKeywordType> keywordTypes = new ArrayList<>();
        ApiKeywordType apiKeywordType = new ApiKeywordType();
        apiKeywordType.setAdgroupId(adgroupId);
        apiKeywordType.setKeyword("xx关键词名称");
        apiKeywordType.setPrice(9.8);
        apiKeywordType.setMatchType(2);
        apiKeywordType.setPhraseType(3);
        apiKeywordType.setPause(true);
        List<Integer> tabs = new ArrayList<>();
        tabs.add(1);
        tabs.add(31);
        apiKeywordType.setTabs(tabs);
        String pcDestinationUrl = "https://aisite.wejianzhan.com/site/abcd.com/46aa6sssd1b-d206-4dfc-999a-7b8b487aab5d";
        apiKeywordType.setPcDestinationUrl(pcDestinationUrl);
        String moDestinationUrl = "https://aisite.wejianzhan.com/site/abcd.com/46aa6sssd1b-d206-4dfc-999a-7b8b487aab5d";
        apiKeywordType.setMobileDestinationUrl(moDestinationUrl);
        keywordTypes.add(apiKeywordType);
        apiKeywordAddRequest.setKeywordTypes(keywordTypes);
        // 设置请求body
        addWordRequestWrapper.setBody(apiKeywordAddRequest);
        // 调用API
        AddWordResponseWrapper addWordResponseWrapper = keywordService.addWord(addWordRequestWrapper);

        // 判断请求是否成功
        if (addWordResponseWrapper.getHeader().getStatus() != 0) {
            LOGGER.error("addWord fail. errors:" + addWordResponseWrapper.getHeader());
            throw new RuntimeException("addWord fail.");
        }
        return addWordResponseWrapper.getBody().getData();
    }

    public static void main(String[] args) {
        try {
            // 第一步：创建计划
            List<ApiCampaignType> apiCampaignTypes = addCampaign();
            LOGGER.info("apiCampaignTypes:{}", apiCampaignTypes);
            // 获取计划id
            Long campaignId = apiCampaignTypes.get(0).getCampaignId();

            // 第二步：在计划下新建单元
            List<ApiAdgroupType> apiAdgroupTypes = addAdgroup(campaignId);
            LOGGER.info("apiAdgroupTypes:{}", apiAdgroupTypes);
            // 获取单元id
            Long adgroupId = apiAdgroupTypes.get(0).getAdgroupId();

            // 第三步：在单元下添加创意
            List<ApiCreativeType> apiCreativeTypes = addCreative(campaignId, adgroupId);
            LOGGER.info("apiCreativeTypes:{}", apiCreativeTypes);
            // 第四步：在单元下添加关键词
            List<ApiKeywordType> apiKeywordTypes = addWord(adgroupId);
            LOGGER.info("apiKeywordTypes:{}", apiKeywordTypes);
        } catch (Exception e) {
            LOGGER.error("CreateSearchAd fail.", e);
        }
    }
}
