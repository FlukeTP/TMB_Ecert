
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
 * <p>Java class for MsgRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AsyncRqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CredentialsRqHdr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContextRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FeeRqHdr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRqHdr_Type", propOrder = {
    "asyncRqUID",
    "credentialsRqHdr",
    "contextRqHdr",
    "feeRqHdr"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.MsgRqHdrType.class,
    OperRqHdrType.class
})
public class MsgRqHdrType {

    @XmlElement(name = "AsyncRqUID")
    protected String asyncRqUID;
    @XmlElementRef(name = "CredentialsRqHdr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CredentialsRqHdrType>> credentialsRqHdr;
    @XmlElementRef(name = "ContextRqHdr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContextRqHdrType> contextRqHdr;
    @XmlElement(name = "FeeRqHdr")
    protected List<FeeRqHdrType> feeRqHdr;

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
     * Gets the value of the credentialsRqHdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credentialsRqHdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredentialsRqHdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CredentialsRqHdrType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CredentialsRqHdrType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CredentialsRqHdrType>> getCredentialsRqHdr() {
        if (credentialsRqHdr == null) {
            credentialsRqHdr = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CredentialsRqHdrType>>();
        }
        return this.credentialsRqHdr;
    }

    /**
     * Gets the value of the contextRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ContextRqHdrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ContextRqHdrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContextRqHdrType> getContextRqHdr() {
        return contextRqHdr;
    }

    /**
     * Sets the value of the contextRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ContextRqHdrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ContextRqHdrType }{@code >}
     *     
     */
    public void setContextRqHdr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContextRqHdrType> value) {
        this.contextRqHdr = value;
    }

    /**
     * Gets the value of the feeRqHdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeRqHdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeRqHdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeRqHdrType }
     * 
     * 
     */
    public List<FeeRqHdrType> getFeeRqHdr() {
        if (feeRqHdr == null) {
            feeRqHdr = new ArrayList<FeeRqHdrType>();
        }
        return this.feeRqHdr;
    }

}
