
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Interface_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interface_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}Interface_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcVersion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcAdapterVersion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interface_Type", propOrder = {
    "svcVersion",
    "svcAdapterVersion"
})
public class InterfaceType
    extends com.tmb.payment.wsdl.xpress.vo.InterfaceType
{

    @XmlElement(name = "SvcVersion")
    protected String svcVersion;
    @XmlElement(name = "SvcAdapterVersion")
    protected String svcAdapterVersion;

    /**
     * Gets the value of the svcVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcVersion() {
        return svcVersion;
    }

    /**
     * Sets the value of the svcVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcVersion(String value) {
        this.svcVersion = value;
    }

    /**
     * Gets the value of the svcAdapterVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcAdapterVersion() {
        return svcAdapterVersion;
    }

    /**
     * Sets the value of the svcAdapterVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcAdapterVersion(String value) {
        this.svcAdapterVersion = value;
    }

}
