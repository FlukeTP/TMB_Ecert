
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}LongText"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DiscURL"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcceptReqd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscInfo_Type", propOrder = {
    "longText",
    "discURL",
    "acceptReqd"
})
public class DiscInfoType {

    @XmlElement(name = "LongText")
    protected String longText;
    @XmlElement(name = "DiscURL")
    protected String discURL;
    @XmlElement(name = "AcceptReqd")
    protected Boolean acceptReqd;

    /**
     * Gets the value of the longText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongText() {
        return longText;
    }

    /**
     * Sets the value of the longText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongText(String value) {
        this.longText = value;
    }

    /**
     * Gets the value of the discURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscURL() {
        return discURL;
    }

    /**
     * Sets the value of the discURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscURL(String value) {
        this.discURL = value;
    }

    /**
     * Gets the value of the acceptReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptReqd() {
        return acceptReqd;
    }

    /**
     * Sets the value of the acceptReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptReqd(Boolean value) {
        this.acceptReqd = value;
    }

}
