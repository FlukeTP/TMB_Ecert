
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditMediaItem_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMediaItem_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditMediaItemIdent" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditMediaCashData"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditMediaChkData"/&gt;
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
@XmlType(name = "CreditMediaItem_Type", propOrder = {
    "creditMediaItemIdent",
    "creditMediaCashData",
    "creditMediaChkData"
})
public class CreditMediaItemType {

    @XmlElement(name = "CreditMediaItemIdent")
    protected String creditMediaItemIdent;
    @XmlElement(name = "CreditMediaCashData")
    protected CreditMediaCashDataType creditMediaCashData;
    @XmlElementRef(name = "CreditMediaChkData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType> creditMediaChkData;

    /**
     * Gets the value of the creditMediaItemIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditMediaItemIdent() {
        return creditMediaItemIdent;
    }

    /**
     * Sets the value of the creditMediaItemIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditMediaItemIdent(String value) {
        this.creditMediaItemIdent = value;
    }

    /**
     * Gets the value of the creditMediaCashData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditMediaCashDataType }
     *     
     */
    public CreditMediaCashDataType getCreditMediaCashData() {
        return creditMediaCashData;
    }

    /**
     * Sets the value of the creditMediaCashData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditMediaCashDataType }
     *     
     */
    public void setCreditMediaCashData(CreditMediaCashDataType value) {
        this.creditMediaCashData = value;
    }

    /**
     * Gets the value of the creditMediaChkData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditMediaChkDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType> getCreditMediaChkData() {
        return creditMediaChkData;
    }

    /**
     * Sets the value of the creditMediaChkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditMediaChkDataType }{@code >}
     *     
     */
    public void setCreditMediaChkData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType> value) {
        this.creditMediaChkData = value;
    }

}
