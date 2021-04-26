
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAcctRelInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyAcctRelInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LegalRespCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyOwnerCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPayInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OnlineBankingInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ECOACd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctOwnerType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BeneficiaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelationshipType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RemainingNoFeeCounter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MaxFeeCounter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UsedFeeCounter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CreditCardOrg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CreditCardType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OpeningMethod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRelInfo_Type", propOrder = {
    "legalRespCode",
    "partyOwnerCode",
    "billPayInd",
    "onlineBankingInd",
    "ecoaCd",
    "acctOwnerType",
    "beneficiaryType",
    "relationshipType",
    "percent",
    "remainingNoFeeCounter",
    "maxFeeCounter",
    "usedFeeCounter",
    "creditCardOrg",
    "creditCardType",
    "openingMethod"
})
public class PartyAcctRelInfoType
    extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelInfoType
{

    @XmlElement(name = "LegalRespCode")
    protected String legalRespCode;
    @XmlElement(name = "PartyOwnerCode")
    protected String partyOwnerCode;
    @XmlElement(name = "BillPayInd")
    protected Boolean billPayInd;
    @XmlElement(name = "OnlineBankingInd")
    protected Boolean onlineBankingInd;
    @XmlElement(name = "ECOACd")
    protected String ecoaCd;
    @XmlElement(name = "AcctOwnerType")
    protected String acctOwnerType;
    @XmlElement(name = "BeneficiaryType")
    protected String beneficiaryType;
    @XmlElement(name = "RelationshipType")
    protected String relationshipType;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "RemainingNoFeeCounter")
    protected Long remainingNoFeeCounter;
    @XmlElement(name = "MaxFeeCounter")
    protected Long maxFeeCounter;
    @XmlElement(name = "UsedFeeCounter")
    protected Long usedFeeCounter;
    @XmlElement(name = "CreditCardOrg")
    protected String creditCardOrg;
    @XmlElement(name = "CreditCardType")
    protected String creditCardType;
    @XmlElement(name = "OpeningMethod")
    protected String openingMethod;

    /**
     * Gets the value of the legalRespCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalRespCode() {
        return legalRespCode;
    }

    /**
     * Sets the value of the legalRespCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalRespCode(String value) {
        this.legalRespCode = value;
    }

    /**
     * Gets the value of the partyOwnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyOwnerCode() {
        return partyOwnerCode;
    }

    /**
     * Sets the value of the partyOwnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyOwnerCode(String value) {
        this.partyOwnerCode = value;
    }

    /**
     * Gets the value of the billPayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillPayInd() {
        return billPayInd;
    }

    /**
     * Sets the value of the billPayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillPayInd(Boolean value) {
        this.billPayInd = value;
    }

    /**
     * Gets the value of the onlineBankingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlineBankingInd() {
        return onlineBankingInd;
    }

    /**
     * Sets the value of the onlineBankingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlineBankingInd(Boolean value) {
        this.onlineBankingInd = value;
    }

    /**
     * Gets the value of the ecoaCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECOACd() {
        return ecoaCd;
    }

    /**
     * Sets the value of the ecoaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECOACd(String value) {
        this.ecoaCd = value;
    }

    /**
     * Gets the value of the acctOwnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnerType() {
        return acctOwnerType;
    }

    /**
     * Sets the value of the acctOwnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnerType(String value) {
        this.acctOwnerType = value;
    }

    /**
     * Gets the value of the beneficiaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    /**
     * Sets the value of the beneficiaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryType(String value) {
        this.beneficiaryType = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the remainingNoFeeCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingNoFeeCounter() {
        return remainingNoFeeCounter;
    }

    /**
     * Sets the value of the remainingNoFeeCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingNoFeeCounter(Long value) {
        this.remainingNoFeeCounter = value;
    }

    /**
     * Gets the value of the maxFeeCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxFeeCounter() {
        return maxFeeCounter;
    }

    /**
     * Sets the value of the maxFeeCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxFeeCounter(Long value) {
        this.maxFeeCounter = value;
    }

    /**
     * Gets the value of the usedFeeCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsedFeeCounter() {
        return usedFeeCounter;
    }

    /**
     * Sets the value of the usedFeeCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsedFeeCounter(Long value) {
        this.usedFeeCounter = value;
    }

    /**
     * Gets the value of the creditCardOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardOrg() {
        return creditCardOrg;
    }

    /**
     * Sets the value of the creditCardOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardOrg(String value) {
        this.creditCardOrg = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the openingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningMethod() {
        return openingMethod;
    }

    /**
     * Sets the value of the openingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningMethod(String value) {
        this.openingMethod = value;
    }

}
