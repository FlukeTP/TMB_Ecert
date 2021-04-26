
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NFIP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NFIP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MapExistInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MapIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MapSuffixIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MapRevisionDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MapDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FloodZoneIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CmtyNbr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CmtyName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CmtyStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CmtyStatusDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CmtyPanelIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NFIP_Type", propOrder = {
    "postAddr",
    "mapExistInd",
    "mapIdent",
    "mapSuffixIdent",
    "mapRevisionDt",
    "mapDt",
    "floodZoneIdent",
    "cmtyNbr",
    "cmtyName",
    "cmtyStatusCode",
    "cmtyStatusDt",
    "cmtyPanelIdent"
})
public class NFIPType {

    @XmlElementRef(name = "PostAddr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> postAddr;
    @XmlElement(name = "MapExistInd")
    protected Boolean mapExistInd;
    @XmlElement(name = "MapIdent")
    protected String mapIdent;
    @XmlElement(name = "MapSuffixIdent")
    protected String mapSuffixIdent;
    @XmlElement(name = "MapRevisionDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mapRevisionDt;
    @XmlElement(name = "MapDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mapDt;
    @XmlElement(name = "FloodZoneIdent")
    protected String floodZoneIdent;
    @XmlElement(name = "CmtyNbr")
    protected String cmtyNbr;
    @XmlElement(name = "CmtyName")
    protected String cmtyName;
    @XmlElement(name = "CmtyStatusCode")
    protected String cmtyStatusCode;
    @XmlElement(name = "CmtyStatusDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cmtyStatusDt;
    @XmlElement(name = "CmtyPanelIdent")
    protected String cmtyPanelIdent;

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PostAddrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PostAddrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     *     
     */
    public void setPostAddr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the mapExistInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMapExistInd() {
        return mapExistInd;
    }

    /**
     * Sets the value of the mapExistInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMapExistInd(Boolean value) {
        this.mapExistInd = value;
    }

    /**
     * Gets the value of the mapIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapIdent() {
        return mapIdent;
    }

    /**
     * Sets the value of the mapIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapIdent(String value) {
        this.mapIdent = value;
    }

    /**
     * Gets the value of the mapSuffixIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapSuffixIdent() {
        return mapSuffixIdent;
    }

    /**
     * Sets the value of the mapSuffixIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapSuffixIdent(String value) {
        this.mapSuffixIdent = value;
    }

    /**
     * Gets the value of the mapRevisionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMapRevisionDt() {
        return mapRevisionDt;
    }

    /**
     * Sets the value of the mapRevisionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMapRevisionDt(XMLGregorianCalendar value) {
        this.mapRevisionDt = value;
    }

    /**
     * Gets the value of the mapDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMapDt() {
        return mapDt;
    }

    /**
     * Sets the value of the mapDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMapDt(XMLGregorianCalendar value) {
        this.mapDt = value;
    }

    /**
     * Gets the value of the floodZoneIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloodZoneIdent() {
        return floodZoneIdent;
    }

    /**
     * Sets the value of the floodZoneIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloodZoneIdent(String value) {
        this.floodZoneIdent = value;
    }

    /**
     * Gets the value of the cmtyNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtyNbr() {
        return cmtyNbr;
    }

    /**
     * Sets the value of the cmtyNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtyNbr(String value) {
        this.cmtyNbr = value;
    }

    /**
     * Gets the value of the cmtyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtyName() {
        return cmtyName;
    }

    /**
     * Sets the value of the cmtyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtyName(String value) {
        this.cmtyName = value;
    }

    /**
     * Gets the value of the cmtyStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtyStatusCode() {
        return cmtyStatusCode;
    }

    /**
     * Sets the value of the cmtyStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtyStatusCode(String value) {
        this.cmtyStatusCode = value;
    }

    /**
     * Gets the value of the cmtyStatusDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCmtyStatusDt() {
        return cmtyStatusDt;
    }

    /**
     * Sets the value of the cmtyStatusDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCmtyStatusDt(XMLGregorianCalendar value) {
        this.cmtyStatusDt = value;
    }

    /**
     * Gets the value of the cmtyPanelIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtyPanelIdent() {
        return cmtyPanelIdent;
    }

    /**
     * Sets the value of the cmtyPanelIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtyPanelIdent(String value) {
        this.cmtyPanelIdent = value;
    }

}
