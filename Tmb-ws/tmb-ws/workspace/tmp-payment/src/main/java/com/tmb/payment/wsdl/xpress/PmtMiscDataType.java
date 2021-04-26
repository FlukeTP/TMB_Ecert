
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PmtMiscType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtMiscData_Type", propOrder = {
    "pmtMiscType",
    "miscText"
})
public class PmtMiscDataType {

    @XmlElement(name = "PmtMiscType", required = true)
    protected String pmtMiscType;
    @XmlElement(name = "MiscText")
    protected String miscText;

    /**
     * Gets the value of the pmtMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtMiscType() {
        return pmtMiscType;
    }

    /**
     * Sets the value of the pmtMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtMiscType(String value) {
        this.pmtMiscType = value;
    }

    /**
     * Gets the value of the miscText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscText() {
        return miscText;
    }

    /**
     * Sets the value of the miscText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscText(String value) {
        this.miscText = value;
    }

}
