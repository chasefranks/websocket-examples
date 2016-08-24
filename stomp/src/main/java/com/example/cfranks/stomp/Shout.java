package com.example.cfranks.stomp;

public class Shout {
	
	private String message;
	
	public Shout() {
		// TODO Auto-generated constructor stub
	}
	
	public Shout(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Shout [message=" + message + "]";
	}

}
