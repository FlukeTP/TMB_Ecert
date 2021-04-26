
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StmtGrpStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StmtGrpStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpStatusCode"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EffDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StmtGrpStatus_Type", propOrder = {
    "stmtGrpStatusCode",
    "effDt"
})
public class StmtGrpStatusType {

    @XmlElement(name = "StmtGrpStatusCode", required = true)
    protected String stmtGrpStatusCode;
    @XmlElement(name = "EffDt")
    protected Object effDt;

    /**
     * Gets the value of the stmtGrpStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtGrpStatusCode() {
        return stmtGrpStatusCode;
    }

    /**
     * Sets the value of the stmtGrpStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtGrpStatusCode(String value) {
        this.stmtGrpStatusCode = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEffDt(Object value) {
        this.effDt = value;
    }

}
