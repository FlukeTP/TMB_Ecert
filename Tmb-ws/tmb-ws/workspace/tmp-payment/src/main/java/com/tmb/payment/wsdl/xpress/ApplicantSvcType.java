
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicantSvc_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicantSvc_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplicantSvcIdent"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CompleteInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SrvBookInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcRemoveInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantSvc_Type", propOrder = {
    "applicantSvcIdent",
    "completeInd",
    "srvBookInd",
    "svcRemoveInd"
})
public class ApplicantSvcType {

    @XmlElement(name = "ApplicantSvcIdent", required = true)
    protected String applicantSvcIdent;
    @XmlElement(name = "CompleteInd")
    protected Boolean completeInd;
    @XmlElement(name = "SrvBookInd")
    protected Boolean srvBookInd;
    @XmlElement(name = "SvcRemoveInd")
    protected Boolean svcRemoveInd;

    /**
     * Gets the value of the applicantSvcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantSvcIdent() {
        return applicantSvcIdent;
    }

    /**
     * Sets the value of the applicantSvcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantSvcIdent(String value) {
        this.applicantSvcIdent = value;
    }

    /**
     * Gets the value of the completeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteInd() {
        return completeInd;
    }

    /**
     * Sets the value of the completeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteInd(Boolean value) {
        this.completeInd = value;
    }

    /**
     * Gets the value of the srvBookInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSrvBookInd() {
        return srvBookInd;
    }

    /**
     * Sets the value of the srvBookInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSrvBookInd(Boolean value) {
        this.srvBookInd = value;
    }

    /**
     * Gets the value of the svcRemoveInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSvcRemoveInd() {
        return svcRemoveInd;
    }

    /**
     * Sets the value of the svcRemoveInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSvcRemoveInd(Boolean value) {
        this.svcRemoveInd = value;
    }

}
