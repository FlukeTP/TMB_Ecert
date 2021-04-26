
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PmtKeys_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}PmtIdent"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotAvailInd"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtKeys_Type", propOrder = {
    "pmtIdent",
    "notAvailInd"
})
public class PmtKeysType
    extends com.tmb.payment.wsdl.xpress.vo.PmtKeysType
{

    @XmlElement(name = "PmtIdent")
    protected String pmtIdent;
    @XmlElement(name = "NotAvailInd")
    protected boolean notAvailInd;

    /**
     * Gets the value of the pmtIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtIdent() {
        return pmtIdent;
    }

    /**
     * Sets the value of the pmtIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtIdent(String value) {
        this.pmtIdent = value;
    }

    /**
     * Gets the value of the notAvailInd property.
     * 
     */
    public boolean isNotAvailInd() {
        return notAvailInd;
    }

    /**
     * Sets the value of the notAvailInd property.
     * 
     */
    public void setNotAvailInd(boolean value) {
        this.notAvailInd = value;
    }

}
