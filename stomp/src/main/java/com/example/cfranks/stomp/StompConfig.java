package com.example.cfranks.stomp;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class StompConfig extends AbstractWebSocketMessageBrokerConfigurer {

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		// the low level WebSocket endpoint
		registry.addEndpoint("/marcopolo"); 
	}
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		// enable the in-memory message broker and route urls /queue and /topic
		registry.enableSimpleBroker("/queue", "/topic"); 
		
		// enable the in-memory message broker and route urls /queue and /topic
		registry.setApplicationDestinationPrefixes("/app");
	}

}
