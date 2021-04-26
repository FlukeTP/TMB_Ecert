
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkTrnData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkTrnData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}NetworkTrnData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OriginatorIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OriginationDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTrnData_Type", propOrder = {
    "originatorIdent",
    "originationDt"
})
public class NetworkTrnDataType
    extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType
{

    @XmlElement(name = "OriginatorIdent")
    protected String originatorIdent;
    @XmlElement(name = "OriginationDt")
    protected String originationDt;

    /**
     * Gets the value of the originatorIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorIdent() {
        return originatorIdent;
    }

    /**
     * Sets the value of the originatorIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorIdent(String value) {
        this.originatorIdent = value;
    }

    /**
     * Gets the value of the originationDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginationDt() {
        return originationDt;
    }

    /**
     * Sets the value of the originationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginationDt(String value) {
        this.originationDt = value;
    }

}
