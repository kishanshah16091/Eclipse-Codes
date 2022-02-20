package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Create a 2d array of integer value. print the sum of all numbers.
		// Pseudo programming
		// 1) Create an 2d array
		// 2) print the sum of all numbers
		// Create the 2D array
		int[][] array2D = { { 10, 10, 10 }, { 20, 20, 20 }, { 30, 30, 30 } };
		// print out the elements of array without a loops
		// System.out.println(Arrays.toString(array2D));
		// 4) sum all the elements of the array

		for (int i = 0; i < array2D.length; i++) {
			System.out.println(Arrays.toString(array2D[i]));
		}
		System.out.println("**************");

		int sum = 0;
		for (int x = 0; x < array2D.length; x++) {
			System.out.println(Arrays.toString(array2D[x]));
			for (int y = 0; y < array2D[x].length; y++) {
				sum = sum + array2D[x][y];
			}
		}
		System.out.println("sum of array elements is " + sum);
	}

}
