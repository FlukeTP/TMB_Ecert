
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
 *         &lt;element name="bulkUpdateData" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisBulkUpdateType"/&gt;
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
    "bulkUpdateData",
    "extension"
})
@XmlRootElement(name = "bulkUpdateProperties")
public class BulkUpdateProperties {

    @XmlElement(required = true)
    protected String repositoryId;
    @XmlElement(required = true)
    protected CmisBulkUpdateType bulkUpdateData;
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
     * Gets the value of the bulkUpdateData property.
     * 
     * @return
     *     possible object is
     *     {@link CmisBulkUpdateType }
     *     
     */
    public CmisBulkUpdateType getBulkUpdateData() {
        return bulkUpdateData;
    }

    /**
     * Sets the value of the bulkUpdateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisBulkUpdateType }
     *     
     */
    public void setBulkUpdateData(CmisBulkUpdateType value) {
        this.bulkUpdateData = value;
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
