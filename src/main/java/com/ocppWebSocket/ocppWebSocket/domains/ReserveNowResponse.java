package com.ocppWebSocket.ocppWebSocket.domains;

public class ReserveNowResponse {
	

	private String status;
	
	
	public ReserveNowResponse(String status) {
		super();
		this.status = status;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
