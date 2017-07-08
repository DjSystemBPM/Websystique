package com.websystique.spring4.autowiring.bytype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration-bytype.xml");
 
        //autowire=byType
        Employee employee = (Employee)context.getBean("employee");
        System.out.println("Employee Details : "+employee);
        context.close();
    }
}
