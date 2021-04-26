
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgSection_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgSection_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MsgDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgSection_Type", propOrder = {
    "msgDesc"
})
public class MsgSectionType {

    @XmlElement(name = "MsgDesc")
    protected String msgDesc;

    /**
     * Gets the value of the msgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDesc() {
        return msgDesc;
    }

    /**
     * Sets the value of the msgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDesc(String value) {
        this.msgDesc = value;
    }

}
