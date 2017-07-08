package com.websystique.spring4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.websystique.spring4.domain.HolaMundo;

public class AppMain {

	//DESDE ARCHIVO JAVA DE CONFIGURACION SPRING
//	public static void main(String[] args) {
//		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HolaMundoConfig.class);
//        HolaMundo bean = (HolaMundo) context.getBean("holaMundoBean");
//        bean.diHola(" Alfredo desde Java Config Spring 4");
//        context.close();
//	}
	
	//DESDE ARCHIVO XML DE CONFIGURACION SPRING
	public static void main(String args[]) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("hola-mundo-config.xml");
        HolaMundo bean = (HolaMundo) context.getBean("holaMundoBean");
        bean.diHola(" Alfredo desde XML Spring 4");
        context.close();
 
    }
}
