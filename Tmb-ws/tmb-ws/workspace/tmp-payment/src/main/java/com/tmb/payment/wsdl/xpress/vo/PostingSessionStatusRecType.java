
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingSessionStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingSessionStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingSessionStatusRec_Type", propOrder = {
    "postingSessionId",
    "postingSessionStatus"
})
public class PostingSessionStatusRecType {

    @XmlElement(name = "PostingSessionId")
    protected String postingSessionId;
    @XmlElement(name = "PostingSessionStatus")
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
