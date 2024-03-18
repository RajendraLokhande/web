package com.springcore.auto.wire;

public class Emp {
	
	private String address;

	public String getAddress() {
		return address;
	}
    public void setAddress(String address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub

	}
	public Emp(String address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}	
	
}
