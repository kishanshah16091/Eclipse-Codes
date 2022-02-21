package com.syntax.homework;

import java.util.Scanner;

public class replit76 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arraySize = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		System.out.println("Please enter day 1 of the week");

		String days1 = scan.next();
		System.out.println("Please enter day 2 of the week");
		String days2 = scan.next();
		System.out.println("Please enter day 3 of the week");
		String days3 = scan.next();
		System.out.println("Please enter day 4 of the week");
		String days4 = scan.next();
		System.out.println("Please enter day 5 of the week");
		String days5 = scan.next();
		System.out.println("Please enter day 6 of the week");
		String days6 = scan.next();
		System.out.println("Please enter day 7 of the week");
		String days7 = scan.next();
		for (int i = 0; i < arraySize.length; i++) {
			System.out.println(arraySize[i]);
		}
		System.out.println();
	}
}
