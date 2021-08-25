package com.ocppWebSocket.ocppWebSocket.domains;

public class StartTransaction {
	
	private Integer connectorId;
	private Integer idTag; 
	private Integer meterStart; 
	private String timestamp; 
	
	public StartTransaction() {
		
	}
	
	public StartTransaction(Integer connectorId, Integer idTag, Integer meterStart, String timestamp) {
		super();
		this.connectorId = connectorId;
		this.idTag = idTag;
		this.meterStart = meterStart;
		this.timestamp = timestamp;
	}

	public Integer getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(Integer connectorId) {
		this.connectorId = connectorId;
	}

	public Integer getIdTag() {
		return idTag;
	}

	public void setIdTag(Integer idTag) {
		this.idTag = idTag;
	}

	public Integer getMeterStart() {
		return meterStart;
	}

	public void setMeterStart(Integer meterStart) {
		this.meterStart = meterStart;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
	

}
