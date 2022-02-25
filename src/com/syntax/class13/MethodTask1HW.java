package com.syntax.class13;

public class MethodTask1HW {

	// Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.
	int largerNumber(int firstNumber, int secondNumber) {

		if (firstNumber > secondNumber) {
			return firstNumber;
		}

		else if (firstNumber < secondNumber) {
			return secondNumber;
		} else {
			return secondNumber;
		}
	}

	public static void main(String[] args) {
		MethodTask1HW obj = new MethodTask1HW();
		int largeNumbers = obj.largerNumber(3130, 330);

		System.out.println(largeNumbers);

	}

}
