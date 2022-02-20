package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Create an array on int values using a scanner and calculate the sum of stored
		// elements in the array
		// Solving this programming is called pseudo
		// steps 1 Take the size of the array using scanner class from user
		// Steps 2 create an in array of above size
		// fill the array with elements from the user using scanner class
		// sum all the elements of the array
		// A class that helps use take the input from the keyboard

		Scanner input = new Scanner(System.in);// Prompt the user for the size
		System.out.println("Please Enter the Size of the array");
		// take the size from the user and store it in the size variable
		int size = input.nextInt();// Print out the size
		System.out.println("Size of the array " + size);
		// 2) Create an int array of above size

		int[] Array = new int[size];
		// 3) fill the array with elements from the user using scanner class
		System.out.println("please enter " + size + " element");
		for (int i = 0; i < size; i++) {
			System.out.println("please enter element for index " + i);
			Array[i] = input.nextInt();
		}
        //Print out the elements of an array with out a loops
		System.out.println(Arrays.toString(Array));
		//System.out.println(Array);
		
	}
//5 10 20 36 55 
}
