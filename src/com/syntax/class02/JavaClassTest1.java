package com.syntax.class02;

public class JavaClassTest1 {

	public static void main(String[] args) {

		System.out.println("****Test A****");

		String name = "Kishan";
		String lastName = "Shah";
		String grade = "A";
		String city = "Gaimnesville";
		String state = "VA";
		String phoneNumber = "703-973-4597";

		// My name is ___ and my last name is ____

		System.out.println("My name is " + name + " and my last name is " + lastName);

		// I am A/B student

		System.out.println("I am " + grade + " student");

		// I live in city__ and state____

		System.out.println("I live in city " + city + " and state " + state);

		// And my phone number is …..

		System.out.println("And my pnone number is " + phoneNumber);

		System.out.println("**** Test B ****");

		// b) Change student’s city, state, phone number and grade. And print those
		// updated values:

		city = "Arlington";
		state = "Maryland";
		phoneNumber = "1234567890";
		grade = "B";
		System.out.println("My name is " + name + " and I moved to new city " + city + " and new state " + state + "."
				+ " My new phone number is " + phoneNumber);

	}

}
