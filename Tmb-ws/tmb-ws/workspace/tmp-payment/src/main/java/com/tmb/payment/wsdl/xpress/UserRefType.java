
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserRec"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRef_Type", propOrder = {
    "userRec"
})
public class UserRefType {

    @XmlElement(name = "UserRec")
    protected UserRecType userRec;

    /**
     * Gets the value of the userRec property.
     * 
     * @return
     *     possible object is
     *     {@link UserRecType }
     *     
     */
    public UserRecType getUserRec() {
        return userRec;
    }

    /**
     * Sets the value of the userRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRecType }
     *     
     */
    public void setUserRec(UserRecType value) {
        this.userRec = value;
    }

}
