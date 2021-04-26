
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}MsgRqHdr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OperRules" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperRqHdr_Type", propOrder = {
    "operRules"
})
public class OperRqHdrType
    extends MsgRqHdrType
{

    @XmlElement(name = "OperRules")
    protected OperRulesType operRules;

    /**
     * Gets the value of the operRules property.
     * 
     * @return
     *     possible object is
     *     {@link OperRulesType }
     *     
     */
    public OperRulesType getOperRules() {
        return operRules;
    }

    /**
     * Sets the value of the operRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperRulesType }
     *     
     */
    public void setOperRules(OperRulesType value) {
        this.operRules = value;
    }

}
