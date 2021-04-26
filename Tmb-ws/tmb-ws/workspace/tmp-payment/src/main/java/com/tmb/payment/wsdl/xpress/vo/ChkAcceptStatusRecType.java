
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkAcceptStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkAcceptStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkAcceptStatusRec_Type", propOrder = {
    "chkAcceptId",
    "chkAcceptStatus"
})
public class ChkAcceptStatusRecType {

    @XmlElement(name = "ChkAcceptId")
    protected String chkAcceptId;
    @XmlElement(name = "ChkAcceptStatus")
    protected ChkAcceptStatusType chkAcceptStatus;

    /**
     * Gets the value of the chkAcceptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkAcceptId() {
        return chkAcceptId;
    }

    /**
     * Sets the value of the chkAcceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkAcceptId(String value) {
        this.chkAcceptId = value;
    }

    /**
     * Gets the value of the chkAcceptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChkAcceptStatusType }
     *     
     */
    public ChkAcceptStatusType getChkAcceptStatus() {
        return chkAcceptStatus;
    }

    /**
     * Sets the value of the chkAcceptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkAcceptStatusType }
     *     
     */
    public void setChkAcceptStatus(ChkAcceptStatusType value) {
        this.chkAcceptStatus = value;
    }

}
