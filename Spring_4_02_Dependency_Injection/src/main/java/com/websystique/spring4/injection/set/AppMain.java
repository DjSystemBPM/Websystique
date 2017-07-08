package com.websystique.spring4.injection.set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration-set.xml");
        Communication app = (Communication) context.getBean("communication");
        app.communicate();
        context.close();
    }

}
