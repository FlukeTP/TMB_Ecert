
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnIndData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnIndData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnIndType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnInd"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnIndData_Type", propOrder = {
    "trnIndType",
    "trnInd"
})
public class AcctTrnIndDataType {

    @XmlElement(name = "TrnIndType", required = true)
    protected String trnIndType;
    @XmlElement(name = "TrnInd")
    protected boolean trnInd;

    /**
     * Gets the value of the trnIndType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnIndType() {
        return trnIndType;
    }

    /**
     * Sets the value of the trnIndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnIndType(String value) {
        this.trnIndType = value;
    }

    /**
     * Gets the value of the trnInd property.
     * 
     */
    public boolean isTrnInd() {
        return trnInd;
    }

    /**
     * Sets the value of the trnInd property.
     * 
     */
    public void setTrnInd(boolean value) {
        this.trnInd = value;
    }

}
