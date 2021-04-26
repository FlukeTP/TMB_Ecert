
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AlertRec_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AlertAuth" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRec_Type", propOrder = {
    "alertAuth"
})
public class AlertRecType
    extends com.tmb.payment.wsdl.xpress.vo.AlertRecType
{

    @XmlElement(name = "AlertAuth")
    protected AlertAuthType alertAuth;

    /**
     * Gets the value of the alertAuth property.
     * 
     * @return
     *     possible object is
     *     {@link AlertAuthType }
     *     
     */
    public AlertAuthType getAlertAuth() {
        return alertAuth;
    }

    /**
     * Sets the value of the alertAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertAuthType }
     *     
     */
    public void setAlertAuth(AlertAuthType value) {
        this.alertAuth = value;
    }

}
