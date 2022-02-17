package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {

		int num = 1;

		// Creating an array that holds 4 elements
		int[] numbers = new int[4];

		// Storing values /element inside an array
		numbers[0] = 90;
		numbers[1] = 87;
		numbers[2] = 89;
		numbers[3] = 99;

		// Print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3] + numbers[0]);

		// I want to create an array of countries

		String[] countries = new String[5];

		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Afghanistan";
		countries[3] = "Nepal";
		countries[4] = "Morocco";
		// countries[5]="Turkey"; ArrayIndexOutOfBoundsException
		// System.out.println(countries[5] ArrayIndexOutOfBoundsException
		
		System.out.println(countries[3] + " " + countries[4]);

		String[] names = new String[7];
		names[1] = "Kishan";
		names[2] = "Shawn";
		names[3] = "Sreejan";
		names[4] = "Sushan";
		names[5] = "Rajkumar";
		
		System.out.println("vale in index 0 is ="+names[0]);
		//System.out.println(names[7]);  ArrayIndexOutOfBoundsException
		names[1]="Daniyar";// changing the variable value 
		System.out.println(names[1]);

	}

}
