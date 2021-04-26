
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistCategory_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistCategory_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatusInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatusReasonInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistCategory_Type", propOrder = {
    "statusInd",
    "statusReasonInd"
})
public class HistCategoryType {

    @XmlElement(name = "StatusInd")
    protected Boolean statusInd;
    @XmlElement(name = "StatusReasonInd")
    protected Boolean statusReasonInd;

    /**
     * Gets the value of the statusInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusInd() {
        return statusInd;
    }

    /**
     * Sets the value of the statusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusInd(Boolean value) {
        this.statusInd = value;
    }

    /**
     * Gets the value of the statusReasonInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusReasonInd() {
        return statusReasonInd;
    }

    /**
     * Sets the value of the statusReasonInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusReasonInd(Boolean value) {
        this.statusReasonInd = value;
    }

}
