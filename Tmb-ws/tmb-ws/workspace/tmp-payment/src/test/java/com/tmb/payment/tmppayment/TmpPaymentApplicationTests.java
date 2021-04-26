package com.tmb.payment.tmppayment;

import java.io.File;
import java.net.URI;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.tmb.payment.ws.TmpPaymentApplication;
import com.tmb.payment.ws.vo.ECMUploadRequest;
import com.tmb.payment.ws.vo.ECMUploadResponse;

@SpringBootTest(classes=TmpPaymentApplication.class)
@RunWith(SpringRunner.class)
public class TmpPaymentApplicationTests {
	
	@Test
	public void add() throws Exception {
		
		ECMUploadRequest ecmUploadRequest = new ECMUploadRequest();
		ecmUploadRequest.setRepositoryId("ECMWBGDEV");
		ecmUploadRequest.setObjectTypeId("CommLoanDocument");
		//NAME : YYYYMMDDHHMM-DocTypeCode-ShortDocName-FileName.xxx
		ecmUploadRequest.setName("201901141212-10113-shortname-Certificate.pdf");
		ecmUploadRequest.setTmbSource("A0394");
		ecmUploadRequest.setTmbCreatorId("42307"); //user
		ecmUploadRequest.setTmbDocTypeCode("00025");
		ecmUploadRequest.setTmbIdentificationId("0105538051683");
		ecmUploadRequest.setTmbIdentificationType("SC");
		ecmUploadRequest.setArchival(2020);
		ecmUploadRequest.setDisposal(2029);
		ecmUploadRequest.setChannel("05");
		ecmUploadRequest.setApplicationId("08Jan2019-00003");
		ecmUploadRequest.setCustomerFirstNameThai("king power");
		ecmUploadRequest.setCustomerFirstNameEng("king power");
		
		
		byte[] bty = FileUtils.readFileToByteArray(new File("E:/pdf2.pdf"));
		ecmUploadRequest.setFile(bty);
		
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<ECMUploadRequest> request = new HttpEntity<>(ecmUploadRequest);
		URI fooResourceUrl = new URI("http://172.28.30.37:8081/tmb-ws/api-ecm/createDocument");
		ResponseEntity<ECMUploadResponse> response = restTemplate .exchange(fooResourceUrl , HttpMethod.POST, request, ECMUploadResponse.class);
		 		  
		ECMUploadResponse foo = response.getBody();
		
		System.out.println(foo.getStatusCode());
		System.out.println(foo.getObjectId());
		System.out.println(foo.getDescription());
	}
	
	public static void main(String[] args) throws Exception {
		new TmpPaymentApplicationTests().add();
	}

}
