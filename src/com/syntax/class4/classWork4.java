package com.syntax.class4;

public class classWork4 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and call it a Donor. In order to be eligible to donate
		 * your blood you have to be 18 years old. Also once you identify age
		 * eligibility then we have to see if person matches weight requirements. If
		 * person weight it more than 110 lbs → then he/she is eligible, otherwise we
		 * cannot accept such a patient.
		 */
		boolean donor = true;
		int age = 18;
		int weight=122;
		
		if (age <= 18) {
			System.out.println("You are eligable let's check weight");
			if (weight >=110) {
				System.out.println("You are eligable to donate your blood");
		}else {

			System.out.println(" Sorry you are not eligable for donate your blood");
			
		}else {
			System.out.println("You are not eligible by age");
	}
	}
		}
	}
