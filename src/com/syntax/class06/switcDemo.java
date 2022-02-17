package com.syntax.class06;

public class switcDemo {

	public static void main(String[] args) {

		// switch case with different data types

		char choice = 'u';
		String answer = null;
		switch (choice) {

		case 'y':
			answer = "yes";
			break;

		case 'n':
			answer = "no";
			break;

		case 'm':
			answer = "maybe";
			break;

		case 'u':
			answer = "unknown";
			break;

		}
		System.out.println(answer);

		System.out.println("------------------------------------------");

		/*
		 * declare a variable to store a car based on the value of car define the
		 * country of origin
		 */

		String car = "BMW";
		String country = null;
		switch (car) {
		case "BMW":
			country = "Germany";
			break;
		case "Ford":
			country = "USA";
			break;
		case "Toyota":
			country = "Japan";
			break;
		case "Lada":
			country = "Russia";
			break;

		default:
			country = "unknown";

		}

		System.out.println(car + " is from " + country + " country.");

	}

}
