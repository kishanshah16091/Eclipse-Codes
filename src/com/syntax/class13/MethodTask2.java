package com.syntax.class13;

public class MethodTask2 {
	// Create a method that will take a number and prints whether the number is even
	// or odd

	int evenAndOddNumber(int evenNumber, int oddNumber) {

		if (evenNumber % 2 == 0) {
			return evenNumber;
		} else {
			return oddNumber;

		}

	}

	public static void main(String[] args) {
		MethodTask2 obj = new MethodTask2();
		int result = obj.evenAndOddNumber(19,29);
		
		System.out.println(result);
		
	}

}
