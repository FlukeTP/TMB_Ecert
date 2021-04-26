
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtRec_Type", propOrder = {
    "pmtId",
    "pmtInfo",
    "pmtEnvr",
    "pmtStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PmtRecType.class
})
public class PmtRecType {

    @XmlElement(name = "PmtId", required = true)
    protected String pmtId;
    @XmlElementRef(name = "PmtInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PmtInfoType> pmtInfo;
    @XmlElement(name = "PmtEnvr")
    protected PmtEnvrType pmtEnvr;
    @XmlElement(name = "PmtStatus", required = true)
    protected PmtStatusType pmtStatus;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtId(String value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the pmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PmtInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PmtInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PmtInfoType> getPmtInfo() {
        return pmtInfo;
    }

    /**
     * Sets the value of the pmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PmtInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PmtInfoType }{@code >}
     *     
     */
    public void setPmtInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PmtInfoType> value) {
        this.pmtInfo = value;
    }

    /**
     * Gets the value of the pmtEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnvrType }
     *     
     */
    public PmtEnvrType getPmtEnvr() {
        return pmtEnvr;
    }

    /**
     * Sets the value of the pmtEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnvrType }
     *     
     */
    public void setPmtEnvr(PmtEnvrType value) {
        this.pmtEnvr = value;
    }

    /**
     * Gets the value of the pmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatusType }
     *     
     */
    public PmtStatusType getPmtStatus() {
        return pmtStatus;
    }

    /**
     * Sets the value of the pmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatusType }
     *     
     */
    public void setPmtStatus(PmtStatusType value) {
        this.pmtStatus = value;
    }

}
