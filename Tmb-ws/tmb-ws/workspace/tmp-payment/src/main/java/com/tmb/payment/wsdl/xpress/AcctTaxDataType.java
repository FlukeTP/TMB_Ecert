
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTaxData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTaxData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AcctTaxData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WithholdingCalcMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WithholdingSchedule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTaxData_Type", propOrder = {
    "withholdingCalcMethod",
    "withholdingSchedule"
})
public class AcctTaxDataType
    extends com.tmb.payment.wsdl.xpress.vo.AcctTaxDataType
{

    @XmlElement(name = "WithholdingCalcMethod")
    protected String withholdingCalcMethod;
    @XmlElement(name = "WithholdingSchedule")
    protected String withholdingSchedule;

    /**
     * Gets the value of the withholdingCalcMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingCalcMethod() {
        return withholdingCalcMethod;
    }

    /**
     * Sets the value of the withholdingCalcMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingCalcMethod(String value) {
        this.withholdingCalcMethod = value;
    }

    /**
     * Gets the value of the withholdingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingSchedule() {
        return withholdingSchedule;
    }

    /**
     * Sets the value of the withholdingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingSchedule(String value) {
        this.withholdingSchedule = value;
    }

}
