
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcIdent" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctIdent"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAcctKeys_Type", propOrder = {
    "svcIdent",
    "mediaAcctId",
    "mediaAcctIdent"
})
public class MediaAcctKeysType {

    @XmlElement(name = "SvcIdent")
    protected String svcIdent;
    @XmlElement(name = "MediaAcctId")
    protected String mediaAcctId;
    @XmlElement(name = "MediaAcctIdent")
    protected String mediaAcctIdent;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcIdent(String value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the mediaAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAcctId() {
        return mediaAcctId;
    }

    /**
     * Sets the value of the mediaAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAcctId(String value) {
        this.mediaAcctId = value;
    }

    /**
     * Gets the value of the mediaAcctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAcctIdent() {
        return mediaAcctIdent;
    }

    /**
     * Sets the value of the mediaAcctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAcctIdent(String value) {
        this.mediaAcctIdent = value;
    }

}
