
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AsyncRqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CredentialsRsHdr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContextRsHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FeeRsHdr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardUpdateRsHdr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRsHdr_Type", propOrder = {
    "asyncRqUID",
    "credentialsRsHdr",
    "contextRsHdr",
    "feeRsHdr",
    "cardUpdateRsHdr"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.MsgRsHdrType.class,
    OperRsHdrType.class
})
public class MsgRsHdrType {

    @XmlElement(name = "AsyncRqUID")
    protected String asyncRqUID;
    @XmlElementRef(name = "CredentialsRsHdr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CredentialsRsHdrType>> credentialsRsHdr;
    @XmlElementRef(name = "ContextRsHdr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContextRsHdrType> contextRsHdr;
    @XmlElement(name = "FeeRsHdr")
    protected List<FeeRsHdrType> feeRsHdr;
    @XmlElement(name = "CardUpdateRsHdr")
    protected CardUpdateRsHdrType cardUpdateRsHdr;

    /**
     * Gets the value of the asyncRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncRqUID() {
        return asyncRqUID;
    }

    /**
     * Sets the value of the asyncRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncRqUID(String value) {
        this.asyncRqUID = value;
    }

    /**
     * Gets the value of the credentialsRsHdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credentialsRsHdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredentialsRsHdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CredentialsRsHdrType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CredentialsRsHdrType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CredentialsRsHdrType>> getCredentialsRsHdr() {
        if (credentialsRsHdr == null) {
            credentialsRsHdr = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CredentialsRsHdrType>>();
        }
        return this.credentialsRsHdr;
    }

    /**
     * Gets the value of the contextRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ContextRsHdrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ContextRsHdrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContextRsHdrType> getContextRsHdr() {
        return contextRsHdr;
    }

    /**
     * Sets the value of the contextRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ContextRsHdrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ContextRsHdrType }{@code >}
     *     
     */
    public void setContextRsHdr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContextRsHdrType> value) {
        this.contextRsHdr = value;
    }

    /**
     * Gets the value of the feeRsHdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeRsHdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeRsHdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeRsHdrType }
     * 
     * 
     */
    public List<FeeRsHdrType> getFeeRsHdr() {
        if (feeRsHdr == null) {
            feeRsHdr = new ArrayList<FeeRsHdrType>();
        }
        return this.feeRsHdr;
    }

    /**
     * Gets the value of the cardUpdateRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CardUpdateRsHdrType }
     *     
     */
    public CardUpdateRsHdrType getCardUpdateRsHdr() {
        return cardUpdateRsHdr;
    }

    /**
     * Sets the value of the cardUpdateRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardUpdateRsHdrType }
     *     
     */
    public void setCardUpdateRsHdr(CardUpdateRsHdrType value) {
        this.cardUpdateRsHdr = value;
    }

}
