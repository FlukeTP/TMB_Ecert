
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrespdnceMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrespdnceMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fnf.com/xes}MiscDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CorrespdnceMiscType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespdnceMiscData_Type", propOrder = {
    "correspdnceMiscType"
})
public class CorrespdnceMiscDataType
    extends MiscDetailType
{

    @XmlElement(name = "CorrespdnceMiscType", required = true)
    protected String correspdnceMiscType;

    /**
     * Gets the value of the correspdnceMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespdnceMiscType() {
        return correspdnceMiscType;
    }

    /**
     * Sets the value of the correspdnceMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespdnceMiscType(String value) {
        this.correspdnceMiscType = value;
    }

}
