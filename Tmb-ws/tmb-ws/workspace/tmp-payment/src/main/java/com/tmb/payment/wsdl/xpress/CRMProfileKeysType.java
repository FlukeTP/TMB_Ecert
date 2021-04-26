
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRMProfileKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMProfileKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CRMID"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IBUserID"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMProfileKeys_Type", propOrder = {
    "crmid",
    "ibUserID"
})
public class CRMProfileKeysType {

    @XmlElement(name = "CRMID")
    protected String crmid;
    @XmlElement(name = "IBUserID")
    protected String ibUserID;

    /**
     * Gets the value of the crmid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRMID() {
        return crmid;
    }

    /**
     * Sets the value of the crmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRMID(String value) {
        this.crmid = value;
    }

    /**
     * Gets the value of the ibUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBUserID() {
        return ibUserID;
    }

    /**
     * Sets the value of the ibUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBUserID(String value) {
        this.ibUserID = value;
    }

}
