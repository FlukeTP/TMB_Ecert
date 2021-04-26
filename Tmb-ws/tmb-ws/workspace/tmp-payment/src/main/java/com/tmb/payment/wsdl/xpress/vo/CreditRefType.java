
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditInfo"/&gt;
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
@XmlType(name = "CreditRef_Type", propOrder = {
    "creditKeys",
    "creditRec",
    "creditInfo"
})
public class CreditRefType {

    @XmlElement(name = "CreditKeys")
    protected CreditKeysType creditKeys;
    @XmlElement(name = "CreditRec")
    protected CreditRecType creditRec;
    @XmlElementRef(name = "CreditInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditInfoType> creditInfo;

    /**
     * Gets the value of the creditKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CreditKeysType }
     *     
     */
    public CreditKeysType getCreditKeys() {
        return creditKeys;
    }

    /**
     * Sets the value of the creditKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditKeysType }
     *     
     */
    public void setCreditKeys(CreditKeysType value) {
        this.creditKeys = value;
    }

    /**
     * Gets the value of the creditRec property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRecType }
     *     
     */
    public CreditRecType getCreditRec() {
        return creditRec;
    }

    /**
     * Sets the value of the creditRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRecType }
     *     
     */
    public void setCreditRec(CreditRecType value) {
        this.creditRec = value;
    }

    /**
     * Gets the value of the creditInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditInfoType> getCreditInfo() {
        return creditInfo;
    }

    /**
     * Sets the value of the creditInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditInfoType }{@code >}
     *     
     */
    public void setCreditInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditInfoType> value) {
        this.creditInfo = value;
    }

}
