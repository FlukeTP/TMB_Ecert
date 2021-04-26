
package com.tmb.payment.wsdl.ecm.wsapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bulkUploadDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bulkUploadDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentRequest" type="{http://wsapi.svc.ecm.clevel.com/}documentServiceRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bulkUploadDocument", propOrder = {
    "documentRequest"
})
public class BulkUploadDocument {

    protected DocumentServiceRequest documentRequest;

    /**
     * Gets the value of the documentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentServiceRequest }
     *     
     */
    public DocumentServiceRequest getDocumentRequest() {
        return documentRequest;
    }

    /**
     * Sets the value of the documentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentServiceRequest }
     *     
     */
    public void setDocumentRequest(DocumentServiceRequest value) {
        this.documentRequest = value;
    }

}
