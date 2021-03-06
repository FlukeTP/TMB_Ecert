
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillerId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerId_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillerNum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerId_Type", propOrder = {
    "spName",
    "billerNum"
})
public class BillerIdType {

    @XmlElement(name = "SPName", required = true)
    protected String spName;
    @XmlElement(name = "BillerNum", required = true)
    protected String billerNum;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the billerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerNum() {
        return billerNum;
    }

    /**
     * Sets the value of the billerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerNum(String value) {
        this.billerNum = value;
    }

}
