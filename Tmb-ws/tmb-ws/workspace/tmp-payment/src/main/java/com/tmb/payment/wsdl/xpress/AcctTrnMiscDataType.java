
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fnf.com/xes}MiscDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctTrnMiscType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnMiscData_Type", propOrder = {
    "acctTrnMiscType"
})
public class AcctTrnMiscDataType
    extends MiscDetailType
{

    @XmlElement(name = "AcctTrnMiscType", required = true)
    protected String acctTrnMiscType;

    /**
     * Gets the value of the acctTrnMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTrnMiscType() {
        return acctTrnMiscType;
    }

    /**
     * Sets the value of the acctTrnMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTrnMiscType(String value) {
        this.acctTrnMiscType = value;
    }

}
