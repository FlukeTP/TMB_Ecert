
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbkStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassbkStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="UpToDate"/&gt;
 *     &lt;enumeration value="NewItems"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="MediaError"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassbkStatusCode_Type")
@XmlEnum
public enum PassbkStatusCodeType {

    @XmlEnumValue("UpToDate")
    UP_TO_DATE("UpToDate"),
    @XmlEnumValue("NewItems")
    NEW_ITEMS("NewItems"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("MediaError")
    MEDIA_ERROR("MediaError"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    PassbkStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassbkStatusCodeType fromValue(String v) {
        for (PassbkStatusCodeType c: PassbkStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
