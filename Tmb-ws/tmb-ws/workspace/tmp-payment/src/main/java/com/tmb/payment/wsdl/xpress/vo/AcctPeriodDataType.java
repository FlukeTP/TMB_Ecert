
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctPeriodData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctPeriodData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctAmtType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctPeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastOccurInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Amt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastOccurenceDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctPeriodData_Type", propOrder = {
    "acctAmtType",
    "acctPeriodType",
    "lastOccurInd",
    "effDt",
    "expDt",
    "amt",
    "count",
    "lastOccurenceDt"
})
public class AcctPeriodDataType {

    @XmlElement(name = "AcctAmtType", required = true)
    protected String acctAmtType;
    @XmlElement(name = "AcctPeriodType")
    protected String acctPeriodType;
    @XmlElement(name = "LastOccurInd")
    protected Boolean lastOccurInd;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "LastOccurenceDt")
    protected String lastOccurenceDt;

    /**
     * Gets the value of the acctAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctAmtType() {
        return acctAmtType;
    }

    /**
     * Sets the value of the acctAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctAmtType(String value) {
        this.acctAmtType = value;
    }

    /**
     * Gets the value of the acctPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPeriodType() {
        return acctPeriodType;
    }

    /**
     * Sets the value of the acctPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPeriodType(String value) {
        this.acctPeriodType = value;
    }

    /**
     * Gets the value of the lastOccurInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastOccurInd() {
        return lastOccurInd;
    }

    /**
     * Sets the value of the lastOccurInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastOccurInd(Boolean value) {
        this.lastOccurInd = value;
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
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the lastOccurenceDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastOccurenceDt() {
        return lastOccurenceDt;
    }

    /**
     * Sets the value of the lastOccurenceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOccurenceDt(String value) {
        this.lastOccurenceDt = value;
    }

}
