
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurAmtRange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurAmtRange_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}LowCurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}HighCurAmt" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurAmtRange_Type", propOrder = {
    "lowCurAmt",
    "highCurAmt"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.CurAmtRangeType.class
})
public class CurAmtRangeType {

    @XmlElement(name = "LowCurAmt")
    protected LowCurAmtType lowCurAmt;
    @XmlElement(name = "HighCurAmt")
    protected HighCurAmtType highCurAmt;

    /**
     * Gets the value of the lowCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LowCurAmtType }
     *     
     */
    public LowCurAmtType getLowCurAmt() {
        return lowCurAmt;
    }

    /**
     * Sets the value of the lowCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowCurAmtType }
     *     
     */
    public void setLowCurAmt(LowCurAmtType value) {
        this.lowCurAmt = value;
    }

    /**
     * Gets the value of the highCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link HighCurAmtType }
     *     
     */
    public HighCurAmtType getHighCurAmt() {
        return highCurAmt;
    }

    /**
     * Sets the value of the highCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighCurAmtType }
     *     
     */
    public void setHighCurAmt(HighCurAmtType value) {
        this.highCurAmt = value;
    }

}
