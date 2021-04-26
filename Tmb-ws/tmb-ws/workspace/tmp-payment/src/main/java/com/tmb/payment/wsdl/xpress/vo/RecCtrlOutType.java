
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecCtrlOut_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecCtrlOut_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SentRecCount"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MatchedRecCount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemainRecCount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Cursor" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Token" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecCtrlOut_Type", propOrder = {
    "sentRecCount",
    "matchedRecCount",
    "remainRecCount",
    "cursor",
    "token"
})
public class RecCtrlOutType {

    @XmlElement(name = "SentRecCount")
    protected long sentRecCount;
    @XmlElement(name = "MatchedRecCount")
    protected Long matchedRecCount;
    @XmlElement(name = "RemainRecCount")
    protected Long remainRecCount;
    @XmlElement(name = "Cursor")
    protected CursorType cursor;
    @XmlElement(name = "Token")
    protected String token;

    /**
     * Gets the value of the sentRecCount property.
     * 
     */
    public long getSentRecCount() {
        return sentRecCount;
    }

    /**
     * Sets the value of the sentRecCount property.
     * 
     */
    public void setSentRecCount(long value) {
        this.sentRecCount = value;
    }

    /**
     * Gets the value of the matchedRecCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchedRecCount() {
        return matchedRecCount;
    }

    /**
     * Sets the value of the matchedRecCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchedRecCount(Long value) {
        this.matchedRecCount = value;
    }

    /**
     * Gets the value of the remainRecCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainRecCount() {
        return remainRecCount;
    }

    /**
     * Sets the value of the remainRecCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainRecCount(Long value) {
        this.remainRecCount = value;
    }

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link CursorType }
     *     
     */
    public CursorType getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorType }
     *     
     */
    public void setCursor(CursorType value) {
        this.cursor = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
