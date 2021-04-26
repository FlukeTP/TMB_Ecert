
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctBalType;
import com.tmb.payment.wsdl.xpress.vo.AcctTypeType;
import com.tmb.payment.wsdl.xpress.vo.CurCodeType;
import com.tmb.payment.wsdl.xpress.vo.FIDataType;
import com.tmb.payment.wsdl.xpress.vo.InitialAmountType;
import com.tmb.payment.wsdl.xpress.vo.LOCLimitType;
import com.tmb.payment.wsdl.xpress.vo.TermType;


/**
 * <p>Java class for AcctDft_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctDft_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctDataType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProductIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InitialAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Rate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LOCLimit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DepAppAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdDfltMisc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctDft_Type", propOrder = {
    "acctDataType",
    "acctType",
    "productIdent",
    "fiData",
    "initialAmount",
    "rate",
    "name",
    "term",
    "curCode",
    "locLimit",
    "acctBal",
    "depAppAcct",
    "prodDfltMisc"
})
public class AcctDftType {

    @XmlElement(name = "AcctDataType")
    protected String acctDataType;
    @XmlElement(name = "AcctType", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctTypeType acctType;
    @XmlElement(name = "ProductIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String productIdent;
    @XmlElement(name = "FIData", namespace = "urn:ifxforum-org:XSD:1")
    protected FIDataType fiData;
    @XmlElement(name = "InitialAmount", namespace = "urn:ifxforum-org:XSD:1")
    protected InitialAmountType initialAmount;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Term", namespace = "urn:ifxforum-org:XSD:1")
    protected TermType term;
    @XmlElement(name = "CurCode", namespace = "urn:ifxforum-org:XSD:1")
    protected CurCodeType curCode;
    @XmlElement(name = "LOCLimit", namespace = "urn:ifxforum-org:XSD:1")
    protected LOCLimitType locLimit;
    @XmlElement(name = "AcctBal", namespace = "urn:ifxforum-org:XSD:1")
    protected List<AcctBalType> acctBal;
    @XmlElement(name = "DepAppAcct")
    protected DepAppAcctType depAppAcct;
    @XmlElement(name = "ProdDfltMisc")
    protected List<ProdDfltMiscType> prodDfltMisc;

    /**
     * Gets the value of the acctDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDataType() {
        return acctDataType;
    }

    /**
     * Sets the value of the acctDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDataType(String value) {
        this.acctDataType = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the productIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdent() {
        return productIdent;
    }

    /**
     * Sets the value of the productIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdent(String value) {
        this.productIdent = value;
    }

    /**
     * Gets the value of the fiData property.
     * 
     * @return
     *     possible object is
     *     {@link FIDataType }
     *     
     */
    public FIDataType getFIData() {
        return fiData;
    }

    /**
     * Sets the value of the fiData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIDataType }
     *     
     */
    public void setFIData(FIDataType value) {
        this.fiData = value;
    }

    /**
     * Gets the value of the initialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InitialAmountType }
     *     
     */
    public InitialAmountType getInitialAmount() {
        return initialAmount;
    }

    /**
     * Sets the value of the initialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialAmountType }
     *     
     */
    public void setInitialAmount(InitialAmountType value) {
        this.initialAmount = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurCodeType }
     *     
     */
    public CurCodeType getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurCodeType }
     *     
     */
    public void setCurCode(CurCodeType value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the locLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLimitType }
     *     
     */
    public LOCLimitType getLOCLimit() {
        return locLimit;
    }

    /**
     * Sets the value of the locLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLimitType }
     *     
     */
    public void setLOCLimit(LOCLimitType value) {
        this.locLimit = value;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBalType }
     * 
     * 
     */
    public List<AcctBalType> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBalType>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the depAppAcct property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppAcctType }
     *     
     */
    public DepAppAcctType getDepAppAcct() {
        return depAppAcct;
    }

    /**
     * Sets the value of the depAppAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppAcctType }
     *     
     */
    public void setDepAppAcct(DepAppAcctType value) {
        this.depAppAcct = value;
    }

    /**
     * Gets the value of the prodDfltMisc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodDfltMisc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdDfltMisc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdDfltMiscType }
     * 
     * 
     */
    public List<ProdDfltMiscType> getProdDfltMisc() {
        if (prodDfltMisc == null) {
            prodDfltMisc = new ArrayList<ProdDfltMiscType>();
        }
        return this.prodDfltMisc;
    }

}
