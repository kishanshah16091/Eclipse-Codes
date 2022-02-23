package com.syntax.class13;

public class BooleanMethod {
	/*
	 * Void is type of method that don't return anything when called checkEveonOdd
	 * is the name of the method () we use to pass information from outside int
	 * number this is parameter that we can pass to this method when called we can
	 * use this variable inside the logic of method
	 */

	void checkWeather(boolean isRaning) {

		if (isRaning) {
			System.out.println("I am staying at home");
		} else {
			System.out.println("Lets go for a walk ");
		}
	}
    //Task 
	// Create a method to check a name if name is Kishan it prints
	// send memes otherwise if name is Maha prints I am a doctor
	// Print i don't know you

	void checkPerson(String name) {
		if ("Kishan".equals(name)) {
			System.out.println("Memer");

		} else if ("Maha".equals(name)) {
			System.out.println("Doctor");
		} else {
			System.out.println("unknown");
		}

	}

	public static void main(String[] args) {

		BooleanMethod object1 = new BooleanMethod();
		object1.checkWeather(false);

		object1.checkPerson("Kishan");
		object1.checkPerson("Maha");
	}

}
