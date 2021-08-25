package com.ocppWebSocket.ocppWebSocket.domains;

public class ReserveNow {
	
	private Integer connectorId;
	private String expiryDate;
	private String idTag;
	private Integer reservationId;
	
	public ReserveNow() {
		
	}
	
	public ReserveNow(Integer connectorId, String expiryDate, String idTag, Integer reservationId) {
		super();
		this.connectorId = connectorId;
		this.expiryDate = expiryDate;
		this.idTag = idTag;
		this.reservationId = reservationId;
	}

	public Integer getConnectorId() {
		return connectorId;
	}

	public void setConnectorId(Integer connectorId) {
		this.connectorId = connectorId;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public Integer getReservationId() {
		return reservationId;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}
	
	
	
	
	

}
