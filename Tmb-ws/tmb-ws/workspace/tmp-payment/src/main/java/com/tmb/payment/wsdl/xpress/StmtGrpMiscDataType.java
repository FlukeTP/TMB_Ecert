
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StmtGrpMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StmtGrpMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpMiscType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpMiscText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StmtGrpMiscData_Type", propOrder = {
    "stmtGrpMiscType",
    "stmtGrpMiscText"
})
public class StmtGrpMiscDataType {

    @XmlElement(name = "StmtGrpMiscType", required = true)
    protected String stmtGrpMiscType;
    @XmlElement(name = "StmtGrpMiscText")
    protected String stmtGrpMiscText;

    /**
     * Gets the value of the stmtGrpMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtGrpMiscType() {
        return stmtGrpMiscType;
    }

    /**
     * Sets the value of the stmtGrpMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtGrpMiscType(String value) {
        this.stmtGrpMiscType = value;
    }

    /**
     * Gets the value of the stmtGrpMiscText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtGrpMiscText() {
        return stmtGrpMiscText;
    }

    /**
     * Sets the value of the stmtGrpMiscText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtGrpMiscText(String value) {
        this.stmtGrpMiscText = value;
    }

}
