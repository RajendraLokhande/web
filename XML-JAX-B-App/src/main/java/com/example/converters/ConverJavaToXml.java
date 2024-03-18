package com.example.converters;

import java.io.File;
import java.rmi.MarshalledObject;

import com.example.bindings.Address;

//import org.springframework.boot.autoconfigure.ssl.SslProperties.Bundles.Watch.File;

import com.example.bindings.Person;


public class ConverJavaToXml {

	
	public static void main (String [] arg) throws Exception {
		
		Address addr= new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");
		
		
		
		
		
		Person person = new Person();
		person.setId(101);
		person.setName("John");
		person.setAge(25);
		person.setPhno((long) 124578698);
		person.setAdress(addr);
		
		
		Marshaller  instance = JAXBContext.newInstance(Person.class);
		
		Marshaller marshaller = instance.createMarshaller();
		
		marshaller.marshal(person, new File ("Person.xml"));
		
		System.out.println("Marshalling Completed...");
		
		
		
		
		
	}
	
	
}
