package com.ocppWebSocket.ocppWebSocket.domains;

public class StartTransactionResponse {
	
	

	private IdTagInfo idTagInfo;
	private Integer transactionId;
	
	public StartTransactionResponse() {
		
	}
	
	public StartTransactionResponse(IdTagInfo idTagInfo, Integer transactionId) {
		super();
		this.idTagInfo = idTagInfo;
		this.transactionId = transactionId;
	}

	public IdTagInfo getIdTagInfo() {
		return idTagInfo;
	}

	public void setIdTagInfo(IdTagInfo idTagInfo) {
		this.idTagInfo = idTagInfo;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

}
