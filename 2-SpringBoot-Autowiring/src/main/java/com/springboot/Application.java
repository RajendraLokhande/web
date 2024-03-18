package com.springboot;





import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.springboot.service.ReportService;


import io.micrometer.observation.Observation.ContextView;

@SpringBootApplication
public class Application {
 


	public static void main(String[] args) {
 ConfigurableApplicationContext run	= SpringApplication.run(Application.class, args);
 
  ReportService reportService = Context.getBean(ReportService.class);
 
 reportService.generatedReport();
 
	}
}