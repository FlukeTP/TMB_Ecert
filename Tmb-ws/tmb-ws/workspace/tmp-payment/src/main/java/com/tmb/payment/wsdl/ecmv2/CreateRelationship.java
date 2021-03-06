
package com.tmb.payment.wsdl.ecmv2;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="properties" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisPropertiesType"/&gt;
 *         &lt;element name="policies" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addACEs" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisAccessControlListType" minOccurs="0"/&gt;
 *         &lt;element name="removeACEs" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisAccessControlListType" minOccurs="0"/&gt;
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
    "properties",
    "policies",
    "addACEs",
    "removeACEs",
    "extension"
})
@XmlRootElement(name = "createRelationship")
public class CreateRelationship {

    @XmlElement(required = true)
    protected String repositoryId;
    @XmlElement(required = true)
    protected CmisPropertiesType properties;
    @XmlElement(nillable = true)
    protected List<String> policies;
    @XmlElementRef(name = "addACEs", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisAccessControlListType> addACEs;
    @XmlElementRef(name = "removeACEs", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<CmisAccessControlListType> removeACEs;
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
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertiesType }
     *     
     */
    public CmisPropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertiesType }
     *     
     */
    public void setProperties(CmisPropertiesType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPolicies() {
        if (policies == null) {
            policies = new ArrayList<String>();
        }
        return this.policies;
    }

    /**
     * Gets the value of the addACEs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisAccessControlListType }{@code >}
     *     
     */
    public JAXBElement<CmisAccessControlListType> getAddACEs() {
        return addACEs;
    }

    /**
     * Sets the value of the addACEs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisAccessControlListType }{@code >}
     *     
     */
    public void setAddACEs(JAXBElement<CmisAccessControlListType> value) {
        this.addACEs = value;
    }

    /**
     * Gets the value of the removeACEs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmisAccessControlListType }{@code >}
     *     
     */
    public JAXBElement<CmisAccessControlListType> getRemoveACEs() {
        return removeACEs;
    }

    /**
     * Sets the value of the removeACEs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmisAccessControlListType }{@code >}
     *     
     */
    public void setRemoveACEs(JAXBElement<CmisAccessControlListType> value) {
        this.removeACEs = value;
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
