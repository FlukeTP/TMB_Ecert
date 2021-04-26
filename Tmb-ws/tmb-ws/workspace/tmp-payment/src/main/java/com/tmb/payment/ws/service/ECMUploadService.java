package com.tmb.payment.ws.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.consumer.ECMDocV2Consumer;
import com.tmb.payment.ws.vo.ECMUploadRequest;
import com.tmb.payment.ws.vo.ECMUploadResponse;
import com.tmb.payment.wsdl.ecmv2.CmisException;

@Service
public class ECMUploadService {
	
	private static final Logger log = LoggerFactory.getLogger(ECMUploadService.class);

	@Autowired
	private ECMDocV2Consumer ecmDocV2Consumer;

	public ECMUploadResponse createDocument(ECMUploadRequest ecmUploadRequest) throws Exception {
		ECMUploadResponse res = new ECMUploadResponse();

		File file = null;
		try {
		
		Assert.notNull(ecmUploadRequest.getFile(), "File is null");
		Assert.notNull(ecmUploadRequest.getRepositoryId(), "repositoryId is null");

		byte[] filebytes = ecmUploadRequest.getFile();
		
		file = File.createTempFile("ecmupload", ".tmp");
		FileUtils.writeByteArrayToFile(file, filebytes);
		
		log.info("UPLOAD TEMP FILE : {}" , file.getAbsolutePath());
		
		List<String> ids = new ArrayList<>();
		ids.add("0105538051683");
			
		String objectId = ecmDocV2Consumer.createDocument(ecmUploadRequest.getRepositoryId()
				, ecmUploadRequest.getObjectTypeId()
				,ecmUploadRequest.getName()
				, ecmUploadRequest.getTouchReferenceNumber()
				, ecmUploadRequest.getDocType()
				,ecmUploadRequest.getDocumentCode()
				,ecmUploadRequest.getTmbSource()
				, ecmUploadRequest.getTmbCreatorId()
				, ecmUploadRequest.getTmbDocTypeCode()
				, ecmUploadRequest.getTmbIdentificationId()
				, ecmUploadRequest.getTmbIdentificationType()
				,ecmUploadRequest.getArchival()
				, ecmUploadRequest.getDisposal()
				,ecmUploadRequest.getChannel()
				, ecmUploadRequest.getDocLocation()
				,file
				,ecmUploadRequest.getApplicationId()
				,ecmUploadRequest.getCustomerFirstNameEng()
				,ecmUploadRequest.getCustomerFirstNameThai()
				,ids
				);
		
		res.setObjectId(objectId);
		res.setStatusCode(WS_RESPONE.SUCCEEDED_CODE);
		res.setDescription(WS_RESPONE.SUCCEEDED);
		
		}catch (CmisException cmisException) {
			res.setStatusCode(WS_RESPONE.FAILED_CODE);
			res.setDescription(cmisException.getMessage());
		}catch (IllegalArgumentException e ) {
			res.setStatusCode(WS_RESPONE.FAILED_CODE);
			res.setDescription(e.getMessage());
		}
		

		return res;
	}

}
