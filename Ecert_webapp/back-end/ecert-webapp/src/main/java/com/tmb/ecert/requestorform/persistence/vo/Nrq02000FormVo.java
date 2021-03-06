package com.tmb.ecert.requestorform.persistence.vo;

import java.math.BigDecimal;

import org.springframework.web.multipart.MultipartFile;

public class Nrq02000FormVo {
	private Long reqFormId;
	private String tmbReqFormNo;
	private String reqTypeSelect;
	private String customSegSelect;
	private String payMethodSelect;
	private String subAccMethodSelect;
	private String accNo;
	private String accName;
	private String corpNo;
	private String corpName;
	private String corpName1;
	private String acceptNo;
	private String glType;
    private String status;
	private String tranCode;
    private String accountNo;
    private String accountType;
	private String departmentName;
	private Boolean tmbReceiptChk;
	private String telReq;
	private String address;
	private String note;
	private String certificates;
	private MultipartFile requestFile;
	private MultipartFile copyFile;
	private MultipartFile changeNameFile;
	private String requestFileName;
	private String copyFileName;
	private String changeNameFileName;
	private String ref1;
	private String ref2;
	private BigDecimal amount; 
	private BigDecimal amountDbd; 
	private BigDecimal amountTmb; 
	private String rejectReasonCode;
	private String rejectReasonOther;
	private String hasAuthed;
	private String userStatus;
	private String majorNo;
	
	public String getMajorNo() {
		return majorNo;
	}

	public void setMajorNo(String majorNo) {
		this.majorNo = majorNo;
	}

	public String getHasAuthed() {
		return hasAuthed;
	}

	public void setHasAuthed(String hasAuthed) {
		this.hasAuthed = hasAuthed;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public BigDecimal getAmountDbd() {
		return amountDbd;
	}

	public void setAmountDbd(BigDecimal amountDbd) {
		this.amountDbd = amountDbd;
	}

	public BigDecimal getAmountTmb() {
		return amountTmb;
	}

	public void setAmountTmb(BigDecimal amountTmb) {
		this.amountTmb = amountTmb;
	}

	public String getRejectReasonCode() {
		return rejectReasonCode;
	}

	public void setRejectReasonCode(String rejectReasonCode) {
		this.rejectReasonCode = rejectReasonCode;
	}

	public String getRejectReasonOther() {
		return rejectReasonOther;
	}

	public void setRejectReasonOther(String rejectReasonOther) {
		this.rejectReasonOther = rejectReasonOther;
	}

	public String getRef1() {
		return ref1;
	}

	public void setRef1(String ref1) {
		this.ref1 = ref1;
	}

	public String getRef2() {
		return ref2;
	}

	public void setRef2(String ref2) {
		this.ref2 = ref2;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getRequestFileName() {
		return requestFileName;
	}

	public void setRequestFileName(String requestFileName) {
		this.requestFileName = requestFileName;
	}

	public String getCopyFileName() {
		return copyFileName;
	}

	public void setCopyFileName(String copyFileName) {
		this.copyFileName = copyFileName;
	}

	public String getChangeNameFileName() {
		return changeNameFileName;
	}

	public void setChangeNameFileName(String changeNameFileName) {
		this.changeNameFileName = changeNameFileName;
	}

	public Long getReqFormId() {
		return reqFormId;
	}

	public void setReqFormId(Long reqFormId) {
		this.reqFormId = reqFormId;
	}

	public String getTmbReqFormNo() {
		return tmbReqFormNo;
	}

	public void setTmbReqFormNo(String tmbReqFormNo) {
		this.tmbReqFormNo = tmbReqFormNo;
	}

	public String getReqTypeSelect() {
		return reqTypeSelect;
	}

	public void setReqTypeSelect(String reqTypeSelect) {
		this.reqTypeSelect = reqTypeSelect;
	}

	public String getCustomSegSelect() {
		return customSegSelect;
	}

	public void setCustomSegSelect(String customSegSelect) {
		this.customSegSelect = customSegSelect;
	}

	public String getPayMethodSelect() {
		return payMethodSelect;
	}

	public void setPayMethodSelect(String payMethodSelect) {
		this.payMethodSelect = payMethodSelect;
	}

	public String getSubAccMethodSelect() {
		return subAccMethodSelect;
	}

	public void setSubAccMethodSelect(String subAccMethodSelect) {
		this.subAccMethodSelect = subAccMethodSelect;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getCorpNo() {
		return corpNo;
	}

	public void setCorpNo(String corpNo) {
		this.corpNo = corpNo;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getCorpName1() {
		return corpName1;
	}

	public void setCorpName1(String corpName1) {
		this.corpName1 = corpName1;
	}

	public String getAcceptNo() {
		return acceptNo;
	}

	public void setAcceptNo(String acceptNo) {
		this.acceptNo = acceptNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Boolean getTmbReceiptChk() {
		return tmbReceiptChk;
	}

	public void setTmbReceiptChk(Boolean tmbReceiptChk) {
		this.tmbReceiptChk = tmbReceiptChk;
	}

	public String getTelReq() {
		return telReq;
	}

	public void setTelReq(String telReq) {
		this.telReq = telReq;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCertificates() {
		return certificates;
	}

	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}

	public MultipartFile getRequestFile() {
		return requestFile;
	}

	public void setRequestFile(MultipartFile requestFile) {
		this.requestFile = requestFile;
	}

	public MultipartFile getCopyFile() {
		return copyFile;
	}

	public void setCopyFile(MultipartFile copyFile) {
		this.copyFile = copyFile;
	}

	public MultipartFile getChangeNameFile() {
		return changeNameFile;
	}

	public void setChangeNameFile(MultipartFile changeNameFile) {
		this.changeNameFile = changeNameFile;
	}

	public String getGlType() {
		return glType;
	}

	public void setGlType(String glType) {
		this.glType = glType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTranCode() {
		return tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
