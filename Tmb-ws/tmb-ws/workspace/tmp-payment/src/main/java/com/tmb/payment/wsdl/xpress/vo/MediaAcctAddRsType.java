
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctAddRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctAddRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Status" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RqUID"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MsgRsHdr" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctRec"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctStatusRec"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAcctAddRs_Type", propOrder = {
    "status",
    "rqUID",
    "msgRsHdr",
    "mediaAcctRec",
    "mediaAcctStatusRec"
})
public class MediaAcctAddRsType {

    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElementRef(name = "RqUID", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<String> rqUID;
    @XmlElementRef(name = "MsgRsHdr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MsgRsHdrType> msgRsHdr;
    @XmlElementRef(name = "MediaAcctRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType> mediaAcctRec;
    @XmlElementRef(name = "MediaAcctStatusRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctStatusRecType> mediaAcctStatusRec;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

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
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MsgRsHdrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MsgRsHdrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MsgRsHdrType> getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MsgRsHdrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MsgRsHdrType }{@code >}
     *     
     */
    public void setMsgRsHdr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MsgRsHdrType> value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the mediaAcctRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaAcctRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType> getMediaAcctRec() {
        return mediaAcctRec;
    }

    /**
     * Sets the value of the mediaAcctRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaAcctRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType }{@code >}
     *     
     */
    public void setMediaAcctRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType> value) {
        this.mediaAcctRec = value;
    }

    /**
     * Gets the value of the mediaAcctStatusRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaAcctStatusRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaAcctStatusRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctStatusRecType> getMediaAcctStatusRec() {
        return mediaAcctStatusRec;
    }

    /**
     * Sets the value of the mediaAcctStatusRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaAcctStatusRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaAcctStatusRecType }{@code >}
     *     
     */
    public void setMediaAcctStatusRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctStatusRecType> value) {
        this.mediaAcctStatusRec = value;
    }

}
