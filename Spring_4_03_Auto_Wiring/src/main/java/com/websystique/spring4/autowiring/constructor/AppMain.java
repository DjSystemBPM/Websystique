package com.websystique.spring4.autowiring.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration-constructor.xml");
 
        //autowire=constructor
        Performer performer = (Performer)context.getBean("performer");
        System.out.println("Performer Details : "+performer);
        context.close();
    }
}
