package com.ocppWebSocket.ocppWebSocket;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.SubProtocolCapable;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.ocppWebSocket.ocppWebSocket.controler.domains.Client;
import com.ocppWebSocket.ocppWebSocket.controler.domains.Global;
import com.ocppWebSocket.ocppWebSocket.domains.Auth;
import com.ocppWebSocket.ocppWebSocket.domains.AuthorizeResponse;
import com.ocppWebSocket.ocppWebSocket.domains.BootNotificationResponse;
import com.ocppWebSocket.ocppWebSocket.domains.HeartbeatResponse;
import com.ocppWebSocket.ocppWebSocket.domains.IdTagInfo;
import com.ocppWebSocket.ocppWebSocket.domains.StartTransactionResponse;

public class MyHandler extends TextWebSocketHandler implements SubProtocolCapable {
	
	

	private final String[] subProtocols = {"ocpp1.6", "ocpp2.0"};
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
		Global.id="";
		Global.session="";
		Global.client="Close";
		System.out.print("\n Connection Close \n"+"Session: "+session.getId()+"\n");
		session.getHandshakeHeaders();
		
	}
	@Override
	public void afterConnectionEstablished(WebSocketSession session)
            throws Exception{
		Global.id=session.getId();
		Global.session=session.getUri().toString();
		Global.client="ok";
		
		Client aa= new Client(session.getId(),session.getUri().toString(),"ok");
		System.out.print("\n Connected \n"+"Session: "+session.getId()+"\n");
		
		System.out.print(session.getUri());
		
	}

    @Override
    public void handleMessage(WebSocketSession session,WebSocketMessage<?> message)  throws Exception {
    	//WebSocketHttpHeaders expectedHeaders = new WebSocketHttpHeaders();
    	System.out.print(message.getPayload());
    	
    	
    	ZonedDateTime data = ZonedDateTime.now();
    	BootNotificationResponse stat=new BootNotificationResponse("Accepted",data.toString(),300);
    	JSONArray mm=new JSONArray((message.getPayload()).toString());
    	session.sendMessage(new TextMessage(message.getPayload().toString()));
    	System.out.print("\n Remote: "+session.getRemoteAddress()+"\n");
    	JSONObject ss=new JSONObject(stat);
    	System.out.print(session.getHandshakeHeaders());
    	JSONArray ja = new JSONArray();
    	
    	ja.put(3);
    	ja.put(mm.get(1));
    	//
    	ja.put(ss);
    	System.out.print("\n"+message.getPayload()+"\n");
    	System.out.print(mm.get(2)+"\n");
    	if(mm.get(2).equals("Authorize")) {
    		
    		JSONArray nob = new JSONArray();
    		JSONObject iii=new JSONObject(new Auth(new AuthorizeResponse("1233434","ddfd","Accepted")));
    		nob.put(3);
    		nob.put(mm.get(1));
    		nob.put(iii);
    		System.out.print(nob);
    		//[2,"4","Authorize",{"idToken":{"idToken":"111111","type":"ISO14443"},"evseId":[1]}]
    		session.sendMessage(new TextMessage(nob.toString()));
    	}
    	if(mm.get(2).equals("BootNotification")) {
    		System.out.print("Boot \n");
    		
    		session.sendMessage(new TextMessage(ja.toString()));
    	}
    	
    	if(mm.get(2).equals("Heartbeat")) {
    		System.out.print("Heart \n");
    		HeartbeatResponse hear=new HeartbeatResponse(data.toString());
    		JSONObject hear3=new JSONObject(hear);
        	JSONArray ja2 = new JSONArray();
        	ja2.put(3);
        	ja2.put(mm.get(1));
        	ja2.put(hear3);
        	session.sendMessage(new TextMessage(ja2.toString()));
    		
    		
    	}
    	if(mm.get(2).equals("StatusNotification")) {
    		System.out.print("Status \n");
    		JSONObject dd=new JSONObject(mm.get(3));
    		System.out.print("Status do conector todos: "+mm.get(3)+"\n");
    		System.out.print("Conector : "+mm.get(3)+"\n");
    		System.out.print("Status do conector: "+mm.getJSONObject(3).getString("connectorStatus")+"\n");
    		
    		
    	}
    	if(mm.get(2).equals("StartTransaction")) {
    		System.out.print("Start charge \n");
    		StartTransactionResponse n =new StartTransactionResponse(new IdTagInfo("dff","Accepted","Accepted"),1);
    		session.sendMessage(new TextMessage(n.toString()));
    	}
    	
    	
        // ...
    }
    
    
    @Override
    public List<String> getSubProtocols() {
    	System.out.print(Arrays.asList(subProtocols));
        return Arrays.asList(subProtocols);
    }
    
    

}