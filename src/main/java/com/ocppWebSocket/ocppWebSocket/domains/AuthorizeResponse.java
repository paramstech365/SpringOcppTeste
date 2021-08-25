package com.ocppWebSocket.ocppWebSocket.domains;

public class AuthorizeResponse {
	
	private String expiryDate;
	private String parentIdTag;
	private String status;
	public AuthorizeResponse() {
		
	}
	public AuthorizeResponse(String expiryDate, String parentIdTag, String status) {
		super();
		this.expiryDate = expiryDate;
		this.parentIdTag = parentIdTag;
		this.status = status;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getParentIdTag() {
		return parentIdTag;
	}

	public void setParentIdTag(String parentIdTag) {
		this.parentIdTag = parentIdTag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}