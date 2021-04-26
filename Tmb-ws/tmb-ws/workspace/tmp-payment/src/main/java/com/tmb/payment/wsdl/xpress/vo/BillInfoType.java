
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PresAcctId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillSummAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillDt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OpenDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CloseDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtInst" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NotifyReqd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ViewDtlPref" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillStmtData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillRefData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillInfo_Type", propOrder = {
    "billType",
    "partyRef",
    "presAcctId",
    "memo",
    "billSummAmt",
    "dueDt",
    "billDt",
    "openDt",
    "closeDt",
    "pmtInst",
    "notifyReqd",
    "viewDtlPref",
    "billStmtData",
    "billRefData"
})
public class BillInfoType {

    @XmlElement(name = "BillType", required = true)
    protected String billType;
    @XmlElement(name = "PartyRef")
    protected PartyRefType partyRef;
    @XmlElement(name = "PresAcctId", required = true)
    protected PresAcctIdType presAcctId;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "BillSummAmt")
    protected List<BillSummAmtType> billSummAmt;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "BillDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDt;
    @XmlElement(name = "OpenDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDt;
    @XmlElement(name = "CloseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closeDt;
    @XmlElement(name = "PmtInst")
    protected List<PmtInstType> pmtInst;
    @XmlElement(name = "NotifyReqd")
    protected Boolean notifyReqd;
    @XmlElement(name = "ViewDtlPref")
    protected String viewDtlPref;
    @XmlElement(name = "BillStmtData")
    protected BillStmtDataType billStmtData;
    @XmlElement(name = "BillRefData")
    protected String billRefData;

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the partyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRefType }
     *     
     */
    public PartyRefType getPartyRef() {
        return partyRef;
    }

    /**
     * Sets the value of the partyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRefType }
     *     
     */
    public void setPartyRef(PartyRefType value) {
        this.partyRef = value;
    }

    /**
     * Gets the value of the presAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link PresAcctIdType }
     *     
     */
    public PresAcctIdType getPresAcctId() {
        return presAcctId;
    }

    /**
     * Sets the value of the presAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresAcctIdType }
     *     
     */
    public void setPresAcctId(PresAcctIdType value) {
        this.presAcctId = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the billSummAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billSummAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillSummAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillSummAmtType }
     * 
     * 
     */
    public List<BillSummAmtType> getBillSummAmt() {
        if (billSummAmt == null) {
            billSummAmt = new ArrayList<BillSummAmtType>();
        }
        return this.billSummAmt;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the billDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDt() {
        return billDt;
    }

    /**
     * Sets the value of the billDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDt(XMLGregorianCalendar value) {
        this.billDt = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDt(XMLGregorianCalendar value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the closeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDt() {
        return closeDt;
    }

    /**
     * Sets the value of the closeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDt(XMLGregorianCalendar value) {
        this.closeDt = value;
    }

    /**
     * Gets the value of the pmtInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtInstType }
     * 
     * 
     */
    public List<PmtInstType> getPmtInst() {
        if (pmtInst == null) {
            pmtInst = new ArrayList<PmtInstType>();
        }
        return this.pmtInst;
    }

    /**
     * Gets the value of the notifyReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyReqd() {
        return notifyReqd;
    }

    /**
     * Sets the value of the notifyReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyReqd(Boolean value) {
        this.notifyReqd = value;
    }

    /**
     * Gets the value of the viewDtlPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewDtlPref() {
        return viewDtlPref;
    }

    /**
     * Sets the value of the viewDtlPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewDtlPref(String value) {
        this.viewDtlPref = value;
    }

    /**
     * Gets the value of the billStmtData property.
     * 
     * @return
     *     possible object is
     *     {@link BillStmtDataType }
     *     
     */
    public BillStmtDataType getBillStmtData() {
        return billStmtData;
    }

    /**
     * Sets the value of the billStmtData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillStmtDataType }
     *     
     */
    public void setBillStmtData(BillStmtDataType value) {
        this.billStmtData = value;
    }

    /**
     * Gets the value of the billRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRefData() {
        return billRefData;
    }

    /**
     * Sets the value of the billRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRefData(String value) {
        this.billRefData = value;
    }

}
