package com.tmb.payment.ws.vo;

import java.io.Serializable;
import java.util.List;

public class ImportDocumentRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1814266027115643268L;
	private String reqId;
	private String caNumber;
	private String channelId;
	private String reqUserId;
	private String segmentCode;

	private List<ImportDocumentFile> files;

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getReqUserId() {
		return reqUserId;
	}

	public void setReqUserId(String reqUserId) {
		this.reqUserId = reqUserId;
	}

	public String getSegmentCode() {
		return segmentCode;
	}

	public void setSegmentCode(String segmentCode) {
		this.segmentCode = segmentCode;
	}

	public List<ImportDocumentFile> getFiles() {
		return files;
	}

	public void setFiles(List<ImportDocumentFile> files) {
		this.files = files;
	}

}
