package com.syntax.class4;

public class classTask4 {

	public static void main(String[] args) {
		// Write a program to store a boolean value of whether user has diploma or not.
		// If user has a diploma, you should say congratulations, otherwise program
		// should suggest to get a degree. Then if user has a degree program should
		// check a gpa score. If gpa score is higher or equals to 3.5 → output should
		// say “You are eligible for scholarship”, otherwise → “You should have studied
		// harder” .
		boolean diploma = true;
		if (diploma) {
			System.out.println("Congratulations");
			double gpaScore = 3.6;
			if (gpaScore > 3.5) {
				System.out.println("You are eligable for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Go get the Degree");
		}
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 50000 than user will take a loan,
		 * otherwise user will pay cash.
		 * 
		 */

double mortgageRate=5.5;
int mortgagePrice=70000;

if (mortgageRate>4.5) {
	System.out.println("you can not buy a house");
}else {
	System.out.println("You can buy a house");
	if (mortgagePrice>70000) {
		System.out.println("You should take a loan");
	}else {
		System.out.println("You can pay cash");
	}
}

	}

}
