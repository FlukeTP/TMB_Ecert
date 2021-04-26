
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditAcctData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditAcctData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OriginationDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Freq" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TotalPmtCount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurposeDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CollateralDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RegPmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NextPmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrepayPenalty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LOCLoanData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditAcctData_Type", propOrder = {
    "originationDt",
    "freq",
    "totalPmtCount",
    "purposeDesc",
    "collateralDesc",
    "regPmt",
    "dueDt",
    "nextPmt",
    "prepayPenalty",
    "locLoanData"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.CreditAcctDataType.class
})
public class CreditAcctDataType {

    @XmlElement(name = "OriginationDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originationDt;
    @XmlElement(name = "Freq")
    protected String freq;
    @XmlElement(name = "TotalPmtCount")
    protected Long totalPmtCount;
    @XmlElement(name = "PurposeDesc")
    protected String purposeDesc;
    @XmlElement(name = "CollateralDesc")
    protected String collateralDesc;
    @XmlElement(name = "RegPmt")
    protected RegPmtType regPmt;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "NextPmt")
    protected NextPmtType nextPmt;
    @XmlElement(name = "PrepayPenalty")
    protected PrepayPenaltyType prepayPenalty;
    @XmlElement(name = "LOCLoanData")
    protected LOCLoanDataType locLoanData;

    /**
     * Gets the value of the originationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginationDt() {
        return originationDt;
    }

    /**
     * Sets the value of the originationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginationDt(XMLGregorianCalendar value) {
        this.originationDt = value;
    }

    /**
     * Gets the value of the freq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreq() {
        return freq;
    }

    /**
     * Sets the value of the freq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreq(String value) {
        this.freq = value;
    }

    /**
     * Gets the value of the totalPmtCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPmtCount() {
        return totalPmtCount;
    }

    /**
     * Sets the value of the totalPmtCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPmtCount(Long value) {
        this.totalPmtCount = value;
    }

    /**
     * Gets the value of the purposeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeDesc() {
        return purposeDesc;
    }

    /**
     * Sets the value of the purposeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeDesc(String value) {
        this.purposeDesc = value;
    }

    /**
     * Gets the value of the collateralDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralDesc() {
        return collateralDesc;
    }

    /**
     * Sets the value of the collateralDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralDesc(String value) {
        this.collateralDesc = value;
    }

    /**
     * Gets the value of the regPmt property.
     * 
     * @return
     *     possible object is
     *     {@link RegPmtType }
     *     
     */
    public RegPmtType getRegPmt() {
        return regPmt;
    }

    /**
     * Sets the value of the regPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegPmtType }
     *     
     */
    public void setRegPmt(RegPmtType value) {
        this.regPmt = value;
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
     * Gets the value of the nextPmt property.
     * 
     * @return
     *     possible object is
     *     {@link NextPmtType }
     *     
     */
    public NextPmtType getNextPmt() {
        return nextPmt;
    }

    /**
     * Sets the value of the nextPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextPmtType }
     *     
     */
    public void setNextPmt(NextPmtType value) {
        this.nextPmt = value;
    }

    /**
     * Gets the value of the prepayPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link PrepayPenaltyType }
     *     
     */
    public PrepayPenaltyType getPrepayPenalty() {
        return prepayPenalty;
    }

    /**
     * Sets the value of the prepayPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepayPenaltyType }
     *     
     */
    public void setPrepayPenalty(PrepayPenaltyType value) {
        this.prepayPenalty = value;
    }

    /**
     * Gets the value of the locLoanData property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLoanDataType }
     *     
     */
    public LOCLoanDataType getLOCLoanData() {
        return locLoanData;
    }

    /**
     * Sets the value of the locLoanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLoanDataType }
     *     
     */
    public void setLOCLoanData(LOCLoanDataType value) {
        this.locLoanData = value;
    }

}
