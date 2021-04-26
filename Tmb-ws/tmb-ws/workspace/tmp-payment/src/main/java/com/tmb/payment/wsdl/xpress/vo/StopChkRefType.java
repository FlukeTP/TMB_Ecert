
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopChkRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkInfo"/&gt;
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
@XmlType(name = "StopChkRef_Type", propOrder = {
    "stopChkKeys",
    "stopChkRec",
    "stopChkInfo"
})
public class StopChkRefType {

    @XmlElementRef(name = "StopChkKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkKeysType> stopChkKeys;
    @XmlElementRef(name = "StopChkRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkRecType> stopChkRec;
    @XmlElementRef(name = "StopChkInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkInfoType> stopChkInfo;

    /**
     * Gets the value of the stopChkKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkKeysType> getStopChkKeys() {
        return stopChkKeys;
    }

    /**
     * Sets the value of the stopChkKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkKeysType }{@code >}
     *     
     */
    public void setStopChkKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkKeysType> value) {
        this.stopChkKeys = value;
    }

    /**
     * Gets the value of the stopChkRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkRecType> getStopChkRec() {
        return stopChkRec;
    }

    /**
     * Sets the value of the stopChkRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkRecType }{@code >}
     *     
     */
    public void setStopChkRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkRecType> value) {
        this.stopChkRec = value;
    }

    /**
     * Gets the value of the stopChkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkInfoType> getStopChkInfo() {
        return stopChkInfo;
    }

    /**
     * Sets the value of the stopChkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkInfoType }{@code >}
     *     
     */
    public void setStopChkInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkInfoType> value) {
        this.stopChkInfo = value;
    }

}
