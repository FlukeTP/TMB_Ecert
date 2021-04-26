package com.tmb.payment.ws.vo;

import java.io.Serializable;

public class ImportDocumentFile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2100159761711075064L;
	// item list
	private String fileName;
	private String docTypeCode;
	private String importDate;
	private String registrationId;
	private String refAppNo;
	private String cusName;
	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDocTypeCode() {
		return docTypeCode;
	}

	public void setDocTypeCode(String docTypeCode) {
		this.docTypeCode = docTypeCode;
	}

	public String getImportDate() {
		return importDate;
	}

	public void setImportDate(String importDate) {
		this.importDate = importDate;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getRefAppNo() {
		return refAppNo;
	}

	public void setRefAppNo(String refAppNo) {
		this.refAppNo = refAppNo;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

}
