
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopChkStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChkStatusRec_Type", propOrder = {
    "stopChkId",
    "stopChkStatus"
})
public class StopChkStatusRecType {

    @XmlElement(name = "StopChkId")
    protected String stopChkId;
    @XmlElementRef(name = "StopChkStatus", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkStatusType> stopChkStatus;

    /**
     * Gets the value of the stopChkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopChkId() {
        return stopChkId;
    }

    /**
     * Sets the value of the stopChkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopChkId(String value) {
        this.stopChkId = value;
    }

    /**
     * Gets the value of the stopChkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkStatusType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkStatusType> getStopChkStatus() {
        return stopChkStatus;
    }

    /**
     * Sets the value of the stopChkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkStatusType }{@code >}
     *     
     */
    public void setStopChkStatus(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkStatusType> value) {
        this.stopChkStatus = value;
    }

}
