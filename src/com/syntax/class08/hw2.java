package com.syntax.class08;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declare a variable to store a price for a coffee. Ask user to pay for a
		 * coffee. Keep asking to pay for coffee until user enters exact amount . If
		 * user give more than $3 --> ask them to give less, if user gives less money
		 * then ask to give more. Once user got a write amount print “Please enjoy your
		 * coffee 
		 */

		double price = 2.99;
		System.out.println("Please pay for your coffee");

		Scanner in = new Scanner(System.in);
		double pay;

		do {
			pay = in.nextDouble();
			if (pay > price) {
				System.out.println("Please give less");

			} else if (pay < price) {
				System.out.println("Please give more money");
			}

		} while (pay != price);

		System.out.println("Please enjoy your coffee");
	}

}
