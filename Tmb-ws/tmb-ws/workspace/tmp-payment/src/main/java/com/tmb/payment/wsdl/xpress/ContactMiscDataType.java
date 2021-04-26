
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fnf.com/xes}MiscDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContactMiscType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMiscData_Type", propOrder = {
    "contactMiscType"
})
public class ContactMiscDataType
    extends MiscDetailType
{

    @XmlElement(name = "ContactMiscType", required = true)
    protected String contactMiscType;

    /**
     * Gets the value of the contactMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMiscType() {
        return contactMiscType;
    }

    /**
     * Sets the value of the contactMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMiscType(String value) {
        this.contactMiscType = value;
    }

}
