package com.problem4;

public class Address {
	
	String city;
	String state;
	String pinCode;
	
	@Override
	public String toString() {
		
		System.out.println("Address : ");
		System.out.println("City : "+this.city);
		System.out.println("State : "+this.state);
		System.out.println("Pin Code : "+this.pinCode);		
		
		return new String();			
	}	
}
