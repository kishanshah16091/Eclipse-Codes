package com.syntax.class10;

public class hW04 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.

		int[] numbers = { 15, 45, 10, 32 };
		int largest = numbers[0];

		for (int n = 1; n < numbers.length; n++) {
			if (numbers[n] > largest) {

				largest = numbers[n];

			}

		}
		System.out.println(largest);

		largest = numbers[0];
		for (int num : numbers) {
			if (num > largest) {

				largest = num;
			}

		}
		System.out.println(largest);
	}

}
