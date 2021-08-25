package com.ocppWebSocket.ocppWebSocket.controler.domains;

public class Client {
	
	
	public String id;
	public String session;
	public String client;
	
	public Client() {
		
	}
	
	
	public Client(String id, String session, String client) {
		super();
		this.id = id;
		this.session = session;
		this.client = client;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
	

}
