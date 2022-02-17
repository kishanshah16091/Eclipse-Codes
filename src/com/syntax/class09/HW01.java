package com.syntax.class09;

public class HW01 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.

		String[] cars = new String[6];

		cars[0] = "Honda";
		cars[1] = "Range Rover";
		cars[2] = "BMW";
		cars[3] = "Toyota";
		cars[4] = "Mercedes";
		cars[5] = "Ford";
		System.out.println("My favorite car is " + cars[1]);

		System.out.println("****************Ehance for loop*************************");

		String[] cars1 = { "Honda", "Range Rover", "BMW", "Toyota", "Mercedes", "Ford" };
		for (String car : cars1) {
			System.out.println(car);
		}
		System.out.println("******************For loop*************************");

		for (int c = 0; c < cars.length; c++) {
			System.out.println(cars[c]);
			{

			}

		}
	}
}
