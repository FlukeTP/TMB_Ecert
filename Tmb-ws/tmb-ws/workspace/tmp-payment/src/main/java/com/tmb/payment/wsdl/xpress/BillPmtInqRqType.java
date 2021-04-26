
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.RecCtrlInType;


/**
 * <p>Java class for BillPmtInqRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPmtInqRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RqUID"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MsgRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecCtrlIn" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}BillPmtSel"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecSelect"/&gt;
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
@XmlType(name = "BillPmtInqRq_Type", propOrder = {
    "rqUID",
    "msgRqHdr",
    "recCtrlIn",
    "billPmtSelOrRecSelect"
})
public class BillPmtInqRqType {

    @XmlElementRef(name = "RqUID", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<String> rqUID;
    @XmlElementRef(name = "MsgRqHdr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MsgRqHdrType> msgRqHdr;
    @XmlElement(name = "RecCtrlIn", namespace = "urn:ifxforum-org:XSD:1")
    protected RecCtrlInType recCtrlIn;
    @XmlElements({
        @XmlElement(name = "BillPmtSel", type = BillPmtSelType.class),
        @XmlElement(name = "RecSelect", namespace = "urn:ifxforum-org:XSD:1", type = String.class)
    })
    protected List<Object> billPmtSelOrRecSelect;

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
     * Gets the value of the recCtrlIn property.
     * 
     * @return
     *     possible object is
     *     {@link RecCtrlInType }
     *     
     */
    public RecCtrlInType getRecCtrlIn() {
        return recCtrlIn;
    }

    /**
     * Sets the value of the recCtrlIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCtrlInType }
     *     
     */
    public void setRecCtrlIn(RecCtrlInType value) {
        this.recCtrlIn = value;
    }

    /**
     * Gets the value of the billPmtSelOrRecSelect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billPmtSelOrRecSelect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillPmtSelOrRecSelect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillPmtSelType }
     * {@link String }
     * 
     * 
     */
    public List<Object> getBillPmtSelOrRecSelect() {
        if (billPmtSelOrRecSelect == null) {
            billPmtSelOrRecSelect = new ArrayList<Object>();
        }
        return this.billPmtSelOrRecSelect;
    }

}
