
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemitInstruction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemitInstruction_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Contact" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemitInstruction_Type", propOrder = {
    "remitRefIdent",
    "pmtRefIdent",
    "deliveryInstruction",
    "deliveryMethod",
    "contact"
})
public class RemitInstructionType {

    @XmlElement(name = "RemitRefIdent")
    protected String remitRefIdent;
    @XmlElement(name = "PmtRefIdent")
    protected String pmtRefIdent;
    @XmlElement(name = "DeliveryInstruction")
    protected String deliveryInstruction;
    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElementRef(name = "Contact", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType> contact;

    /**
     * Gets the value of the remitRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitRefIdent() {
        return remitRefIdent;
    }

    /**
     * Sets the value of the remitRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitRefIdent(String value) {
        this.remitRefIdent = value;
    }

    /**
     * Gets the value of the pmtRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRefIdent() {
        return pmtRefIdent;
    }

    /**
     * Sets the value of the pmtRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRefIdent(String value) {
        this.pmtRefIdent = value;
    }

    /**
     * Gets the value of the deliveryInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstruction() {
        return deliveryInstruction;
    }

    /**
     * Sets the value of the deliveryInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstruction(String value) {
        this.deliveryInstruction = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ContactType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ContactType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ContactType }{@code >}
     *     
     */
    public void setContact(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType> value) {
        this.contact = value;
    }

}
