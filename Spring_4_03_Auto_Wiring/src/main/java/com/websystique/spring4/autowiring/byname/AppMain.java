package com.websystique.spring4.autowiring.byname;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration-byname.xml");
 
        //autowire=byName 
        Application application = (Application)context.getBean("application");
        System.out.println("Application Details : " + application);
        context.close();
    }
}
