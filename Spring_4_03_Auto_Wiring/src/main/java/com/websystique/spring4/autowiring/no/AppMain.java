package com.websystique.spring4.autowiring.no;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration-no.xml");
		 
	        //autowire=default
	        Driver driver = (Driver)context.getBean("driver");
	        System.out.println("Driver Details : "+driver);
	        context.close();

	}

}
