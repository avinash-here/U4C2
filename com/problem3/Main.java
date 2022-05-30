package com.problem3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Book your ola cab now");
		System.out.println("Enter number of Passengers");
		int pass = sc.nextInt();
		System.out.println("Enter number of Kilometres");
		int kms = sc.nextInt();
		
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(pass, kms);
		int res = myOla.calculateBill(myCar);
		
		System.out.println();
		System.out.println("The total fare amount is "+ res);
		
	}

}
