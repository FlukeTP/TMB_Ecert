
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CurCodeType;


/**
 * <p>Java class for PartyPref_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPref_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyPref_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DoNotSolicit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPref_Type", propOrder = {
    "curCode",
    "doNotSolicit"
})
public class PartyPrefType
    extends com.tmb.payment.wsdl.xpress.vo.PartyPrefType
{

    @XmlElement(name = "CurCode", namespace = "urn:ifxforum-org:XSD:1")
    protected CurCodeType curCode;
    @XmlElement(name = "DoNotSolicit")
    protected Boolean doNotSolicit;

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurCodeType }
     *     
     */
    public CurCodeType getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurCodeType }
     *     
     */
    public void setCurCode(CurCodeType value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the doNotSolicit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotSolicit() {
        return doNotSolicit;
    }

    /**
     * Sets the value of the doNotSolicit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotSolicit(Boolean value) {
        this.doNotSolicit = value;
    }

}
