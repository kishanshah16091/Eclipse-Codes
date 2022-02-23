package com.syntax.class13;

public class ClassTask {

	// Create a method that takes a person name and an animal name
	// if person name is "Teyfur" and if animal is "Horse" it returns us "Camel"

	String personNameAndAnimalName(String personName, String animalName) {
		if ("Teyfur".equalsIgnoreCase(personName) && "Horse".equalsIgnoreCase(animalName)) {

			return "Camel";
		} else if ("Horse".equals(animalName)) {
			return "Horse";

		} else {
			return "I don't know";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTask obj = new ClassTask();
		String result = obj.personNameAndAnimalName("Teyfur", "Horse");
		System.out.println(result);
		System.out.println(obj.personNameAndAnimalName("Kishan", "Hosre"));
	}

}
