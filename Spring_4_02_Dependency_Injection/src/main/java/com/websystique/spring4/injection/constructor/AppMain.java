package com.websystique.spring4.injection.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration-constructor.xml");
        Communication app = (Communication)context.getBean("communication");
        app.communicate();
        context.close();
    }
}
