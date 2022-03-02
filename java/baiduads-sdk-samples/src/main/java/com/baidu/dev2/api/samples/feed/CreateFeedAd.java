package com.baidu.dev2.api.samples.feed;

import com.baidu.dev2.api.sdk.adgroupfeed.api.AdgroupFeedService;
import com.baidu.dev2.api.sdk.adgroupfeed.model.AddAdgroupFeedRequestWrapper;
import com.baidu.dev2.api.sdk.adgroupfeed.model.AddAdgroupFeedRequestWrapperBody;
import com.baidu.dev2.api.sdk.adgroupfeed.model.AddAdgroupFeedResponseWrapper;
import com.baidu.dev2.api.sdk.adgroupfeed.model.AdgroupFeedType;
import com.baidu.dev2.api.sdk.campaignfeed.api.CampaignFeedService;
import com.baidu.dev2.api.sdk.campaignfeed.model.AddCampaignFeedRequestWrapper;
import com.baidu.dev2.api.sdk.campaignfeed.model.AddCampaignFeedRequestWrapperBody;
import com.baidu.dev2.api.sdk.campaignfeed.model.AddCampaignFeedResponseWrapper;
import com.baidu.dev2.api.sdk.campaignfeed.model.CampaignFeedType;
import com.baidu.dev2.api.sdk.campaignfeed.model.ScheduleType;
import com.baidu.dev2.api.sdk.common.ApiRequestHeader;
import com.baidu.dev2.api.sdk.creativefeed.api.CreativeFeedService;
import com.baidu.dev2.api.sdk.creativefeed.model.AddCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.AddCreativeFeedRequestWrapperBody;
import com.baidu.dev2.api.sdk.creativefeed.model.AddCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.CreativeFeedType;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 创建信息流广告示例
 */
public class CreateFeedAd {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateFeedAd.class);

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
    public static List<CampaignFeedType> addCampaignFeed() throws ApiException {
        CampaignFeedService campaignFeedService = new CampaignFeedService();
        AddCampaignFeedRequestWrapperBody addCampaignFeedRequestWrapperBody =
                new AddCampaignFeedRequestWrapperBody();
        AddCampaignFeedRequestWrapper addCampaignFeedRequestWrapper = new AddCampaignFeedRequestWrapper();
        // 设置请求header
        addCampaignFeedRequestWrapper.setHeader(header);
        // 构造请求参数
        ArrayList<CampaignFeedType> campaignFeedTypes = new ArrayList<>();
        CampaignFeedType campaignFeedType = new CampaignFeedType();
        campaignFeedType.setCampaignFeedName("xx计划名称");
        // 设置推广对象 1 - 网站链接 2 - 应用下载（IOS）3 - 应用下载（Android）7 - 电商店铺
        campaignFeedType.setSubject(1);
        // 设置计划推广开始结束时段 开始时间不能早于当天日期 结束时间不能早于开始日期
        campaignFeedType.setStarttime("2022-02-23");
        campaignFeedType.setEndtime("2022-09-12");
        // 设置计划推广暂停时段
        ArrayList<ScheduleType> scheduleTypes = new ArrayList<>();
        ScheduleType scheduleType = new ScheduleType();
        scheduleType.setWeekDay(1);
        scheduleType.setStartHour(1L);
        scheduleType.setEndHour(2L);
        scheduleTypes.add(scheduleType);
        campaignFeedType.setSchedule(scheduleTypes);
        campaignFeedTypes.add(campaignFeedType);
        addCampaignFeedRequestWrapperBody.setCampaignFeedTypes(campaignFeedTypes);
        // 设置请求body
        addCampaignFeedRequestWrapper.setBody(addCampaignFeedRequestWrapperBody);
        // 调用API
        AddCampaignFeedResponseWrapper addCampaignFeedResponseWrapper =
                campaignFeedService.addCampaignFeed(addCampaignFeedRequestWrapper);
        // 判断请求是否成功
        if (addCampaignFeedResponseWrapper.getHeader().getStatus() != 0) {
            LOGGER.error("addCampaignFeed fail. errors:" + addCampaignFeedResponseWrapper.getHeader());
            throw new RuntimeException("addCampaignFeed fail.");
        }
        return addCampaignFeedResponseWrapper.getBody().getData();
    }

    /**
     * 在新建计划下新建单元
     *
     * @param campaignFeedId
     * @return
     * @throws ApiException
     */
    public static List<AdgroupFeedType> addAdgroupFeed(Long campaignFeedId) throws ApiException {
        AdgroupFeedService adgroupFeedService = new AdgroupFeedService();
        AddAdgroupFeedRequestWrapperBody addAdgroupFeedRequestWrapperBody =
                new AddAdgroupFeedRequestWrapperBody();
        AddAdgroupFeedRequestWrapper addAdgroupFeedRequestWrapper = new AddAdgroupFeedRequestWrapper();
        // 设置请求header
        addAdgroupFeedRequestWrapper.setHeader(header);
        // 构造请求参数
        ArrayList<AdgroupFeedType> adgroupFeedTypes = new ArrayList<>();
        AdgroupFeedType adgroupFeedType = new AdgroupFeedType();
        adgroupFeedType.setCampaignFeedId(campaignFeedId);
        adgroupFeedType.setAdgroupFeedName("xx单元名称");
        adgroupFeedType.setPause(false);
        // 定向设置
        Map audience = new HashMap();
        audience.put("region", 9999999);
        audience.put("age", 0);
        audience.put("sex", 0);
        audience.put("lifeStage", 0);
        audience.put("education", 0);
        audience.put("newInterests", 0);
        audience.put("keywords", "");
        adgroupFeedType.setAudience(audience);
        adgroupFeedType.setBid(66.66);
        ArrayList<Integer> productTypes = new ArrayList<>();
        productTypes.add(1);
        productTypes.add(2);
        adgroupFeedType.setProducttypes(productTypes);
        ArrayList<Integer> fTypes = new ArrayList<>();
        fTypes.add(1);
        adgroupFeedType.setFtypes(fTypes);
        adgroupFeedTypes.add(adgroupFeedType);
        // 设置优化目标和付费模式
        adgroupFeedType.setBidtype(1);
        addAdgroupFeedRequestWrapperBody.setAdgroupFeedTypes(adgroupFeedTypes);
        // 设置请求body
        addAdgroupFeedRequestWrapper.setBody(addAdgroupFeedRequestWrapperBody);
        // 调用API
        AddAdgroupFeedResponseWrapper addAdgroupFeedResponseWrapper =
                adgroupFeedService.addAdgroupFeed(addAdgroupFeedRequestWrapper);
        // 判断请求是否成功
        if (addAdgroupFeedResponseWrapper.getHeader().getStatus() != 0) {
            LOGGER.error("addCampaignFeed fail. errors:" + addAdgroupFeedResponseWrapper.getHeader());
            throw new RuntimeException("addCampaignFeed fail.");
        }
        return addAdgroupFeedResponseWrapper.getBody().getData();
    }

    /**
     * 在新建单元下新建创意
     *
     * @param adgroupFeedId
     * @return
     * @throws ApiException
     */
    public static List<CreativeFeedType> addCreativeFeed(Long adgroupFeedId) throws ApiException {
        CreativeFeedService creativeFeedService = new CreativeFeedService();
        AddCreativeFeedRequestWrapperBody addCreativeFeedRequestWrapperBody =
                new AddCreativeFeedRequestWrapperBody();
        AddCreativeFeedRequestWrapper addCreativeFeedRequestWrapper = new AddCreativeFeedRequestWrapper();
        // 设置请求header
        addCreativeFeedRequestWrapper.setHeader(header);
        // 构造请求参数
        ArrayList<CreativeFeedType> creativeFeedTypes = new ArrayList<>();
        CreativeFeedType creativeFeedType = new CreativeFeedType();
        creativeFeedType.setAdgroupFeedId(adgroupFeedId);
        creativeFeedType.setCreativeFeedName("xx创意名称");
        // 设置创意样式 取值请参考信息流创意样式列表
        creativeFeedType.setMaterialstyle(101);
        creativeFeedType.setPause(false);
        // 设置物料内容 参考信息流创意物料说明和信息流创意样式列表
        creativeFeedType.setMaterial("请传json");
        creativeFeedType.setIdeaType(0);
        creativeFeedTypes.add(creativeFeedType);
        addCreativeFeedRequestWrapperBody.setCreativeFeedTypes(creativeFeedTypes);
        // 设置请求body
        addCreativeFeedRequestWrapper.setBody(addCreativeFeedRequestWrapperBody);
        // 调用API
        AddCreativeFeedResponseWrapper addCreativeFeedResponseWrapper =
                creativeFeedService.addCreativeFeed(addCreativeFeedRequestWrapper);
        // 判断请求是否成功
        if (addCreativeFeedResponseWrapper.getHeader().getStatus() != 0) {
            LOGGER.error("addCreative fail. errors:" + addCreativeFeedResponseWrapper.getHeader());
            throw new RuntimeException("addCreative fail.");
        }
        return addCreativeFeedResponseWrapper.getBody().getData();
    }

    public static void main(String[] args) {
        try {
            // 第一步：创建计划
            List<CampaignFeedType> campaignFeedTypes = addCampaignFeed();
            LOGGER.info("campaignFeedTypes:{}", campaignFeedTypes);
            // 获取计划id
            Long campaignFeedId = campaignFeedTypes.get(0).getCampaignFeedId();

            // 第二步：在新建计划下新建单元
            List<AdgroupFeedType> adgroupFeedTypes = addAdgroupFeed(campaignFeedId);
            LOGGER.info("adgroupFeedTypes:{}", adgroupFeedTypes);
            // 获取单元id
            Long adgroupFeedId = adgroupFeedTypes.get(0).getAdgroupFeedId();

            // 第三步：在新建单元下新建创意
            List<CreativeFeedType> creativeFeedTypes = addCreativeFeed(adgroupFeedId);
            LOGGER.info("creativeFeedTypes:{}", creativeFeedTypes);
        } catch (Exception e) {
            LOGGER.error("CreateFeedAd fail.", e);
        }
    }
}
