package com.syntax.homework;

public class replit71 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers that stores the following
		 * values: 45,78, 12, 67, 55, 89, 23, 77, 88
		 * Print only values that stored with even index including 0
		 * Output:
		 * 45 12 55 23 88
		 */
		int[] numbers = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };

		for (int number : numbers) 
		{
			if (number%3!=0) {
			System.out.print(number + " ");

		}
		}
	}

}
