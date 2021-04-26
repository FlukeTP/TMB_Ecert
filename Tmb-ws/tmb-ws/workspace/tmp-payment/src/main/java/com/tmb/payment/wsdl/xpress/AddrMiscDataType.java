
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddrMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddrMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fnf.com/xes}MiscDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AddrMiscType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddrMiscData_Type", propOrder = {
    "addrMiscType"
})
public class AddrMiscDataType
    extends MiscDetailType
{

    @XmlElement(name = "AddrMiscType", required = true)
    protected String addrMiscType;

    /**
     * Gets the value of the addrMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrMiscType() {
        return addrMiscType;
    }

    /**
     * Sets the value of the addrMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrMiscType(String value) {
        this.addrMiscType = value;
    }

}
