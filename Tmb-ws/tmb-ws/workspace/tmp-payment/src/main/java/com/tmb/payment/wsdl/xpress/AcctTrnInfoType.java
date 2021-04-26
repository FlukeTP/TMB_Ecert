
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AcctTrnInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RetireAcctTrnData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntRateData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctTrnMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtSymbol" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnDesc1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnDesc2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnChannel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TellerId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OriginationDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PendingInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnInfo_Type", propOrder = {
    "retireAcctTrnData",
    "intRateData",
    "acctTrnMiscData",
    "trnSeqNum",
    "stmtSymbol",
    "trnDesc1",
    "trnDesc2",
    "trnChannel",
    "tellerId",
    "originationDt",
    "pendingInd"
})
public class AcctTrnInfoType
    extends com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType
{

    @XmlElement(name = "RetireAcctTrnData")
    protected List<RetireAcctTrnDataType> retireAcctTrnData;
    @XmlElementRef(name = "IntRateData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntRateDataType> intRateData;
    @XmlElement(name = "AcctTrnMiscData")
    protected List<AcctTrnMiscDataType> acctTrnMiscData;
    @XmlElement(name = "TrnSeqNum")
    protected String trnSeqNum;
    @XmlElement(name = "StmtSymbol")
    protected String stmtSymbol;
    @XmlElement(name = "TrnDesc1")
    protected String trnDesc1;
    @XmlElement(name = "TrnDesc2")
    protected String trnDesc2;
    @XmlElement(name = "TrnChannel")
    protected String trnChannel;
    @XmlElement(name = "TellerId")
    protected String tellerId;
    @XmlElement(name = "OriginationDt")
    protected String originationDt;
    @XmlElement(name = "PendingInd")
    protected Boolean pendingInd;

    /**
     * Gets the value of the retireAcctTrnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retireAcctTrnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetireAcctTrnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetireAcctTrnDataType }
     * 
     * 
     */
    public List<RetireAcctTrnDataType> getRetireAcctTrnData() {
        if (retireAcctTrnData == null) {
            retireAcctTrnData = new ArrayList<RetireAcctTrnDataType>();
        }
        return this.retireAcctTrnData;
    }

    /**
     * Gets the value of the intRateData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IntRateDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IntRateDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntRateDataType> getIntRateData() {
        return intRateData;
    }

    /**
     * Sets the value of the intRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IntRateDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IntRateDataType }{@code >}
     *     
     */
    public void setIntRateData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntRateDataType> value) {
        this.intRateData = value;
    }

    /**
     * Gets the value of the acctTrnMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctTrnMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTrnMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctTrnMiscDataType }
     * 
     * 
     */
    public List<AcctTrnMiscDataType> getAcctTrnMiscData() {
        if (acctTrnMiscData == null) {
            acctTrnMiscData = new ArrayList<AcctTrnMiscDataType>();
        }
        return this.acctTrnMiscData;
    }

    /**
     * Gets the value of the trnSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSeqNum() {
        return trnSeqNum;
    }

    /**
     * Sets the value of the trnSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSeqNum(String value) {
        this.trnSeqNum = value;
    }

    /**
     * Gets the value of the stmtSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtSymbol() {
        return stmtSymbol;
    }

    /**
     * Sets the value of the stmtSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtSymbol(String value) {
        this.stmtSymbol = value;
    }

    /**
     * Gets the value of the trnDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnDesc1() {
        return trnDesc1;
    }

    /**
     * Sets the value of the trnDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnDesc1(String value) {
        this.trnDesc1 = value;
    }

    /**
     * Gets the value of the trnDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnDesc2() {
        return trnDesc2;
    }

    /**
     * Sets the value of the trnDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnDesc2(String value) {
        this.trnDesc2 = value;
    }

    /**
     * Gets the value of the trnChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnChannel() {
        return trnChannel;
    }

    /**
     * Sets the value of the trnChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnChannel(String value) {
        this.trnChannel = value;
    }

    /**
     * Gets the value of the tellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerId() {
        return tellerId;
    }

    /**
     * Sets the value of the tellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerId(String value) {
        this.tellerId = value;
    }

    /**
     * Gets the value of the originationDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginationDt() {
        return originationDt;
    }

    /**
     * Sets the value of the originationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginationDt(String value) {
        this.originationDt = value;
    }

    /**
     * Gets the value of the pendingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingInd() {
        return pendingInd;
    }

    /**
     * Sets the value of the pendingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingInd(Boolean value) {
        this.pendingInd = value;
    }

}
