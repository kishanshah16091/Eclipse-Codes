package com.syntax.class06;

import java.util.Scanner;

public class testTry {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int day = scan.nextInt();

		String dayName;
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid";
		}
		System.out.println(dayName);
	}
}
