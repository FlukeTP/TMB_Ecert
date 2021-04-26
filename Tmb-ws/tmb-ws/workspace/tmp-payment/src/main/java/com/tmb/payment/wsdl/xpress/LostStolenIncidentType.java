
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LostStolenIncident_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LostStolenIncident_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LossCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LossDtTm" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RepCardNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LostStolenIncident_Type", propOrder = {
    "lossCd",
    "lossDtTm",
    "repCardNum",
    "cardType"
})
public class LostStolenIncidentType {

    @XmlElement(name = "LossCd")
    protected String lossCd;
    @XmlElement(name = "LossDtTm")
    protected String lossDtTm;
    @XmlElement(name = "RepCardNum")
    protected String repCardNum;
    @XmlElement(name = "CardType", namespace = "urn:ifxforum-org:XSD:1")
    protected String cardType;

    /**
     * Gets the value of the lossCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossCd() {
        return lossCd;
    }

    /**
     * Sets the value of the lossCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossCd(String value) {
        this.lossCd = value;
    }

    /**
     * Gets the value of the lossDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossDtTm() {
        return lossDtTm;
    }

    /**
     * Sets the value of the lossDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossDtTm(String value) {
        this.lossDtTm = value;
    }

    /**
     * Gets the value of the repCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepCardNum() {
        return repCardNum;
    }

    /**
     * Sets the value of the repCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepCardNum(String value) {
        this.repCardNum = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

}
