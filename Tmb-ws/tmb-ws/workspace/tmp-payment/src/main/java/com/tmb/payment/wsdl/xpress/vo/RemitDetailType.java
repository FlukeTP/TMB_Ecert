
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemitDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemitDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceReceiver" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceSender" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtSummAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillRefData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillingAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemitDetail_Type", propOrder = {
    "invoiceReceiver",
    "invoiceSender",
    "curAmt",
    "pmtSummAmt",
    "refData",
    "billRefData",
    "billId",
    "memo",
    "billingAcct",
    "invoiceData"
})
public class RemitDetailType {

    @XmlElement(name = "InvoiceReceiver")
    protected InvoiceReceiverType invoiceReceiver;
    @XmlElement(name = "InvoiceSender")
    protected InvoiceSenderType invoiceSender;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "PmtSummAmt")
    protected List<PmtSummAmtType> pmtSummAmt;
    @XmlElement(name = "RefData")
    protected List<RefDataType> refData;
    @XmlElement(name = "BillRefData")
    protected String billRefData;
    @XmlElement(name = "BillId")
    protected String billId;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "BillingAcct")
    protected String billingAcct;
    @XmlElement(name = "InvoiceData")
    protected List<InvoiceDataType> invoiceData;

    /**
     * Gets the value of the invoiceReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceReceiverType }
     *     
     */
    public InvoiceReceiverType getInvoiceReceiver() {
        return invoiceReceiver;
    }

    /**
     * Sets the value of the invoiceReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceReceiverType }
     *     
     */
    public void setInvoiceReceiver(InvoiceReceiverType value) {
        this.invoiceReceiver = value;
    }

    /**
     * Gets the value of the invoiceSender property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSenderType }
     *     
     */
    public InvoiceSenderType getInvoiceSender() {
        return invoiceSender;
    }

    /**
     * Sets the value of the invoiceSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSenderType }
     *     
     */
    public void setInvoiceSender(InvoiceSenderType value) {
        this.invoiceSender = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setCurAmt(CurAmtType value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the pmtSummAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtSummAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtSummAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtSummAmtType }
     * 
     * 
     */
    public List<PmtSummAmtType> getPmtSummAmt() {
        if (pmtSummAmt == null) {
            pmtSummAmt = new ArrayList<PmtSummAmtType>();
        }
        return this.pmtSummAmt;
    }

    /**
     * Gets the value of the refData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefDataType }
     * 
     * 
     */
    public List<RefDataType> getRefData() {
        if (refData == null) {
            refData = new ArrayList<RefDataType>();
        }
        return this.refData;
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

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillId(String value) {
        this.billId = value;
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
     * Gets the value of the billingAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAcct() {
        return billingAcct;
    }

    /**
     * Sets the value of the billingAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAcct(String value) {
        this.billingAcct = value;
    }

    /**
     * Gets the value of the invoiceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceDataType }
     * 
     * 
     */
    public List<InvoiceDataType> getInvoiceData() {
        if (invoiceData == null) {
            invoiceData = new ArrayList<InvoiceDataType>();
        }
        return this.invoiceData;
    }

}
