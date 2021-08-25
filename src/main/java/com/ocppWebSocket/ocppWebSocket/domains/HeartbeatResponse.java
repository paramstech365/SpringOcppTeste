package com.ocppWebSocket.ocppWebSocket.domains;

public class HeartbeatResponse {
	

	private String currentTime;
	
	public HeartbeatResponse() {
		
	}
	public HeartbeatResponse(String currentTime) {
		super();
		this.currentTime = currentTime;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

}
