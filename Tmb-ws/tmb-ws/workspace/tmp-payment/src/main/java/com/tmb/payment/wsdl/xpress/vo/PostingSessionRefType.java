
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingSessionRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingSessionRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionInfo"/&gt;
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
@XmlType(name = "PostingSessionRef_Type", propOrder = {
    "postingSessionKeys",
    "postingSessionRec",
    "postingSessionInfo"
})
public class PostingSessionRefType {

    @XmlElement(name = "PostingSessionKeys")
    protected PostingSessionKeysType postingSessionKeys;
    @XmlElement(name = "PostingSessionRec")
    protected PostingSessionRecType postingSessionRec;
    @XmlElement(name = "PostingSessionInfo")
    protected PostingSessionInfoType postingSessionInfo;

    /**
     * Gets the value of the postingSessionKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PostingSessionKeysType }
     *     
     */
    public PostingSessionKeysType getPostingSessionKeys() {
        return postingSessionKeys;
    }

    /**
     * Sets the value of the postingSessionKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingSessionKeysType }
     *     
     */
    public void setPostingSessionKeys(PostingSessionKeysType value) {
        this.postingSessionKeys = value;
    }

    /**
     * Gets the value of the postingSessionRec property.
     * 
     * @return
     *     possible object is
     *     {@link PostingSessionRecType }
     *     
     */
    public PostingSessionRecType getPostingSessionRec() {
        return postingSessionRec;
    }

    /**
     * Sets the value of the postingSessionRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingSessionRecType }
     *     
     */
    public void setPostingSessionRec(PostingSessionRecType value) {
        this.postingSessionRec = value;
    }

    /**
     * Gets the value of the postingSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PostingSessionInfoType }
     *     
     */
    public PostingSessionInfoType getPostingSessionInfo() {
        return postingSessionInfo;
    }

    /**
     * Sets the value of the postingSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingSessionInfoType }
     *     
     */
    public void setPostingSessionInfo(PostingSessionInfoType value) {
        this.postingSessionInfo = value;
    }

}
