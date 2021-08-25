package com.ocppWebSocket.ocppWebSocket.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocppWebSocket.ocppWebSocket.controler.domains.Client;
import com.ocppWebSocket.ocppWebSocket.controler.domains.Global;


@RestController
public class NameOfStationsConnected {
	
	public String oi;
	
	
	
	
	@GetMapping("/connect")
	public Client greeting( ) {
		Client ok=new Client("1","1","1");
		JSONObject ss=new JSONObject(Client.class);
		System.out.print(ss);
		
		return new Client(Global.id,Global.session,Global.client);
	}
	@GetMapping("/")
	public String init( ) {
		
		
		return "Init app!";
	}




	
	

}
