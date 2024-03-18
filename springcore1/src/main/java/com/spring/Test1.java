package com.spring;


//import org.springframework.beans.factory.BeanFactory;
// org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	
	public static void main (String [] arg) throws Exception{
	
		
	 ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/config.xml" );
	BillCollector bc =context.getBean("billcollector", BillCollector.class);
	bc.collectPayment(1400);
	
//	 DebitcardPayment bc1 =  (DebitcardPayment)context.getBean("debitCard");
	 		
//	bc1.collectPay(1500);
	 
	}
}
