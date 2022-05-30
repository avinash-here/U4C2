package com.problem4;

public class Main {
	
	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			Student s1 = (Student)person;
			s1.studentId = 1;
			s1.courseEnrolled = "JA111";
			s1.courseFee = 50000;
			s1.addr.city = "Chennai";
			s1.addr.state = "TN";
			s1.addr.pinCode = "600001";	
			return s1;
		}
		
		if(person instanceof Instructor) {
			Instructor ins1 = (Instructor)person;
			ins1.instructorId = 456;
			ins1.salary = 45562;			
			ins1.addr.city = "Chennai";
			ins1.addr.state = "TN";
			ins1.addr.pinCode = "600001";	
			return ins1;
		}		
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Person newStudent =  generatePerson(new Student());
		Person newInstructor =  generatePerson(new Instructor());
				
		System.out.println(newStudent);
		System.out.println(newInstructor);
	}

}
