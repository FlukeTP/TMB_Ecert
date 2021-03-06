package com.tmb.payment.wsdl.ecmv2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-19T14:38:30.308+07:00
 * Generated source version: 3.2.6
 *
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "VersioningServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface VersioningServicePort {

    @WebMethod(action = "checkOut")
    @RequestWrapper(localName = "checkOut", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.CheckOut")
    @ResponseWrapper(localName = "checkOutResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.CheckOutResponse")
    public void checkOut(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        javax.xml.ws.Holder<java.lang.String> objectId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        javax.xml.ws.Holder<CmisExtensionType> extension,
        @WebParam(mode = WebParam.Mode.OUT, name = "contentCopied", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        javax.xml.ws.Holder<java.lang.Boolean> contentCopied
    ) throws CmisException;

    @WebMethod(action = "cancelCheckOut")
    @RequestWrapper(localName = "cancelCheckOut", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.CancelCheckOut")
    @ResponseWrapper(localName = "cancelCheckOutResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.CancelCheckOutResponse")
    public void cancelCheckOut(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String objectId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        javax.xml.ws.Holder<CmisExtensionType> extension
    ) throws CmisException;

    @WebMethod(action = "getObjectOfLatestVersion")
    @RequestWrapper(localName = "getObjectOfLatestVersion", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.GetObjectOfLatestVersion")
    @ResponseWrapper(localName = "getObjectOfLatestVersionResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.GetObjectOfLatestVersionResponse")
    @WebResult(name = "object", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public com.tmb.payment.wsdl.ecmv2.CmisObjectType getObjectOfLatestVersion(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String objectId,
        @WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean major,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeAllowableActions,
        @WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.EnumIncludeRelationships includeRelationships,
        @WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String renditionFilter,
        @WebParam(name = "includePolicyIds", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includePolicyIds,
        @WebParam(name = "includeACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeACL,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod(action = "getAllVersions")
    @RequestWrapper(localName = "getAllVersions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.GetAllVersions")
    @ResponseWrapper(localName = "getAllVersionsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.GetAllVersionsResponse")
    @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public java.util.List<com.tmb.payment.wsdl.ecmv2.CmisObjectType> getAllVersions(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String objectId,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean includeAllowableActions,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod(action = "getPropertiesOfLatestVersion")
    @RequestWrapper(localName = "getPropertiesOfLatestVersion", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.GetPropertiesOfLatestVersion")
    @ResponseWrapper(localName = "getPropertiesOfLatestVersionResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.GetPropertiesOfLatestVersionResponse")
    @WebResult(name = "properties", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
    public com.tmb.payment.wsdl.ecmv2.CmisPropertiesType getPropertiesOfLatestVersion(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String objectId,
        @WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean major,
        @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String filter,
        @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType extension
    ) throws CmisException;

    @WebMethod(action = "checkIn")
    @RequestWrapper(localName = "checkIn", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.CheckIn")
    @ResponseWrapper(localName = "checkInResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "com.tmb.payment.wsdl.ecmv2.CheckInResponse")
    public void checkIn(
        @WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String repositoryId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        javax.xml.ws.Holder<java.lang.String> objectId,
        @WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.Boolean major,
        @WebParam(name = "properties", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.CmisPropertiesType properties,
        @WebParam(name = "contentStream", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.CmisContentStreamType contentStream,
        @WebParam(name = "checkinComment", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.lang.String checkinComment,
        @WebParam(name = "policies", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        java.util.List<java.lang.String> policies,
        @WebParam(name = "addACEs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.CmisAccessControlListType addACEs,
        @WebParam(name = "removeACEs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        com.tmb.payment.wsdl.ecmv2.CmisAccessControlListType removeACEs,
        @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
        javax.xml.ws.Holder<CmisExtensionType> extension
    ) throws CmisException;
}
