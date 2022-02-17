package com.syntax.class08;

import java.util.Scanner;

public class class08homework {

	public static void main(String[] args) {

		/*
		 * 2. Ask a user to enter name, last name and age 5 times. Every time your
		 * program should print those values in a format “You name is _ _ and you are _
		 * years old’
		 */
		System.out.println("***************************");

		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {

			System.out.println("Hello " + i);

		}
		System.out.println(" MULTIPLICATION TABLE ");

		/*
		 * 3x1=3 3x2=6 3x3=9
		 */

		int num = 3;
		int result;
		for (int i = 1; i <= 10; i++) {
			result = num * i;

			System.out.println(num + " X " + i + " = " + result);

			for (int b = 0; b <= 10; b += 3) {
				System.out.print(b + " ");

			}
			System.out.println("_________________");
			int sum = 0;
			for (int c = 1; c <= 5; c++) {
				sum += c;//sum=sum+i;
				System.out.println(sum);
			}
			

		}
	}
}
