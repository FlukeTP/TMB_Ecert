
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppMiscDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppMiscDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fnf.com/xes}MiscDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppMiscDetail_Type", propOrder = {
    "miscType"
})
public class AppMiscDetailType
    extends MiscDetailType
{

    @XmlElement(name = "MiscType", required = true)
    protected String miscType;

    /**
     * Gets the value of the miscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscType() {
        return miscType;
    }

    /**
     * Sets the value of the miscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscType(String value) {
        this.miscType = value;
    }

}
