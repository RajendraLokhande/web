package com.spring;

public class Person {
	
	private int age;
	private String name;
	private String city;
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public Person(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	
}

