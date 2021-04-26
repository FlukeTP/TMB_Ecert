package com.tmb.payment.ws.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.consumer.ECMDocumentConsumer;
import com.tmb.payment.ws.utils.SoapDateUtils;
import com.tmb.payment.ws.vo.ImportDocumentFile;
import com.tmb.payment.ws.vo.ImportDocumentRequest;
import com.tmb.payment.ws.vo.ImportDocumentResponse;

@Service
public class ImportDocumentService {
	
	@Autowired
	private ECMDocumentConsumer ecmDocumentConsumer;

	public ImportDocumentResponse process(ImportDocumentRequest importDocumentRequest) {
		try {
			
		Assert.notNull(importDocumentRequest.getReqId(), "reqId is null");
		Assert.notNull(importDocumentRequest.getCaNumber(), "caNumber is null");
		Assert.notNull(importDocumentRequest.getChannelId(), "channelId is null");
		Assert.notNull(importDocumentRequest.getReqUserId(), "reqUserId is null");
		Assert.notNull(importDocumentRequest.getSegmentCode(), "segmentCode is null");
		Assert.notNull(importDocumentRequest.getFiles(), "Files is null");

		for ( ImportDocumentFile file : importDocumentRequest.getFiles()) {
			Assert.notNull(file.getFileName(), "FILE_NAME is null");
			Assert.notNull(file.getDocTypeCode(), "DOC_TYPE_CODE is null");
			Assert.notNull(file.getImportDate(), "IMPORT_DATE is null");
			Date importdt = SoapDateUtils.parseDDMMYYYYDate(file.getImportDate());
			Assert.notNull(importdt, "IMPORT_DATE is invalid format : "+ SoapDateUtils.DD_MM_YYYY);
		}

		}catch (IllegalArgumentException e) {
			ImportDocumentResponse sp = new ImportDocumentResponse();
			sp.setStatusCode(WS_RESPONE.FAILED_CODE);
			sp.setDescription(e.getMessage());
			return sp;
		}
				
		ImportDocumentResponse sp = new ImportDocumentResponse();
//		sp.setStatusCode(WS_RESPONE.SUCCEEDED_CODE);
//		sp.setDescription(WS_RESPONE.SUCCEEDED);
//		sp.setReqId(importDocumentRequest.getReqId());
//		sp.setReqUserId(importDocumentRequest.getReqUserId());
//		sp.setChannelId(importDocumentRequest.getChannelId());
//		sp.setResCode("0");
//		sp.setResDesc(WS_RESPONE.SUCCEEDED);
		
		sp = ecmDocumentConsumer.importDoc(importDocumentRequest);
		
		return sp;
	}

}
