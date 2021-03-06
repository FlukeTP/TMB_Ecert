package com.tmb.payment.wsdl.ecmv2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-19T14:38:30.176+07:00
 * Generated source version: 3.2.6
 *
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "DiscoveryServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface DiscoveryServicePort {

    @WebMethod(action = "query")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "queryResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", partName = "parameters")
    public QueryResponse query(
        @WebParam(partName = "parameters", name = "query", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        Query parameters
    ) throws CmisException;

    @WebMethod(action = "getContentChanges")
    @RequestWrapper(localName = "getContentChanges", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.GetContentChanges")
    @ResponseWrapper(localName = "getContentChangesResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.GetContentChangesResponse")
    public void getContentChanges(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "changeLogToken", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        javax.xml.ws.Holder<java.lang.String> changeLogToken,
        @WebParam(name = "includeProperties", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeProperties,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "includePolicyIds", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includePolicyIds,
        @WebParam(name = "includeACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeACL,
        @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.math.BigInteger maxItems,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType extension,
        @WebParam(mode = WebParam.Mode.OUT, name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        javax.xml.ws.Holder<CmisObjectListType> objects
    ) throws CmisException;
}
