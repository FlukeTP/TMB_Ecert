
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CompositeCurAmtType;


/**
 * <p>Java class for TellerCompositeCurAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TellerCompositeCurAmt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CompositeCurAmt_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CalculatorData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TellerCompositeCurAmt_Type", propOrder = {
    "calculatorData"
})
public class TellerCompositeCurAmtType
    extends CompositeCurAmtType
{

    @XmlElement(name = "CalculatorData")
    protected CalculatorDataType calculatorData;

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
