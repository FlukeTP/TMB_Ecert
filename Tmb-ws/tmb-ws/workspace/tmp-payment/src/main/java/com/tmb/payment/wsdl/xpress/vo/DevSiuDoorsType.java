
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuDoors_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevSiuDoors_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Yes"/&gt;
 *     &lt;enumeration value="No"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevSiuDoors_Type")
@XmlEnum
public enum DevSiuDoorsType {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevSiuDoorsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevSiuDoorsType fromValue(String v) {
        for (DevSiuDoorsType c: DevSiuDoorsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
