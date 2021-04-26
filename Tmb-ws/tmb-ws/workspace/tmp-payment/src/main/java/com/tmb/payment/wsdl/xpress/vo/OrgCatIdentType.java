
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrgCatIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgCatIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgCatIdentSource" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgCatIdentValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgCatIdent_Type", propOrder = {
    "orgCatIdentSource",
    "orgCatIdentValue"
})
public class OrgCatIdentType {

    @XmlElement(name = "OrgCatIdentSource")
    protected String orgCatIdentSource;
    @XmlElement(name = "OrgCatIdentValue")
    protected String orgCatIdentValue;

    /**
     * Gets the value of the orgCatIdentSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCatIdentSource() {
        return orgCatIdentSource;
    }

    /**
     * Sets the value of the orgCatIdentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCatIdentSource(String value) {
        this.orgCatIdentSource = value;
    }

    /**
     * Gets the value of the orgCatIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCatIdentValue() {
        return orgCatIdentValue;
    }

    /**
     * Sets the value of the orgCatIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCatIdentValue(String value) {
        this.orgCatIdentValue = value;
    }

}
