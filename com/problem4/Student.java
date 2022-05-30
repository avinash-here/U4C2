package com.problem4;

public class Student extends Person{
	
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	@Override
	public String toString() {
		
		System.out.println("Student ");
		System.out.println("Student ID : "+this.studentId);
		System.out.println("Course Enrolled : "+ this.courseEnrolled);
		System.out.println("Course Fee : "+ this.courseFee);
		
		
		
		return new String();	
		
	}	
	

}
