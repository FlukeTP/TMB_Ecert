
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtEnclPayeeInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclPayeeInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclPayee"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IndustIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtEnclPayeeInfo_Type", propOrder = {
    "stdPayeeId",
    "pmtEnclPayee",
    "industIdent"
})
public class PmtEnclPayeeInfoType {

    @XmlElement(name = "StdPayeeId")
    protected StdPayeeIdType stdPayeeId;
    @XmlElement(name = "PmtEnclPayee")
    protected PmtEnclPayeeType pmtEnclPayee;
    @XmlElement(name = "IndustIdent")
    protected IndustIdentType industIdent;

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
     * Gets the value of the pmtEnclPayee property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclPayeeType }
     *     
     */
    public PmtEnclPayeeType getPmtEnclPayee() {
        return pmtEnclPayee;
    }

    /**
     * Sets the value of the pmtEnclPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclPayeeType }
     *     
     */
    public void setPmtEnclPayee(PmtEnclPayeeType value) {
        this.pmtEnclPayee = value;
    }

    /**
     * Gets the value of the industIdent property.
     * 
     * @return
     *     possible object is
     *     {@link IndustIdentType }
     *     
     */
    public IndustIdentType getIndustIdent() {
        return industIdent;
    }

    /**
     * Sets the value of the industIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustIdentType }
     *     
     */
    public void setIndustIdent(IndustIdentType value) {
        this.industIdent = value;
    }

}
