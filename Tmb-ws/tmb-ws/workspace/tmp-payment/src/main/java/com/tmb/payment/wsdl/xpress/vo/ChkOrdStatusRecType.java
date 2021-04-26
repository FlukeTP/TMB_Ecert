
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkOrdStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkOrdStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkOrdStatusRec_Type", propOrder = {
    "chkOrdId",
    "chkOrdStatus"
})
public class ChkOrdStatusRecType {

    @XmlElement(name = "ChkOrdId")
    protected String chkOrdId;
    @XmlElement(name = "ChkOrdStatus")
    protected ChkOrdStatusType chkOrdStatus;

    /**
     * Gets the value of the chkOrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkOrdId() {
        return chkOrdId;
    }

    /**
     * Sets the value of the chkOrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkOrdId(String value) {
        this.chkOrdId = value;
    }

    /**
     * Gets the value of the chkOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdStatusType }
     *     
     */
    public ChkOrdStatusType getChkOrdStatus() {
        return chkOrdStatus;
    }

    /**
     * Sets the value of the chkOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdStatusType }
     *     
     */
    public void setChkOrdStatus(ChkOrdStatusType value) {
        this.chkOrdStatus = value;
    }

}
