
package com.tmb.payment.wsdl.ecm.wsapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentServiceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reqUserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="caNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="segmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="indexGroups" type="{http://wsapi.svc.ecm.clevel.com/}documentIndexGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentServiceRequest", propOrder = {
    "reqId",
    "reqUserId",
    "caNumber",
    "channelId",
    "segmentCode",
    "indexGroups"
})
@XmlSeeAlso({
    DocumentServiceResponse.class
})
public class DocumentServiceRequest {

    @XmlElement(required = true)
    protected String reqId;
    @XmlElement(required = true)
    protected String reqUserId;
    @XmlElement(required = true)
    protected String caNumber;
    @XmlElement(required = true)
    protected String channelId;
    @XmlElement(required = true)
    protected String segmentCode;
    protected List<DocumentIndexGroup> indexGroups;

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqId(String value) {
        this.reqId = value;
    }

    /**
     * Gets the value of the reqUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqUserId() {
        return reqUserId;
    }

    /**
     * Sets the value of the reqUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqUserId(String value) {
        this.reqUserId = value;
    }

    /**
     * Gets the value of the caNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaNumber() {
        return caNumber;
    }

    /**
     * Sets the value of the caNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaNumber(String value) {
        this.caNumber = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the segmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentCode() {
        return segmentCode;
    }

    /**
     * Sets the value of the segmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentCode(String value) {
        this.segmentCode = value;
    }

    /**
     * Gets the value of the indexGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIndexGroup }
     * 
     * 
     */
    public List<DocumentIndexGroup> getIndexGroups() {
        if (indexGroups == null) {
            indexGroups = new ArrayList<DocumentIndexGroup>();
        }
        return this.indexGroups;
    }

}
