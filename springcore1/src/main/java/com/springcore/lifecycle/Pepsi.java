package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi {//implements InitializingBean,DisposableBean {
	
  private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Pepsi(double price) {
	super();
	this.price = price;
}
public Pepsi() {
	super();
	
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}


public void init() {
	System.out.println("Inside init method");
}

public void destroy (){
 System.out.println("Inside destroy method");
}
  
}

	
	
	

