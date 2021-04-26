
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.OrgNameType;


/**
 * <p>Java class for FloodVendorOrgData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloodVendorOrgData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloodVendorOrgData_Type", propOrder = {
    "orgName"
})
public class FloodVendorOrgDataType {

    @XmlElement(name = "OrgName", namespace = "urn:ifxforum-org:XSD:1")
    protected OrgNameType orgName;

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link OrgNameType }
     *     
     */
    public OrgNameType getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgNameType }
     *     
     */
    public void setOrgName(OrgNameType value) {
        this.orgName = value;
    }

}
