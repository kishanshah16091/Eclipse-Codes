package com.syntax.class13;

public class MethodsDemo2 {
	// Create a method that takes an animal name and person name if name is equal to
	// Teyfur and animal is Horse
	// Print camel otherwise print horse
	
	void TeyfurAndHorse(String personName, String animalName) {
		if ("Teyfur".equalsIgnoreCase(personName) && "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a camel");

		} else if ("Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is horse");

		}
	}

	public static void main(String[] args) {

		MethodsDemo2 object1 = new MethodsDemo2();
		object1.TeyfurAndHorse("Teyfur", "Horse");
		object1.TeyfurAndHorse("Tarik", "Horse");
	}

}
