
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XpressSysKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XpressSysKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}XpressSysId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}XpressSysIdent"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotAvailInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XpressSysKeys_Type", propOrder = {
    "xpressSysId",
    "xpressSysIdent",
    "notAvailInd"
})
public class XpressSysKeysType {

    @XmlElement(name = "XpressSysId")
    protected String xpressSysId;
    @XmlElement(name = "XpressSysIdent")
    protected String xpressSysIdent;
    @XmlElement(name = "NotAvailInd")
    protected Boolean notAvailInd;

    /**
     * Gets the value of the xpressSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpressSysId() {
        return xpressSysId;
    }

    /**
     * Sets the value of the xpressSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpressSysId(String value) {
        this.xpressSysId = value;
    }

    /**
     * Gets the value of the xpressSysIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpressSysIdent() {
        return xpressSysIdent;
    }

    /**
     * Sets the value of the xpressSysIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpressSysIdent(String value) {
        this.xpressSysIdent = value;
    }

    /**
     * Gets the value of the notAvailInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAvailInd() {
        return notAvailInd;
    }

    /**
     * Sets the value of the notAvailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAvailInd(Boolean value) {
        this.notAvailInd = value;
    }

}
