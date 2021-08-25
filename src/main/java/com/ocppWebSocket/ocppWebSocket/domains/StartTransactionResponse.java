package com.ocppWebSocket.ocppWebSocket.domains;

public class StartTransactionResponse {
	
	private Object idTagInfo;
	private Integer transactionId;
	
	public StartTransactionResponse() {
		
	}
	
	public StartTransactionResponse(Object idTagInfo, Integer transactionId) {
		super();
		this.idTagInfo = idTagInfo;
		this.transactionId = transactionId;
	}

	public Object getIdTagInfo() {
		return idTagInfo;
	}

	public void setIdTagInfo(Object idTagInfo) {
		this.idTagInfo = idTagInfo;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	

}
