package com.tmb.payment.ws.consumer;

import java.io.File;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tmb.payment.ws.constant.ECMConstants;
import com.tmb.payment.ws.utils.SoapDateUtils;
import com.tmb.payment.wsdl.ecmv2.CmisContentStreamType;
import com.tmb.payment.wsdl.ecmv2.CmisPropertiesType;
import com.tmb.payment.wsdl.ecmv2.CmisPropertyDateTime;
import com.tmb.payment.wsdl.ecmv2.CmisPropertyId;
import com.tmb.payment.wsdl.ecmv2.CmisPropertyInteger;
import com.tmb.payment.wsdl.ecmv2.CmisPropertyString;
import com.tmb.payment.wsdl.ecmv2.ObjectService;
import com.tmb.payment.wsdl.ecmv2.ObjectServicePort;

@Service
public class ECMDocV2Consumer {
	
	private static final Logger log = LoggerFactory.getLogger(ECMDocV2Consumer.class);

	private ObjectServicePort port = null;

	@Value("${ecm.v2.ws.endpoint}")
	private String endpoint;

	@Value("${ecm.v2.ws.timeout}")
	private long timeout;

	@Value("${ecm.v2.authorization.username}")
	private String username;

	@Value("${ecm.v2.authorization.password}")
	private String password;
	
	
	private ObjectServicePort getObjectServicePort() {

		if(port != null) return port;
		
		try {
			
			ObjectService service = new ObjectService();
			port = service.getObjectServicePort();

			BindingProvider bp = (BindingProvider) port;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

			SOAPBinding binding = (SOAPBinding) bp.getBinding();
			binding.setMTOMEnabled(true);

			Client cxfClient = ClientProxy.getClient(port);
			HTTPConduit http = (HTTPConduit) cxfClient.getConduit();
			HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
			httpClientPolicy.setConnectionTimeout(timeout);
			httpClientPolicy.setReceiveTimeout(timeout);
			httpClientPolicy.setAllowChunking(false);

			AuthorizationPolicy authorization = new AuthorizationPolicy();
			authorization.setUserName(username);
			 authorization.setPassword(password);
//			authorization.setPassword(DigitalSignUtils.decodePwdAes256(keystorepath,password));
			http.setAuthorization(authorization);

			http.setClient(httpClientPolicy);

			XmlInInterceptor xmlInInterceptor = new XmlInInterceptor(log);
			XmlOutInterceptor xmlOutInterceptor = new XmlOutInterceptor(log);
			cxfClient.getInInterceptors().add(xmlInInterceptor);
			cxfClient.getOutInterceptors().add(xmlOutInterceptor);
		} catch (Exception e) {
			log.error("ObjectServicePort getObjectServicePort() Error {}", e);
		}

		return port;

	}
	
	
	public String createDocument(String repositoryId, String objectTypeId, String name, String touchReferenceNumber,
			String docType, String documentCode, String tmbSource, String tmbCreatorId, String tmbDocTypeCode,
			String tmbIdentificationId, String tmbIdentificationType, int archival, int disposal, String channel,
			String docLocation, File file
			,String applicationId
			,String customerFirstNameEng
			,String customerFirstNameThai
			,List<String> ids
			) throws Exception {

		Holder<String> objectId = null;
		CmisContentStreamType contentStream = null;
		CmisPropertiesType properties = null;

		if (file != null) {
			try {

				// Initial CmisPropertiesType
				if (!StringUtils.isEmpty(repositoryId) && file != null) {
					properties = new CmisPropertiesType();

					if (StringUtils.isNotBlank(objectTypeId)) {
						// Set Object Type ID
						CmisPropertyId cmisPropertyObjectTypeId = new CmisPropertyId();
						cmisPropertyObjectTypeId.setPropertyDefinitionId(ECMConstants.WS_OBJECT_ID);
						cmisPropertyObjectTypeId.getValue().add(objectTypeId);
						properties.getProperty().add(cmisPropertyObjectTypeId);
					}

					// Set Name
					if (StringUtils.isNotBlank(name)) {
						CmisPropertyId cmisPropertyName = new CmisPropertyId();
						cmisPropertyName.setPropertyDefinitionId(ECMConstants.WS_CMIS_NAME);
						cmisPropertyName.getValue().add(name);
						properties.getProperty().add(cmisPropertyName);
					}

					// Set touch reference number
					if (StringUtils.isNotBlank(touchReferenceNumber)) {
						CmisPropertyString cmisPropertyTouchRefNumber = new CmisPropertyString();
						cmisPropertyTouchRefNumber.setPropertyDefinitionId(ECMConstants.WS_TFROUCHNUMBER);
						cmisPropertyTouchRefNumber.getValue().add(touchReferenceNumber);
						properties.getProperty().add(cmisPropertyTouchRefNumber);
					}

					// Set Doc Type
					if (StringUtils.isNotBlank(docType)) {
						CmisPropertyString cmisPropertyDocType = new CmisPropertyString();
						cmisPropertyDocType.setPropertyDefinitionId(ECMConstants.WS_TF_DOCTYPE);
						cmisPropertyDocType.getValue().add(docType);
						properties.getProperty().add(cmisPropertyDocType);

					}

					// Set Document Code
					if (StringUtils.isNotBlank(documentCode)) {
						CmisPropertyInteger cmisPropertyDocCode = new CmisPropertyInteger();
						cmisPropertyDocCode.setPropertyDefinitionId(ECMConstants.WS_TF_DOCUMENTCODE);
						cmisPropertyDocCode.getValue().add(new BigInteger(documentCode));
						properties.getProperty().add(cmisPropertyDocCode);
					}

					// Set Tmb Source
					if (StringUtils.isNotBlank(tmbSource)) {
						CmisPropertyString cmisPropertyTmbSource = new CmisPropertyString();
						cmisPropertyTmbSource.setPropertyDefinitionId(ECMConstants.WS_TMB_SOURCE);
						cmisPropertyTmbSource.getValue().add(tmbSource);
						properties.getProperty().add(cmisPropertyTmbSource);
					}
					// Set Tmb creator id
					if (StringUtils.isNotBlank(tmbCreatorId)) {
						CmisPropertyString cmisPropertyCreatorId = new CmisPropertyString();
						cmisPropertyCreatorId.setPropertyDefinitionId(ECMConstants.WS_TMB_CREATOR_ID);
						cmisPropertyCreatorId.getValue().add(tmbCreatorId);
						properties.getProperty().add(cmisPropertyCreatorId);
					}
					// Set Tmb doc type code
					if (StringUtils.isNotBlank(tmbDocTypeCode)) {
						CmisPropertyString cmisPropertyDocTypeCode = new CmisPropertyString();
						cmisPropertyDocTypeCode.setPropertyDefinitionId(ECMConstants.WS_DOC_TYPE_CODE);
						cmisPropertyDocTypeCode.getValue().add(tmbDocTypeCode);
						properties.getProperty().add(cmisPropertyDocTypeCode);
					}
					// Set Tmb identification id primary
					if (StringUtils.isNotBlank(tmbIdentificationId)) {
						CmisPropertyString cmisPropertyIdentification = new CmisPropertyString();
						cmisPropertyIdentification.setPropertyDefinitionId(ECMConstants.WS_IDENTIFICATION_ID_PRIMARY);
						cmisPropertyIdentification.getValue().add(tmbIdentificationId);
						properties.getProperty().add(cmisPropertyIdentification);
					}
					// Set Tmb identification type primary
					if (StringUtils.isNotBlank(tmbIdentificationType)) {
						CmisPropertyString cmisPropertyTypePrimary = new CmisPropertyString();
						cmisPropertyTypePrimary.setPropertyDefinitionId(ECMConstants.WS_IDENTIFICATION_TYPE_PRIMARY);
						cmisPropertyTypePrimary.getValue().add(tmbIdentificationType);
						properties.getProperty().add(cmisPropertyTypePrimary);
					}
					// Set Tmb doc import datetime
					GregorianCalendar gcal = new GregorianCalendar();
					XMLGregorianCalendar now = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
					CmisPropertyDateTime cmisPropertyImportDatetime = new CmisPropertyDateTime();
					cmisPropertyImportDatetime.setPropertyDefinitionId(ECMConstants.WS_DOC_IMPORT_DATETIME);
					cmisPropertyImportDatetime.getValue().add(now);
					properties.getProperty().add(cmisPropertyImportDatetime);

					// Set Tmb archival datetime
					Calendar calendarArchival = Calendar.getInstance();
					calendarArchival.setTime(new Date());
					if (archival != 0) {
						calendarArchival.add(Calendar.YEAR, archival);
					}
					GregorianCalendar grogCalendarArchi = new GregorianCalendar();
					grogCalendarArchi.setTime(calendarArchival.getTime());
					XMLGregorianCalendar xmlGrogCalArchi = DatatypeFactory.newInstance()
							.newXMLGregorianCalendar(grogCalendarArchi);
					CmisPropertyDateTime cmisPropertyArchivalDatetime = new CmisPropertyDateTime();
					cmisPropertyArchivalDatetime.setPropertyDefinitionId(ECMConstants.WS_ARCHIVAL_DATETIME);
					cmisPropertyArchivalDatetime.getValue().add(xmlGrogCalArchi);
					properties.getProperty().add(cmisPropertyArchivalDatetime);

					// Set Tmb disposal datetime
					Calendar calendarDisposal = Calendar.getInstance();
					calendarDisposal.setTime(new Date());
					if (disposal != 0) {
						calendarDisposal.add(Calendar.YEAR, disposal);
					}
					GregorianCalendar grogCalendarDisposal = new GregorianCalendar();
					grogCalendarDisposal.setTime(calendarDisposal.getTime());
					XMLGregorianCalendar xmlGrogCalDisposal = DatatypeFactory.newInstance()
							.newXMLGregorianCalendar(grogCalendarDisposal);
					CmisPropertyDateTime cmisPropertyDisposal = new CmisPropertyDateTime();
					cmisPropertyDisposal.setPropertyDefinitionId(ECMConstants.WS_DISPOSAL_DATETIME);
					cmisPropertyDisposal.getValue().add(xmlGrogCalDisposal);
					properties.getProperty().add(cmisPropertyDisposal);

					// Set Tmb doc summit channel
					if (StringUtils.isNotBlank(channel)) {
						CmisPropertyString cmisPropertyChannel = new CmisPropertyString();
						cmisPropertyChannel.setPropertyDefinitionId(ECMConstants.WS_DOC_SUMMIT_CHANNEL);
						cmisPropertyChannel.getValue().add(channel);
						properties.getProperty().add(cmisPropertyChannel);
					}

					// Set TMB_APPLICATION_ID
					if (StringUtils.isNotBlank(applicationId)) {
						CmisPropertyString cmisPropertyChannel = new CmisPropertyString();
						cmisPropertyChannel.setPropertyDefinitionId(ECMConstants.TMB_APPLICATION_ID);
						cmisPropertyChannel.getValue().add(applicationId);
						properties.getProperty().add(cmisPropertyChannel);
					}

					// Set TMB_CUS_FIRST_NAME_EN
					if (StringUtils.isNotBlank(customerFirstNameEng)) {
						CmisPropertyString cmisPropertyChannel = new CmisPropertyString();
						cmisPropertyChannel.setPropertyDefinitionId(ECMConstants.TMB_CUS_FIRST_NAME_EN);
						cmisPropertyChannel.getValue().add(customerFirstNameEng);
						properties.getProperty().add(cmisPropertyChannel);
					}
					
					// Set TMB_CUS_FIRST_NAME_TH
					if (StringUtils.isNotBlank(customerFirstNameThai)) {
						CmisPropertyString cmisPropertyChannel = new CmisPropertyString();
						cmisPropertyChannel.setPropertyDefinitionId(ECMConstants.TMB_CUS_FIRST_NAME_TH);
						cmisPropertyChannel.getValue().add(customerFirstNameThai);
						properties.getProperty().add(cmisPropertyChannel);
					}

					
					//TMB_DOC_PUBLISH_DATE
					CmisPropertyDateTime tmbDocPublishDate = new CmisPropertyDateTime();
					tmbDocPublishDate.setPropertyDefinitionId(ECMConstants.TMB_DOC_PUBLISH_DATE);
					tmbDocPublishDate.getValue().add(SoapDateUtils.toDate(new Date()));
					properties.getProperty().add(tmbDocPublishDate);
					
					
					// Set Tmb identification id primary
					if (!ids.isEmpty()) {
						CmisPropertyString cmisPropertyIdentification = new CmisPropertyString();
						cmisPropertyIdentification.setPropertyDefinitionId(ECMConstants.TMB_IDENTIFICATION_IDS);
						cmisPropertyIdentification.getValue().addAll(ids);
						properties.getProperty().add(cmisPropertyIdentification);
					}
					
					// Initial CmisContentStreamType (File)
					contentStream = new CmisContentStreamType();
					// Initial file stream
					FileDataSource fileDS = new FileDataSource(file);
					log.info("fileDS.getName() :" + fileDS.getName());
					contentStream.setFilename(fileDS.getName());
					contentStream.setLength(BigInteger.valueOf(fileDS.getFile().length()));
					contentStream.setMimeType(fileDS.getContentType());
					contentStream.setStream(new DataHandler(fileDS));

					objectId = new Holder<String>();
					this.getObjectServicePort().createDocument(repositoryId, properties, docLocation, contentStream,
							null, null, null, null, null, objectId);
				} else {
					log.info("!StringUtils.isEmpty(repositoryId) && file != null");
				}

			} catch (Exception ex) {
				log.error(" Create Document Error {} ",	ex.getMessage());
				throw  ex;
			}
		}

		return objectId != null ? objectId.value : null;
	}
	
}
