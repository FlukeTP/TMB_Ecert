
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingSessionRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingSessionRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingSessionRec_Type", propOrder = {
    "postingSessionId",
    "postingSessionInfo",
    "postingSessionEnvr",
    "postingSessionStatus"
})
public class PostingSessionRecType {

    @XmlElement(name = "PostingSessionId", required = true)
    protected String postingSessionId;
    @XmlElement(name = "PostingSessionInfo", required = true)
    protected PostingSessionInfoType postingSessionInfo;
    @XmlElement(name = "PostingSessionEnvr")
    protected PostingSessionEnvrType postingSessionEnvr;
    @XmlElement(name = "PostingSessionStatus", required = true)
    protected PostingSessionStatusType postingSessionStatus;

    /**
     * Gets the value of the postingSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingSessionId() {
        return postingSessionId;
    }

    /**
     * Sets the value of the postingSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingSessionId(String value) {
        this.postingSessionId = value;
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

    /**
     * Gets the value of the postingSessionEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PostingSessionEnvrType }
     *     
     */
    public PostingSessionEnvrType getPostingSessionEnvr() {
        return postingSessionEnvr;
    }

    /**
     * Sets the value of the postingSessionEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingSessionEnvrType }
     *     
     */
    public void setPostingSessionEnvr(PostingSessionEnvrType value) {
        this.postingSessionEnvr = value;
    }

    /**
     * Gets the value of the postingSessionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PostingSessionStatusType }
     *     
     */
    public PostingSessionStatusType getPostingSessionStatus() {
        return postingSessionStatus;
    }

    /**
     * Sets the value of the postingSessionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingSessionStatusType }
     *     
     */
    public void setPostingSessionStatus(PostingSessionStatusType value) {
        this.postingSessionStatus = value;
    }

}
