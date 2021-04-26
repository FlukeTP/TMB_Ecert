
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PswdInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PswdInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Pswd"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ChannelName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PswdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PswdInfo_Type", propOrder = {
    "pswd",
    "channelName",
    "pswdType"
})
public class PswdInfoType {

    @XmlElement(name = "Pswd", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String pswd;
    @XmlElement(name = "ChannelName")
    protected String channelName;
    @XmlElement(name = "PswdType")
    protected String pswdType;

    /**
     * Gets the value of the pswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Sets the value of the pswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the pswdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdType() {
        return pswdType;
    }

    /**
     * Sets the value of the pswdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswdType(String value) {
        this.pswdType = value;
    }

}
