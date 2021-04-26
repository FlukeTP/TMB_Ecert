
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctStatusModRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctStatusModRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RqUID"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctStatusModRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "acctKeys",
    "acctStatus"
})
public class AcctStatusModRqType {

    @XmlElementRef(name = "RqUID", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<String> rqUID;
    @XmlElementRef(name = "MsgRqHdr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MsgRqHdrType> msgRqHdr;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElementRef(name = "AcctStatus", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctStatusType> acctStatus;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRqUID(JAXBElement<String> value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MsgRqHdrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MsgRqHdrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MsgRqHdrType> getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MsgRqHdrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MsgRqHdrType }{@code >}
     *     
     */
    public void setMsgRqHdr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MsgRqHdrType> value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     
     */
    public void setAcctKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> value) {
        this.acctKeys = value;
    }

    /**
     * Gets the value of the acctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctStatusType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctStatusType> getAcctStatus() {
        return acctStatus;
    }

    /**
     * Sets the value of the acctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctStatusType }{@code >}
     *     
     */
    public void setAcctStatus(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctStatusType> value) {
        this.acctStatus = value;
    }

}
