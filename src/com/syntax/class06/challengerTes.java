package com.syntax.class06;

import java.util.Scanner;

public class challengerTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your mark");
		int score = in.nextInt();
		String grade;

		if (score >= 0 && score <= 25) {
			grade = "F";
			System.out.println("Your grade is " + grade);
		} else if (score >= 25 && score <= 45) {
			grade = "E";
			System.out.println("Your grade is " + grade);
		} else if (score >= 45 && score <= 50) {
			grade = "D";
			System.out.println("Your grade is " + grade);
		} else if (score >= 50 && score <= 60) {
			grade = "C";
			System.out.println("Your grade is " + grade);
		} else if (score >= 60 && score <= 80) {
			grade = "B";
			System.out.println("Your grade is " + grade);

		} else if (score >= 80 && score <= 100) {
			grade = "A";
			System.out.println("Your grade is " + grade);

		} else {
			System.out.println("Please enter valid mark");

		}

	}
}
