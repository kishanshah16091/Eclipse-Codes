package com.syntax.class4;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * Hw--4
		 * 
		 */
		int num = 10;

		if (num % 2 == 0) {
			System.out.println("This " + num + " is an even Number");
		} else {
			System.out.println("The " + num + " is an odd number");

			
		
			
			
			Scanner input = new Scanner(System.in);
			System.out.println("Is it weekend?");
			boolean i = input.nextBoolean();
			if (i!=i) {
				System.out.println("manual testing");
			}else {
				System.out.println("Java");
			}
			
			
		}
	}
}
