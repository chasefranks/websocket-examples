package com.example.cfranks.websockets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

@Component
public class MarcoHandler extends AbstractWebSocketHandler {
	
	private Logger logger = LoggerFactory.getLogger(MarcoHandler.class);
	
	public MarcoHandler() {
		
	}	
	
	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		logger.info("message received:");
		logger.info(message.getPayload().toString());
		
		Thread.sleep(2000);
		logger.info("sending message...");
		session.sendMessage(new TextMessage("Polo"));
	}
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		logger.debug("connection established from:");
		logger.debug(session.getRemoteAddress().toString());
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		logger.debug("connection closed");
	}

}
