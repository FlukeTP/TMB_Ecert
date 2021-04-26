
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExRateSheetRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExRateSheetRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetInfo"/&gt;
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
@XmlType(name = "ForExRateSheetRef_Type", propOrder = {
    "forExRateSheetKeys",
    "forExRateSheetRec",
    "forExRateSheetInfo"
})
public class ForExRateSheetRefType {

    @XmlElement(name = "ForExRateSheetKeys")
    protected ForExRateSheetKeysType forExRateSheetKeys;
    @XmlElementRef(name = "ForExRateSheetRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetRecType> forExRateSheetRec;
    @XmlElementRef(name = "ForExRateSheetInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType> forExRateSheetInfo;

    /**
     * Gets the value of the forExRateSheetKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateSheetKeysType }
     *     
     */
    public ForExRateSheetKeysType getForExRateSheetKeys() {
        return forExRateSheetKeys;
    }

    /**
     * Sets the value of the forExRateSheetKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateSheetKeysType }
     *     
     */
    public void setForExRateSheetKeys(ForExRateSheetKeysType value) {
        this.forExRateSheetKeys = value;
    }

    /**
     * Gets the value of the forExRateSheetRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExRateSheetRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExRateSheetRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetRecType> getForExRateSheetRec() {
        return forExRateSheetRec;
    }

    /**
     * Sets the value of the forExRateSheetRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExRateSheetRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExRateSheetRecType }{@code >}
     *     
     */
    public void setForExRateSheetRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetRecType> value) {
        this.forExRateSheetRec = value;
    }

    /**
     * Gets the value of the forExRateSheetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExRateSheetInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType> getForExRateSheetInfo() {
        return forExRateSheetInfo;
    }

    /**
     * Sets the value of the forExRateSheetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExRateSheetInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType }{@code >}
     *     
     */
    public void setForExRateSheetInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType> value) {
        this.forExRateSheetInfo = value;
    }

}
