
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailApp_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailApp_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevAppOperation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevAppNormalOperation"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevAppComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailApp_Type", propOrder = {
    "devAppOperation",
    "devAppNormalOperation",
    "devAppComponent"
})
public class DevDetailAppType {

    @XmlElement(name = "DevAppOperation")
    protected List<String> devAppOperation;
    @XmlElement(name = "DevAppNormalOperation")
    protected boolean devAppNormalOperation;
    @XmlElement(name = "DevAppComponent")
    protected List<DevAppComponentType> devAppComponent;

    /**
     * Gets the value of the devAppOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devAppOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevAppOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDevAppOperation() {
        if (devAppOperation == null) {
            devAppOperation = new ArrayList<String>();
        }
        return this.devAppOperation;
    }

    /**
     * Gets the value of the devAppNormalOperation property.
     * 
     */
    public boolean isDevAppNormalOperation() {
        return devAppNormalOperation;
    }

    /**
     * Sets the value of the devAppNormalOperation property.
     * 
     */
    public void setDevAppNormalOperation(boolean value) {
        this.devAppNormalOperation = value;
    }

    /**
     * Gets the value of the devAppComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devAppComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevAppComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevAppComponentType }
     * 
     * 
     */
    public List<DevAppComponentType> getDevAppComponent() {
        if (devAppComponent == null) {
            devAppComponent = new ArrayList<DevAppComponentType>();
        }
        return this.devAppComponent;
    }

}
