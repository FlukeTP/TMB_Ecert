
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopChkSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}StopChkSel_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ACH" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChkSel_Type", propOrder = {
    "ach"
})
public class StopChkSelType
    extends com.tmb.payment.wsdl.xpress.vo.StopChkSelType
{

    @XmlElement(name = "ACH")
    protected ACHType ach;

    /**
     * Gets the value of the ach property.
     * 
     * @return
     *     possible object is
     *     {@link ACHType }
     *     
     */
    public ACHType getACH() {
        return ach;
    }

    /**
     * Sets the value of the ach property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHType }
     *     
     */
    public void setACH(ACHType value) {
        this.ach = value;
    }

}
