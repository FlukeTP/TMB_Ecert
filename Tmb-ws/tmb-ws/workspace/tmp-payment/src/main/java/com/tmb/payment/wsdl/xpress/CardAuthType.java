
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAuth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAuth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CardAuth_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PINBlock"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Phone" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PINAction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAuth_Type", propOrder = {
    "pinBlock",
    "cryptType",
    "fiIdent",
    "phone",
    "applIdent",
    "pinAction"
})
public class CardAuthType
    extends com.tmb.payment.wsdl.xpress.vo.CardAuthType
{

    @XmlElement(name = "PINBlock", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String pinBlock;
    @XmlElement(name = "CryptType", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String cryptType;
    @XmlElement(name = "FIIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String fiIdent;
    @XmlElement(name = "Phone", namespace = "urn:ifxforum-org:XSD:1")
    protected String phone;
    @XmlElement(name = "ApplIdent")
    protected String applIdent;
    @XmlElement(name = "PINAction")
    protected String pinAction;

    /**
     * Gets the value of the pinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINBlock() {
        return pinBlock;
    }

    /**
     * Sets the value of the pinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINBlock(String value) {
        this.pinBlock = value;
    }

    /**
     * Gets the value of the cryptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Sets the value of the cryptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the applIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplIdent() {
        return applIdent;
    }

    /**
     * Sets the value of the applIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplIdent(String value) {
        this.applIdent = value;
    }

    /**
     * Gets the value of the pinAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINAction() {
        return pinAction;
    }

    /**
     * Sets the value of the pinAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINAction(String value) {
        this.pinAction = value;
    }

}
