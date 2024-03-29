/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpacreativefeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.Template;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DpaCreativeFeedType
 */
@JsonPropertyOrder({
  DpaCreativeFeedType.JSON_PROPERTY_CREATIVE_FEED_ID,
  DpaCreativeFeedType.JSON_PROPERTY_CAMPAIGN_FEED_ID,
  DpaCreativeFeedType.JSON_PROPERTY_ADGROUP_FEED_ID,
  DpaCreativeFeedType.JSON_PROPERTY_MATERIALSTYLE,
  DpaCreativeFeedType.JSON_PROPERTY_CREATIVE_FEED_NAME,
  DpaCreativeFeedType.JSON_PROPERTY_MATERIAL,
  DpaCreativeFeedType.JSON_PROPERTY_TEMPLATE,
  DpaCreativeFeedType.JSON_PROPERTY_PAUSE,
  DpaCreativeFeedType.JSON_PROPERTY_STATUS,
  DpaCreativeFeedType.JSON_PROPERTY_REFUSEREASON,
  DpaCreativeFeedType.JSON_PROPERTY_HUITUS
})
@JsonTypeName("DpaCreativeFeedType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DpaCreativeFeedType {
  public static final String JSON_PROPERTY_CREATIVE_FEED_ID = "creativeFeedId";
  private Long creativeFeedId;

  public static final String JSON_PROPERTY_CAMPAIGN_FEED_ID = "campaignFeedId";
  private Long campaignFeedId;

  public static final String JSON_PROPERTY_ADGROUP_FEED_ID = "adgroupFeedId";
  private Long adgroupFeedId;

  public static final String JSON_PROPERTY_MATERIALSTYLE = "materialstyle";
  private Long materialstyle;

  public static final String JSON_PROPERTY_CREATIVE_FEED_NAME = "creativeFeedName";
  private String creativeFeedName;

  public static final String JSON_PROPERTY_MATERIAL = "material";
  private String material;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Template template;

  public static final String JSON_PROPERTY_PAUSE = "pause";
  private Boolean pause;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_REFUSEREASON = "refusereason";
  private String refusereason;

  public static final String JSON_PROPERTY_HUITUS = "huitus";
  private List<Long> huitus = null;

  public DpaCreativeFeedType() { 
  }

  public DpaCreativeFeedType creativeFeedId(Long creativeFeedId) {
    
    this.creativeFeedId = creativeFeedId;
    return this;
  }

   /**
   * Get creativeFeedId
   * @return creativeFeedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreativeFeedId() {
    return creativeFeedId;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeFeedId(Long creativeFeedId) {
    this.creativeFeedId = creativeFeedId;
  }


  public DpaCreativeFeedType campaignFeedId(Long campaignFeedId) {
    
    this.campaignFeedId = campaignFeedId;
    return this;
  }

   /**
   * Get campaignFeedId
   * @return campaignFeedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignFeedId() {
    return campaignFeedId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignFeedId(Long campaignFeedId) {
    this.campaignFeedId = campaignFeedId;
  }


  public DpaCreativeFeedType adgroupFeedId(Long adgroupFeedId) {
    
    this.adgroupFeedId = adgroupFeedId;
    return this;
  }

   /**
   * Get adgroupFeedId
   * @return adgroupFeedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupFeedId() {
    return adgroupFeedId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupFeedId(Long adgroupFeedId) {
    this.adgroupFeedId = adgroupFeedId;
  }


  public DpaCreativeFeedType materialstyle(Long materialstyle) {
    
    this.materialstyle = materialstyle;
    return this;
  }

   /**
   * Get materialstyle
   * @return materialstyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIALSTYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaterialstyle() {
    return materialstyle;
  }


  @JsonProperty(JSON_PROPERTY_MATERIALSTYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialstyle(Long materialstyle) {
    this.materialstyle = materialstyle;
  }


  public DpaCreativeFeedType creativeFeedName(String creativeFeedName) {
    
    this.creativeFeedName = creativeFeedName;
    return this;
  }

   /**
   * Get creativeFeedName
   * @return creativeFeedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_FEED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreativeFeedName() {
    return creativeFeedName;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_FEED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeFeedName(String creativeFeedName) {
    this.creativeFeedName = creativeFeedName;
  }


  public DpaCreativeFeedType material(String material) {
    
    this.material = material;
    return this;
  }

   /**
   * Get material
   * @return material
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaterial() {
    return material;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterial(String material) {
    this.material = material;
  }


  public DpaCreativeFeedType template(Template template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Template getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(Template template) {
    this.template = template;
  }


  public DpaCreativeFeedType pause(Boolean pause) {
    
    this.pause = pause;
    return this;
  }

   /**
   * Get pause
   * @return pause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPause() {
    return pause;
  }


  @JsonProperty(JSON_PROPERTY_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPause(Boolean pause) {
    this.pause = pause;
  }


  public DpaCreativeFeedType status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public DpaCreativeFeedType refusereason(String refusereason) {
    
    this.refusereason = refusereason;
    return this;
  }

   /**
   * Get refusereason
   * @return refusereason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUSEREASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefusereason() {
    return refusereason;
  }


  @JsonProperty(JSON_PROPERTY_REFUSEREASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefusereason(String refusereason) {
    this.refusereason = refusereason;
  }


  public DpaCreativeFeedType huitus(List<Long> huitus) {
    
    this.huitus = huitus;
    return this;
  }

  public DpaCreativeFeedType addHuitusItem(Long huitusItem) {
    if (this.huitus == null) {
      this.huitus = new ArrayList<>();
    }
    this.huitus.add(huitusItem);
    return this;
  }

   /**
   * Get huitus
   * @return huitus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HUITUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getHuitus() {
    return huitus;
  }


  @JsonProperty(JSON_PROPERTY_HUITUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHuitus(List<Long> huitus) {
    this.huitus = huitus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaCreativeFeedType dpaCreativeFeedType = (DpaCreativeFeedType) o;
    return Objects.equals(this.creativeFeedId, dpaCreativeFeedType.creativeFeedId) &&
        Objects.equals(this.campaignFeedId, dpaCreativeFeedType.campaignFeedId) &&
        Objects.equals(this.adgroupFeedId, dpaCreativeFeedType.adgroupFeedId) &&
        Objects.equals(this.materialstyle, dpaCreativeFeedType.materialstyle) &&
        Objects.equals(this.creativeFeedName, dpaCreativeFeedType.creativeFeedName) &&
        Objects.equals(this.material, dpaCreativeFeedType.material) &&
        Objects.equals(this.template, dpaCreativeFeedType.template) &&
        Objects.equals(this.pause, dpaCreativeFeedType.pause) &&
        Objects.equals(this.status, dpaCreativeFeedType.status) &&
        Objects.equals(this.refusereason, dpaCreativeFeedType.refusereason) &&
        Objects.equals(this.huitus, dpaCreativeFeedType.huitus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeFeedId, campaignFeedId, adgroupFeedId, materialstyle, creativeFeedName, material, template, pause, status, refusereason, huitus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaCreativeFeedType {\n");
    sb.append("    creativeFeedId: ").append(toIndentedString(creativeFeedId)).append("\n");
    sb.append("    campaignFeedId: ").append(toIndentedString(campaignFeedId)).append("\n");
    sb.append("    adgroupFeedId: ").append(toIndentedString(adgroupFeedId)).append("\n");
    sb.append("    materialstyle: ").append(toIndentedString(materialstyle)).append("\n");
    sb.append("    creativeFeedName: ").append(toIndentedString(creativeFeedName)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    pause: ").append(toIndentedString(pause)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    refusereason: ").append(toIndentedString(refusereason)).append("\n");
    sb.append("    huitus: ").append(toIndentedString(huitus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

