package com.syntax.class11;

public class Task7 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		// Fibonacci serices. 0 1 1 2 3 5 8 13 21 34

		// store the number of Fibonacci numbers that we want to produce
		// start from 0 and 1
		// add the previous numbers to produce the next number
		// check if we have printed the required number or not

		int howMany = 20;
		int previous = 0;
		int current = 1;
		int next = 0;
		System.out.println(previous);
		System.out.println(current);
		for (int i = 0; i < howMany - 2; i++) {
			next = previous + current;
			System.out.print(next+" ");
			previous=current;
			current=next;
		}
	}
}
