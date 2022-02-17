package com.syntax.class05;

import java.util.Scanner;

public class tryTryTry {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean t = in.nextBoolean();
		if (t = true) {
			System.out.println("What is your credit score?");
			int score = in.nextInt();
			String eligibility = null;

			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				eligibility = "Eligible";
			} else if (score > 800) {
				eligibility = "Definitely eligible";
			}
			System.out.println("The eligibility is " + eligibility);

		} else {
			System.out.println("Unknown");

		}

	}
}
