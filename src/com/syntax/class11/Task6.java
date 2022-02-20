package com.syntax.class11;

public class Task6 {

	public static void main(String[] args) {
		// Write a java program to check weather a given number is prime or not?

		// If a number is not greater than 1 it is not prime

		int number = 2;
		boolean isPrime = true;
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % 1 == 0) {
					isPrime = false;
					break;
				}
			}
		} else {
			isPrime = false;

		}
		System.out.println(number + " isPrime " + isPrime);
	}

}
