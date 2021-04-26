
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustSvcKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSvcKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcId"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustSvcKeys_Type", propOrder = {
    "spName",
    "custSvcId"
})
public class CustSvcKeysType {

    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "CustSvcId")
    protected CustSvcIdType custSvcId;

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
     * Gets the value of the custSvcId property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcIdType }
     *     
     */
    public CustSvcIdType getCustSvcId() {
        return custSvcId;
    }

    /**
     * Sets the value of the custSvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcIdType }
     *     
     */
    public void setCustSvcId(CustSvcIdType value) {
        this.custSvcId = value;
    }

}
