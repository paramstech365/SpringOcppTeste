package com.ocppWebSocket.ocppWebSocket.domains;

public class AuthorizeRequest {
	
	private String idTag;
	
	public AuthorizeRequest() {
		
	}
	
	public AuthorizeRequest(String idTag) {
		super();
		this.idTag = idTag;
	}

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	
}
