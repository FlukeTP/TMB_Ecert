
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipMgr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipMgr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelationshipRole" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelationshipMgrIdent"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Desc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipMgr_Type", propOrder = {
    "relationshipRole",
    "relationshipMgrIdent",
    "desc"
})
public class RelationshipMgrType {

    @XmlElement(name = "RelationshipRole")
    protected String relationshipRole;
    @XmlElement(name = "RelationshipMgrIdent", required = true)
    protected String relationshipMgrIdent;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the relationshipRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipRole() {
        return relationshipRole;
    }

    /**
     * Sets the value of the relationshipRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipRole(String value) {
        this.relationshipRole = value;
    }

    /**
     * Gets the value of the relationshipMgrIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipMgrIdent() {
        return relationshipMgrIdent;
    }

    /**
     * Sets the value of the relationshipMgrIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipMgrIdent(String value) {
        this.relationshipMgrIdent = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
