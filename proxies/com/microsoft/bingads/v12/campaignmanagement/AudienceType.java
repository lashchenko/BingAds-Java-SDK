package com.microsoft.bingads.v12.campaignmanagement;

/**
 * Enum class for AudienceType.
 */
public enum AudienceType {

    REMARKETING_LIST("RemarketingList"),
    CUSTOM("Custom"),
    IN_MARKET("InMarket"),
    PRODUCT("Product"),
    SIMILAR_REMARKETING_LIST("SimilarRemarketingList");
        
    private final String value;

    AudienceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceType fromValue(String v) {
        for (AudienceType c : AudienceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}