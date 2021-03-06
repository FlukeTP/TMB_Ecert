
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
 * 2018-12-19T14:38:29.921+07:00
 * Generated source version: 3.2.6
 *
 */
public final class RelationshipServicePort_RelationshipServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "RelationshipService");

    private RelationshipServicePort_RelationshipServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RelationshipService.WSDL_LOCATION;
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

        RelationshipService ss = new RelationshipService(wsdlURL, SERVICE_NAME);
        RelationshipServicePort port = ss.getRelationshipServicePort();

        {
        System.out.println("Invoking getObjectRelationships...");
        java.lang.String _getObjectRelationships_repositoryId = "";
        java.lang.String _getObjectRelationships_objectId = "";
        java.lang.Boolean _getObjectRelationships_includeSubRelationshipTypes = null;
        com.tmb.payment.wsdl.ecmv2.EnumRelationshipDirection _getObjectRelationships_relationshipDirection = null;
        java.lang.String _getObjectRelationships_typeId = "";
        java.lang.String _getObjectRelationships_filter = "";
        java.lang.Boolean _getObjectRelationships_includeAllowableActions = null;
        java.math.BigInteger _getObjectRelationships_maxItems = new java.math.BigInteger("0");
        java.math.BigInteger _getObjectRelationships_skipCount = new java.math.BigInteger("0");
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _getObjectRelationships_extension = null;
        try {
            com.tmb.payment.wsdl.ecmv2.CmisObjectListType _getObjectRelationships__return = port.getObjectRelationships(_getObjectRelationships_repositoryId, _getObjectRelationships_objectId, _getObjectRelationships_includeSubRelationshipTypes, _getObjectRelationships_relationshipDirection, _getObjectRelationships_typeId, _getObjectRelationships_filter, _getObjectRelationships_includeAllowableActions, _getObjectRelationships_maxItems, _getObjectRelationships_skipCount, _getObjectRelationships_extension);
            System.out.println("getObjectRelationships.result=" + _getObjectRelationships__return);

        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
