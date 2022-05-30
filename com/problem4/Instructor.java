package com.problem4;

public class Instructor extends Person{
	
	int instructorId;
	int salary;
	
	@Override
	public String toString() {
		
		System.out.println("Instructor ");
		System.out.println("Instructor ID : "+this.instructorId);
		System.out.println("Salary : "+ this.salary);
		
		return new String();	
		
	}	

}
