package com.example.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class Person {

	private Integer id;
	private String name ;
	
	@XmlTransient
	private Integer age;
	
	
	@XmlElement(name="PhoneNum")
	private Long   phno;
	
	@XmlAttribute
	private String type;
	
    private Address adress;
    
}
