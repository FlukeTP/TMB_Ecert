package com.tmb.payment.ws.vo;

import java.io.Serializable;

public class CheckStatusDocumentRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6036391757083528104L;
	private String reqId;
	private String channelId;
	private String reqUserId;
	private String segmentCode;
	private String caNumber;

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
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

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

}
