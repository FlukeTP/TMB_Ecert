
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdPayeeRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StdPayeeRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StdPayeeRec_Type", propOrder = {
    "stdPayeeId",
    "stdPayeeInfo",
    "stdPayeeEnvr",
    "stdPayeeStatus"
})
public class StdPayeeRecType {

    @XmlElement(name = "StdPayeeId", required = true)
    protected StdPayeeIdType stdPayeeId;
    @XmlElement(name = "StdPayeeInfo", required = true)
    protected StdPayeeInfoType stdPayeeInfo;
    @XmlElement(name = "StdPayeeEnvr")
    protected StdPayeeEnvrType stdPayeeEnvr;
    @XmlElement(name = "StdPayeeStatus", required = true)
    protected StdPayeeStatusType stdPayeeStatus;

    /**
     * Gets the value of the stdPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeIdType }
     *     
     */
    public StdPayeeIdType getStdPayeeId() {
        return stdPayeeId;
    }

    /**
     * Sets the value of the stdPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeIdType }
     *     
     */
    public void setStdPayeeId(StdPayeeIdType value) {
        this.stdPayeeId = value;
    }

    /**
     * Gets the value of the stdPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeInfoType }
     *     
     */
    public StdPayeeInfoType getStdPayeeInfo() {
        return stdPayeeInfo;
    }

    /**
     * Sets the value of the stdPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeInfoType }
     *     
     */
    public void setStdPayeeInfo(StdPayeeInfoType value) {
        this.stdPayeeInfo = value;
    }

    /**
     * Gets the value of the stdPayeeEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeEnvrType }
     *     
     */
    public StdPayeeEnvrType getStdPayeeEnvr() {
        return stdPayeeEnvr;
    }

    /**
     * Sets the value of the stdPayeeEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeEnvrType }
     *     
     */
    public void setStdPayeeEnvr(StdPayeeEnvrType value) {
        this.stdPayeeEnvr = value;
    }

    /**
     * Gets the value of the stdPayeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeStatusType }
     *     
     */
    public StdPayeeStatusType getStdPayeeStatus() {
        return stdPayeeStatus;
    }

    /**
     * Sets the value of the stdPayeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeStatusType }
     *     
     */
    public void setStdPayeeStatus(StdPayeeStatusType value) {
        this.stdPayeeStatus = value;
    }

}
