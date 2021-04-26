
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StmtGrpRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StmtGrpRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}StmtGrpId"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}StmtGrpKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpInfo"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpAuth" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StmtGrpRec_Type", propOrder = {
    "stmtGrpId",
    "stmtGrpKeys",
    "stmtGrpInfo",
    "stmtGrpStatus",
    "stmtGrpEnvr",
    "stmtGrpAuth"
})
public class StmtGrpRecType {

    @XmlElement(name = "StmtGrpId")
    protected String stmtGrpId;
    @XmlElement(name = "StmtGrpKeys")
    protected StmtGrpKeysType stmtGrpKeys;
    @XmlElement(name = "StmtGrpInfo", required = true)
    protected StmtGrpInfoType stmtGrpInfo;
    @XmlElement(name = "StmtGrpStatus")
    protected StmtGrpStatusType stmtGrpStatus;
    @XmlElement(name = "StmtGrpEnvr")
    protected StmtGrpEnvrType stmtGrpEnvr;
    @XmlElement(name = "StmtGrpAuth")
    protected StmtGrpAuthType stmtGrpAuth;

    /**
     * Gets the value of the stmtGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtGrpId() {
        return stmtGrpId;
    }

    /**
     * Sets the value of the stmtGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtGrpId(String value) {
        this.stmtGrpId = value;
    }

    /**
     * Gets the value of the stmtGrpKeys property.
     * 
     * @return
     *     possible object is
     *     {@link StmtGrpKeysType }
     *     
     */
    public StmtGrpKeysType getStmtGrpKeys() {
        return stmtGrpKeys;
    }

    /**
     * Sets the value of the stmtGrpKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtGrpKeysType }
     *     
     */
    public void setStmtGrpKeys(StmtGrpKeysType value) {
        this.stmtGrpKeys = value;
    }

    /**
     * Gets the value of the stmtGrpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StmtGrpInfoType }
     *     
     */
    public StmtGrpInfoType getStmtGrpInfo() {
        return stmtGrpInfo;
    }

    /**
     * Sets the value of the stmtGrpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtGrpInfoType }
     *     
     */
    public void setStmtGrpInfo(StmtGrpInfoType value) {
        this.stmtGrpInfo = value;
    }

    /**
     * Gets the value of the stmtGrpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StmtGrpStatusType }
     *     
     */
    public StmtGrpStatusType getStmtGrpStatus() {
        return stmtGrpStatus;
    }

    /**
     * Sets the value of the stmtGrpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtGrpStatusType }
     *     
     */
    public void setStmtGrpStatus(StmtGrpStatusType value) {
        this.stmtGrpStatus = value;
    }

    /**
     * Gets the value of the stmtGrpEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link StmtGrpEnvrType }
     *     
     */
    public StmtGrpEnvrType getStmtGrpEnvr() {
        return stmtGrpEnvr;
    }

    /**
     * Sets the value of the stmtGrpEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtGrpEnvrType }
     *     
     */
    public void setStmtGrpEnvr(StmtGrpEnvrType value) {
        this.stmtGrpEnvr = value;
    }

    /**
     * Gets the value of the stmtGrpAuth property.
     * 
     * @return
     *     possible object is
     *     {@link StmtGrpAuthType }
     *     
     */
    public StmtGrpAuthType getStmtGrpAuth() {
        return stmtGrpAuth;
    }

    /**
     * Sets the value of the stmtGrpAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtGrpAuthType }
     *     
     */
    public void setStmtGrpAuth(StmtGrpAuthType value) {
        this.stmtGrpAuth = value;
    }

}
