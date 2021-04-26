
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntDispData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntDispData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntDisposition"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntDistAcctRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntDispData_Type", propOrder = {
    "intDisposition",
    "intDistAcctRef"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.IntDispDataType.class
})
public class IntDispDataType {

    @XmlElement(name = "IntDisposition", required = true)
    protected String intDisposition;
    @XmlElementRef(name = "IntDistAcctRef", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntDistAcctRefType> intDistAcctRef;

    /**
     * Gets the value of the intDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntDisposition() {
        return intDisposition;
    }

    /**
     * Sets the value of the intDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntDisposition(String value) {
        this.intDisposition = value;
    }

    /**
     * Gets the value of the intDistAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IntDistAcctRefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IntDistAcctRefType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntDistAcctRefType> getIntDistAcctRef() {
        return intDistAcctRef;
    }

    /**
     * Sets the value of the intDistAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IntDistAcctRefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IntDistAcctRefType }{@code >}
     *     
     */
    public void setIntDistAcctRef(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntDistAcctRefType> value) {
        this.intDistAcctRef = value;
    }

}
