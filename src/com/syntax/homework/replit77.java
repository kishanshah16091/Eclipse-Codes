package com.syntax.homework;

import java.util.Scanner;

public class replit77 {

	public static void main(String[] args) {
		/*
		 * Create an array of integers that will store 5 elements taken from a user
		 * 
		 * Don't print any prompt message for the user
		 * 
		 * Then print out all the elements you have created in the first loop in reverse
		 * order.
		 */

		Scanner scan = new Scanner(System.in);
		int numbers;
		numbers = scan.nextInt();
		for (int i = 5; i >= numbers; i--)
			System.out.println(i);

	}

}
