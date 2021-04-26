
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelPartyRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelPartyRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}RelPartyRef_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelationshipIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HeadofHouseHoldInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Comments" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelPartyRef_Type", propOrder = {
    "relationshipIdent",
    "headofHouseHoldInd",
    "comments"
})
public class RelPartyRefType
    extends com.tmb.payment.wsdl.xpress.vo.RelPartyRefType
{

    @XmlElement(name = "RelationshipIdent")
    protected Long relationshipIdent;
    @XmlElement(name = "HeadofHouseHoldInd")
    protected Boolean headofHouseHoldInd;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the relationshipIdent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelationshipIdent() {
        return relationshipIdent;
    }

    /**
     * Sets the value of the relationshipIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelationshipIdent(Long value) {
        this.relationshipIdent = value;
    }

    /**
     * Gets the value of the headofHouseHoldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadofHouseHoldInd() {
        return headofHouseHoldInd;
    }

    /**
     * Sets the value of the headofHouseHoldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadofHouseHoldInd(Boolean value) {
        this.headofHouseHoldInd = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
