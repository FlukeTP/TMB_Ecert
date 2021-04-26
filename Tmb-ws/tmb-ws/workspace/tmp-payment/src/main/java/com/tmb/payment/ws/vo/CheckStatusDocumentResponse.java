package com.tmb.payment.ws.vo;

import java.util.List;

public class CheckStatusDocumentResponse {

	private String statusCode;
	private String description;
	private List<CheckDocumentFile> indexGroups;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<CheckDocumentFile> getIndexGroups() {
		return indexGroups;
	}

	public void setIndexGroups(List<CheckDocumentFile> indexGroups) {
		this.indexGroups = indexGroups;
	}

}
