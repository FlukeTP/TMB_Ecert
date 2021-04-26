package com.tmb.payment.ws.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.consumer.ECMDocumentConsumer;
import com.tmb.payment.ws.vo.CheckStatusDocumentRequest;
import com.tmb.payment.ws.vo.CheckStatusDocumentResponse;

@Service
public class CheckStatusDocumentService {

	private static final Logger log = LoggerFactory.getLogger(CheckStatusDocumentService.class);
	
	@Autowired
	private ECMDocumentConsumer ecmDocumentConsumer;
	
	public CheckStatusDocumentResponse process(CheckStatusDocumentRequest request) {
		try {

			Assert.notNull(request.getReqId(), "reqId is null");
			Assert.notNull(request.getChannelId(), "channelId is null");
			Assert.notNull(request.getReqUserId(), "reqUserId is null");
			Assert.notNull(request.getSegmentCode(), "segmentCode is null");
			Assert.notNull(request.getCaNumber(), "caNumber is null");

		} catch (IllegalArgumentException e) {
			CheckStatusDocumentResponse sp = new CheckStatusDocumentResponse();
			sp.setStatusCode(WS_RESPONE.FAILED_CODE);
			sp.setDescription(e.getMessage());
			return sp;
		}

		log.debug("All Input is OK.");
		CheckStatusDocumentResponse sp = new CheckStatusDocumentResponse();
//		sp.setStatusCode(WS_RESPONE.SUCCEEDED_CODE);
//		sp.setDescription(WS_RESPONE.SUCCEEDED);
		sp = ecmDocumentConsumer.checkStatusDoc(request);

		return sp;
	}

}
