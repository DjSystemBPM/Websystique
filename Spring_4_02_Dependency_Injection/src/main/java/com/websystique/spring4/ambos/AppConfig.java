package com.websystique.spring4.ambos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.websystique.spring4.injection.constructor.Encryption;
import com.websystique.spring4.injection.constructor.RSAEncryption;
import com.websystique.spring4.injection.set.ActiveMQMessaging;
import com.websystique.spring4.injection.set.Messaging;

@Configuration
public class AppConfig {

	@Bean(name = "communication")
	public Communication communication() {
		Communication communication = new Communication(encryption());
		communication.setMessaging(messaging());
		return communication;
	}
	
	
	@Bean(name = "encryption")
    @Description("Este Bean debe ser injectado via setter.")
    public Encryption encryption() {
        return new RSAEncryption();
    }
	
	@Bean(name = "messaging")
    @Description("This bean will be injected via setter injection")
    public Messaging messaging() {
        return new ActiveMQMessaging();
    }
}
