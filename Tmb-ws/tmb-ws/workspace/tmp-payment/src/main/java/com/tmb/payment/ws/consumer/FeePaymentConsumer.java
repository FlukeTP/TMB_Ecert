package com.tmb.payment.ws.consumer;

import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.utils.SoapDateUtils;
import com.tmb.payment.ws.vo.FeePaymentRequest;
import com.tmb.payment.ws.vo.FeePaymentResponse;
import com.tmb.payment.wsdl.xpress.AcctKeysType;
import com.tmb.payment.wsdl.xpress.BillPmtAddRqType;
import com.tmb.payment.wsdl.xpress.BillPmtAddRsType;
import com.tmb.payment.wsdl.xpress.BillPmtInfoType;
import com.tmb.payment.wsdl.xpress.ContextRqHdrType;
import com.tmb.payment.wsdl.xpress.FromAcctRefType;
import com.tmb.payment.wsdl.xpress.MsgRqHdrType;
import com.tmb.payment.wsdl.xpress.ObjectFactory;
import com.tmb.payment.wsdl.xpress.billpmtport.BillPmt;
import com.tmb.payment.wsdl.xpress.billpmtport.BillPmtPortType;
import com.tmb.payment.wsdl.xpress.vo.AcctIdentType;
import com.tmb.payment.wsdl.xpress.vo.AcctRefType;
import com.tmb.payment.wsdl.xpress.vo.AcctTypeType;
import com.tmb.payment.wsdl.xpress.vo.AdditionalStatusType;
import com.tmb.payment.wsdl.xpress.vo.ClientAppType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;

@Service
public class FeePaymentConsumer {

	private static final Logger log = LoggerFactory.getLogger(FeePaymentConsumer.class);

	@Value("${feepayment.endpoint}")
	String enpoint;


	@Value("${feepayment.timeout}")
	long timeout;
	
	
	BillPmtPortType port ;
	
	private BillPmtPortType getPort() {

		if(port != null) return port;

		BillPmt client = new BillPmt();
		BillPmtPortType port = client.getBillPmtPort();


		Client cxfClient = ClientProxy.getClient(port);
		HTTPConduit http = (HTTPConduit) cxfClient.getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(timeout);
		httpClientPolicy.setReceiveTimeout(timeout);
		httpClientPolicy.setAllowChunking(false);

		http.setClient(httpClientPolicy);

		cxfClient.getRequestContext().put(Message.ENDPOINT_ADDRESS, enpoint) ;

		XmlInInterceptor xmlInInterceptor = new XmlInInterceptor(log);
		XmlOutInterceptor xmlOutInterceptor = new XmlOutInterceptor(log);
		cxfClient.getInInterceptors().add(xmlInInterceptor);
		cxfClient.getOutInterceptors().add(xmlOutInterceptor);

		return port;
	}
	
	
	public FeePaymentResponse add(FeePaymentRequest feePaymentRequest) {
		
		port = this.getPort();
		
		
		BillPmtAddRqType rq = new BillPmtAddRqType();
		
		com.tmb.payment.wsdl.xpress.ObjectFactory rootObjectFactory = new ObjectFactory();
		JAXBElement<String> rqUI = rootObjectFactory.createRqUID(feePaymentRequest.getRqUid()); //TODO 1
		rq.setRqUID(rqUI);
//		---------------------------------------------------------------------
		com.tmb.payment.wsdl.xpress.vo.ObjectFactory subobjectFactory = new com.tmb.payment.wsdl.xpress.vo.ObjectFactory();
		
		MsgRqHdrType msgrqhdr = new MsgRqHdrType();
		
		ContextRqHdrType contxthdr = new ContextRqHdrType();
//		ClientDt
		contxthdr.setClientDt(SoapDateUtils.toClientDate(new Date()));
//		CustLangPref
		contxthdr.setCustLangPref(feePaymentRequest.getCustLangPref());
		
		//----ClientAppType----
		ClientAppType capptype = subobjectFactory.createClientAppType();
		contxthdr.setClientApp(capptype);
//		ClientApp.Org                                                                                                                                                                         
		capptype.setOrg(feePaymentRequest.getClientAppOrg());
		
//		Name
		capptype.setName(feePaymentRequest.getClientAppName());
		
//		Version
		capptype.setVersion(feePaymentRequest.getClientAppVersion());
		
//		SPName
		contxthdr.setSPName(feePaymentRequest.getSpName());
		
		JAXBElement<ContextRqHdrType> rootconexthdr = rootObjectFactory.createContextRqHdr(contxthdr);
		msgrqhdr.setContextRqHdr(rootconexthdr);
		
		JAXBElement<MsgRqHdrType> msgrqhdRoot = rootObjectFactory.createMsgRqHdr(msgrqhdr);
		rq.setMsgRqHdr(msgrqhdRoot);
		
//		---------------- BillPmtInfo --------------------
		
		BillPmtInfoType billPmtInfo = rootObjectFactory.createBillPmtInfoType();
		rq.setBillPmtInfo(billPmtInfo);
		
//		8	TranCode
		billPmtInfo.setTranCode(feePaymentRequest.getTranCode());
		
//		-----------FromAcctRef--------
		FromAcctRefType fromAcctRef = rootObjectFactory.createFromAcctRefType();
		billPmtInfo.setFromAcctRef(rootObjectFactory.createFromAcctRef(fromAcctRef));
		//		9	. AcctKeys. AcctIdent. AcctIdentValue
		
		AcctKeysType fromAcctKeyObj = new AcctKeysType();
		JAXBElement<? extends AcctKeysType> formAcckey = rootObjectFactory.createAcctKeys(fromAcctKeyObj);
		fromAcctRef.setAcctKeys(formAcckey);
		
		AcctIdentType acd = subobjectFactory.createAcctIdentType();
		acd.setAcctIdentValue(feePaymentRequest.getFromAccountIdent());
		fromAcctKeyObj.setAcctIdent(acd);
		//		10	FromAcctRef. AcctKeys. AcctType. AcctIdentValue
		AcctTypeType act = subobjectFactory.createAcctTypeType();
		act.setAcctTypeValue(feePaymentRequest.getFromAccountType());
		fromAcctKeyObj.setAcctType(act);
		
		
//		11	ToAcctRef.AcctKeys.AcctIdent.AcctIdentValue
		
		AcctRefType toaccref = subobjectFactory.createAcctRefType();
		billPmtInfo.setToAcctRef(toaccref );
		
		
		
		AcctKeysType toAcctKeysMain = new AcctKeysType();
		JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> toAcctKeys = rootObjectFactory.createAcctKeys(toAcctKeysMain);
		toaccref.setAcctKeys(toAcctKeys);
		
		AcctIdentType toAcctIdent = new AcctIdentType();
		toAcctIdent.setAcctIdentValue(feePaymentRequest.getToAccountIdent());
		toAcctKeysMain.setAcctIdent(toAcctIdent );

		//	12	ToAcctRef.AcctKeys.AcctType.AcctIdentValue
		AcctTypeType toAcctType = new AcctTypeType();
		toAcctType.setAcctTypeValue( feePaymentRequest.getToAccountType());
		toAcctKeysMain.setAcctType(toAcctType);
		
		/////////////////////////
		CurAmtType curAmt = new CurAmtType();
		billPmtInfo.setCurAmt(curAmt );
		//13
		curAmt.setAmt( feePaymentRequest.getCurAmt());
		
		//14
		CurAmtType billPmtFee = new CurAmtType();
		billPmtInfo.setBillPmtFee(billPmtFee );
		billPmtFee.setAmt( feePaymentRequest.getBillPmtFee());
		
//		15
		billPmtInfo.setPmtRefIdent(feePaymentRequest.getRef1() );
//		16
		billPmtInfo.setInvoiceNum( feePaymentRequest.getRef2() );
		
//		17
		XMLGregorianCalendar postDate = SoapDateUtils.toDate( SoapDateUtils.parsePostDate(feePaymentRequest.getPostedDate()));
		postDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		billPmtInfo.setPostedDt(postDate);
		
//		18
//		if(!APPROVE_REGISTRATION.TMB_ACCOUNT.equals(reqPayment.getAccount())){
			billPmtInfo.setEPAYCode( feePaymentRequest.getEpayCode());
//		}
			
//		19 billPmtInfo
		if(StringUtils.isNotEmpty(feePaymentRequest.getBranchIdent())) {
			billPmtInfo.setBranchIdent( feePaymentRequest.getBranchIdent() );
		}
		
//		12
		billPmtInfo.setCompCode( feePaymentRequest.getCompCode() );
		
		billPmtInfo.setPostedTime(feePaymentRequest.getPostedTime());
				
		
		BillPmtAddRsType billPmtAddRsType = port.add(rq);
		
		FeePaymentResponse resp = new FeePaymentResponse();
		
		if( billPmtAddRsType.getStatus().getStatusCode() != 0L){
			//billPmtAddRsType.getStatus().getAdditionalStatus();
			StringBuilder errors = new StringBuilder();
			 List<JAXBElement<? extends AdditionalStatusType>> responseList = billPmtAddRsType.getStatus().getAdditionalStatus();
			if(responseList!=null && responseList.size()>0){
				JAXBElement<AdditionalStatusType> statusType  = (JAXBElement<AdditionalStatusType>)responseList.get(responseList.size()-1);	
				if(statusType!=null){
					//response.setStatusCode(String.valueOf(statusType.getValue().getStatusCode()));
//					response.setStatusDes(statusType.getValue().getStatusDesc());
					String status = statusType.getValue().getStatusDesc();
					log.info("status : error = {}" , status);
//					resp.setDescription(status);
					errors.append(status).append(", ");
				}
			}
			String statusCode = "" + billPmtAddRsType.getStatus().getStatusCode();
			String statusDes  = billPmtAddRsType.getStatus().getStatusDesc();
			log.error("Xpress Fee Payment Error = {} , {}", statusCode, statusDes);
			resp.setStatusCode(WS_RESPONE.FAILED_CODE);
			resp.setDescription(statusCode + " : " + statusDes + " => " + errors.toString());
		}else{
			BillPmtInfoType info = billPmtAddRsType.getBillPmtRec().getBillPmtInfo();
			
			Date pd = SoapDateUtils.toDate(info.getPostedDt());
			resp.setPostedDate(SoapDateUtils.formatDate(pd));
			resp.setPostedTime(info.getPostedTime());
			resp.setStatusCode(WS_RESPONE.SUCCEEDED_CODE);
			resp.setDescription(WS_RESPONE.SUCCEEDED);
			log.info("GetPostedTime : complete = {}" , info.getPostedTime());
		}
		
		return resp;
	}

}
