
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for TellerCurAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TellerCurAmt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CalculatorData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TellerCurAmt_Type", propOrder = {
    "curAmt",
    "calculatorData"
})
public class TellerCurAmtType {

    @XmlElement(name = "CurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected CurAmtType curAmt;
    @XmlElement(name = "CalculatorData")
    protected CalculatorDataType calculatorData;

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setCurAmt(CurAmtType value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the calculatorData property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatorDataType }
     *     
     */
    public CalculatorDataType getCalculatorData() {
        return calculatorData;
    }

    /**
     * Sets the value of the calculatorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatorDataType }
     *     
     */
    public void setCalculatorData(CalculatorDataType value) {
        this.calculatorData = value;
    }

}
