
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DreamAccountInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DreamAccountInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DreamDesc"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DreamTargetAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DreamAccountInfo_Type", propOrder = {
    "dreamDesc",
    "dreamTargetAmount"
})
public class DreamAccountInfoType {

    @XmlElement(name = "DreamDesc", required = true)
    protected String dreamDesc;
    @XmlElement(name = "DreamTargetAmount", required = true)
    protected BigDecimal dreamTargetAmount;

    /**
     * Gets the value of the dreamDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDreamDesc() {
        return dreamDesc;
    }

    /**
     * Sets the value of the dreamDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDreamDesc(String value) {
        this.dreamDesc = value;
    }

    /**
     * Gets the value of the dreamTargetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDreamTargetAmount() {
        return dreamTargetAmount;
    }

    /**
     * Sets the value of the dreamTargetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDreamTargetAmount(BigDecimal value) {
        this.dreamTargetAmount = value;
    }

}
