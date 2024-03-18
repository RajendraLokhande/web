package in.spring_core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
      ApplicationContext context=new ClassPathXmlApplicationContext("in/spring_core/config.xml");
      Employee Employee1=(Employee)context.getBean("Employee");
      System.out.println(Employee1);   
      
    }
}
