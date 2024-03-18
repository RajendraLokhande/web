package com.SpringBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
   ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringBean/config.xml");

//	ITEmployee iemp = context.getBean("ITEmployee", ITEmployee.class);	
//	iemp.payPayment(20.00);
//	

		    ITEmployee it = (ITEmployee) context.getBean("itNonIt");
		    
		    it.payPayment(1554.00);
	}

}
