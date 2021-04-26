
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for Security_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Security_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PiecesCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OrigUnitCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UnitCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UnitValAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UnitPrice" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CUSIPNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ISINIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SafekeepingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PowerOnFileInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AssignmentOnFileInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LOCDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Beneficiary" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IssuedBy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HeldBy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContractDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContractNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Owner" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTypeValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security_Type", propOrder = {
    "piecesCount",
    "origUnitCount",
    "unitCount",
    "unitValAmt",
    "unitPrice",
    "cusipNum",
    "isinIdent",
    "safekeepingCode",
    "powerOnFileInd",
    "assignmentOnFileInd",
    "locDt",
    "beneficiary",
    "issuedBy",
    "heldBy",
    "contractDt",
    "contractNumber",
    "owner",
    "acctTypeValue"
})
public class SecurityType {

    @XmlElement(name = "PiecesCount")
    protected Long piecesCount;
    @XmlElement(name = "OrigUnitCount")
    protected Long origUnitCount;
    @XmlElement(name = "UnitCount")
    protected Long unitCount;
    @XmlElement(name = "UnitValAmt")
    protected CurAmtType unitValAmt;
    @XmlElement(name = "UnitPrice")
    protected CurAmtType unitPrice;
    @XmlElement(name = "CUSIPNum")
    protected String cusipNum;
    @XmlElement(name = "ISINIdent")
    protected String isinIdent;
    @XmlElement(name = "SafekeepingCode")
    protected String safekeepingCode;
    @XmlElement(name = "PowerOnFileInd")
    protected Boolean powerOnFileInd;
    @XmlElement(name = "AssignmentOnFileInd")
    protected Boolean assignmentOnFileInd;
    @XmlElement(name = "LOCDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar locDt;
    @XmlElement(name = "Beneficiary")
    protected String beneficiary;
    @XmlElement(name = "IssuedBy")
    protected String issuedBy;
    @XmlElement(name = "HeldBy")
    protected String heldBy;
    @XmlElement(name = "ContractDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractDt;
    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "AcctTypeValue", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctTypeValue;

    /**
     * Gets the value of the piecesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPiecesCount() {
        return piecesCount;
    }

    /**
     * Sets the value of the piecesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPiecesCount(Long value) {
        this.piecesCount = value;
    }

    /**
     * Gets the value of the origUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrigUnitCount() {
        return origUnitCount;
    }

    /**
     * Sets the value of the origUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrigUnitCount(Long value) {
        this.origUnitCount = value;
    }

    /**
     * Gets the value of the unitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitCount() {
        return unitCount;
    }

    /**
     * Sets the value of the unitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitCount(Long value) {
        this.unitCount = value;
    }

    /**
     * Gets the value of the unitValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getUnitValAmt() {
        return unitValAmt;
    }

    /**
     * Sets the value of the unitValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setUnitValAmt(CurAmtType value) {
        this.unitValAmt = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setUnitPrice(CurAmtType value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the cusipNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSIPNum() {
        return cusipNum;
    }

    /**
     * Sets the value of the cusipNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSIPNum(String value) {
        this.cusipNum = value;
    }

    /**
     * Gets the value of the isinIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISINIdent() {
        return isinIdent;
    }

    /**
     * Sets the value of the isinIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISINIdent(String value) {
        this.isinIdent = value;
    }

    /**
     * Gets the value of the safekeepingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafekeepingCode() {
        return safekeepingCode;
    }

    /**
     * Sets the value of the safekeepingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafekeepingCode(String value) {
        this.safekeepingCode = value;
    }

    /**
     * Gets the value of the powerOnFileInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerOnFileInd() {
        return powerOnFileInd;
    }

    /**
     * Sets the value of the powerOnFileInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerOnFileInd(Boolean value) {
        this.powerOnFileInd = value;
    }

    /**
     * Gets the value of the assignmentOnFileInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignmentOnFileInd() {
        return assignmentOnFileInd;
    }

    /**
     * Sets the value of the assignmentOnFileInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignmentOnFileInd(Boolean value) {
        this.assignmentOnFileInd = value;
    }

    /**
     * Gets the value of the locDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLOCDt() {
        return locDt;
    }

    /**
     * Sets the value of the locDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLOCDt(XMLGregorianCalendar value) {
        this.locDt = value;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiary(String value) {
        this.beneficiary = value;
    }

    /**
     * Gets the value of the issuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * Sets the value of the issuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedBy(String value) {
        this.issuedBy = value;
    }

    /**
     * Gets the value of the heldBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeldBy() {
        return heldBy;
    }

    /**
     * Sets the value of the heldBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeldBy(String value) {
        this.heldBy = value;
    }

    /**
     * Gets the value of the contractDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDt() {
        return contractDt;
    }

    /**
     * Sets the value of the contractDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDt(XMLGregorianCalendar value) {
        this.contractDt = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the acctTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTypeValue() {
        return acctTypeValue;
    }

    /**
     * Sets the value of the acctTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTypeValue(String value) {
        this.acctTypeValue = value;
    }

}
