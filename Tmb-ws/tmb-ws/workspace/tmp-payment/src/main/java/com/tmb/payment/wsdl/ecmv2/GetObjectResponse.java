
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
 *         &lt;element name="object" type="{http://docs.oasis-open.org/ns/cmis/core/200908/}cmisObjectType"/&gt;
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
    "object"
})
@XmlRootElement(name = "getObjectResponse")
public class GetObjectResponse {

    @XmlElement(required = true)
    protected CmisObjectType object;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link CmisObjectType }
     *     
     */
    public CmisObjectType getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisObjectType }
     *     
     */
    public void setObject(CmisObjectType value) {
        this.object = value;
    }

}
