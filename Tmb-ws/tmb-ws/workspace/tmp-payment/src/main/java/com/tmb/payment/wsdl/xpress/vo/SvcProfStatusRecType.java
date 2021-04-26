
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcProfStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcProfStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcProfStatusRec_Type", propOrder = {
    "svcProfId",
    "svcProfStatus"
})
public class SvcProfStatusRecType {

    @XmlElement(name = "SvcProfId")
    protected String svcProfId;
    @XmlElement(name = "SvcProfStatus")
    protected SvcProfStatusType svcProfStatus;

    /**
     * Gets the value of the svcProfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcProfId() {
        return svcProfId;
    }

    /**
     * Sets the value of the svcProfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcProfId(String value) {
        this.svcProfId = value;
    }

    /**
     * Gets the value of the svcProfStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProfStatusType }
     *     
     */
    public SvcProfStatusType getSvcProfStatus() {
        return svcProfStatus;
    }

    /**
     * Sets the value of the svcProfStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProfStatusType }
     *     
     */
    public void setSvcProfStatus(SvcProfStatusType value) {
        this.svcProfStatus = value;
    }

}
