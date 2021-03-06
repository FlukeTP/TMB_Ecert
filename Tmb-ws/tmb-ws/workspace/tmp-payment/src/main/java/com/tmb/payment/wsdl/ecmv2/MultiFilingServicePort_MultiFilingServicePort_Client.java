
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
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-19T14:38:29.796+07:00
 * Generated source version: 3.2.6
 *
 */
public final class MultiFilingServicePort_MultiFilingServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "MultiFilingService");

    private MultiFilingServicePort_MultiFilingServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MultiFilingService.WSDL_LOCATION;
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

        MultiFilingService ss = new MultiFilingService(wsdlURL, SERVICE_NAME);
        MultiFilingServicePort port = ss.getMultiFilingServicePort();

        {
        System.out.println("Invoking addObjectToFolder...");
        java.lang.String _addObjectToFolder_repositoryId = "";
        java.lang.String _addObjectToFolder_objectId = "";
        java.lang.String _addObjectToFolder_folderId = "";
        java.lang.Boolean _addObjectToFolder_allVersions = null;
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _addObjectToFolder_extensionVal = null;
        javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisExtensionType> _addObjectToFolder_extension = new javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisExtensionType>(_addObjectToFolder_extensionVal);
        try {
            port.addObjectToFolder(_addObjectToFolder_repositoryId, _addObjectToFolder_objectId, _addObjectToFolder_folderId, _addObjectToFolder_allVersions, _addObjectToFolder_extension);

            System.out.println("addObjectToFolder._addObjectToFolder_extension=" + _addObjectToFolder_extension.value);
        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking removeObjectFromFolder...");
        java.lang.String _removeObjectFromFolder_repositoryId = "";
        java.lang.String _removeObjectFromFolder_objectId = "";
        java.lang.String _removeObjectFromFolder_folderId = "";
        com.tmb.payment.wsdl.ecmv2.CmisExtensionType _removeObjectFromFolder_extensionVal = null;
        javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisExtensionType> _removeObjectFromFolder_extension = new javax.xml.ws.Holder<com.tmb.payment.wsdl.ecmv2.CmisExtensionType>(_removeObjectFromFolder_extensionVal);
        try {
            port.removeObjectFromFolder(_removeObjectFromFolder_repositoryId, _removeObjectFromFolder_objectId, _removeObjectFromFolder_folderId, _removeObjectFromFolder_extension);

            System.out.println("removeObjectFromFolder._removeObjectFromFolder_extension=" + _removeObjectFromFolder_extension.value);
        } catch (CmisException e) {
            System.out.println("Expected exception: cmisException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
