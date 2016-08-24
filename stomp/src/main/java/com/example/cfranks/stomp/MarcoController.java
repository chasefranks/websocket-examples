package com.example.cfranks.stomp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MarcoController {	
	
	private static final Logger log = LoggerFactory.getLogger(MarcoController.class);
	
	@MessageMapping("/marco") // note the prefix /app is implicit
	public void handleShout(Shout incoming) {
		log.info("message received at /app/marco:" + incoming.toString());
	}
	
	@SubscribeMapping({"/marco"}) // this handles subscriptions to /app/marco
	public Shout handleSubscription() {
		log.info("subscription to /app/marco received");
		Shout outgoing = new Shout("Polo!");
		return outgoing;		
	}

}
