package com.ocppWebSocket.ocppWebSocket.domains;

public class StatusNotification {
	
	private Integer connectorId;
	private String errorCode;
	private String info;
	private String status;
	private String timestamp;
	private String vendorId;
	private String vendorErrorCode;
	
	public StatusNotification() {
		
	}
	public StatusNotification(Integer connectorId, String errorCode, String info, String status, String timestamp,
			String vendorId, String vendorErrorCode) {
		super();
		this.connectorId = connectorId;
		this.errorCode = errorCode;
		this.info = info;
		this.status = status;
		this.timestamp = timestamp;
		this.vendorId = vendorId;
		this.vendorErrorCode = vendorErrorCode;
	}
	public Integer getConnectorId() {
		return connectorId;
	}
	public void setConnectorId(Integer connectorId) {
		this.connectorId = connectorId;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorErrorCode() {
		return vendorErrorCode;
	}
	public void setVendorErrorCode(String vendorErrorCode) {
		this.vendorErrorCode = vendorErrorCode;
	}

}
