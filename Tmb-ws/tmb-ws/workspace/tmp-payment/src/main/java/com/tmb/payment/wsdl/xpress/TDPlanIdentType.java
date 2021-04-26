
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDPlanIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDPlanIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PlanIdentType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PlanIdentValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDPlanIdent_Type", propOrder = {
    "planIdentType",
    "planIdentValue"
})
public class TDPlanIdentType {

    @XmlElement(name = "PlanIdentType")
    protected String planIdentType;
    @XmlElement(name = "PlanIdentValue")
    protected String planIdentValue;

    /**
     * Gets the value of the planIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanIdentType() {
        return planIdentType;
    }

    /**
     * Sets the value of the planIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanIdentType(String value) {
        this.planIdentType = value;
    }

    /**
     * Gets the value of the planIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanIdentValue() {
        return planIdentValue;
    }

    /**
     * Sets the value of the planIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanIdentValue(String value) {
        this.planIdentValue = value;
    }

}
