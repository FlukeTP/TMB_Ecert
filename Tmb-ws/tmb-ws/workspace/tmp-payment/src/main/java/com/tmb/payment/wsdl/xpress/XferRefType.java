
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XferRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferRec"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferInfo"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferRef_Type", propOrder = {
    "xferKeys",
    "xferRec",
    "xferInfo"
})
public class XferRefType {

    @XmlElementRef(name = "XferKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> xferKeys;
    @XmlElementRef(name = "XferRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferRecType> xferRec;
    @XmlElementRef(name = "XferInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> xferInfo;

    /**
     * Gets the value of the xferKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> getXferKeys() {
        return xferKeys;
    }

    /**
     * Sets the value of the xferKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferKeysType }{@code >}
     *     
     */
    public void setXferKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> value) {
        this.xferKeys = value;
    }

    /**
     * Gets the value of the xferRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferRecType> getXferRec() {
        return xferRec;
    }

    /**
     * Sets the value of the xferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferRecType }{@code >}
     *     
     */
    public void setXferRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferRecType> value) {
        this.xferRec = value;
    }

    /**
     * Gets the value of the xferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> getXferInfo() {
        return xferInfo;
    }

    /**
     * Sets the value of the xferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferInfoType }{@code >}
     *     
     */
    public void setXferInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> value) {
        this.xferInfo = value;
    }

}
