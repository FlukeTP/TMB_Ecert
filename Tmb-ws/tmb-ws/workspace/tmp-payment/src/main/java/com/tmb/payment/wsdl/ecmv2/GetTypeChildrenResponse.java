
package com.tmb.payment.wsdl.ecmv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="types" type="{http://docs.oasis-open.org/ns/cmis/messaging/200908/}cmisTypeDefinitionListType"/&gt;
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
    "types"
})
@XmlRootElement(name = "getTypeChildrenResponse")
public class GetTypeChildrenResponse {

    @XmlElement(required = true)
    protected CmisTypeDefinitionListType types;

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link CmisTypeDefinitionListType }
     *     
     */
    public CmisTypeDefinitionListType getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisTypeDefinitionListType }
     *     
     */
    public void setTypes(CmisTypeDefinitionListType value) {
        this.types = value;
    }

}
