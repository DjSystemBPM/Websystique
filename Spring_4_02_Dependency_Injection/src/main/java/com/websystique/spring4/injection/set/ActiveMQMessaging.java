package com.websystique.spring4.injection.set;

public class ActiveMQMessaging implements Messaging{

	@Override
	public void sendMessage() {
		 System.out.println("Enviando Mensaje via Active MQ");
		
	}

}
