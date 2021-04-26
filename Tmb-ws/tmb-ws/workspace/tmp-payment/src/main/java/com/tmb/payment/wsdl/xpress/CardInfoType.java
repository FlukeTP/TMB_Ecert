
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.TermType;


/**
 * <p>Java class for CardInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CardInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BinICA" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardValidation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AnniversaryDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeOvrdRsn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardSysIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LostStolenIncident" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardOrderRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardPeriodData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfo_Type", propOrder = {
    "binICA",
    "cardValidation",
    "anniversaryDt",
    "term",
    "feeOvrdRsn",
    "cardSysIdent",
    "lostStolenIncident",
    "cardOrderRef",
    "cardPeriodData",
    "cardMiscData"
})
public class CardInfoType
    extends com.tmb.payment.wsdl.xpress.vo.CardInfoType
{

    @XmlElement(name = "BinICA")
    protected String binICA;
    @XmlElement(name = "CardValidation")
    protected String cardValidation;
    @XmlElement(name = "AnniversaryDt")
    protected String anniversaryDt;
    @XmlElement(name = "Term", namespace = "urn:ifxforum-org:XSD:1")
    protected TermType term;
    @XmlElement(name = "FeeOvrdRsn")
    protected String feeOvrdRsn;
    @XmlElement(name = "CardSysIdent")
    protected String cardSysIdent;
    @XmlElement(name = "LostStolenIncident")
    protected LostStolenIncidentType lostStolenIncident;
    @XmlElement(name = "CardOrderRef")
    protected CardOrderRefType cardOrderRef;
    @XmlElement(name = "CardPeriodData")
    protected List<CardPeriodDataType> cardPeriodData;
    @XmlElement(name = "CardMiscData")
    protected List<CardMiscDataType> cardMiscData;

    /**
     * Gets the value of the binICA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinICA() {
        return binICA;
    }

    /**
     * Sets the value of the binICA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinICA(String value) {
        this.binICA = value;
    }

    /**
     * Gets the value of the cardValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardValidation() {
        return cardValidation;
    }

    /**
     * Sets the value of the cardValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardValidation(String value) {
        this.cardValidation = value;
    }

    /**
     * Gets the value of the anniversaryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnniversaryDt() {
        return anniversaryDt;
    }

    /**
     * Sets the value of the anniversaryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnniversaryDt(String value) {
        this.anniversaryDt = value;
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
     * Gets the value of the feeOvrdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeOvrdRsn() {
        return feeOvrdRsn;
    }

    /**
     * Sets the value of the feeOvrdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeOvrdRsn(String value) {
        this.feeOvrdRsn = value;
    }

    /**
     * Gets the value of the cardSysIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSysIdent() {
        return cardSysIdent;
    }

    /**
     * Sets the value of the cardSysIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSysIdent(String value) {
        this.cardSysIdent = value;
    }

    /**
     * Gets the value of the lostStolenIncident property.
     * 
     * @return
     *     possible object is
     *     {@link LostStolenIncidentType }
     *     
     */
    public LostStolenIncidentType getLostStolenIncident() {
        return lostStolenIncident;
    }

    /**
     * Sets the value of the lostStolenIncident property.
     * 
     * @param value
     *     allowed object is
     *     {@link LostStolenIncidentType }
     *     
     */
    public void setLostStolenIncident(LostStolenIncidentType value) {
        this.lostStolenIncident = value;
    }

    /**
     * Gets the value of the cardOrderRef property.
     * 
     * @return
     *     possible object is
     *     {@link CardOrderRefType }
     *     
     */
    public CardOrderRefType getCardOrderRef() {
        return cardOrderRef;
    }

    /**
     * Sets the value of the cardOrderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOrderRefType }
     *     
     */
    public void setCardOrderRef(CardOrderRefType value) {
        this.cardOrderRef = value;
    }

    /**
     * Gets the value of the cardPeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardPeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardPeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPeriodDataType }
     * 
     * 
     */
    public List<CardPeriodDataType> getCardPeriodData() {
        if (cardPeriodData == null) {
            cardPeriodData = new ArrayList<CardPeriodDataType>();
        }
        return this.cardPeriodData;
    }

    /**
     * Gets the value of the cardMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardMiscDataType }
     * 
     * 
     */
    public List<CardMiscDataType> getCardMiscData() {
        if (cardMiscData == null) {
            cardMiscData = new ArrayList<CardMiscDataType>();
        }
        return this.cardMiscData;
    }

}
