
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifyScoreReason_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyScoreReason_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyScoreReasonCd"/&gt;
 *         &lt;element name="VerifyScoreReasonDesc" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyScoreReason_Type", propOrder = {
    "verifyScoreReasonCd",
    "verifyScoreReasonDesc"
})
public class VerifyScoreReasonType {

    @XmlElement(name = "VerifyScoreReasonCd", required = true)
    protected String verifyScoreReasonCd;
    @XmlElement(name = "VerifyScoreReasonDesc")
    protected Object verifyScoreReasonDesc;

    /**
     * Gets the value of the verifyScoreReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyScoreReasonCd() {
        return verifyScoreReasonCd;
    }

    /**
     * Sets the value of the verifyScoreReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyScoreReasonCd(String value) {
        this.verifyScoreReasonCd = value;
    }

    /**
     * Gets the value of the verifyScoreReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVerifyScoreReasonDesc() {
        return verifyScoreReasonDesc;
    }

    /**
     * Sets the value of the verifyScoreReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVerifyScoreReasonDesc(Object value) {
        this.verifyScoreReasonDesc = value;
    }

}
