
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.ChkNumRangeType;


/**
 * <p>Java class for AcctHoldSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctHoldSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}AcctHoldKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HoldType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DtRange" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmtRange" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}InclExpInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}InitiatingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Desc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctHoldSel_Type", propOrder = {
    "acctHoldKeysOrAcctKeys",
    "holdType",
    "seqNum",
    "dtRange",
    "curAmtRange",
    "chkNumRange",
    "inclExpInd",
    "initiatingParty",
    "desc"
})
public class AcctHoldSelType {

    @XmlElementRefs({
        @XmlElementRef(name = "AcctHoldKeys", namespace = "http://www.fnf.com/xes", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> acctHoldKeysOrAcctKeys;
    @XmlElement(name = "HoldType")
    protected String holdType;
    @XmlElement(name = "SeqNum", namespace = "urn:ifxforum-org:XSD:1")
    protected Long seqNum;
    @XmlElementRef(name = "DtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> dtRange;
    @XmlElementRef(name = "CurAmtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType> curAmtRange;
    @XmlElement(name = "ChkNumRange", namespace = "urn:ifxforum-org:XSD:1")
    protected ChkNumRangeType chkNumRange;
    @XmlElement(name = "InclExpInd")
    protected Boolean inclExpInd;
    @XmlElement(name = "InitiatingParty")
    protected String initiatingParty;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the acctHoldKeysOrAcctKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctHoldKeysOrAcctKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctHoldKeysOrAcctKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AcctHoldKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAcctHoldKeysOrAcctKeys() {
        if (acctHoldKeysOrAcctKeys == null) {
            acctHoldKeysOrAcctKeys = new ArrayList<JAXBElement<?>>();
        }
        return this.acctHoldKeysOrAcctKeys;
    }

    /**
     * Gets the value of the holdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldType() {
        return holdType;
    }

    /**
     * Sets the value of the holdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldType(String value) {
        this.holdType = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the dtRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.DtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DtRangeType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> getDtRange() {
        return dtRange;
    }

    /**
     * Sets the value of the dtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.DtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DtRangeType }{@code >}
     *     
     */
    public void setDtRange(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> value) {
        this.dtRange = value;
    }

    /**
     * Gets the value of the curAmtRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CurAmtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType> getCurAmtRange() {
        return curAmtRange;
    }

    /**
     * Sets the value of the curAmtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CurAmtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType }{@code >}
     *     
     */
    public void setCurAmtRange(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType> value) {
        this.curAmtRange = value;
    }

    /**
     * Gets the value of the chkNumRange property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumRangeType }
     *     
     */
    public ChkNumRangeType getChkNumRange() {
        return chkNumRange;
    }

    /**
     * Sets the value of the chkNumRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumRangeType }
     *     
     */
    public void setChkNumRange(ChkNumRangeType value) {
        this.chkNumRange = value;
    }

    /**
     * Gets the value of the inclExpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclExpInd() {
        return inclExpInd;
    }

    /**
     * Sets the value of the inclExpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclExpInd(Boolean value) {
        this.inclExpInd = value;
    }

    /**
     * Gets the value of the initiatingParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingParty() {
        return initiatingParty;
    }

    /**
     * Sets the value of the initiatingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingParty(String value) {
        this.initiatingParty = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
