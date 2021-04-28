
package com.tmb.payment.wsdl.ecmv2;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-19T14:38:29.746+07:00
 * Generated source version: 3.2.6
 *
 */
public final class RepositoryServicePort_RepositoryServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "RepositoryService");

    private RepositoryServicePort_RepositoryServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RepositoryService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        RepositoryService ss = new RepositoryService(wsdlURL, SERVICE_NAME);
        RepositoryServicePort port = ss.getRepositoryServicePort();

        {
        System.out.println("Invoking getTypeChildren...");
        java.lang.String _getTypeChildren_repositoryId = "";
        java.lang.String _getTypeChildren_typeId = "";
        java.lang.Boolean _getTypeChildren_includePropertyDefinitions = null;
        java.math.BigInteger _getTypeChildren_maxItems = new java.math.BigInteger("0");
        java.math.BigInteger _getTypeChildren_skipCount = new java.math.BigInteger("0");
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getTypeChildren_extension = null;
        try {
            com.tmb.payment.wsdl.ecmv2.CmisTypeDefinitionListType _getTypeChildren__return = port.getTypeChildren(_getTypeChildren_repositoryId, _getTypeChildren_typeId, _getTypeChildren_includePropertyDefinitions, _getTypeChildren_maxItems, _getTypeChildren_skipCount, _getTypeChildren_extension);
            System.out.println("getTypeChildren.result=" + _getTypeChildren__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking updateType...");
        java.lang.String _updateType_repositoryId = "";
        com.tmb.payment.wsdl.ecmv2.CmisTypeDefinitionType _updateType_typeVal = null;
        javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisTypeDefinitionType> _updateType_type = new javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisTypeDefinitionType>(_updateType_typeVal);
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _updateType_extension = null;
        try {
            port.updateType(_updateType_repositoryId, _updateType_type, _updateType_extension);

            System.out.println("updateType._updateType_type=" + _updateType_type.value);
        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteType...");
        java.lang.String _deleteType_repositoryId = "";
        java.lang.String _deleteType_typeId = "";
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _deleteType_extensionVal = null;
        javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisExtensionType> _deleteType_extension = new javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisExtensionType>(_deleteType_extensionVal);
        try {
            port.deleteType(_deleteType_repositoryId, _deleteType_typeId, _deleteType_extension);

            System.out.println("deleteType._deleteType_extension=" + _deleteType_extension.value);
        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createType...");
        java.lang.String _createType_repositoryId = "";
        com.tmb.payment.wsdl.ecmv2.CmisTypeDefinitionType _createType_typeVal = null;
        javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisTypeDefinitionType> _createType_type = new javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisTypeDefinitionType>(_createType_typeVal);
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _createType_extension = null;
        try {
            port.createType(_createType_repositoryId, _createType_type, _createType_extension);

            System.out.println("createType._createType_type=" + _createType_type.value);
        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTypeDescendants...");
        java.lang.String _getTypeDescendants_repositoryId = "";
        java.lang.String _getTypeDescendants_typeId = "";
        java.math.BigInteger _getTypeDescendants_depth = new java.math.BigInteger("0");
        java.lang.Boolean _getTypeDescendants_includePropertyDefinitions = null;
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getTypeDescendants_extension = null;
        try {
            java.util.List<com.tmb.payment.wsdl.ecmv2.CmisTypeContainer> _getTypeDescendants__return = port.getTypeDescendants(_getTypeDescendants_repositoryId, _getTypeDescendants_typeId, _getTypeDescendants_depth, _getTypeDescendants_includePropertyDefinitions, _getTypeDescendants_extension);
            System.out.println("getTypeDescendants.result=" + _getTypeDescendants__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRepositoryInfo...");
        java.lang.String _getRepositoryInfo_repositoryId = "";
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getRepositoryInfo_extension = null;
        try {
            com.tmb.payment.wsdl.ecmv2.CmisRepositoryInfoType _getRepositoryInfo__return = port.getRepositoryInfo(_getRepositoryInfo_repositoryId, _getRepositoryInfo_extension);
            System.out.println("getRepositoryInfo.result=" + _getRepositoryInfo__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getTypeDefinition...");
        java.lang.String _getTypeDefinition_repositoryId = "";
        java.lang.String _getTypeDefinition_typeId = "";
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getTypeDefinition_extension = null;
        try {
            com.tmb.payment.wsdl.ecmv2.CmisTypeDefinitionType _getTypeDefinition__return = port.getTypeDefinition(_getTypeDefinition_repositoryId, _getTypeDefinition_typeId, _getTypeDefinition_extension);
            System.out.println("getTypeDefinition.result=" + _getTypeDefinition__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRepositories...");
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getRepositories_extension = null;
        try {
            java.util.List<com.tmb.payment.wsdl.ecmv2.CmisRepositoryEntryType> _getRepositories__return = port.getRepositories(_getRepositories_extension);
            System.out.println("getRepositories.result=" + _getRepositories__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}