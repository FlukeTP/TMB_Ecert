
package com.tmb.payment.wsdl.ecmv2;

import java.math.BigInteger;
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
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includeAllowableActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeRelationships" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumIncludeRelationships" minOccurs="0"/&gt;
 *         &lt;element name="renditionFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includePathSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "folderId",
    "depth",
    "filter",
    "includeAllowableActions",
    "includeRelationships",
    "renditionFilter",
    "includePathSegment",
    "extension"
})
@XmlRootElement(name = "getFolderTree")
public class GetFolderTree {

    @XmlElement(required = true)
    protected String repositoryId;
    @XmlElement(required = true)
    protected String folderId;
    @XmlElementRef(name = "depth", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> depth;
    @XmlElementRef(name = "filter", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filter;
    @XmlElementRef(name = "includeAllowableActions", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> includeAllowableActions;
    @XmlElementRef(name = "includeRelationships", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<EnumIncludeRelationships> includeRelationships;
    @XmlElementRef(name = "renditionFilter", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> renditionFilter;
    @XmlElementRef(name = "includePathSegment", namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> includePathSegment;
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
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderId(String value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setDepth(JAXBElement<BigInteger> value) {
        this.depth = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilter(JAXBElement<String> value) {
        this.filter = value;
    }

    /**
     * Gets the value of the includeAllowableActions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludeAllowableActions() {
        return includeAllowableActions;
    }

    /**
     * Sets the value of the includeAllowableActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludeAllowableActions(JAXBElement<Boolean> value) {
        this.includeAllowableActions = value;
    }

    /**
     * Gets the value of the includeRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnumIncludeRelationships }{@code >}
     *     
     */
    public JAXBElement<EnumIncludeRelationships> getIncludeRelationships() {
        return includeRelationships;
    }

    /**
     * Sets the value of the includeRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnumIncludeRelationships }{@code >}
     *     
     */
    public void setIncludeRelationships(JAXBElement<EnumIncludeRelationships> value) {
        this.includeRelationships = value;
    }

    /**
     * Gets the value of the renditionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRenditionFilter() {
        return renditionFilter;
    }

    /**
     * Sets the value of the renditionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRenditionFilter(JAXBElement<String> value) {
        this.renditionFilter = value;
    }

    /**
     * Gets the value of the includePathSegment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludePathSegment() {
        return includePathSegment;
    }

    /**
     * Sets the value of the includePathSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludePathSegment(JAXBElement<Boolean> value) {
        this.includePathSegment = value;
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
