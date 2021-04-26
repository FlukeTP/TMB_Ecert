
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaBal_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaBal_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}MediaBal_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DenominationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DenomSubType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaBal_Type", propOrder = {
    "denominationType",
    "denomSubType"
})
public class MediaBalType
    extends com.tmb.payment.wsdl.xpress.vo.MediaBalType
{

    @XmlElement(name = "DenominationType")
    @XmlSchemaType(name = "string")
    protected DenominationTypeType denominationType;
    @XmlElement(name = "DenomSubType")
    protected String denomSubType;

    /**
     * Gets the value of the denominationType property.
     * 
     * @return
     *     possible object is
     *     {@link DenominationTypeType }
     *     
     */
    public DenominationTypeType getDenominationType() {
        return denominationType;
    }

    /**
     * Sets the value of the denominationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenominationTypeType }
     *     
     */
    public void setDenominationType(DenominationTypeType value) {
        this.denominationType = value;
    }

    /**
     * Gets the value of the denomSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomSubType() {
        return denomSubType;
    }

    /**
     * Sets the value of the denomSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomSubType(String value) {
        this.denomSubType = value;
    }

}
