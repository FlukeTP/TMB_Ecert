package com.tmb.payment.ws.consumer;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tmb.payment.ws.constant.ProjectConstant.DOCUMENT_SERVICE;
import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.vo.CheckDocumentFile;
import com.tmb.payment.ws.vo.CheckStatusDocumentRequest;
import com.tmb.payment.ws.vo.CheckStatusDocumentResponse;
import com.tmb.payment.ws.vo.ImportDocumentFile;
import com.tmb.payment.ws.vo.ImportDocumentRequest;
import com.tmb.payment.ws.vo.ImportDocumentResponse;
import com.tmb.payment.wsdl.ecm.wsapi.DocumentIndex;
import com.tmb.payment.wsdl.ecm.wsapi.DocumentIndexGroup;
import com.tmb.payment.wsdl.ecm.wsapi.DocumentIndexKey;
import com.tmb.payment.wsdl.ecm.wsapi.DocumentServiceRequest;
import com.tmb.payment.wsdl.ecm.wsapi.DocumentServiceResponse;
import com.tmb.payment.wsdl.ecm.wsapi.IDocumentService;
import com.tmb.payment.wsdl.ecm.wsimpl.DocumentServiceService;

@Service
public class ECMDocumentConsumer {

	private static final Logger log = LoggerFactory.getLogger(ECMDocumentConsumer.class);

	@Value("${ecm.enpoint}")
	String enpoint;

	@Value("${ecm.timeout}")
	long timeout;

	private IDocumentService port = null;

	private IDocumentService getPort() {

		if(port != null) return port;
		
		DocumentServiceService dss = new DocumentServiceService();
		port = dss.getDocumentServicePort();
		
		log.info("Import and Check Status document to ECM Endpoint = " + enpoint);
		log.info("Import and Check Status document to ECM Timeout = " + timeout);
		BindingProvider bp = (BindingProvider)port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, enpoint);
		
		Client cxfClient = ClientProxy.getClient(port);
		HTTPConduit http = (HTTPConduit) cxfClient.getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(timeout);
		httpClientPolicy.setReceiveTimeout(timeout);
		httpClientPolicy.setAllowChunking(false);

		http.setClient(httpClientPolicy);

		XmlInInterceptor xmlInInterceptor = new XmlInInterceptor(log);
		XmlOutInterceptor xmlOutInterceptor = new XmlOutInterceptor(log);
		cxfClient.getInInterceptors().add(xmlInInterceptor);
		cxfClient.getOutInterceptors().add(xmlOutInterceptor);

		return port;
	}

	public ImportDocumentResponse importDoc(ImportDocumentRequest importDocumentRequest) {
		
		this.port = this.getPort();
		
		DocumentServiceRequest documentRequest = new DocumentServiceRequest();
		
		documentRequest.setReqId(importDocumentRequest.getReqId());
		documentRequest.setCaNumber(importDocumentRequest.getCaNumber());
		documentRequest.setChannelId(importDocumentRequest.getChannelId());
		documentRequest.setReqUserId(importDocumentRequest.getReqUserId());
		documentRequest.setSegmentCode(importDocumentRequest.getSegmentCode());
		
		List<DocumentIndexGroup> documentIndexGroups = documentRequest.getIndexGroups();
		
		for(ImportDocumentFile docFile : importDocumentRequest.getFiles()) {
		
			DocumentIndexGroup documentIndexGroup = new DocumentIndexGroup();
			documentIndexGroup.setNo(1);
			List<DocumentIndex> documentIndexsList = documentIndexGroup.getDocumentIndexs();
	
			{
				DocumentIndex docIndex = new DocumentIndex();
				docIndex.setIndexKey(DocumentIndexKey.FILE_NAME);
				docIndex.setValue(docFile.getFileName()); 
				documentIndexsList.add(docIndex);
			}
			{
				DocumentIndex docIndex = new DocumentIndex();
				docIndex.setIndexKey(DocumentIndexKey.DOC_TYPE_CODE);
				docIndex.setValue(docFile.getDocTypeCode()); 
				documentIndexsList.add(docIndex);
			}
			{
				DocumentIndex docIndex = new DocumentIndex();
				docIndex.setIndexKey(DocumentIndexKey.IMPORT_DATE);
				docIndex.setValue(docFile.getImportDate()); 
				documentIndexsList.add(docIndex);
			}
			{
				DocumentIndex docIndex = new DocumentIndex();
				docIndex.setIndexKey(DocumentIndexKey.REGISTRATION_ID);
				docIndex.setValue(docFile.getRegistrationId()); 
				documentIndexsList.add(docIndex);
			}
			{
				DocumentIndex docIndex = new DocumentIndex();
				docIndex.setIndexKey(DocumentIndexKey.REF_APP_NO);
				docIndex.setValue(docFile.getRefAppNo()); 
				documentIndexsList.add(docIndex);
			}
			{
				DocumentIndex docIndex = new DocumentIndex();
				docIndex.setIndexKey(DocumentIndexKey.CUS_NAME);
				docIndex.setValue(docFile.getCusName()); 
				documentIndexsList.add(docIndex);
			}
			
			documentIndexGroups.add(documentIndexGroup);
		}
		
		DocumentServiceResponse documentResp = this.port.importDocuments(documentRequest );

		ImportDocumentResponse sp = new ImportDocumentResponse();

		if(DOCUMENT_SERVICE.SUCCESS.equalsIgnoreCase(documentResp.getResCode())) {
			sp.setStatusCode(WS_RESPONE.SUCCEEDED_CODE);
			sp.setDescription(WS_RESPONE.SUCCEEDED);
			sp.setReqId(importDocumentRequest.getReqId());
			sp.setReqUserId(importDocumentRequest.getReqUserId());
			sp.setChannelId(importDocumentRequest.getChannelId());
			sp.setResCode(documentResp.getResCode());
			sp.setResDesc(documentResp.getResDesc());
		}else {
			sp.setStatusCode(WS_RESPONE.FAILED_CODE);
			sp.setDescription(documentResp.getResDesc());
			sp.setResCode(documentResp.getResCode());
			sp.setResDesc(documentResp.getResDesc());
		}
		
		return sp;
	}

	public CheckStatusDocumentResponse checkStatusDoc(CheckStatusDocumentRequest request) {

		this.port = this.getPort();

		DocumentServiceRequest documentRequest = new DocumentServiceRequest();
		
		documentRequest.setReqId(request.getReqId());
		documentRequest.setCaNumber(request.getCaNumber());
		documentRequest.setChannelId(request.getChannelId());
		documentRequest.setReqUserId(request.getReqUserId());
		documentRequest.setSegmentCode(request.getSegmentCode());
		
		DocumentServiceResponse resp = this.port.checkStatus(documentRequest);
		
		CheckStatusDocumentResponse sp = new CheckStatusDocumentResponse();

		if(DOCUMENT_SERVICE.SUCCESS.equalsIgnoreCase(resp.getResCode())) {
			sp.setStatusCode(WS_RESPONE.SUCCEEDED_CODE);
			sp.setDescription(WS_RESPONE.SUCCEEDED);
		}else {
			sp.setStatusCode(WS_RESPONE.FAILED_CODE);
			sp.setDescription( resp.getResCode() + " : " +  resp.getResDesc());
		}
		
		List<DocumentIndexGroup> indexGroup = resp.getIndexGroups();
		if(!indexGroup.isEmpty()) {
			List<CheckDocumentFile> indexGroups = new ArrayList<>();
			sp.setIndexGroups(indexGroups);
			for (DocumentIndexGroup documentIndexGroup : indexGroup) {
				CheckDocumentFile f = new CheckDocumentFile();
				f.setNo(documentIndexGroup.getNo());
				
				String fileName = this.findvalue(DocumentIndexKey.FILE_NAME, documentIndexGroup.getDocumentIndexs());
				f.setFileName(fileName );
				
				String cusName = this.findvalue(DocumentIndexKey.CUS_NAME, documentIndexGroup.getDocumentIndexs());
				f.setCusName(cusName);
				
				String docTypeCode = this.findvalue(DocumentIndexKey.DOC_TYPE_CODE, documentIndexGroup.getDocumentIndexs());
				f.setDocTypeCode(docTypeCode);
				
				String importDate = this.findvalue(DocumentIndexKey.IMPORT_DATE, documentIndexGroup.getDocumentIndexs());
				f.setImportDate(importDate);
				
				String refAppNo = this.findvalue(DocumentIndexKey.REF_APP_NO, documentIndexGroup.getDocumentIndexs());
				f.setRefAppNo(refAppNo);
				
				String registrationId = this.findvalue(DocumentIndexKey.REGISTRATION_ID, documentIndexGroup.getDocumentIndexs());
				f.setRegistrationId(registrationId);
				
				String fileResCode = this.findvalue(DocumentIndexKey.FILE_RES_CODE, documentIndexGroup.getDocumentIndexs());
				f.setFileResCode(fileResCode);
				
				String fileResDesc = this.findvalue(DocumentIndexKey.FILE_RES_DESC, documentIndexGroup.getDocumentIndexs());
				f.setFileResDesc(fileResDesc);
				
				String ecmDocId = this.findvalue(DocumentIndexKey.ECM_DOC_ID, documentIndexGroup.getDocumentIndexs());
				f.setEcmDocId(ecmDocId);
				
				indexGroups.add(f);
			}
			
		}
		
		return sp;
	}
	
	private String findvalue( DocumentIndexKey indexKey , List<DocumentIndex> docs) {
		for (DocumentIndex documentIndex : docs) {
			if(documentIndex.getIndexKey().compareTo(indexKey) == 0) {
				return documentIndex.getValue();
			}
		}
		return null;
	}
}
