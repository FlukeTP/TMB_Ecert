package com.tmb.payment.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.service.ECMUploadService;
import com.tmb.payment.ws.vo.ECMUploadRequest;
import com.tmb.payment.ws.vo.ECMUploadResponse;

@RestController
@RequestMapping("api-ecm")
public class ECMUploadController {
	
	private static final Logger log = LoggerFactory.getLogger(ECMUploadController.class);

	@Autowired
	private ECMUploadService ecmUploadService;
	
	@PostMapping("createDocument")
	public ECMUploadResponse createDocument(@RequestBody ECMUploadRequest  ecmUploadRequest) {
		ECMUploadResponse rsp = new ECMUploadResponse();
		try {
			rsp = ecmUploadService.createDocument(ecmUploadRequest);			
		}catch (Exception e) {
			log.error("createDocument", e);
			rsp.setStatusCode(WS_RESPONE.FAILED_CODE);
			rsp.setDescription("Internal Webervice Error : please see in log");
		}
		
		return rsp;
	}

}
