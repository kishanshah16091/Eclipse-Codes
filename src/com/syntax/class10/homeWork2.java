package com.syntax.class10;

public class homeWork2 {
	public static void main(String[] args) {

		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 * 
		 * 
		 * Create an array of animals and store 5 elements into it. Using 2 different
		 * loops print all elements from the array.
		 * 
		 * 
		 * Create an array on integers and calculate the sum of all elements in an array
		 * 
		 * 
		 * From an array of integer elements find the largest number.
		 * 
		 * 
		 * 
		 */

		int[] numbers = { 15, 45, 10, 32 };
		int size = numbers.length;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += numbers[i];

		}
		System.out.println("Sum of all elements in the array = " + sum);

		System.out.println("*******************Ehance for loop************");

		sum = 0;
		for (int num : numbers) {
			sum += num;

		}

		System.out.println("Sum of all elements in the array = " + sum);
	}
}
