package com.ocppWebSocket.ocppWebSocket.domains;

public class Auth {
	

	private AuthorizeResponse idTagInfo;
	public Auth() {
		
	}
	
	public Auth(AuthorizeResponse idTagInfo) {
		super();
		this.idTagInfo = idTagInfo;
	}

	public AuthorizeResponse getIdTagInfo() {
		return idTagInfo;
	}

	public void setIdTagInfo(AuthorizeResponse idTagInfo) {
		this.idTagInfo = idTagInfo;
	}

}
