
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExQuoteEnvr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExQuoteEnvr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}BaseEnvr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NewForExRate"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExHomeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForwardPts" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffTimeFrame"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FixingDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SmallBankNoteDenom" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FundingDueDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExQuoteEnvr_Type", propOrder = {
    "forExQuoteIdent",
    "newForExRate",
    "forExHomeRate",
    "forwardPts",
    "effTimeFrame",
    "fixingDt",
    "smallBankNoteDenom",
    "fundingDueDt"
})
public class ForExQuoteEnvrType
    extends BaseEnvrType
{

    @XmlElement(name = "ForExQuoteIdent")
    protected String forExQuoteIdent;
    @XmlElement(name = "NewForExRate", required = true)
    protected NewForExRateType newForExRate;
    @XmlElement(name = "ForExHomeRate")
    protected ForExHomeRateType forExHomeRate;
    @XmlElement(name = "ForwardPts")
    protected BigDecimal forwardPts;
    @XmlElement(name = "EffTimeFrame", required = true)
    protected EffTimeFrameType effTimeFrame;
    @XmlElement(name = "FixingDt")
    protected String fixingDt;
    @XmlElement(name = "SmallBankNoteDenom")
    protected BigDecimal smallBankNoteDenom;
    @XmlElement(name = "FundingDueDt")
    protected String fundingDueDt;

    /**
     * Gets the value of the forExQuoteIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExQuoteIdent() {
        return forExQuoteIdent;
    }

    /**
     * Sets the value of the forExQuoteIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExQuoteIdent(String value) {
        this.forExQuoteIdent = value;
    }

    /**
     * Gets the value of the newForExRate property.
     * 
     * @return
     *     possible object is
     *     {@link NewForExRateType }
     *     
     */
    public NewForExRateType getNewForExRate() {
        return newForExRate;
    }

    /**
     * Sets the value of the newForExRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewForExRateType }
     *     
     */
    public void setNewForExRate(NewForExRateType value) {
        this.newForExRate = value;
    }

    /**
     * Gets the value of the forExHomeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ForExHomeRateType }
     *     
     */
    public ForExHomeRateType getForExHomeRate() {
        return forExHomeRate;
    }

    /**
     * Sets the value of the forExHomeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExHomeRateType }
     *     
     */
    public void setForExHomeRate(ForExHomeRateType value) {
        this.forExHomeRate = value;
    }

    /**
     * Gets the value of the forwardPts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForwardPts() {
        return forwardPts;
    }

    /**
     * Sets the value of the forwardPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForwardPts(BigDecimal value) {
        this.forwardPts = value;
    }

    /**
     * Gets the value of the effTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link EffTimeFrameType }
     *     
     */
    public EffTimeFrameType getEffTimeFrame() {
        return effTimeFrame;
    }

    /**
     * Sets the value of the effTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffTimeFrameType }
     *     
     */
    public void setEffTimeFrame(EffTimeFrameType value) {
        this.effTimeFrame = value;
    }

    /**
     * Gets the value of the fixingDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixingDt() {
        return fixingDt;
    }

    /**
     * Sets the value of the fixingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixingDt(String value) {
        this.fixingDt = value;
    }

    /**
     * Gets the value of the smallBankNoteDenom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSmallBankNoteDenom() {
        return smallBankNoteDenom;
    }

    /**
     * Sets the value of the smallBankNoteDenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSmallBankNoteDenom(BigDecimal value) {
        this.smallBankNoteDenom = value;
    }

    /**
     * Gets the value of the fundingDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingDueDt() {
        return fundingDueDt;
    }

    /**
     * Sets the value of the fundingDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingDueDt(String value) {
        this.fundingDueDt = value;
    }

}
