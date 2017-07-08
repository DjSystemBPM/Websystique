package com.websystique.spring4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.websystique.spring4.domain.HolaMundo;
import com.websystique.spring4.domain.HolaMundoImpl;

@Configuration
public class HolaMundoConfig {
	
	@Bean(name="holaMundoBean")
    @Description("Esto es un ejemplo de un Bean")
    public HolaMundo helloWorld() {
        return new HolaMundoImpl();
    }

}
