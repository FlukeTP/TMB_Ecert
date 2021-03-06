
package com.tmb.payment.wsdl.ecmv2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addACEs" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisAccessControlListType" minOccurs="0"/&gt;
 *         &lt;element name="removeACEs" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisAccessControlListType" minOccurs="0"/&gt;
 *         &lt;element name="ACLPropagation" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumACLPropagation" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://docs.oasis-open.org/ns/cmis/messaging/200908/}cmisExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "repositoryId",
    "objectId",
    "addACEs",
    "removeACEs",
    "aclPropagation",
    "extension"
})
@XmlRootElement(name = "applyACL")
public class ApplyACL {

    @XmlElement(required = true)
    protected String repositoryId;
    @XmlElement(required = true)
    protected String objectId;
    protected CmisAccessControlListType addACEs;
    protected CmisAccessControlListType removeACEs;
    @XmlElementRef(name = "ACLPropagation", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<EnumACLPropagation> aclPropagation;
    @XmlElementRef(name = "extension", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisExtensionType> extension;

    /**
     * Gets the value of the repositoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * Sets the value of the repositoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryId(String value) {
        this.repositoryId = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the addACEs property.
     * 
     * @return
     *     possible object is
     *     {@link CmisAccessControlListType }
     *     
     */
    public CmisAccessControlListType getAddACEs() {
        return addACEs;
    }

    /**
     * Sets the value of the addACEs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisAccessControlListType }
     *     
     */
    public void setAddACEs(CmisAccessControlListType value) {
        this.addACEs = value;
    }

    /**
     * Gets the value of the removeACEs property.
     * 
     * @return
     *     possible object is
     *     {@link CmisAccessControlListType }
     *     
     */
    public CmisAccessControlListType getRemoveACEs() {
        return removeACEs;
    }

    /**
     * Sets the value of the removeACEs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisAccessControlListType }
     *     
     */
    public void setRemoveACEs(CmisAccessControlListType value) {
        this.removeACEs = value;
    }

    /**
     * Gets the value of the aclPropagation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnumACLPropagation }{@code >}
     *     
     */
    public JAXBElement<EnumACLPropagation> getACLPropagation() {
        return aclPropagation;
    }

    /**
     * Sets the value of the aclPropagation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnumACLPropagation }{@code >}
     *     
     */
    public void setACLPropagation(JAXBElement<EnumACLPropagation> value) {
        this.aclPropagation = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisExtensionType }{@code >}
     *     
     */
    public JAXBElement<CmisExtensionType> getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisExtensionType }{@code >}
     *     
     */
    public void setExtension(JAXBElement<CmisExtensionType> value) {
        this.extension = value;
    }

}
