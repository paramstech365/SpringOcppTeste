package com.ocppWebSocket.ocppWebSocket.domains;

public class StopTransaction {
	
	private String idTag;
	private Integer meterStop;
	private String timeStamp;
	private Integer transactionId;
	private String reason;
	private Object[] transactionData;
	
	public StopTransaction() {
		
	}
	
	public StopTransaction(String idTag, Integer meterStop, String timeStamp, Integer transactionId, String reason,
			Object[] transactionData) {
		super();
		this.idTag = idTag;
		this.meterStop = meterStop;
		this.timeStamp = timeStamp;
		this.transactionId = transactionId;
		this.reason = reason;
		this.transactionData = transactionData;
	}

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public Integer getMeterStop() {
		return meterStop;
	}

	public void setMeterStop(Integer meterStop) {
		this.meterStop = meterStop;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Object[] getTransactionData() {
		return transactionData;
	}

	public void setTransactionData(Object[] transactionData) {
		this.transactionData = transactionData;
	}
	

}
