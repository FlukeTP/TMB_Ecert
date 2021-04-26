
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnEnvr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnEnvr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AcctTrnEnvr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OperTrnIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnEnvr_Type", propOrder = {
    "operTrnIdent"
})
public class AcctTrnEnvrType
    extends com.tmb.payment.wsdl.xpress.vo.AcctTrnEnvrType
{

    @XmlElement(name = "OperTrnIdent")
    protected String operTrnIdent;

    /**
     * Gets the value of the operTrnIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperTrnIdent() {
        return operTrnIdent;
    }

    /**
     * Sets the value of the operTrnIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperTrnIdent(String value) {
        this.operTrnIdent = value;
    }

}
