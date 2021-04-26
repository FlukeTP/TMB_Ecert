
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPmtAddRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPmtAddRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RqUID"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPmtAddRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "billPmtInfo"
})
public class BillPmtAddRqType {

    @XmlElementRef(name = "RqUID", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<String> rqUID;
    @XmlElementRef(name = "MsgRqHdr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MsgRqHdrType> msgRqHdr;
    @XmlElement(name = "BillPmtInfo", required = true)
    protected BillPmtInfoType billPmtInfo;

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
     * Gets the value of the billPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillPmtInfoType }
     *     
     */
    public BillPmtInfoType getBillPmtInfo() {
        return billPmtInfo;
    }

    /**
     * Sets the value of the billPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPmtInfoType }
     *     
     */
    public void setBillPmtInfo(BillPmtInfoType value) {
        this.billPmtInfo = value;
    }

}
