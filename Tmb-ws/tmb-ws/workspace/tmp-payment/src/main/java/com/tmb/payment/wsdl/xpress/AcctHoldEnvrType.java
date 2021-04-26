
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.PassbkKeysType;
import com.tmb.payment.wsdl.xpress.vo.PointOfServiceDataType;


/**
 * <p>Java class for AcctHoldEnvr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctHoldEnvr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreatedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreateRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientCreateDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientBusinessDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastUpdateDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastUpdateRqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LoginName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NetworkTrnData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ServerTerminalSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PointOfServiceData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientTerminalSeqNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctHoldEnvr_Type", propOrder = {
    "createdDt",
    "createRefIdent",
    "clientCreateDt",
    "clientBusinessDt",
    "lastUpdateDt",
    "lastUpdateRqUID",
    "loginName",
    "partyKeys",
    "cardKeys",
    "passbkKeys",
    "networkTrnData",
    "serverTerminalSeqNum",
    "pointOfServiceData",
    "clientTerminalSeqNum"
})
public class AcctHoldEnvrType {

    @XmlElement(name = "CreatedDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String createdDt;
    @XmlElement(name = "CreateRefIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String createRefIdent;
    @XmlElement(name = "ClientCreateDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String clientCreateDt;
    @XmlElement(name = "ClientBusinessDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String clientBusinessDt;
    @XmlElement(name = "LastUpdateDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String lastUpdateDt;
    @XmlElement(name = "LastUpdateRqUID", namespace = "urn:ifxforum-org:XSD:1")
    protected String lastUpdateRqUID;
    @XmlElement(name = "LoginName", namespace = "urn:ifxforum-org:XSD:1")
    protected String loginName;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElementRef(name = "CardKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType> cardKeys;
    @XmlElement(name = "PassbkKeys", namespace = "urn:ifxforum-org:XSD:1")
    protected PassbkKeysType passbkKeys;
    @XmlElementRef(name = "NetworkTrnData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType> networkTrnData;
    @XmlElement(name = "ServerTerminalSeqNum", namespace = "urn:ifxforum-org:XSD:1")
    protected String serverTerminalSeqNum;
    @XmlElement(name = "PointOfServiceData", namespace = "urn:ifxforum-org:XSD:1")
    protected PointOfServiceDataType pointOfServiceData;
    @XmlElement(name = "ClientTerminalSeqNum", namespace = "urn:ifxforum-org:XSD:1")
    protected String clientTerminalSeqNum;

    /**
     * Gets the value of the createdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDt() {
        return createdDt;
    }

    /**
     * Sets the value of the createdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDt(String value) {
        this.createdDt = value;
    }

    /**
     * Gets the value of the createRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateRefIdent() {
        return createRefIdent;
    }

    /**
     * Sets the value of the createRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateRefIdent(String value) {
        this.createRefIdent = value;
    }

    /**
     * Gets the value of the clientCreateDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCreateDt() {
        return clientCreateDt;
    }

    /**
     * Sets the value of the clientCreateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCreateDt(String value) {
        this.clientCreateDt = value;
    }

    /**
     * Gets the value of the clientBusinessDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientBusinessDt() {
        return clientBusinessDt;
    }

    /**
     * Sets the value of the clientBusinessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientBusinessDt(String value) {
        this.clientBusinessDt = value;
    }

    /**
     * Gets the value of the lastUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * Sets the value of the lastUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDt(String value) {
        this.lastUpdateDt = value;
    }

    /**
     * Gets the value of the lastUpdateRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateRqUID() {
        return lastUpdateRqUID;
    }

    /**
     * Sets the value of the lastUpdateRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateRqUID(String value) {
        this.lastUpdateRqUID = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the partyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> getPartyKeys() {
        return partyKeys;
    }

    /**
     * Sets the value of the partyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public void setPartyKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> value) {
        this.partyKeys = value;
    }

    /**
     * Gets the value of the cardKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CardKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CardKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType> getCardKeys() {
        return cardKeys;
    }

    /**
     * Sets the value of the cardKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CardKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CardKeysType }{@code >}
     *     
     */
    public void setCardKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType> value) {
        this.cardKeys = value;
    }

    /**
     * Gets the value of the passbkKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkKeysType }
     *     
     */
    public PassbkKeysType getPassbkKeys() {
        return passbkKeys;
    }

    /**
     * Sets the value of the passbkKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkKeysType }
     *     
     */
    public void setPassbkKeys(PassbkKeysType value) {
        this.passbkKeys = value;
    }

    /**
     * Gets the value of the networkTrnData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.NetworkTrnDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType> getNetworkTrnData() {
        return networkTrnData;
    }

    /**
     * Sets the value of the networkTrnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.NetworkTrnDataType }{@code >}
     *     
     */
    public void setNetworkTrnData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType> value) {
        this.networkTrnData = value;
    }

    /**
     * Gets the value of the serverTerminalSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerTerminalSeqNum() {
        return serverTerminalSeqNum;
    }

    /**
     * Sets the value of the serverTerminalSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerTerminalSeqNum(String value) {
        this.serverTerminalSeqNum = value;
    }

    /**
     * Gets the value of the pointOfServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceDataType }
     *     
     */
    public PointOfServiceDataType getPointOfServiceData() {
        return pointOfServiceData;
    }

    /**
     * Sets the value of the pointOfServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceDataType }
     *     
     */
    public void setPointOfServiceData(PointOfServiceDataType value) {
        this.pointOfServiceData = value;
    }

    /**
     * Gets the value of the clientTerminalSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTerminalSeqNum() {
        return clientTerminalSeqNum;
    }

    /**
     * Sets the value of the clientTerminalSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTerminalSeqNum(String value) {
        this.clientTerminalSeqNum = value;
    }

}
