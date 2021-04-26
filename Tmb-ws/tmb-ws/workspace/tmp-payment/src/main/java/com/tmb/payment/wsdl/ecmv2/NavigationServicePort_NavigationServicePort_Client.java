
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
 * 2018-12-19T14:38:29.975+07:00
 * Generated source version: 3.2.6
 *
 */
public final class NavigationServicePort_NavigationServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "NavigationService");

    private NavigationServicePort_NavigationServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = NavigationService.WSDL_LOCATION;
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

        NavigationService ss = new NavigationService(wsdlURL, SERVICE_NAME);
        NavigationServicePort port = ss.getNavigationServicePort();

        {
        System.out.println("Invoking getObjectParents...");
        java.lang.String _getObjectParents_repositoryId = "";
        java.lang.String _getObjectParents_objectId = "";
        java.lang.String _getObjectParents_filter = "";
        java.lang.Boolean _getObjectParents_includeAllowableActions = null;
        com.tmb.payment.wsdl.ecmv2.EnumIncludeRelationships _getObjectParents_includeRelationships = null;
        java.lang.String _getObjectParents_renditionFilter = "";
        java.lang.Boolean _getObjectParents_includeRelativePathSegment = null;
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getObjectParents_extension = null;
        try {
            java.util.List<com.tmb.payment.wsdl.ecmv2.CmisObjectParentsType> _getObjectParents__return = port.getObjectParents(_getObjectParents_repositoryId, _getObjectParents_objectId, _getObjectParents_filter, _getObjectParents_includeAllowableActions, _getObjectParents_includeRelationships, _getObjectParents_renditionFilter, _getObjectParents_includeRelativePathSegment, _getObjectParents_extension);
            System.out.println("getObjectParents.result=" + _getObjectParents__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCheckedOutDocs...");
        java.lang.String _getCheckedOutDocs_repositoryId = "";
        java.lang.String _getCheckedOutDocs_folderId = "";
        java.lang.String _getCheckedOutDocs_filter = "";
        java.lang.String _getCheckedOutDocs_orderBy = "";
        java.lang.Boolean _getCheckedOutDocs_includeAllowableActions = null;
        com.tmb.payment.wsdl.ecmv2.EnumIncludeRelationships _getCheckedOutDocs_includeRelationships = null;
        java.lang.String _getCheckedOutDocs_renditionFilter = "";
        java.math.BigInteger _getCheckedOutDocs_maxItems = new java.math.BigInteger("0");
        java.math.BigInteger _getCheckedOutDocs_skipCount = new java.math.BigInteger("0");
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getCheckedOutDocs_extension = null;
        try {
            com.tmb.payment.wsdl.ecmv2.CmisObjectListType _getCheckedOutDocs__return = port.getCheckedOutDocs(_getCheckedOutDocs_repositoryId, _getCheckedOutDocs_folderId, _getCheckedOutDocs_filter, _getCheckedOutDocs_orderBy, _getCheckedOutDocs_includeAllowableActions, _getCheckedOutDocs_includeRelationships, _getCheckedOutDocs_renditionFilter, _getCheckedOutDocs_maxItems, _getCheckedOutDocs_skipCount, _getCheckedOutDocs_extension);
            System.out.println("getCheckedOutDocs.result=" + _getCheckedOutDocs__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getFolderParent...");
        java.lang.String _getFolderParent_repositoryId = "";
        java.lang.String _getFolderParent_folderId = "";
        java.lang.String _getFolderParent_filter = "";
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getFolderParent_extension = null;
        try {
            com.tmb.payment.wsdl.ecmv2.CmisObjectType _getFolderParent__return = port.getFolderParent(_getFolderParent_repositoryId, _getFolderParent_folderId, _getFolderParent_filter, _getFolderParent_extension);
            System.out.println("getFolderParent.result=" + _getFolderParent__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getFolderTree...");
        java.lang.String _getFolderTree_repositoryId = "";
        java.lang.String _getFolderTree_folderId = "";
        java.math.BigInteger _getFolderTree_depth = new java.math.BigInteger("0");
        java.lang.String _getFolderTree_filter = "";
        java.lang.Boolean _getFolderTree_includeAllowableActions = null;
        com.tmb.payment.wsdl.ecmv2.EnumIncludeRelationships _getFolderTree_includeRelationships = null;
        java.lang.String _getFolderTree_renditionFilter = "";
        java.lang.Boolean _getFolderTree_includePathSegment = null;
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getFolderTree_extension = null;
        try {
            java.util.List<com.tmb.payment.wsdl.ecmv2.CmisObjectInFolderContainerType> _getFolderTree__return = port.getFolderTree(_getFolderTree_repositoryId, _getFolderTree_folderId, _getFolderTree_depth, _getFolderTree_filter, _getFolderTree_includeAllowableActions, _getFolderTree_includeRelationships, _getFolderTree_renditionFilter, _getFolderTree_includePathSegment, _getFolderTree_extension);
            System.out.println("getFolderTree.result=" + _getFolderTree__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDescendants...");
        java.lang.String _getDescendants_repositoryId = "";
        java.lang.String _getDescendants_folderId = "";
        java.math.BigInteger _getDescendants_depth = new java.math.BigInteger("0");
        java.lang.String _getDescendants_filter = "";
        java.lang.Boolean _getDescendants_includeAllowableActions = null;
        com.tmb.payment.wsdl.ecmv2.EnumIncludeRelationships _getDescendants_includeRelationships = null;
        java.lang.String _getDescendants_renditionFilter = "";
        java.lang.Boolean _getDescendants_includePathSegment = null;
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getDescendants_extension = null;
        try {
            java.util.List<com.tmb.payment.wsdl.ecmv2.CmisObjectInFolderContainerType> _getDescendants__return = port.getDescendants(_getDescendants_repositoryId, _getDescendants_folderId, _getDescendants_depth, _getDescendants_filter, _getDescendants_includeAllowableActions, _getDescendants_includeRelationships, _getDescendants_renditionFilter, _getDescendants_includePathSegment, _getDescendants_extension);
            System.out.println("getDescendants.result=" + _getDescendants__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getChildren...");
        java.lang.String _getChildren_repositoryId = "";
        java.lang.String _getChildren_folderId = "";
        java.lang.String _getChildren_filter = "";
        java.lang.String _getChildren_orderBy = "";
        java.lang.Boolean _getChildren_includeAllowableActions = null;
        com.tmb.payment.wsdl.ecmv2.EnumIncludeRelationships _getChildren_includeRelationships = null;
        java.lang.String _getChildren_renditionFilter = "";
        java.lang.Boolean _getChildren_includePathSegment = null;
        java.math.BigInteger _getChildren_maxItems = new java.math.BigInteger("0");
        java.math.BigInteger _getChildren_skipCount = new java.math.BigInteger("0");
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getChildren_extension = null;
        try {
            com.tmb.payment.wsdl.ecmv2.CmisObjectInFolderListType _getChildren__return = port.getChildren(_getChildren_repositoryId, _getChildren_folderId, _getChildren_filter, _getChildren_orderBy, _getChildren_includeAllowableActions, _getChildren_includeRelationships, _getChildren_renditionFilter, _getChildren_includePathSegment, _getChildren_maxItems, _getChildren_skipCount, _getChildren_extension);
            System.out.println("getChildren.result=" + _getChildren__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
