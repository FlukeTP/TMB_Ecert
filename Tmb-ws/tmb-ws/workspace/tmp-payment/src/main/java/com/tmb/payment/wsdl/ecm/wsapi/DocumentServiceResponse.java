
package com.tmb.payment.wsdl.ecm.wsapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsapi.svc.ecm.clevel.com/}documentServiceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentServiceResponse", propOrder = {
    "resCode",
    "resDesc"
})
public class DocumentServiceResponse
    extends DocumentServiceRequest
{

    @XmlElement(required = true)
    protected String resCode;
    protected String resDesc;

    /**
     * Gets the value of the resCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResCode() {
        return resCode;
    }

    /**
     * Sets the value of the resCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResCode(String value) {
        this.resCode = value;
    }

    /**
     * Gets the value of the resDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResDesc() {
        return resDesc;
    }

    /**
     * Sets the value of the resDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResDesc(String value) {
        this.resDesc = value;
    }

}
