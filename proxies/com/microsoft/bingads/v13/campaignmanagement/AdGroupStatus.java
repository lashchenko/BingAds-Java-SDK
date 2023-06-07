
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdGroupStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Active"/>
 *     <enumeration value="Paused"/>
 *     <enumeration value="Expired"/>
 *     <enumeration value="Deleted"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdGroupStatus")
@XmlEnum
public enum AdGroupStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Paused")
    PAUSED("Paused"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    AdGroupStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupStatus fromValue(String v) {
        for (AdGroupStatus c: AdGroupStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
