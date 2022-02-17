package com.syntax.class03;

public class ClassTask2 {

	public static void main(String[] args) {

		System.out.println("******** Task 1 *******");

		// Create a Java program and name it Double Comparison. Declare 2 double values
		// and if value of first variable is higher then the second, print “Double value
		// __ is larger than __ .” Otherwise print...

		double ps5 = 400;
		double xbox = 300;
		System.out.println("Double vale " + xbox + " is larger than " + ps5);

		System.out.println("***** Task 1.1 *******");

		// Create a Java program and name it Temperature Check. Create variable to store
		// temperature. Your program should check if temperature is below 32 then it
		// should print “Water will freeze with temperature __“, otherwise “Water will
		// NOT freeze with temperature __“.

		double temp = 32;
		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp + ",");
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp + ".");

			System.out.println("******** Task 2 ***********");

			/*
			 * Create Java program to store 2 values for expected and actual hours. Your
			 * program should check if expected hours are more than actual the program
			 * should print “You will love the course and you will succeed”, otherwise
			 * “Course will be very hard for you!“.
			 */

			int expected = 14;
			int actual = 8;
			if (expected > actual) {
				System.out.println("You will love the course and you will succed" + ",");
			} else {
				System.out.println("Course will be very hard for you!");
				
				// always use.equal to compare 2 strings (i.e Browser.equal("chrome"))
			}
		}

	}

}
