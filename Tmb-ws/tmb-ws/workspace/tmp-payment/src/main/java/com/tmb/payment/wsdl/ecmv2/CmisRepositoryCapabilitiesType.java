
package com.tmb.payment.wsdl.ecmv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for cmisRepositoryCapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmisRepositoryCapabilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capabilityACL" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityACL"/&gt;
 *         &lt;element name="capabilityAllVersionsSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityChanges" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityChanges"/&gt;
 *         &lt;element name="capabilityContentStreamUpdatability" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityContentStreamUpdates"/&gt;
 *         &lt;element name="capabilityGetDescendants" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityGetFolderTree" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityOrderBy" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityOrderBy"/&gt;
 *         &lt;element name="capabilityMultifiling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityPWCSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityPWCUpdatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityQuery" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityQuery"/&gt;
 *         &lt;element name="capabilityRenditions" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityRendition"/&gt;
 *         &lt;element name="capabilityUnfiling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityVersionSpecificFiling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capabilityJoin" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}enumCapabilityJoin"/&gt;
 *         &lt;element name="capabilityCreatablePropertyTypes" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisCreatablePropertyTypesType" minOccurs="0"/&gt;
 *         &lt;element name="capabilityNewTypeSettableAttributes" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisNewTypeSettableAttributes" minOccurs="0"/&gt;
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisUndefinedAttribute"/&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmisRepositoryCapabilitiesType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {
    "capabilityACL",
    "capabilityAllVersionsSearchable",
    "capabilityChanges",
    "capabilityContentStreamUpdatability",
    "capabilityGetDescendants",
    "capabilityGetFolderTree",
    "capabilityOrderBy",
    "capabilityMultifiling",
    "capabilityPWCSearchable",
    "capabilityPWCUpdatable",
    "capabilityQuery",
    "capabilityRenditions",
    "capabilityUnfiling",
    "capabilityVersionSpecificFiling",
    "capabilityJoin",
    "capabilityCreatablePropertyTypes",
    "capabilityNewTypeSettableAttributes",
    "any"
})
public class CmisRepositoryCapabilitiesType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityACL capabilityACL;
    protected boolean capabilityAllVersionsSearchable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityChanges capabilityChanges;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityContentStreamUpdates capabilityContentStreamUpdatability;
    protected boolean capabilityGetDescendants;
    protected boolean capabilityGetFolderTree;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityOrderBy capabilityOrderBy;
    protected boolean capabilityMultifiling;
    protected boolean capabilityPWCSearchable;
    protected boolean capabilityPWCUpdatable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityQuery capabilityQuery;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityRendition capabilityRenditions;
    protected boolean capabilityUnfiling;
    protected boolean capabilityVersionSpecificFiling;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumCapabilityJoin capabilityJoin;
    protected CmisCreatablePropertyTypesType capabilityCreatablePropertyTypes;
    protected CmisNewTypeSettableAttributes capabilityNewTypeSettableAttributes;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the capabilityACL property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityACL }
     *     
     */
    public EnumCapabilityACL getCapabilityACL() {
        return capabilityACL;
    }

    /**
     * Sets the value of the capabilityACL property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityACL }
     *     
     */
    public void setCapabilityACL(EnumCapabilityACL value) {
        this.capabilityACL = value;
    }

    /**
     * Gets the value of the capabilityAllVersionsSearchable property.
     * 
     */
    public boolean isCapabilityAllVersionsSearchable() {
        return capabilityAllVersionsSearchable;
    }

    /**
     * Sets the value of the capabilityAllVersionsSearchable property.
     * 
     */
    public void setCapabilityAllVersionsSearchable(boolean value) {
        this.capabilityAllVersionsSearchable = value;
    }

    /**
     * Gets the value of the capabilityChanges property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityChanges }
     *     
     */
    public EnumCapabilityChanges getCapabilityChanges() {
        return capabilityChanges;
    }

    /**
     * Sets the value of the capabilityChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityChanges }
     *     
     */
    public void setCapabilityChanges(EnumCapabilityChanges value) {
        this.capabilityChanges = value;
    }

    /**
     * Gets the value of the capabilityContentStreamUpdatability property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityContentStreamUpdates }
     *     
     */
    public EnumCapabilityContentStreamUpdates getCapabilityContentStreamUpdatability() {
        return capabilityContentStreamUpdatability;
    }

    /**
     * Sets the value of the capabilityContentStreamUpdatability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityContentStreamUpdates }
     *     
     */
    public void setCapabilityContentStreamUpdatability(EnumCapabilityContentStreamUpdates value) {
        this.capabilityContentStreamUpdatability = value;
    }

    /**
     * Gets the value of the capabilityGetDescendants property.
     * 
     */
    public boolean isCapabilityGetDescendants() {
        return capabilityGetDescendants;
    }

    /**
     * Sets the value of the capabilityGetDescendants property.
     * 
     */
    public void setCapabilityGetDescendants(boolean value) {
        this.capabilityGetDescendants = value;
    }

    /**
     * Gets the value of the capabilityGetFolderTree property.
     * 
     */
    public boolean isCapabilityGetFolderTree() {
        return capabilityGetFolderTree;
    }

    /**
     * Sets the value of the capabilityGetFolderTree property.
     * 
     */
    public void setCapabilityGetFolderTree(boolean value) {
        this.capabilityGetFolderTree = value;
    }

    /**
     * Gets the value of the capabilityOrderBy property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityOrderBy }
     *     
     */
    public EnumCapabilityOrderBy getCapabilityOrderBy() {
        return capabilityOrderBy;
    }

    /**
     * Sets the value of the capabilityOrderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityOrderBy }
     *     
     */
    public void setCapabilityOrderBy(EnumCapabilityOrderBy value) {
        this.capabilityOrderBy = value;
    }

    /**
     * Gets the value of the capabilityMultifiling property.
     * 
     */
    public boolean isCapabilityMultifiling() {
        return capabilityMultifiling;
    }

    /**
     * Sets the value of the capabilityMultifiling property.
     * 
     */
    public void setCapabilityMultifiling(boolean value) {
        this.capabilityMultifiling = value;
    }

    /**
     * Gets the value of the capabilityPWCSearchable property.
     * 
     */
    public boolean isCapabilityPWCSearchable() {
        return capabilityPWCSearchable;
    }

    /**
     * Sets the value of the capabilityPWCSearchable property.
     * 
     */
    public void setCapabilityPWCSearchable(boolean value) {
        this.capabilityPWCSearchable = value;
    }

    /**
     * Gets the value of the capabilityPWCUpdatable property.
     * 
     */
    public boolean isCapabilityPWCUpdatable() {
        return capabilityPWCUpdatable;
    }

    /**
     * Sets the value of the capabilityPWCUpdatable property.
     * 
     */
    public void setCapabilityPWCUpdatable(boolean value) {
        this.capabilityPWCUpdatable = value;
    }

    /**
     * Gets the value of the capabilityQuery property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityQuery }
     *     
     */
    public EnumCapabilityQuery getCapabilityQuery() {
        return capabilityQuery;
    }

    /**
     * Sets the value of the capabilityQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityQuery }
     *     
     */
    public void setCapabilityQuery(EnumCapabilityQuery value) {
        this.capabilityQuery = value;
    }

    /**
     * Gets the value of the capabilityRenditions property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityRendition }
     *     
     */
    public EnumCapabilityRendition getCapabilityRenditions() {
        return capabilityRenditions;
    }

    /**
     * Sets the value of the capabilityRenditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityRendition }
     *     
     */
    public void setCapabilityRenditions(EnumCapabilityRendition value) {
        this.capabilityRenditions = value;
    }

    /**
     * Gets the value of the capabilityUnfiling property.
     * 
     */
    public boolean isCapabilityUnfiling() {
        return capabilityUnfiling;
    }

    /**
     * Sets the value of the capabilityUnfiling property.
     * 
     */
    public void setCapabilityUnfiling(boolean value) {
        this.capabilityUnfiling = value;
    }

    /**
     * Gets the value of the capabilityVersionSpecificFiling property.
     * 
     */
    public boolean isCapabilityVersionSpecificFiling() {
        return capabilityVersionSpecificFiling;
    }

    /**
     * Sets the value of the capabilityVersionSpecificFiling property.
     * 
     */
    public void setCapabilityVersionSpecificFiling(boolean value) {
        this.capabilityVersionSpecificFiling = value;
    }

    /**
     * Gets the value of the capabilityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCapabilityJoin }
     *     
     */
    public EnumCapabilityJoin getCapabilityJoin() {
        return capabilityJoin;
    }

    /**
     * Sets the value of the capabilityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCapabilityJoin }
     *     
     */
    public void setCapabilityJoin(EnumCapabilityJoin value) {
        this.capabilityJoin = value;
    }

    /**
     * Gets the value of the capabilityCreatablePropertyTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CmisCreatablePropertyTypesType }
     *     
     */
    public CmisCreatablePropertyTypesType getCapabilityCreatablePropertyTypes() {
        return capabilityCreatablePropertyTypes;
    }

    /**
     * Sets the value of the capabilityCreatablePropertyTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisCreatablePropertyTypesType }
     *     
     */
    public void setCapabilityCreatablePropertyTypes(CmisCreatablePropertyTypesType value) {
        this.capabilityCreatablePropertyTypes = value;
    }

    /**
     * Gets the value of the capabilityNewTypeSettableAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CmisNewTypeSettableAttributes }
     *     
     */
    public CmisNewTypeSettableAttributes getCapabilityNewTypeSettableAttributes() {
        return capabilityNewTypeSettableAttributes;
    }

    /**
     * Sets the value of the capabilityNewTypeSettableAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisNewTypeSettableAttributes }
     *     
     */
    public void setCapabilityNewTypeSettableAttributes(CmisNewTypeSettableAttributes value) {
        this.capabilityNewTypeSettableAttributes = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
