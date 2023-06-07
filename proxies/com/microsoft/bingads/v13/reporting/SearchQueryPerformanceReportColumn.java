
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchQueryPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SearchQueryPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="AdType"/>
 *     <enumeration value="DestinationUrl"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="DeliveredMatchType"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdStatus"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="AveragePosition"/>
 *     <enumeration value="SearchQuery"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="AdGroupCriterionId"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="Language"/>
 *     <enumeration value="KeywordId"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="TopVsOther"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="DeviceOS"/>
 *     <enumeration value="Assists"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="CostPerAssist"/>
 *     <enumeration value="RevenuePerConversion"/>
 *     <enumeration value="RevenuePerAssist"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="KeywordStatus"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="CustomerId"/>
 *     <enumeration value="CustomerName"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="AllRevenue"/>
 *     <enumeration value="AllConversionRate"/>
 *     <enumeration value="AllCostPerConversion"/>
 *     <enumeration value="AllReturnOnAdSpend"/>
 *     <enumeration value="AllRevenuePerConversion"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     <enumeration value="TopImpressionRatePercent"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="AllConversionsQualified"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SearchQueryPerformanceReportColumn")
@XmlEnum
public enum SearchQueryPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),
    @XmlEnumValue("DestinationUrl")
    DESTINATION_URL("DestinationUrl"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("AveragePosition")
    AVERAGE_POSITION("AveragePosition"),
    @XmlEnumValue("SearchQuery")
    SEARCH_QUERY("SearchQuery"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("AdGroupCriterionId")
    AD_GROUP_CRITERION_ID("AdGroupCriterionId"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("KeywordId")
    KEYWORD_ID("KeywordId"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("KeywordStatus")
    KEYWORD_STATUS("KeywordStatus"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("CustomerId")
    CUSTOMER_ID("CustomerId"),
    @XmlEnumValue("CustomerName")
    CUSTOMER_NAME("CustomerName"),
    @XmlEnumValue("AllConversions")
    ALL_CONVERSIONS("AllConversions"),
    @XmlEnumValue("AllRevenue")
    ALL_REVENUE("AllRevenue"),
    @XmlEnumValue("AllConversionRate")
    ALL_CONVERSION_RATE("AllConversionRate"),
    @XmlEnumValue("AllCostPerConversion")
    ALL_COST_PER_CONVERSION("AllCostPerConversion"),
    @XmlEnumValue("AllReturnOnAdSpend")
    ALL_RETURN_ON_AD_SPEND("AllReturnOnAdSpend"),
    @XmlEnumValue("AllRevenuePerConversion")
    ALL_REVENUE_PER_CONVERSION("AllRevenuePerConversion"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("GoalType")
    GOAL_TYPE("GoalType"),
    @XmlEnumValue("AbsoluteTopImpressionRatePercent")
    ABSOLUTE_TOP_IMPRESSION_RATE_PERCENT("AbsoluteTopImpressionRatePercent"),
    @XmlEnumValue("TopImpressionRatePercent")
    TOP_IMPRESSION_RATE_PERCENT("TopImpressionRatePercent"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("AllConversionsQualified")
    ALL_CONVERSIONS_QUALIFIED("AllConversionsQualified");
    private final String value;

    SearchQueryPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchQueryPerformanceReportColumn fromValue(String v) {
        for (SearchQueryPerformanceReportColumn c: SearchQueryPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
