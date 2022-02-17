package com.syntax.class06;

import java.util.Scanner;

public class rRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the roll number of the Child");
		int rollNumber = scan.nextInt();
		String output;

		switch (rollNumber) {
		case 101:
			output = "Student name: Ramesh";
			break;
		case 102:
			output = "Student name: Mahesh";
			break;
		case 103:
			output = "Student name: Mukesh";
			break;
		default:
			output = ("Not found Student name: in Class");

		}
		System.out.println(output);
	}

}
