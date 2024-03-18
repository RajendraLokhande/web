package com.example.converters;

import java.io.File;

import com.example.bindings.Person;

public class ConvertXmlToJava {

	public static void main (String []args) throws Exception {
		
		File xmlfile = new File("Person.xml");
		
		JAXBContext context= JAXBContext.nweInstance(Person.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Object object = unmarshaller.unmarshal(xml.file);
		
		Person person = (Person) object;
		
		System.out.println(person);
	}
	
}
