
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopChkKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}StopChkKeys_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ACH" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StopChkIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChkKeys_Type", propOrder = {
    "ach",
    "stopChkIdent"
})
public class StopChkKeysType
    extends com.tmb.payment.wsdl.xpress.vo.StopChkKeysType
{

    @XmlElement(name = "ACH")
    protected ACHType ach;
    @XmlElement(name = "StopChkIdent")
    protected String stopChkIdent;

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

    /**
     * Gets the value of the stopChkIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopChkIdent() {
        return stopChkIdent;
    }

    /**
     * Sets the value of the stopChkIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopChkIdent(String value) {
        this.stopChkIdent = value;
    }

}
