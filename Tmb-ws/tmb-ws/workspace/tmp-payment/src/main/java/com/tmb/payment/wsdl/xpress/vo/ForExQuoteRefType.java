
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExQuoteRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExQuoteRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteRef"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteInfo"/&gt;
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
@XmlType(name = "ForExQuoteRef_Type", propOrder = {
    "forExQuoteRef",
    "forExQuoteRec",
    "forExQuoteInfo"
})
public class ForExQuoteRefType {

    @XmlElement(name = "ForExQuoteRef")
    protected ForExQuoteRefType forExQuoteRef;
    @XmlElementRef(name = "ForExQuoteRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExQuoteRecType> forExQuoteRec;
    @XmlElement(name = "ForExQuoteInfo")
    protected ForExQuoteInfoType forExQuoteInfo;

    /**
     * Gets the value of the forExQuoteRef property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteRefType }
     *     
     */
    public ForExQuoteRefType getForExQuoteRef() {
        return forExQuoteRef;
    }

    /**
     * Sets the value of the forExQuoteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteRefType }
     *     
     */
    public void setForExQuoteRef(ForExQuoteRefType value) {
        this.forExQuoteRef = value;
    }

    /**
     * Gets the value of the forExQuoteRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExQuoteRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExQuoteRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExQuoteRecType> getForExQuoteRec() {
        return forExQuoteRec;
    }

    /**
     * Sets the value of the forExQuoteRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExQuoteRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExQuoteRecType }{@code >}
     *     
     */
    public void setForExQuoteRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExQuoteRecType> value) {
        this.forExQuoteRec = value;
    }

    /**
     * Gets the value of the forExQuoteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteInfoType }
     *     
     */
    public ForExQuoteInfoType getForExQuoteInfo() {
        return forExQuoteInfo;
    }

    /**
     * Sets the value of the forExQuoteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteInfoType }
     *     
     */
    public void setForExQuoteInfo(ForExQuoteInfoType value) {
        this.forExQuoteInfo = value;
    }

}
