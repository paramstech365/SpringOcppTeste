package com.ocppWebSocket.ocppWebSocket.domains;

public class StopTransactionResponse {
	
	private String expirityDate;
	private String parentIdTag;
	private String status;
	
	public StopTransactionResponse() {
		
	}
	
	public StopTransactionResponse(String expirityDate, String parentIdTag, String status) {
		super();
		this.expirityDate = expirityDate;
		this.parentIdTag = parentIdTag;
		this.status = status;
	}

	public String getExpirityDate() {
		return expirityDate;
	}

	public void setExpirityDate(String expirityDate) {
		this.expirityDate = expirityDate;
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
