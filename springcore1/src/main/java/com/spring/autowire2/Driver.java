package com.spring.autowire2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {

    ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/autowire2/config.xml");
    DeiselEngine de= context.getBean("deiselengine",DeiselEngine.class); 
	
    System.out.println(de);
	
	}

}
