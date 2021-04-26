
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CountryCodeType;


/**
 * <p>Java class for W8Certification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="W8Certification_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BenRelType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IssuedIdentType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IssuedIdentValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W8RefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Article" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Rate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IncomeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActingCapacity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ElectronicInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W8Indicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W8CertDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W8CertCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "W8Certification_Type", propOrder = {
    "countryCode",
    "benRelType",
    "issuedIdentType",
    "issuedIdentValue",
    "w8RefNum",
    "article",
    "rate",
    "incomeType",
    "memo",
    "actingCapacity",
    "electronicInd",
    "w8Indicator",
    "w8CertDate",
    "w8CertCode"
})
public class W8CertificationType {

    @XmlElement(name = "CountryCode", namespace = "urn:ifxforum-org:XSD:1")
    protected CountryCodeType countryCode;
    @XmlElement(name = "BenRelType")
    protected String benRelType;
    @XmlElement(name = "IssuedIdentType")
    protected String issuedIdentType;
    @XmlElement(name = "IssuedIdentValue")
    protected String issuedIdentValue;
    @XmlElement(name = "W8RefNum")
    protected String w8RefNum;
    @XmlElement(name = "Article")
    protected String article;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "IncomeType")
    protected String incomeType;
    @XmlElement(name = "Memo", namespace = "urn:ifxforum-org:XSD:1")
    protected String memo;
    @XmlElement(name = "ActingCapacity")
    protected String actingCapacity;
    @XmlElement(name = "ElectronicInd")
    protected Boolean electronicInd;
    @XmlElement(name = "W8Indicator")
    protected List<W8IndicatorType> w8Indicator;
    @XmlElement(name = "W8CertDate")
    protected String w8CertDate;
    @XmlElement(name = "W8CertCode")
    protected String w8CertCode;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the benRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenRelType() {
        return benRelType;
    }

    /**
     * Sets the value of the benRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenRelType(String value) {
        this.benRelType = value;
    }

    /**
     * Gets the value of the issuedIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentType() {
        return issuedIdentType;
    }

    /**
     * Sets the value of the issuedIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentType(String value) {
        this.issuedIdentType = value;
    }

    /**
     * Gets the value of the issuedIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentValue() {
        return issuedIdentValue;
    }

    /**
     * Sets the value of the issuedIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentValue(String value) {
        this.issuedIdentValue = value;
    }

    /**
     * Gets the value of the w8RefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getW8RefNum() {
        return w8RefNum;
    }

    /**
     * Sets the value of the w8RefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setW8RefNum(String value) {
        this.w8RefNum = value;
    }

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticle() {
        return article;
    }

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticle(String value) {
        this.article = value;
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
     * Gets the value of the incomeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeType() {
        return incomeType;
    }

    /**
     * Sets the value of the incomeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeType(String value) {
        this.incomeType = value;
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
     * Gets the value of the actingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActingCapacity() {
        return actingCapacity;
    }

    /**
     * Sets the value of the actingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActingCapacity(String value) {
        this.actingCapacity = value;
    }

    /**
     * Gets the value of the electronicInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicInd() {
        return electronicInd;
    }

    /**
     * Sets the value of the electronicInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicInd(Boolean value) {
        this.electronicInd = value;
    }

    /**
     * Gets the value of the w8Indicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the w8Indicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getW8Indicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link W8IndicatorType }
     * 
     * 
     */
    public List<W8IndicatorType> getW8Indicator() {
        if (w8Indicator == null) {
            w8Indicator = new ArrayList<W8IndicatorType>();
        }
        return this.w8Indicator;
    }

    /**
     * Gets the value of the w8CertDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getW8CertDate() {
        return w8CertDate;
    }

    /**
     * Sets the value of the w8CertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setW8CertDate(String value) {
        this.w8CertDate = value;
    }

    /**
     * Gets the value of the w8CertCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getW8CertCode() {
        return w8CertCode;
    }

    /**
     * Sets the value of the w8CertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setW8CertCode(String value) {
        this.w8CertCode = value;
    }

}
