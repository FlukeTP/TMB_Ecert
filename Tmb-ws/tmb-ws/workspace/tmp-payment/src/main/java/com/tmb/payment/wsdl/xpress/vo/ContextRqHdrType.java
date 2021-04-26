
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}QuerySelect" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FieldSelect" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientTerminalSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NetworkTrnData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PointOfServiceData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EMVRqData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MsgAuthCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustLangPref" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClearingLangCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientApp" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProxyClient" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Interface" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextRqHdr_Type", propOrder = {
    "querySelect",
    "fieldSelect",
    "clientTerminalSeqNum",
    "networkTrnData",
    "pointOfServiceData",
    "emvRqData",
    "msgAuthCode",
    "clientDt",
    "custLangPref",
    "clearingLangCode",
    "clientApp",
    "proxyClient",
    "_interface",
    "spName"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.ContextRqHdrType.class
})
public class ContextRqHdrType {

    @XmlElement(name = "QuerySelect")
    protected List<String> querySelect;
    @XmlElement(name = "FieldSelect")
    protected List<String> fieldSelect;
    @XmlElement(name = "ClientTerminalSeqNum")
    protected String clientTerminalSeqNum;
    @XmlElementRef(name = "NetworkTrnData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType> networkTrnData;
    @XmlElement(name = "PointOfServiceData")
    protected PointOfServiceDataType pointOfServiceData;
    @XmlElement(name = "EMVRqData")
    protected EMVRqDataType emvRqData;
    @XmlElement(name = "MsgAuthCode")
    protected MsgAuthCodeType msgAuthCode;
    @XmlElement(name = "ClientDt")
    protected String clientDt;
    @XmlElement(name = "CustLangPref")
    protected String custLangPref;
    @XmlElement(name = "ClearingLangCode")
    protected ClearingLangCodeType clearingLangCode;
    @XmlElement(name = "ClientApp")
    protected ClientAppType clientApp;
    @XmlElement(name = "ProxyClient")
    protected ProxyClientType proxyClient;
    @XmlElementRef(name = "Interface", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.InterfaceType> _interface;
    @XmlElement(name = "SPName")
    protected String spName;

    /**
     * Gets the value of the querySelect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the querySelect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuerySelect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQuerySelect() {
        if (querySelect == null) {
            querySelect = new ArrayList<String>();
        }
        return this.querySelect;
    }

    /**
     * Gets the value of the fieldSelect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldSelect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldSelect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldSelect() {
        if (fieldSelect == null) {
            fieldSelect = new ArrayList<String>();
        }
        return this.fieldSelect;
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

    /**
     * Gets the value of the networkTrnData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.NetworkTrnDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType }{@code >}
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
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.NetworkTrnDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType }{@code >}
     *     
     */
    public void setNetworkTrnData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType> value) {
        this.networkTrnData = value;
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
     * Gets the value of the emvRqData property.
     * 
     * @return
     *     possible object is
     *     {@link EMVRqDataType }
     *     
     */
    public EMVRqDataType getEMVRqData() {
        return emvRqData;
    }

    /**
     * Sets the value of the emvRqData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMVRqDataType }
     *     
     */
    public void setEMVRqData(EMVRqDataType value) {
        this.emvRqData = value;
    }

    /**
     * Gets the value of the msgAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link MsgAuthCodeType }
     *     
     */
    public MsgAuthCodeType getMsgAuthCode() {
        return msgAuthCode;
    }

    /**
     * Sets the value of the msgAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgAuthCodeType }
     *     
     */
    public void setMsgAuthCode(MsgAuthCodeType value) {
        this.msgAuthCode = value;
    }

    /**
     * Gets the value of the clientDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDt() {
        return clientDt;
    }

    /**
     * Sets the value of the clientDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDt(String value) {
        this.clientDt = value;
    }

    /**
     * Gets the value of the custLangPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLangPref() {
        return custLangPref;
    }

    /**
     * Sets the value of the custLangPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLangPref(String value) {
        this.custLangPref = value;
    }

    /**
     * Gets the value of the clearingLangCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingLangCodeType }
     *     
     */
    public ClearingLangCodeType getClearingLangCode() {
        return clearingLangCode;
    }

    /**
     * Sets the value of the clearingLangCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingLangCodeType }
     *     
     */
    public void setClearingLangCode(ClearingLangCodeType value) {
        this.clearingLangCode = value;
    }

    /**
     * Gets the value of the clientApp property.
     * 
     * @return
     *     possible object is
     *     {@link ClientAppType }
     *     
     */
    public ClientAppType getClientApp() {
        return clientApp;
    }

    /**
     * Sets the value of the clientApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAppType }
     *     
     */
    public void setClientApp(ClientAppType value) {
        this.clientApp = value;
    }

    /**
     * Gets the value of the proxyClient property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyClientType }
     *     
     */
    public ProxyClientType getProxyClient() {
        return proxyClient;
    }

    /**
     * Sets the value of the proxyClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyClientType }
     *     
     */
    public void setProxyClient(ProxyClientType value) {
        this.proxyClient = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.InterfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.InterfaceType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.InterfaceType> getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.InterfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.InterfaceType }{@code >}
     *     
     */
    public void setInterface(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.InterfaceType> value) {
        this._interface = value;
    }

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

}
