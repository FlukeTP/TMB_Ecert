
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.MaxCurAmtType;


/**
 * <p>Java class for AlertAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertAmt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AlertAmt_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaxCurAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertAmt_Type", propOrder = {
    "maxCurAmt"
})
public class AlertAmtType
    extends com.tmb.payment.wsdl.xpress.vo.AlertAmtType
{

    @XmlElement(name = "MaxCurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected MaxCurAmtType maxCurAmt;

    /**
     * Gets the value of the maxCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxCurAmtType }
     *     
     */
    public MaxCurAmtType getMaxCurAmt() {
        return maxCurAmt;
    }

    /**
     * Sets the value of the maxCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxCurAmtType }
     *     
     */
    public void setMaxCurAmt(MaxCurAmtType value) {
        this.maxCurAmt = value;
    }

}
