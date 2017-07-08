package com.websystique.spring4.injection.set;

public class Communication {

	private Messaging messaging;

	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}
	
	public void communicate(){
        messaging.sendMessage();
    }
}
