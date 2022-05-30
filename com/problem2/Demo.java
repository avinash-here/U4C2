package com.problem2;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Students");
		int num = sc.nextInt();

		Student[] stud = new Student[num];
		
		for(int i = 1; i <= num; i++) {
			System.out.println();
			System.out.println("Enter Student "+i+" Details :");
			
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter Roll");
			int roll = sc.nextInt();
			
			System.out.println("Enter Address");
			String addr = sc.next();
			
			System.out.println("Enter Marks");
			int marks = sc.nextInt();
			
			Student s1 = new Student(roll, name, addr, marks);
			
			stud[i-1] = s1;
		}
		
		int total = 0;
		for(int j = 0; j < stud.length; j++) {
			System.out.println();
			System.out.println("Student " +(j+1) + " Details :");
			System.out.println("Name : "+ stud[j].getName());
			System.out.println("Roll : "+ stud[j].getRoll());
			System.out.println("Address : "+ stud[j].getAddress());
			System.out.println("Marks : "+ stud[j].getMarks());
			total += stud[j].getMarks();
		}
		
		System.out.println();
		System.out.println("Average of all the student marks : "+ total/stud.length);
		
	}

}
