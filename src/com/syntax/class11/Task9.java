package com.syntax.class11;

public class Task9 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in array.

		int[] arr = { 10, 20, 90, 50, 70 };
		// assuming first number is the largest number
		int largest = Integer.MIN_VALUE;

		int secondLargest = Integer.MIN_VALUE;

		// iterating through all the elements
		for (int elements : arr) {
			
			if (elements > largest) {
				secondLargest = largest;
				largest = elements;

			}else if (elements>secondLargest && elements!=largest) {
				secondLargest=elements;
			}
		}
		System.out.println("Largest "+largest);
		System.out.println("Second Largest "+secondLargest);
	}

}
