
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PmtRec_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PmtKeys"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PmtAuth" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtRec_Type", propOrder = {
    "pmtKeys",
    "pmtAuth"
})
public class PmtRecType
    extends com.tmb.payment.wsdl.xpress.vo.PmtRecType
{

    @XmlElement(name = "PmtKeys", required = true)
    protected PmtKeysType pmtKeys;
    @XmlElement(name = "PmtAuth")
    protected PmtAuthType pmtAuth;

    /**
     * Gets the value of the pmtKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PmtKeysType }
     *     
     */
    public PmtKeysType getPmtKeys() {
        return pmtKeys;
    }

    /**
     * Sets the value of the pmtKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtKeysType }
     *     
     */
    public void setPmtKeys(PmtKeysType value) {
        this.pmtKeys = value;
    }

    /**
     * Gets the value of the pmtAuth property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAuthType }
     *     
     */
    public PmtAuthType getPmtAuth() {
        return pmtAuth;
    }

    /**
     * Sets the value of the pmtAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAuthType }
     *     
     */
    public void setPmtAuth(PmtAuthType value) {
        this.pmtAuth = value;
    }

}
