
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelAuditData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditData_Type", propOrder = {
    "relAuditData"
})
public class AuditDataType {

    @XmlElement(name = "RelAuditData")
    protected RelAuditDataType relAuditData;

    /**
     * Gets the value of the relAuditData property.
     * 
     * @return
     *     possible object is
     *     {@link RelAuditDataType }
     *     
     */
    public RelAuditDataType getRelAuditData() {
        return relAuditData;
    }

    /**
     * Sets the value of the relAuditData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelAuditDataType }
     *     
     */
    public void setRelAuditData(RelAuditDataType value) {
        this.relAuditData = value;
    }

}
