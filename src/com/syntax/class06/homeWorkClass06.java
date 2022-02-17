package com.syntax.class06;

import java.util.Scanner;

public class homeWorkClass06 {

	public static void main(String[] args) {

		/*
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch)
		 * 
		 * 
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 * 
		 * 
		 * 
		 */

		Scanner day= new Scanner(System.in);
		
System.out.println("Please enter numerical value of today's day.");
		
		int whatDay= day.nextInt();
		
		if (whatDay>=1 && whatDay<=5) {
			System.out.println("It is a weekday.");
		}
		else if (whatDay==7 || whatDay==6) {
			System.out.println("It is weekend.");
			
		}
			
		else {
			System.out.println("Invalid day");
		
		
			
			
			
			
			
		}
		
	}

}
