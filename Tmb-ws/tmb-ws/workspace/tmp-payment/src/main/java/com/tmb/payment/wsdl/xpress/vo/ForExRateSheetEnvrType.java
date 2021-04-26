
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExRateSheetEnvr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExRateSheetEnvr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}BaseEnvr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExRateSheetEnvr_Type", propOrder = {
    "forExRateSheetIdent"
})
public class ForExRateSheetEnvrType
    extends BaseEnvrType
{

    @XmlElement(name = "ForExRateSheetIdent")
    protected String forExRateSheetIdent;

    /**
     * Gets the value of the forExRateSheetIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateSheetIdent() {
        return forExRateSheetIdent;
    }

    /**
     * Sets the value of the forExRateSheetIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateSheetIdent(String value) {
        this.forExRateSheetIdent = value;
    }

}
