package com.problem3;

public class OLA {
	
	public Car bookCar(int numberOfPassengers, int numberOfKMs) {
		
		if(numberOfPassengers <= 3) {
			Car hb1 = new HatchBack();
			hb1.setNumberOfKms(numberOfKMs);
			hb1.setNumberOfPassengers(numberOfPassengers);
			return hb1;
		}
		else {
			Car s1 = new Sedan();
			s1.setNumberOfKms(numberOfKMs);
			s1.setNumberOfPassengers(numberOfPassengers);
			return s1;
		}
	}

	public int calculateBill(Car car) {
		
		int bill;
		if(car instanceof Sedan) {
			Sedan s1 = (Sedan)car;
			bill = car.getNumberOfKms()*s1.farePerKm;
		}
		else{
			HatchBack hb1 = (HatchBack)car;
			bill = car.getNumberOfKms()*hb1.farePerKm;
		}
		return bill;		
	}
		

}
