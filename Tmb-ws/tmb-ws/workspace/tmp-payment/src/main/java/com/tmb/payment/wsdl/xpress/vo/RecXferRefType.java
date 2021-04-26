
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecXferRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecXferRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferInfo"/&gt;
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
@XmlType(name = "RecXferRef_Type", propOrder = {
    "recXferKeys",
    "recXferRec",
    "recXferInfo"
})
public class RecXferRefType {

    @XmlElementRef(name = "RecXferKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferKeysType> recXferKeys;
    @XmlElementRef(name = "RecXferRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferRecType> recXferRec;
    @XmlElementRef(name = "RecXferInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferInfoType> recXferInfo;

    /**
     * Gets the value of the recXferKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferKeysType> getRecXferKeys() {
        return recXferKeys;
    }

    /**
     * Sets the value of the recXferKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferKeysType }{@code >}
     *     
     */
    public void setRecXferKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferKeysType> value) {
        this.recXferKeys = value;
    }

    /**
     * Gets the value of the recXferRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferRecType> getRecXferRec() {
        return recXferRec;
    }

    /**
     * Sets the value of the recXferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferRecType }{@code >}
     *     
     */
    public void setRecXferRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferRecType> value) {
        this.recXferRec = value;
    }

    /**
     * Gets the value of the recXferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferInfoType> getRecXferInfo() {
        return recXferInfo;
    }

    /**
     * Sets the value of the recXferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferInfoType }{@code >}
     *     
     */
    public void setRecXferInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferInfoType> value) {
        this.recXferInfo = value;
    }

}
