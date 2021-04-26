
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPeriodData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardPeriodData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardAmtType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardAmtSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardAmtSource" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardPeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastOccurInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Amt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AmtRemaining" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CountRemaining" minOccurs="0"/&gt;
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
@XmlType(name = "CardPeriodData_Type", propOrder = {
    "cardAmtType",
    "cardAmtSubType",
    "cardAmtSource",
    "cardPeriodType",
    "lastOccurInd",
    "effDt",
    "expDt",
    "amt",
    "amtRemaining",
    "count",
    "countRemaining",
    "lastOccurenceDt"
})
public class CardPeriodDataType {

    @XmlElement(name = "CardAmtType")
    protected String cardAmtType;
    @XmlElement(name = "CardAmtSubType")
    protected String cardAmtSubType;
    @XmlElement(name = "CardAmtSource")
    protected String cardAmtSource;
    @XmlElement(name = "CardPeriodType")
    protected String cardPeriodType;
    @XmlElement(name = "LastOccurInd", namespace = "urn:ifxforum-org:XSD:1")
    protected Boolean lastOccurInd;
    @XmlElement(name = "EffDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String effDt;
    @XmlElement(name = "ExpDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String expDt;
    @XmlElement(name = "Amt", namespace = "urn:ifxforum-org:XSD:1")
    protected BigDecimal amt;
    @XmlElement(name = "AmtRemaining")
    protected BigDecimal amtRemaining;
    @XmlElement(name = "Count", namespace = "urn:ifxforum-org:XSD:1")
    protected Long count;
    @XmlElement(name = "CountRemaining")
    protected Long countRemaining;
    @XmlElement(name = "LastOccurenceDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String lastOccurenceDt;

    /**
     * Gets the value of the cardAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAmtType() {
        return cardAmtType;
    }

    /**
     * Sets the value of the cardAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAmtType(String value) {
        this.cardAmtType = value;
    }

    /**
     * Gets the value of the cardAmtSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAmtSubType() {
        return cardAmtSubType;
    }

    /**
     * Sets the value of the cardAmtSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAmtSubType(String value) {
        this.cardAmtSubType = value;
    }

    /**
     * Gets the value of the cardAmtSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAmtSource() {
        return cardAmtSource;
    }

    /**
     * Sets the value of the cardAmtSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAmtSource(String value) {
        this.cardAmtSource = value;
    }

    /**
     * Gets the value of the cardPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPeriodType() {
        return cardPeriodType;
    }

    /**
     * Sets the value of the cardPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPeriodType(String value) {
        this.cardPeriodType = value;
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
     * Gets the value of the amtRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtRemaining() {
        return amtRemaining;
    }

    /**
     * Sets the value of the amtRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtRemaining(BigDecimal value) {
        this.amtRemaining = value;
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
     * Gets the value of the countRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountRemaining() {
        return countRemaining;
    }

    /**
     * Sets the value of the countRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountRemaining(Long value) {
        this.countRemaining = value;
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
