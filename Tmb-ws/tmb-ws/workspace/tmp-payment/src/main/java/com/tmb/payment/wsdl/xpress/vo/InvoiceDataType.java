
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceNum"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TotalCurAmt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PaidCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceVouchNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Fee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoicePremium" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Discount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceAdj" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceData_Type", propOrder = {
    "invoiceType",
    "invoiceNum",
    "refData",
    "totalCurAmt",
    "paidCurAmt",
    "effDt",
    "desc",
    "invoiceVouchNum",
    "fee",
    "invoicePremium",
    "discount",
    "taxData",
    "invoiceAdj",
    "invoiceLineItem"
})
public class InvoiceDataType {

    @XmlElement(name = "InvoiceType")
    protected String invoiceType;
    @XmlElement(name = "InvoiceNum", required = true)
    protected String invoiceNum;
    @XmlElement(name = "RefData")
    protected List<RefDataType> refData;
    @XmlElement(name = "TotalCurAmt", required = true)
    protected TotalCurAmtType totalCurAmt;
    @XmlElement(name = "PaidCurAmt")
    protected PaidCurAmtType paidCurAmt;
    @XmlElement(name = "EffDt", required = true)
    protected String effDt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "InvoiceVouchNum")
    protected String invoiceVouchNum;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
    @XmlElement(name = "InvoicePremium")
    protected InvoicePremiumType invoicePremium;
    @XmlElement(name = "Discount")
    protected DiscountType discount;
    @XmlElement(name = "TaxData")
    protected TaxDataType taxData;
    @XmlElement(name = "InvoiceAdj")
    protected InvoiceAdjType invoiceAdj;
    @XmlElement(name = "InvoiceLineItem")
    protected List<InvoiceLineItemType> invoiceLineItem;

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the invoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Sets the value of the invoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNum(String value) {
        this.invoiceNum = value;
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
     * Gets the value of the totalCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCurAmtType }
     *     
     */
    public TotalCurAmtType getTotalCurAmt() {
        return totalCurAmt;
    }

    /**
     * Sets the value of the totalCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCurAmtType }
     *     
     */
    public void setTotalCurAmt(TotalCurAmtType value) {
        this.totalCurAmt = value;
    }

    /**
     * Gets the value of the paidCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PaidCurAmtType }
     *     
     */
    public PaidCurAmtType getPaidCurAmt() {
        return paidCurAmt;
    }

    /**
     * Sets the value of the paidCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidCurAmtType }
     *     
     */
    public void setPaidCurAmt(PaidCurAmtType value) {
        this.paidCurAmt = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
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

    /**
     * Gets the value of the invoiceVouchNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceVouchNum() {
        return invoiceVouchNum;
    }

    /**
     * Sets the value of the invoiceVouchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceVouchNum(String value) {
        this.invoiceVouchNum = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the invoicePremium property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePremiumType }
     *     
     */
    public InvoicePremiumType getInvoicePremium() {
        return invoicePremium;
    }

    /**
     * Sets the value of the invoicePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePremiumType }
     *     
     */
    public void setInvoicePremium(InvoicePremiumType value) {
        this.invoicePremium = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public void setDiscount(DiscountType value) {
        this.discount = value;
    }

    /**
     * Gets the value of the taxData property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDataType }
     *     
     */
    public TaxDataType getTaxData() {
        return taxData;
    }

    /**
     * Sets the value of the taxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataType }
     *     
     */
    public void setTaxData(TaxDataType value) {
        this.taxData = value;
    }

    /**
     * Gets the value of the invoiceAdj property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAdjType }
     *     
     */
    public InvoiceAdjType getInvoiceAdj() {
        return invoiceAdj;
    }

    /**
     * Sets the value of the invoiceAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAdjType }
     *     
     */
    public void setInvoiceAdj(InvoiceAdjType value) {
        this.invoiceAdj = value;
    }

    /**
     * Gets the value of the invoiceLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineItemType }
     * 
     * 
     */
    public List<InvoiceLineItemType> getInvoiceLineItem() {
        if (invoiceLineItem == null) {
            invoiceLineItem = new ArrayList<InvoiceLineItemType>();
        }
        return this.invoiceLineItem;
    }

}
