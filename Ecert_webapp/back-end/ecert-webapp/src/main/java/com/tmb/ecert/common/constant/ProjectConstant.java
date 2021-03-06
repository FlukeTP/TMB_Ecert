package com.tmb.ecert.common.constant;

public class ProjectConstant {

	public static class APPLICATION_LOG_NAME {
		public static final String ECERT_REQFORM = "e-certificate-requestform.log";
		public static final String ECERT_SEARCH_REQFORM = "e-certificate-search-requesform.log";
		public static final String ECERT_PAYMENT = "e-certificate-payment.log";
		public static final String ECERT_REPORT = "e-certificate-report.log";
		public static final String ECERT_BATCHMONITORING = "e-certificate-batchmonitoring.log";
		public static final String ECERT_AUDITLOG = "e-certificate-auditlog.log";
		public static final String ECERT_ROLEMANAGEMENT = "e-certificate-rolemangement.log";
		public static final String ECERT_PARAMETERCONFIG = "e-certificate-parameterconfig.log";
		public static final String ECERT_EMAILCONFIG = "e-certificate-emailconfig.log";
	}

	public static class CHANNEL {
		public static final String BATCH = "BATCH";
	}

	public static class SYSTEM {
		public static final String TMB_BANKCODE = "tmb.bankcode";
		public static final String TMB_TRANSACTION_CODE = "tmb.transactiono";
		public static final String TMB_SERVICE_CODE = "tmb.servicecode";
		public static final String DBD_ACCOUNT_NAME = "dbd.account.name";
		public static final String DBD_ACCOUNT_NUMBER = "dbd.accountno";
		public static final String TMB_TRAN_TYPE = "tmb.transaction.type";
	}

	public static class ENCODING {
		public static final String TIS_620 = "TIS-620";
	}

	public static class ACTION_AUDITLOG {
		public static final String LOGIN_CODE = "70001";
		public static final String LOGOUT_CODE = "70002";
		public static final String REQFORM_01_CODE = "70003";
		public static final String REQFORM_02_CODE = "70004";
		public static final String REQFORM_03 = "70017";
		public static final String PAYMENT_CODE = "70005";
		public static final String APPROVE_PAYMENT_CODE = "70006";
		public static final String REJECT_PAYMENT_CODE = "70007";
		public static final String REJECT_REQ_CODE = "70008";
		public static final String CANCEL_REQ_CODE = "70009";
		public static final String RECEIPT_CODE = "70010";
		public static final String COVERSHEET_CODE = "70011";
		public static final String UPLOADCERTIFICATE_CODE = "70012";
		public static final String DOWNLOAD_REQFORM_CODE = "70013";
		public static final String DOWNLOAD_REGISTERID_CODE = "70014";
		public static final String DOWNLOAD_CHGNAME_CODE = "70015";
		public static final String DOWNLOAD_ECERT_CODE = "70016";
		public static final String PRINT_FORM_CODE = "70018";
		public static final String PRINT_FORMREQ_CODE = "70019";
		public static final String LOGIN_FAILED = "70020";
		public static final String ROLE_MANAGEMENT = "70021";

	}

	public static class ACTION_AUDITLOG_DESC {
		public static final String LOGIN = "auditlog.login";
		public static final String LOGOUT = "auditlog.logout";
		public static final String REQFORM_01 = "auditlog.reqform.01";
		public static final String REQFORM_02 = "auditlog.reqform.02";
		public static final String REQFORM_03 = "auditlog.reqform.03";
		public static final String PAYMENT = "auditlog.payment";
		public static final String APPROVE_PAYMENT = "auditlog.approvepayment";
		public static final String REJECT_PAYMENT = "auditlog.rejectpayment";
		public static final String REJECT_REQ = "auditlog.rejectrequest";
		public static final String CANCEL_REQ = "auditlog.cancelrequest";
		public static final String RECEIPT = "auditlog.printreceipt";
		public static final String COVERSHEET = "auditlog.printcoversheet";
		public static final String UPLOADCERTIFICATE = "auditlog.uploadcertificate";
		public static final String DOWNLOAD_REQFORM = "auditlog.downloadreqform";
		public static final String DOWNLOAD_REGISTERID = "auditlog.downloadid";
		public static final String DOWNLOAD_CHGNAME_CODE = "auditlog.downloadchangename";
		public static final String DOWNLOAD_ECERT_CODE = "auditlog.downloadcertificate";
		public static final String PRINT_FORM = "auditlog.reqform.04";
		public static final String PRINT_FORMREQ = "auditlog.reqform.05";
		public static final String ROLE_ADD = "auditlog.addrole";
		public static final String ROLE_EDIT = "auditlog.editrole";
		public static final String ROLE_IMPORT = "auditlog.importrole";

	}

	public static class SERVICE_TIMMING {
		public static final String SHUTDOWN_TIME_TO = "shutdown.time.to";
		public static final String SHUTDOWN_TIME_FROM = "shutdown.time.from";
	}

	public static class WEB_SERVICE_ENDPOINT {
		public static final String UPLOADCERTIFICARE_SLEEP = "ecer.upload.certificate.sleep";
		public static final String UPLOADCERTIFICARE_TIME = "ecer.upload.certificate.time";
		public static final String ECM_IMPORT_DOCUMENT = "ecert.ecm.importdocument.endpoint";
		public static final String ECM_CHECK_STATUS = "ecert.ecm.checkstatus.endpoint";
		public static final String ECM_CHANNELID = "ecm.channelid";
		public static final String ECM_DOCTYPE = "ecm.doctype";
		public static final String XPRESS_BILLPAYMENT = "ecert.xpress.billpayment.endpoint";
		public static final String APPROVE_BEFOREPAYMENT = "ecert.dbd.approvebeforepay.endpoint";
		public static final String REALTIME_PAYMENT = "ecert.dbd.realtimepayment.endpoint";
		public static final String ECM_CREATE_DOC = "ecert.ecm.v2.createdoc.endpoint";
	}

	public static class WEB_SERVICE_PARAMS {
		public static final String TMB_BANKCODE = "tmb.bankcode";
		public static final String TMB_SERVICECODE = "tmb.servicecode";
		public static final String TMB_TRANSACTION_NO = "tmb.transactiono";
		public static final String TMB_PAYMENT_TYPE = "tmb.payment.type";
		
		public static final String FEE_CUST_LANG = "feepayment.customer.language";
		public static final String FEE_CLIENT_ORG = "feepayment.clientapp.org";
		public static final String FEE_CLIENT_NAME = "feepayment.clientapp.name";
		public static final String FEE_CLIENT_VERSION = "feepayment.clientapp.version";
		public static final String FEE_SPNAME = "feepayment.SPName";
		public static final String FEE_TRANS_CODE = "feepayment.transaction.code";
		public static final String FEE_TRANS_CODE_CA = "feepayment.transaction.code.ca";
		public static final String FEE_FROM_ACCOUNT_TYPE = "feepayment.fromacctref.account.type";
		public static final String FEE_FROM_ACCOUNT_TYPE_CA = "feepayment.fromacctref.account.type.ca";
		public static final String DBD_ACCOUNT = "dbd.accountno";
		public static final String FEE_TO_ACCOUNT_TYPE = "feepayment.toacctref.account.type";
		public static final String FEE_EPAY = "feepayment.epay.code";
		public static final String FEE_BRANCH = "feepayment.branchIdent";
		public static final String FEE_COMP_CODE = "feepayment.compcode";
		
		public static final String ECM_FTP_HOST = "ecm.ftp.host";
		public static final String ECM_FTP_PATH = "ecm.ftp.path";
		public static final String ECM_FTP_USERNAME = "ecm.ftp.user";
		public static final String ECM_FTP_PASSWORD = "ecm.ftp.password";
		
		public static final String AMOUNT_LIMIT = "payment.amount.limit";
		
	}
	
	public static class EMAIL_SERVICE {
		
		public static final String EMAIL_GATEWAY_HOST= "mail.gateway.host";
		public static final String EMAIL_GATEWAY_PORT= "mail.gateway.port";
		
		public static final String FUNCTION_NAME_UPDATE_STATUS = "Update Status";
		public static final String FUNCTION_NAME_CREATE_REQUESTFORM = "CreateForm";
		public static final String FUNCTION_NAME_SEND_EMAIL = "Send Email";
		public static final String FUNCTION_NAME_SEND_FTP = "Send FTP File";
		public static final String FUNCTION_NAME_EXPORT_EXCEL = "Export Excel";
		public static final String FUNCTION_NAME_DOWNLOAD = "Download";
		public static final String FUNCTION_NAME_PRINT_RECEIPT = "Print Receipt";
		public static final String FUNCTION_NAME_PRINT_COVERSHEET = "Print Coversheet";
		public static final String FUNCTION_NAME_PRINT_UPLOADCERTIFICATE = "Upload Certificate";

	}
	
	public static class ECERT_MANUAL {
		public static final String MANUAL_PATH = "ecert.manual.path";
		public static final String MANUAL_FILENAME = "ecert.manual.filename";
		public static final String MANUAL_PATHVIDEO = "ecert.manual.pathvideo";
	}
	public static class ECM_PARAMETER {
		public static final String ECM_V2_REPOSITORY = "ecm.v2.repositoryId";
		public static final String ECM_V2_TMB_SOURCE = "ecm.v2.tmb_source";
		public static final String ECM_V2_SUMMIT_CHANNEL = "ecm.v2.submit_channel";
		public static final String ECM_V2_DOCTYPE_REQ = "ecm.v2.doctype.requestform";
		public static final String ECM_V2_DOCTYPE_RECP = "ecm.v2.doctype.receipt";
		public static final String ECM_V2_DOCTYPE_CER = "ecm.v2.doctype.certificate";
		public static final String ECM_V2_DOCTYPE_IDCARD = "ecm.v2.doctype.idcard";
		public static final String ECM_V2_DOCTYPE_OTHER = "ecm.v2.doctype.other";
		public static final String ECM_V2_TMB_IDTYPE = "ecm.v2.tmb_id_type";
		public static final String ECM_V2_OBJ_ID = "ecm.v2.objtypeid";
		public static final String ECM_CONFIGURARION="ecm.configuration";
		
		public static final String ECM_DOCTYPE_REQ = "ecm.doctype.requestform";
		public static final String ECM_DOCTYPE_RECP = "ecm.doctype.receipt";
		public static final String ECM_DOCTYPE_CER = "ecm.doctype.certificate";
		public static final String ECM_DOCTYPE_IDCARD = "ecm.doctype.idcard";
		public static final String ECM_DOCTYPE_OTHER = "ecm.doctype.other";
		
		
	}
}
