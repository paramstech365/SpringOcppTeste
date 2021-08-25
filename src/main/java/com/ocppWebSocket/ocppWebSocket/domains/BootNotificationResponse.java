package com.ocppWebSocket.ocppWebSocket.domains;

public class BootNotificationResponse {
	
	private String status;
	private String currentTime;
	private Integer interval;
	public BootNotificationResponse() {
		
	}
	public BootNotificationResponse(String status, String currentTime, Integer interval) {
		super();
		this.status = status;
		this.currentTime = currentTime;
		this.interval = interval;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	public Integer getInterval() {
		return interval;
	}
	public void setInterval(Integer interval) {
		this.interval = interval;
	}
	
	

}
