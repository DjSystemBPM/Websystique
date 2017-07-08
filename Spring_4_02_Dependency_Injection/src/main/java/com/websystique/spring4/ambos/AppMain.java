package com.websystique.spring4.ambos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration-ambos.xml");
 
        Communication app = (Communication)context.getBean("communication");
        app.communicate();
        context.close();
    }
}
