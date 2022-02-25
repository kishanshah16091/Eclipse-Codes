package com.sytax.class14;

public class Task3 {
	// Create a method that will say Hello in different language based on the
	// country that will passed when method is executed.

	String sayHello(String country) {
		switch (country) {
		case "USA":
			return "Hello";
		case "France":
			return "Bonjour";
		case "Turkey":
			return "Merhaba";
		default:
			return "End of Code";
		}

	}

	public static void main(String[] args) {

		Task3 object = new Task3();
		String country = object.sayHello("USA");
		System.out.println(country);
	}

}
